package com.neo4j.neo4j_operations.entity;

import org.springframework.data.neo4j.core.schema.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.data.neo4j.core.schema.Relationship.Direction.OUTGOING;

@Node
public class comics {
    @Id
    @GeneratedValue
    private Long comicID;

    @Property(name = "title")
    private String title;

    @Property(name = "issueNumber")
    private Long issueNumber;

    @Relationship(type = "INCLUDE", direction = OUTGOING)
    private List<characters> characters = new ArrayList<>();

    public comics(Long comicID, String title, Long issueNumber) {
        this.comicID = comicID;
        this.title = title;
        this.issueNumber = issueNumber;
    }

}
