package com.heyrudy.app.helpers;

import java.util.function.Function;

public interface Monad<T> {

    // monads have 3 fundamental operations :
    // return : T1 -> M<T1>
    // unbox : M<T> -> T
    // bind : M<T> -> (T -> M<U>) -> M<U>

    // Monad unbox : M<T> -> T
    T get();
    // monad bind : M<T> -> (T -> M<U>) -> M<U>
    <U> Monad<U> bind(Function<? super T, Monad<U>> mapping);
    // a monad is a functor so it can also fmap
    <U> Monad<U> fmap(Function<? super T, ? extends U> fn);
}
