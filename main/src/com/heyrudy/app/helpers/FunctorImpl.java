package com.heyrudy.app.helpers;

import java.util.Objects;
import java.util.function.Function;

public final class FunctorImpl<T>
        implements Functor<T, FunctorImpl<?>> {

    private final T value;

    private FunctorImpl(T value) {
        this.value = Objects.requireNonNull(value);
    }

    public static <T> FunctorImpl<T> of(T value) {
        return new FunctorImpl<>(value);
    }

    public T get() {
        return value;
    }

    public <B> FunctorImpl<B> fmap(Function<? super T, ? extends B> fn) {
        B apply = fn.apply(value);
        return FunctorImpl.of(apply);
    }
}
