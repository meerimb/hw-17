package com.company;

public class Programmer extends Person{
    String companyName;

    public Programmer(String name, String designation) {
        super(name, designation);
    }

    public Programmer() {
        super();
    }


    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
    public void coding(){
        System.out.println("Programmer likes coding.");

    }
    @Override
    public void eat() {
        System.out.println("Programmer likes eat a cake.");
    }

    @Override
    public void learn() {
        System.out.println("Programmer also likes to learn to play chess.");
    }

    @Override
    public void walk() {
        System.out.println("Programmer likes to walk in the park.");
    }
    @Override
    public String toString(){
        return
                "Programmer name:"+" "+getName()+
                        ", Designation:"+" "+getDesignation()+
                        ", Company Name:"+" "+companyName;
    }
}
