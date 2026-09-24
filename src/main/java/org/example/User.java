package org.example;

public class User {
    private Integer id;
    private String name;
    private String sex;

    public User(Integer id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;

    }

    public Integer getId() {
        return id;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }
}

