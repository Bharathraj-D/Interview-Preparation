package com.example.vehicle.entity;

public class Vehicle {
    String Name;
    String id;
    String Model;

    public Vehicle(String name, String id, String model) {
        Name = name;
        this.id = id;
        Model = model;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
