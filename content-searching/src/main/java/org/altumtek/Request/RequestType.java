package org.altumtek.Request;

/**
 * Set of request types supported within the system.
 *
 * Created by chanuka on 10/14/18.
 */
public enum RequestType {
    ACK,        // acknowledgement
    BSC,        // Bootstrap Server Command
    GOSSIP,
    HEARTBEAT,
    SEARCH;
}
