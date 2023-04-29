package com.heyrudy.app.controller;

public interface Controller<T, U> {

    U action(T t);
}
