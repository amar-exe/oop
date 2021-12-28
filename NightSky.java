package com.company;

import java.util.Random;
public class NightSky {

    private double density;
    private int width;
    private int height;
    private Random randomizer;

    private int stars;

    public NightSky(double d) {
        this(d,20,10);
    }

    public NightSky(int w,int h) {
        this(0.1,w,h);
    }

    public NightSky(double d,int w,int h){
        this.density=d;
        this.width=w;
        this.height=h;
        this.stars=0;
        this.randomizer = new Random();
    }

    public void printLine() {
        for(int j=0;j<this.width;j++) {
            if(this.density>=this.randomizer.nextDouble()) {
                System.out.print('*');
                this.stars+=1;
            }
            else System.out.print(' ');
        }
    }
    public void print() {
        this.stars=0;
        for(int j=0;j<this.height;j++) {
            this.printLine();
            System.out.print("\n");
        }
    }
    public int starsInLastPrint() {
        return this.stars;
    }
}