package com.example.photonApi.dto;

import com.example.photonApi.entity.Comment;
import com.example.photonApi.entity.UserAccount;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

public class PostDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String caption;
    private String imageUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private UserAccount user;

    private List<Comment> comments = new ArrayList<>();

    private List<Long> likes = new ArrayList<>();
}
