package org.altumtek.Request;

/**
 * Set of request types supported within the system.
 * <p>
 * Created by chanuka on 10/14/18.
 */
public enum RequestType {
    ACK,        // acknowledgement
    BSC,        // Bootstrap Server Command
    DUMMY,      // Dummy request
    ERROR,
    GOSSIP,
    GOSSIPOK,
    HEARTBEAT,
    JOIN,
    JOINOK,
    LEAVE,
    LEAVEOK,
    SER,
    SEROK,
    REG,
    REGOK,
    UNREG,
    UNROK
}
