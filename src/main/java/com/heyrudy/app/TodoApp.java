package com.heyrudy.app;

import com.heyrudy.app.server.HttpServer;

public final class TodoApp {

    public static void main(String[] args) {
        HttpServer.HttpServerRunning server = new HttpServer.HttpServerRunning();
        server.create()
                .bind()
                .listen()
                .start();
    }
}
