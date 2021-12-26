package com.company;

public class Singer extends Person{
    String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public Singer() {

    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }
    public void singing(){
        System.out.println("Singer likes sing the soul music.");
    }
    public void playGuitar(){
        System.out.println("Singer likes to play the Guitar");
    }
    @Override
    public void eat() {
        System.out.println("Singer likes to eating mango.");
    }

    @Override
    public void learn() {
        System.out.println("Singer likes to learning dance.");
    }

    @Override
    public void walk() {
        System.out.println("Singer likes to walking in the square.");
    }
    @Override
    public String toString(){
        return "Singer name:"+" "+getName()+
                ", Designation:"+" "+getDesignation()+
                ", Band Name:"+" "+bandName;
    }
}
