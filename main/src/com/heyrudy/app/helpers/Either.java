package com.heyrudy.app.helpers;

public sealed interface Either<T, E>
        permits Either.Left, Either.Right {

    record Left<T, E>(T t) implements Either<T, E> {
    }

    record Right<T, E>(E e) implements Either<T, E> {
    }
}

