package com.heyrudy.app.router;

public interface AutoRoute<T, U> {

    U action(T t);
}
