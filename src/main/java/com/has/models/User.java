package com.has.models;

public class User {
    private int age;
    private String name;
    private String nianji;

    public User() {
    }

    public User(int age, String name, String nianji) {
        this.age = age;
        this.name = name;
        this.nianji = nianji;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNianji() {
        return nianji;
    }

    public void setNianji(String nianji) {
        this.nianji = nianji;
    }
}
