package com.company.task_4;

public class Shirt {
    private String id;
    private String description;
    private String color;
    private String size;

    public Shirt(String id, String description, String color, String size) {
        this.id = id;
        this.description = description;
        this.size = size;
    }

    public Shirt(String shirt) {
        String[] params = shirt.split(",");
        id = params[0];
        description = params[1];
        color = params[2];
        size = params[3];
    }

    public String toString() {
        return String.format("ID: %s \nDescription: %s \nColor: %s \nSize: %s ", id, description, color, size);
    }
}
