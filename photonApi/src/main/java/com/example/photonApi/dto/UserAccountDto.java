package com.example.photonApi.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserAccountDto {

    private Long id;

    private String username;

    private String email;

    private String password;

    private String bio;

    private String imageUrl;

    private List<Long> postIds = new ArrayList<>();

    private List<Long> commentIds = new ArrayList<>();
}