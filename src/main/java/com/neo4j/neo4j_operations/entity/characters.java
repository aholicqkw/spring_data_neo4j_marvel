package com.neo4j.neo4j_operations.entity;

import org.springframework.data.neo4j.core.schema.*;

import java.util.HashSet;
import java.util.Set;

import static org.springframework.data.neo4j.core.schema.Relationship.Direction.INCOMING;
import static org.springframework.data.neo4j.core.schema.Relationship.Direction.OUTGOING;

@Node("characters")
public class characters {
    @Id
    @GeneratedValue
    private Long characterID;

    @Property(name = "name")
    private String name;

    @Relationship(type = "love")
    private Set<characters> lover = new HashSet<>();

    @Relationship(type = "family")
    private Set<characters> family = new HashSet<>();

    @Relationship(type = "enemy")
    private Set<characters> enemy = new HashSet<>();

    @Relationship(type = "friend")
    private Set<characters> friend = new HashSet<>();

    @Relationship(type = "work")
    private Set<characters> worker = new HashSet<>();

    @Relationship(type = "creator", direction = INCOMING)
    private Set<characters> creator = new HashSet<>();

    @Relationship(type = "ToComics", direction = OUTGOING)
    private Set<characters> ToComics = new HashSet<>();

    public characters(Long characterID, String name) {
        this.characterID = characterID;
        this.name = name;
    }

}
