package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class TasksWeek3 {

    public static double average(int num1, int num2, int num3, int num4) {
        return (double)(num1+num2+num3+num4)/4;
    }

	/*
	//Task1
	public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Average: " + average(1,2,3,4) );
  }*/
	/*
	//Task2
	public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in);

	    System.out.println("Input name: ");
	    String name=reader.nextLine();
	    System.out.println("Name has " + name.length() + " characters");
	}*/
	/*
	//Task3
	public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in);

	    System.out.println("Input name: ");
	    String name=reader.nextLine();
	    for(int i=0;i<name.length();i++) {
	    	System.out.println(name.charAt(i));
	    }}*/
	/*
	//Task4
	public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in);

	    System.out.println("Input first word: ");
	    String wrd=reader.nextLine();

	    System.out.println("Input second word: ");
	    String sbstring=reader.nextLine();

	    int ifFound=wrd.indexOf(sbstring);
	    if(ifFound==-1) {
	    	System.out.println(sbstring + " is not in "+ wrd);
	    }
	    else {
	    	System.out.println(sbstring + " is in "+ wrd);
	    }
	    }*/
	/*
	//Task5
	public static void main(String[] args) {
	    ArrayList<String> words = new ArrayList<String>();
	    Scanner reader = new Scanner(System.in);


	    while(true) {
	    	System.out.println("Type a word: ");
		    String k=reader.nextLine();
			   if(words.contains(k)) {
				   System.out.println("You already entered that word");
				   break;
		   }
			   else {
				   words.add(k);
			   }
	    }
	    }*/
    /*
    //Task6
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);


        while(true) {
            System.out.println("Type a word: ");
            String k=reader.nextLine();
            if(words.contains(k)) {
                System.out.println("You already entered that word");
                break;
            }
            else {
                words.add(k);
            }
        }
    }*/
    public static ArrayList<Integer> lengths(ArrayList<String> lists){
        ArrayList<Integer> newlist = new ArrayList<Integer>();
        for(int i=0; i<lists.size();i++){
            newlist.add(lists.get(i).length());

        }
        return newlist;
    }
    /*
    //Task7
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("jagoda");
        fruits.add("jabuka");
        fruits.add("orah");
        fruits.add("kruska");
        System.out.println(lengths(fruits));
    }*/
    //Task8
    public static void main(String[] args){
        System.out.println("Input word: ");
        Scanner reader = new Scanner(System.in);
        String k=reader.nextLine();
        String temp="";
        for(int i=k.length()-1;i>=0;i--){
            temp+=k.charAt(i);
        }
        if(k.equals(temp)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
