package com.company;

public class StringUtils {
    public static boolean included(String word, String searched){
        if((word==null)||(searched==null)){
            return false;
        }

        if(word.trim().toLowerCase().contains(searched.trim().toLowerCase())){
            return true;
        }
        else return false;
    }
}
