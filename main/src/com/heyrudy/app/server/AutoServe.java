package com.heyrudy.app.server;

import java.util.concurrent.Executor;

public interface AutoServe {

    AutoServe create();
    HttpServer createContext(String path);
    void removeContext(String path);
    CustomSocketAddress getAddress();
    void setExecutor(Executor executor);
    Executor getExecutor();
    AutoServe bind();
    AutoServe listen();
    void start();
    void stop();
    void restart();
}
