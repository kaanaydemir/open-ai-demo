package com.kaanaydemir.openaidemo.client;

import com.kaanaydemir.openaidemo.dto.ChatRequest;
import com.kaanaydemir.openaidemo.dto.ChatResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "openAiClient", url = "${openai.url}")
public interface OpenAiClient {
    @PostMapping
    ChatResponse chat(@RequestBody ChatRequest request);
}
