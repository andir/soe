package com.ocdsoft.bacta.soe.connection;

import com.ocdsoft.bacta.engine.network.client.ConnectionState;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by kburkhardt on 2/8/15.
 */
public interface SoeUdpConnectionMBean {
    int getId();
    ConnectionState getState();
    AtomicInteger getGameNetworkMessagesSent();
    AtomicInteger getProtocolMessagesSent();
    AtomicInteger getProtocolMessagesReceived();
    AtomicInteger getGameNetworkMessagesReceived();
}
