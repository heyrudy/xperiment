package com.heyrudy.app.helpers;

import java.util.function.Function;

public interface Applicative<F, A extends Applicative<?, ?>> extends Functor<F, A> {
    <B> Applicative<B, A> apply(Applicative<Function<? super F, ? extends B>, A> appFn);
}
