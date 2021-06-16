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

        public HttpServerRunning create() {
            return null;
        }

        public HttpServer createContext(String path) {
            return null;
        }

        public void removeContext(String path) {

        }

        public CustomSocketAddress getAddress() {
            return null;
        }

        public void setExecutor(Executor executor) {

        }

        public Executor getExecutor() {
            return null;
        }

        public HttpServerRunning bind() {
            return null;
        }

        public HttpServerRunning listen() {
            return null;
        }

        public void start() {
        }

        public void stop() {
        }

        public void restart() {
        }
    }
}
