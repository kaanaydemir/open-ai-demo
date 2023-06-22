package com.kaanaydemir.openaidemo.controller;

import com.kaanaydemir.openaidemo.dto.ChatRequest;
import com.kaanaydemir.openaidemo.dto.Choice;
import com.kaanaydemir.openaidemo.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/movie")
public class OpenAiController {

    private final MovieService movieService;

    public OpenAiController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping("/find")
    public ResponseEntity<List<Choice>> find(@RequestBody ChatRequest request) {
        return ResponseEntity.ok(movieService.findMovie(request));
    }
}
