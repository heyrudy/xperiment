package app.server;

public sealed interface DbServer {
    record DbServerAddressConfig() implements DbServer { }
    record DbServerContextPathConfig() implements DbServer { }
    record DbServerNameConfig() implements DbServer { }
    record DbServerErrorConfig() implements DbServer { }
    record DbServerPortConfig() implements DbServer { }
    record DbServerSessionConfig() implements DbServer { }
    record DbServerEncodingConfig() implements DbServer { }
    record DbServerSecurityConfig() implements DbServer { }
}
