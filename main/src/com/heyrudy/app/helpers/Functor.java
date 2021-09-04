package com.heyrudy.app.helpers;

import java.util.function.Function;

public interface Functor<A, F extends Functor<?, ?>> {
    <B> Functor<B, F> fmap(Function<? super A, ? extends B> fn);
}
