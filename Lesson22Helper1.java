package org.example;


import java.util.ArrayList;
import java.util.Arrays;

public class Lesson22Helper1 {
    public Integer[] getCoinsideKundenAndGluk(Integer[] arrKunden, Integer[] arrGluk){
        ArrayList<Integer> arrCoinside = new ArrayList<Integer>();
        for (int i : arrKunden){
            for (int j : arrGluk){
                if(i == j){
                    arrCoinside.add(i);
                    System.out.println("Your gluk number is: "+i);
                }
            }
        }
        Integer[] finalArrCoinside = new Integer[arrCoinside.size()];
        finalArrCoinside = arrCoinside.toArray(finalArrCoinside);
        if(finalArrCoinside.length == 0){
            System.out.println("You have no lucky number. Don't worry, be happy!");
        }else {
            System.out.println("You have the next coinside with gluk numbers: " + Arrays.toString(finalArrCoinside));
        }
        return finalArrCoinside;
    }
}