package app;

import app.server.HttpServer;

import java.util.Objects;

public final class TodoApp {

    public static void main(String[] args) {
        HttpServer.HttpServerRunning server = new HttpServer.HttpServerRunning();
//        assert Objects.requireNonNull(server.create())
//                .bind() != null;
//        assert Objects.requireNonNull(server.create()
//                .bind())
//                .listen() != null;
//        assert server.create()
//                .bind()
//                .listen() != null;
        server.create()
                .bind()
                .listen()
                .start();
    }
}
