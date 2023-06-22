package com.kaanaydemir.openaidemo.service;

import com.kaanaydemir.openaidemo.client.OpenAiClient;
import com.kaanaydemir.openaidemo.dto.ChatRequest;
import com.kaanaydemir.openaidemo.dto.ChatResponse;
import org.springframework.stereotype.Service;

@Service
public class OpenAiService {

    private final OpenAiClient openAiClient;

    public OpenAiService(OpenAiClient openAiClient) {
        this.openAiClient = openAiClient;
    }

    public ChatResponse chat(ChatRequest request) {
        return openAiClient.chat(request);
    }
}
