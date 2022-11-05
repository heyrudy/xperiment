package com.heyrudy.app.helpers;

import java.util.Objects;
import java.util.function.Function;

public sealed interface Optional<T>
        extends Monad<T>
        permits Optional.Some, Optional.None {

    final class Some<T> implements Optional<T> {

        private final T value;

        private Some(T value) {
            this.value = Objects.requireNonNull(value);
        }

        // Monad return : T1 -> M<T1>
        public static <T> Some<T> of(T value) {
            return new Some<>(value);
        }

        // Monad unbox : M<T> -> T
        public T get() {
            return value;
        }

        // monad bind : M<T> -> (T -> M<U>) -> M<U>
        public <U> Monad<U> bind(Function<? super T, Monad<U>> mapping) {
            return mapping.apply(value);
        }

        // fmap is a subset of bind
        public <U> Monad<U> fmap(Function<? super T, ? extends U> fn) {
            return bind(fn.andThen(Some::of));
        }
    }

    final class None implements Optional {

        public static final None INSTANCE = new None();

        private None() {
        }

        public None bind(Function fn) {
            return INSTANCE;
        }

        public None fmap(Function fn) {
            return INSTANCE;
        }

        public None get() {
            return INSTANCE;
        }
    }
}
