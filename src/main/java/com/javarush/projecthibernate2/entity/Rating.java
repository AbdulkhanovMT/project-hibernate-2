package com.javarush.projecthibernate2.entity;

public enum Rating {
    G("G"),
    PG("PG"),
    PG13("PG-13"),
    R("R"),
    NC17("NC-17");

    private final String value;

    Rating(String s) {
        this.value = s;
    }

    public String getValue() {
        return value;
    }

}
