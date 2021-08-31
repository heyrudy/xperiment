package com.heyrudy.app.server;

import java.util.concurrent.Executor;

public sealed interface HttpServer
        extends AutoServe
        permits HttpServer.HttpServerAddressConfig,
        HttpServer.HttpServerCompressionConfig,
        HttpServer.HttpServerContextParametersConfig,
        HttpServer.HttpServerContextPathConfig,
        HttpServer.HttpServerNameConfig,
        HttpServer.HttpServerErrorConfig,
        HttpServer.HttpServerPortConfig,
        HttpServer.HttpServerServletPathConfig,
        HttpServer.HttpServerSessionConfig,
        HttpServer.HttpServerEncodingConfig,
        HttpServer.HttpServerSecurityConfig,
        HttpServer.HttpServerRunning {

    record HttpServerAddressConfig() implements HttpServer {

        public AutoServe create() {
            return null;
        }


        public HttpServer createContext(String path) {
            return null;
        }

        public void removeContext(String path) {
            // removeContext is not yet implemented
        }


        public CustomSocketAddress getAddress() {
            return null;
        }


        public void setExecutor(Executor executor) {
            // setExecutor is not yet implemented
        }


        public Executor getExecutor() {
            return null;
        }


        public AutoServe bind() {
            return null;
        }


        public AutoServe listen() {
            return null;
        }


        public void start() {
            // start is not yet implemented
        }


        public void stop() {
            // stop is not yet implemented
        }


        public void restart() {
            // restart is not yet implemented
        }
    }

    record HttpServerCompressionConfig() implements HttpServer {

        public AutoServe create() {
            return null;
        }


        public HttpServer createContext(String path) {
            return null;
        }

        public void removeContext(String path) {
            // removeContext is not yet implemented
        }


        public CustomSocketAddress getAddress() {
            return null;
        }


        public void setExecutor(Executor executor) {
            // setExecutor is not yet implemented
        }


        public Executor getExecutor() {
            return null;
        }


        public AutoServe bind() {
            return null;
        }


        public AutoServe listen() {
            return null;
        }


        public void start() {
            // start is not yet implemented
        }


        public void stop() {
            // stop is not yet implemented
        }


        public void restart() {
            // restart is not yet implemented
        }
    }

    record HttpServerContextParametersConfig() implements HttpServer {

        public AutoServe create() {
            return null;
        }


        public HttpServer createContext(String path) {
            return null;
        }

        public void removeContext(String path) {
            // removeContext is not yet implemented
        }


        public CustomSocketAddress getAddress() {
            return null;
        }


        public void setExecutor(Executor executor) {
            // setExecutor is not yet implemented
        }


        public Executor getExecutor() {
            return null;
        }


        public AutoServe bind() {
            return null;
        }


        public AutoServe listen() {
            return null;
        }


        public void start() {
            // start is not yet implemented
        }


        public void stop() {
            // stop is not yet implemented
        }


        public void restart() {
            // restart is not yet implemented
        }
    }

    record HttpServerContextPathConfig() implements HttpServer {

        public AutoServe create() {
            return null;
        }


        public HttpServer createContext(String path) {
            return null;
        }

        public void removeContext(String path) {
            // removeContext is not yet implemented
        }


        public CustomSocketAddress getAddress() {
            return null;
        }


        public void setExecutor(Executor executor) {
            // setExecutor is not yet implemented
        }


        public Executor getExecutor() {
            return null;
        }


        public AutoServe bind() {
            return null;
        }


        public AutoServe listen() {
            return null;
        }


        public void start() {
            // start is not yet implemented
        }


        public void stop() {
            // stop is not yet implemented
        }


        public void restart() {
            // restart is not yet implemented
        }
    }

    record HttpServerNameConfig() implements HttpServer {

        public AutoServe create() {
            return null;
        }


        public HttpServer createContext(String path) {
            return null;
        }

        public void removeContext(String path) {
            // removeContext is not yet implemented
        }


        public CustomSocketAddress getAddress() {
            return null;
        }


        public void setExecutor(Executor executor) {
            // setExecutor is not yet implemented
        }


        public Executor getExecutor() {
            return null;
        }


        public AutoServe bind() {
            return null;
        }


        public AutoServe listen() {
            return null;
        }


        public void start() {
            // start is not yet implemented
        }


        public void stop() {
            // stop is not yet implemented
        }


        public void restart() {
            // restart is not yet implemented
        }
    }

    record HttpServerErrorConfig() implements HttpServer {

        public AutoServe create() {
            return null;
        }


        public HttpServer createContext(String path) {
            return null;
        }

        public void removeContext(String path) {
            // removeContext is not yet implemented
        }


        public CustomSocketAddress getAddress() {
            return null;
        }


        public void setExecutor(Executor executor) {
            // setExecutor is not yet implemented
        }


        public Executor getExecutor() {
            return null;
        }


        public AutoServe bind() {
            return null;
        }


        public AutoServe listen() {
            return null;
        }


        public void start() {
            // start is not yet implemented
        }


        public void stop() {
            // stop is not yet implemented
        }


        public void restart() {
            // restart is not yet implemented
        }
    }

    record HttpServerPortConfig() implements HttpServer {

        public AutoServe create() {
            return null;
        }


        public HttpServer createContext(String path) {
            return null;
        }

        public void removeContext(String path) {
            // removeContext is not yet implemented
        }


        public CustomSocketAddress getAddress() {
            return null;
        }


        public void setExecutor(Executor executor) {
            // setExecutor is not yet implemented
        }


        public Executor getExecutor() {
            return null;
        }


        public AutoServe bind() {
            return null;
        }


        public AutoServe listen() {
            return null;
        }


        public void start() {
            // start is not yet implemented
        }


        public void stop() {
            // stop is not yet implemented
        }


        public void restart() {
            // restart is not yet implemented
        }
    }

    record HttpServerServletPathConfig() implements HttpServer {

        public AutoServe create() {
            return null;
        }


        public HttpServer createContext(String path) {
            return null;
        }

        public void removeContext(String path) {
            // removeContext is not yet implemented
        }


        public CustomSocketAddress getAddress() {
            return null;
        }


        public void setExecutor(Executor executor) {
            // setExecutor is not yet implemented
        }


        public Executor getExecutor() {
            return null;
        }


        public AutoServe bind() {
            return null;
        }


        public AutoServe listen() {
            return null;
        }


        public void start() {
            // start is not yet implemented
        }


        public void stop() {
            // stop is not yet implemented
        }


        public void restart() {
            // restart is not yet implemented
        }
    }

    record HttpServerSessionConfig() implements HttpServer {

        public AutoServe create() {
            return null;
        }


        public HttpServer createContext(String path) {
            return null;
        }

        public void removeContext(String path) {
            // removeContext is not yet implemented
        }


        public CustomSocketAddress getAddress() {
            return null;
        }


        public void setExecutor(Executor executor) {
            // setExecutor is not yet implemented
        }


        public Executor getExecutor() {
            return null;
        }


        public AutoServe bind() {
            return null;
        }


        public AutoServe listen() {
            return null;
        }


        public void start() {
            // start is not yet implemented
        }


        public void stop() {
            // stop is not yet implemented
        }


        public void restart() {
            // restart is not yet implemented
        }
    }

    record HttpServerEncodingConfig() implements HttpServer {

        public AutoServe create() {
            return null;
        }


        public HttpServer createContext(String path) {
            return null;
        }

        public void removeContext(String path) {
            // removeContext is not yet implemented
        }


        public CustomSocketAddress getAddress() {
            return null;
        }


        public void setExecutor(Executor executor) {
            // setExecutor is not yet implemented
        }


        public Executor getExecutor() {
            return null;
        }


        public AutoServe bind() {
            return null;
        }


        public AutoServe listen() {
            return null;
        }


        public void start() {
            // start is not yet implemented
        }


        public void stop() {
            // stop is not yet implemented
        }


        public void restart() {
            // restart is not yet implemented
        }
    }

    record HttpServerSecurityConfig() implements HttpServer {

        public AutoServe create() {
            return null;
        }


        public HttpServer createContext(String path) {
            return null;
        }

        public void removeContext(String path) {
            // removeContext is not yet implemented
        }


        public CustomSocketAddress getAddress() {
            return null;
        }


        public void setExecutor(Executor executor) {
            // setExecutor is not yet implemented
        }


        public Executor getExecutor() {
            return null;
        }


        public AutoServe bind() {
            return null;
        }


        public AutoServe listen() {
            return null;
        }


        public void start() {
            // start is not yet implemented
        }


        public void stop() {
            // stop is not yet implemented
        }


        public void restart() {
            // restart is not yet implemented
        }
    }

    record HttpServerRunning() implements HttpServer, AutoServe {

        public AutoServe create() {
            return null;
        }


        public HttpServer createContext(String path) {
            return null;
        }

        public void removeContext(String path) {
            // removeContext is not yet implemented
        }


        public CustomSocketAddress getAddress() {
            return null;
        }


        public void setExecutor(Executor executor) {
            // setExecutor is not yet implemented
        }


        public Executor getExecutor() {
            return null;
        }


        public AutoServe bind() {
            return null;
        }


        public AutoServe listen() {
            return null;
        }


        public void start() {
            // start is not yet implemented
        }


        public void stop() {
            // stop is not yet implemented
        }


        public void restart() {
            // restart is not yet implemented
        }
    }

}
