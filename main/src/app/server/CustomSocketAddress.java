package app.server;

public sealed interface CustomSocketAddress {

    record SocketAddressHolder() implements CustomSocketAddress { }
    record SocketAddressComposite(String hostname, int port) implements CustomSocketAddress { }
}
