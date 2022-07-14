package com.neo4j.neo4j_operations.Repository;

import com.neo4j.neo4j_operations.entity.characters;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface CharactersRepository extends Neo4jRepository<characters, String>{
}
