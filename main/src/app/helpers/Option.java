package app.helpers;

public sealed interface Option<T> permits Option.Just, Option.None {

    record Just<T>(T t) implements Option<T> {
    }

    record None<T>() implements Option<T> {
    }
}
