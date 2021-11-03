package com.company;

import java.util.*;

public class Team {
    private String teamName;
    private ArrayList<Player> players = new ArrayList<Player>();
    private int maxSize;

    public Team(String teamName){
        this.teamName=teamName;
        this.maxSize=16;
    }

    public String getName(){
        return this.teamName;
    }

    public void addPlayer(Player player){
        if(players.size()<this.maxSize){
            this.players.add(player);
        }

    }

    public void printPlayers(){
        Iterator iter= players.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());}}

    public void setMaxSize(int maxSize){
            this.maxSize=maxSize;
        }


    public int size(){
        return players.size();
    }

    public int goals(){
        int sum=0;

        for(Player p: players) {
        sum+=p.goals();
        }

        return sum;
    }


    }

