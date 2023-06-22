package com.kaanaydemir.openaidemo.service;

import com.kaanaydemir.openaidemo.dto.ChatRequest;
import com.kaanaydemir.openaidemo.dto.ChatResponse;
import com.kaanaydemir.openaidemo.dto.Choice;
import com.kaanaydemir.openaidemo.dto.Message;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final OpenAiService openAiService;

    @Value("${system.movie.finder}")
    private String systemMovieFinder;


    public MovieService(OpenAiService openAiService) {
        this.openAiService = openAiService;
    }
    public List<Choice> findMovie(ChatRequest request) {
        boolean isSystemExist = request.getMessages()
                .stream()
                .anyMatch(message -> message.getRole().equals("system"));

        if (!isSystemExist) {
            request.getMessages().add(new Message("system", systemMovieFinder));
        }

        ChatResponse chat = openAiService.chat(request);
        return chat.getChoices();
    }
}
