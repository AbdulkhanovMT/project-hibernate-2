package com.javarush.projecthibernate2.entity;

import static java.util.Objects.isNull;

public enum Feature {
    TRAILERS("Trailers"),
    COMMENTARIES("Commentaries"),
    DELETED_SCENES("Deleted Scenes"),
    BEHIND_THE_SCENES("Behind the Scenes");

    private final String value;

    Feature(String s) {
        this.value = s;
    }

    public String getValue() {
        return value;
    }

    public static Feature getFeatureFromString(String stringValue) {
        if(isNull(stringValue) || stringValue.isEmpty()){
            return null;
        }

        Feature[] features = Feature.values();
        for (Feature f : features) {
            if (f.value.equals(stringValue)) {
                return f;
            }
        }
        return null;
    }
}
