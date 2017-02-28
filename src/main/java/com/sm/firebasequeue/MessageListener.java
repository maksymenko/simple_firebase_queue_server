package com.sm.firebasequeue;

/**
 * Interface for external message listeners. Is executed in separate thread to
 * handle incoming message.
 *
 */
public interface MessageListener {
  void handle(Message message);
}