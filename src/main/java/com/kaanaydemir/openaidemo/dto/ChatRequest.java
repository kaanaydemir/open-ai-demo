package com.kaanaydemir.openaidemo.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class ChatRequest {

    private String model;
    private List<Message> messages;
    private int n;
    private double temperature;
}
