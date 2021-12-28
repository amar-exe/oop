package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] values = {6,5,8,7,11};

        System.out.println("smallest: "+smallest(values));
        System.out.println("index of the smallest: "+ indexOftheSmallest(values));

        int k=3;

        System.out.println("Index of the smallest starting of "+3+" is: "+indexOfTheSmallestStartingFrom(values,3));

        swap(values,3,2);



        int[] arr = {-3,2,3,4,7,8,12};


        Scanner reader = new Scanner(System.in);

        System.out.println();
        System.out.println("Values of the array: " + Arrays.toString(arr));
        System.out.println();

        System.out.println("Enter searched number: ");
        Integer searchedValue = reader.nextInt();
        System.out.println();

        boolean result = binarySearch(arr, searchedValue);

        System.out.println(result);

        printElegantly(values);
    }



    public static int smallest(int[] array) {
        int temp= array[0];
        for(int i =0;i<array.length;i++) {
            if (temp>array[i]) {
                temp=array[i];
            }
        }
        return temp;


    }
    public static int indexOfTheSmallestStartingFrom(int[] array, int start) {
        int smallest= array[0];
        int index=0;
        for(int i=start;i<array.length;i++) {
            if (smallest>array[i]) {
                smallest=array[i];
                index=i;
            }
        }
        return index;

    }
    public static int indexOftheSmallest(int[] array) {
        int smallest= array[0];
        int index=0;
        for(int i =0;i<array.length;i++) {
            if (smallest>array[i]) {
                smallest=array[i];
                index=i;
            }
        }
        return index;

    }
    public static void swap(int[] array, int ind1, int ind2) {
        int temp=array[ind1];
        array[ind1]=array[ind2];
        array[ind2]=temp;
        System.out.println(Arrays.toString(array));
    }

    public static void printElegantly(int[] array) {
        for(int i=0;i<array.length-1;i++) {
            System.out.print(array[i]+", "); // rework

        }
        System.out.print(array[array.length-1]);
    }

    public static boolean binarySearch(int[] array, int number){
        Arrays.sort(array);
        int i=array.length;
        while(i!=0) {
            i=i/2;
            if(array[i]>=number) {
                i=i/2;
            }
            if(array[i]<=number) {
                i=i/2;
            }
        }
        if (array[i]==number) {
            return true;
        }
        else {
            return false;
        }

    }
    }


