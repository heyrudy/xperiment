package com.heyrudy.app.helpers;

import java.util.Objects;
import java.util.function.Function;

public final class ApplicativeImpl<T>
        implements Applicative<T, ApplicativeImpl<?>> {

    private final T value;

    private ApplicativeImpl(T value) {
        this.value = Objects.requireNonNull(value);
    }

    public static <T> ApplicativeImpl<T> of(T value) {
        return new ApplicativeImpl<>(value);
    }

    public T get() {
        return value;
    }

    //applicative apply : A<T> -> A(T -> U) -> A<U>
    public <B> ApplicativeImpl<B> apply(Applicative<Function<? super T, ? extends B>, ApplicativeImpl<?>> appFn) {
        //appFn is an Applicative which contains a function
        Function<? super T, ? extends B> applicativeFunction = ((ApplicativeImpl<Function<? super T, ? extends B>>) appFn).value;
        return ApplicativeImpl.of(applicativeFunction.apply(this.value));
    }

    //functor fmap : F<T> -> (T -> U) -> F<U>
    // fmap is a subset of apply
    public <B> ApplicativeImpl<B> fmap(Function<? super T, ? extends B> fn) {
        return apply(ApplicativeImpl.of(fn));
    }
}
