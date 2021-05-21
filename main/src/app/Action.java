package app;

public sealed interface Action permits Add, Check, Delete {
}
