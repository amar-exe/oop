package com.company;

public class Bird {
    private String name;
    private String latinName;
    private int obs;

    public Bird(String name, String latinName){
        this.name=name;
        this.latinName=latinName;
        this.obs=0;
    }

    public void observe(){
        this.obs++;
    }

    public String getName() {
        return this.name;
    }

    public String toString(){
        return(this.name+", "+this.latinName+", "+this.obs);
    }
}
