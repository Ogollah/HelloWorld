package com.helloworld;

public class Loop {
    private int girls;
    private int boys;

    public Loop(int gir, int boy){
        girls = gir;
        boys = boy;
    }
    public int getGirls(){
        return girls;
    }

    public int getBoys(){
        return boys;
    }
    public int getPeople(){
        int people = boys + girls;
        return people;
    }
    public void display(){
        System.out.println("We have "+getPeople()+" people in the house.");
    }
}
