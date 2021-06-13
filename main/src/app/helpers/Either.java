package app.helpers;

public sealed interface Either<T, E> {
}

record Left<T, E>(T t) implements Either<T, E> {
}

record Right<T, E>(E e) implements Either<T, E> {
}
