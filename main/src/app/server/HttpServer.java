package app.server;

import java.util.concurrent.Executor;

public sealed interface HttpServer {

    record HttpServerAddressConfig() implements HttpServer {
    }

    record HttpServerCompressionConfig() implements HttpServer {
    }

    record HttpServerContextParametersConfig() implements HttpServer {
    }

    record HttpServerContextPathConfig() implements HttpServer {
    }

    record HttpServerNameConfig() implements HttpServer {
    }

    record HttpServerErrorConfig() implements HttpServer {
    }

    record HttpServerPortConfig() implements HttpServer {
    }

    record HttpServerServletPathConfig() implements HttpServer {
    }

    record HttpServerSessionConfig() implements HttpServer {
    }

    record HttpServerEncodingConfig() implements HttpServer {
    }

    record HttpServerSecurityConfig() implements HttpServer {
    }

    record HttpServerRunning() implements HttpServer, AutoServe {

        @Override
        public HttpServerRunning create() {
            return null;
        }

        @Override
        public HttpServer createContext(String path) {
            return null;
        }

        @Override
        public void removeContext(String path) {

        }

        @Override
        public CustomSocketAddress getAddress() {
            return null;
        }

        @Override
        public void setExecutor(Executor executor) {

        }

        @Override
        public Executor getExecutor() {
            return null;
        }

        @Override
        public HttpServerRunning bind() {
            return null;
        }

        @Override
        public HttpServerRunning listen() {
            return null;
        }

        @Override
        public void start() {
        }

        @Override
        public void stop() {
        }

        @Override
        public void restart() {
        }
    }
}
