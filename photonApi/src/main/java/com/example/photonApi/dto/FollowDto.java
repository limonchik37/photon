package com.example.photonApi.dto;

import lombok.Data;

@Data
public class FollowDto {

    private Long id;

    private Long followerId;

    private Long followingId;
}