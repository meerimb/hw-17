package com.company;

public abstract class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public abstract void eat();

    public abstract void learn();

    public abstract void walk();

    @Override
    public String toString() {
        return "Person name:" + " " + getName() +
                ", Designation:" + " " + getDesignation();

    }
}



