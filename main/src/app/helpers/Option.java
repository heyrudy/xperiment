package app.helpers;

public sealed interface Option<T> {
}

record Just<T>(T t) implements Option<T> {
}

record None<T>() implements Option<T> {
}
