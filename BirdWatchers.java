package com.company;

import java.util.Scanner;
import java.util.ArrayList;

class BirdsWatchers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<Bird>();
        boolean exit = false;
        while(true) {
            if(exit) break;
            System.out.println("? ");
            String command=input.nextLine();
            switch(command) {
                case "Add":
                    System.out.println("Name: ");
                    String name=input.nextLine();
                    System.out.println("Latin name: ");
                    String lname=input.nextLine();
                    Add(birds,name,lname);
                    break;
                case "Observe":
                    System.out.println("What?: ");
                    String nameo=input.nextLine();
                    int help = 0;
                    for(Bird bird: birds) {
                        if(bird.getName().equals(nameo)) {
                            bird.observe();
                            help=help+1;
                        }
                    }
                    if(help==0) System.out.println("Is not a bird!");
                    break;
                case "Show":
                    for(Bird bird: birds) {
                        System.out.println(bird);
                    }
                    break;
                case "Quit":
                    exit=true;
                    break;
                default:
                    break;
            }
        }
    }
    public static void Add(ArrayList<Bird> birds, String bird,String lname) {
        if(!birds.contains(bird)) birds.add(new Bird(bird,lname));
    }

}