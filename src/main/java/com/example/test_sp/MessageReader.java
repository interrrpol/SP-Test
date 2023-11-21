package com.example.test_sp;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.util.List;

public class MessageReader {
    public static List<Message> readMessages() throws IOException {
        return new ObjectMapper().readValue(new URL("file:src/main/java/com/example/test_sp/messages.json"), new TypeReference<List<Message>>() {});
    }
}
