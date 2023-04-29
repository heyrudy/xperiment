package com.heyrudy.app.store;

public interface EntityStore<T, U> {

    U action(T t);
}
