package com.example.photonApi.dto;

import lombok.Data;

@Data
public class CommentDto {

    private Long id;

    private String text;

    private Long userId;

    private Long postId;
}