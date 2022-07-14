package com.neo4j.neo4j_operations.entity;

import org.springframework.data.neo4j.core.schema.*;
import org.springframework.data.neo4j.core.schema.TargetNode;


public class Know  {

    @Id

    @GeneratedValue

    private Long id;

    @TargetNode

    private UserNode from;

    @TargetNode

    private UserNode to;

    public Long getId() {

        return id;

    }

    public void setId(Long id) {

        this.id = id;

    }

    public UserNode getFrom() {

        return from;

    }

    public void setFrom(UserNode from) {

        this.from = from;

    }

    public UserNode getTo() {

        return to;

    }

    public void setTo(UserNode to) {

        this.to = to;

    }

    public Know() {

    }

    public Know(UserNode from, UserNode to) {

        this.from = from;

        this.to = to;

    }

    @Override

    public String toString() {

        return "Know{" +

                "id=" + id +

                ", from=" + from +

                ", to=" + to +

                '}';

    }

}