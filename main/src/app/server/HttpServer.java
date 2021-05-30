package app.server;

public sealed interface HttpServer {
    record HttpServerAddressConfig() implements HttpServer { }
    record HttpServerCompressionConfig() implements HttpServer { }
    record HttpServerContextParametersConfig() implements HttpServer { }
    record HttpServerContextPathConfig() implements HttpServer { }
    record HttpServerNameConfig() implements HttpServer { }
    record HttpServerErrorConfig() implements HttpServer { }
    record HttpServerPortConfig() implements HttpServer { }
    record HttpServerServletPathConfig() implements HttpServer { }
    record HttpServerSessionConfig() implements HttpServer { }
    record HttpServerEncodingConfig() implements HttpServer { }
    record HttpServerSecurityConfig() implements HttpServer { }
}
