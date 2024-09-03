package com.example.photonApi.repositories;

import co.elastic.clients.elasticsearch._types.query_dsl.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, Long> {
}
