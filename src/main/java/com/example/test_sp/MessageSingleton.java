package com.example.test_sp;

public class MessageSingleton {
    //singleton pattern
    private static final MessageSingleton instance = new MessageSingleton();

    private MessageSingleton() {
    }

    public static MessageSingleton getInstance() {
        return instance;
    }
}
