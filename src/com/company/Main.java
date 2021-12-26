package com.company;

public class Main {

    public static void main(String[] args) {
        Programmer programmer=new Programmer();
        programmer.setName("Nelson");
        programmer.setDesignation("Programmer");
        programmer.setCompanyName("Apple");
        programmer.walk();
        programmer.eat();
        programmer.learn();
        programmer.coding();
        System.out.println(programmer);
        System.out.println();

        Dancer dancer=new Dancer();
        dancer.setName("Diana");
        dancer.setDesignation("Dancer");
        dancer.setGroupName("WE8 Studio");
        dancer.learn();
        dancer.eat();
        dancer.walk();
        dancer.dancing();
        System.out.println(dancer);
        System.out.println();

        Singer singer=new Singer();
        singer.setName("Adam");
        singer.setDesignation("Singer");
        singer.setBandName("Maroon 5");
        singer.learn();
        singer.eat();
        singer.walk();
        singer.singing();
        singer.playGuitar();
        System.out.println(singer);

    }
}
