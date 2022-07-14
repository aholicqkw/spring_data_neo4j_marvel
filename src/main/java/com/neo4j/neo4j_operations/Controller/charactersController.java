package com.neo4j.neo4j_operations.Controller;

import com.neo4j.neo4j_operations.Repository.CharactersRepository;
import com.neo4j.neo4j_operations.entity.characters;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/characters")
public class charactersController {
    private final CharactersRepository repo;

    public charactersController(CharactersRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public Iterable<characters> getAllcharacters(){
        return repo.findAll();
    }
}
