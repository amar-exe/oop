package com.company;

public class Player {
    private String playerName;
    private int numOfGoals;

    public Player(String playerName){
        this.playerName=playerName;
    }

    public Player(String playerName, int numOfGoals){
        this.playerName=playerName;
        this.numOfGoals=numOfGoals;
    }

    public String getName(){
        return this.playerName;
    }

    public int goals(){
        return this.numOfGoals;
    }

    public String toString(){
        return(this.playerName + "\nGoals: " + this.numOfGoals);
    }

}
