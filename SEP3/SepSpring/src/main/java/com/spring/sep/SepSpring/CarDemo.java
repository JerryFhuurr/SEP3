package com.spring.sep.SepSpring;

public class CarDemo {
    private final long id;
    private final String name;
    private final String model;

    public CarDemo(long id, String name, String model){
        this.id = id;
        this.name = name;
        this.model = model;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }
}
