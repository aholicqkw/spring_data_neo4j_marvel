package com.neo4j.neo4j_operations.Repository;

import com.neo4j.neo4j_operations.entity.comics;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ComicsRepository  extends Neo4jRepository<comics, String> {
}
