package com.example.test_sp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.aot.hint.TypeReference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
@SpringBootApplication
public class TestSpApplication {

    SpringApplication.run(TestSpApplication.class, args);
    ObjectMapper objectMapper = new ObjectMapper();
    String filePath = "src/main/java/com/example/test_sp/messages.json";
}
