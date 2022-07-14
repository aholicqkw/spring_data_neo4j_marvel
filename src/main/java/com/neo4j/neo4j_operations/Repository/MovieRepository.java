package com.neo4j.neo4j_operations.Repository;

import com.neo4j.neo4j_operations.entity.MovieEntity;
import org.neo4j.driver.internal.shaded.reactor.core.publisher.Mono;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;

public interface MovieRepository extends ReactiveNeo4jRepository<MovieEntity, String> {
    Mono<MovieEntity> findOneByTitle(String title);
}
