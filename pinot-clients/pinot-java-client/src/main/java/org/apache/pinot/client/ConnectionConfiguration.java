package org.apache.pinot.client;

public class ConnectionConfiguration {
    private int readTimeoutMs;
    private int connectTimeoutMs;
    private int handshakeTimeoutMs;
    private boolean tlsV10Enabled;

    public ConnectionConfiguration(int readTimeoutMs, int connectTimeoutMs, int handshakeTimeoutMs,
            boolean tlsV10Enabled) {
        this.readTimeoutMs = readTimeoutMs;
        this.connectTimeoutMs = connectTimeoutMs;
        this.handshakeTimeoutMs = handshakeTimeoutMs;
        this.tlsV10Enabled = tlsV10Enabled;
    }

    public ConnectionTimeouts createConnectionTimeouts() {
        return ConnectionTimeouts.create(readTimeoutMs, connectTimeoutMs, handshakeTimeoutMs);
    }

    public boolean isTlsV10Enabled() {
        return tlsV10Enabled;
    }

    public void setConnectTimeoutMs(int value) {
        connectTimeoutMs = value;
    }

    public void setReadTimeoutMs(int value) {
        readTimeoutMs = value;
    }
    public void setHandshakeTimeoutMs(int value) {
        handshakeTimeoutMs=value;
     }

    public void setTlsV10Enabled(boolean value) {
        tlsV10Enabled = value;
    }

   
}
