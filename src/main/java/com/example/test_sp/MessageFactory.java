package com.example.test_sp;

public class MessageFactory {
    //factory pattern
    public static Message createMessage(String sender, String content) {
        return new Message(sender, content);
    }
    }
}
