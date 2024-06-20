package org.apache.pinot.client; 
       
public class ConnectionConfiguration { 
  private final int readTimeoutMs; 
  private final int connectTimeoutMs; 
  private final int handshakeTimeoutMs; 
  private final boolean tlsV10Enabled; 
 
  public ConnectionConfiguration(int readTimeoutMs, int connectTimeoutMs, int handshakeTimeoutMs, boolean tlsV10Enabled) { 
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
 
  // Getters can be added if required 
}
