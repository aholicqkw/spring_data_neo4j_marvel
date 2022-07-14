package com.neo4j.neo4j_operations.entity;

import org.springframework.data.neo4j.core.schema.*;

import java.util.HashSet;
import java.util.Set;

import static org.springframework.data.neo4j.core.schema.Relationship.Direction.OUTGOING;


@Node

public class UserNode {
    @Id

    @GeneratedValue

    private Long nodeId;

    @Property(name = "name")

    private String name;

    @Property(name = "age")

    private int age;

    @Property(name = "sex")

    private String sex;

    @Relationship(type = "know" ,direction = OUTGOING)

    private Set<UserNode> knows = new HashSet<>();

    public Long getNodeId() {

        return nodeId;

    }

    public void setNodeId(Long nodeId) {

        this.nodeId = nodeId;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public int getAge() {

        return age;

    }

    public void setAge(int age) {

        this.age = age;

    }

    public String getSex() {

        return sex;

    }

    public void setSex(String sex) {

        this.sex = sex;

    }

    public Set<UserNode> getKnows() {

        return knows;

    }

    public void setKnows(Set<UserNode> knows) {

        this.knows = knows;

    }

    public Boolean addKnows(UserNode to){

        return this.knows.add(to);

    }

    @Override

    public String toString() {

        return "UserNode{" +

                "nodeId=" + nodeId +

                ", name='" + name + '\'' +

                ", age=" + age +

                ", sex='" + sex + '\'' +

                '}';

    }

    public UserNode() {}

}