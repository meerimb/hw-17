package com.company;

public class Dancer extends Person{
    String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public Dancer() {

    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }
    public void dancing() {
        System.out.println("Dancer like dancing modern dance.");
    }
    @Override
    public void eat() {
        System.out.println("Dancer likes eating an ice-cream.");
    }

    @Override
    public void learn() {
        System.out.println("Dancer likes learning to play the piano.");
    }

    @Override
    public void walk() {
        System.out.println("Dancer likes to walking in the beach.");
    }
    @Override
    public String toString() {
        return "Dancer name:"+" "+getName()+
                ", Designation:"+" "+getDesignation()+
                ", Group Name:"+" "+groupName;
    }
}
