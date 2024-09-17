package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Lesson22Helper3 {
    public  Integer[] setGlukNumber(){
        Random rand = new Random();
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        Integer[] glukNummerArray = new Integer[5];
        Integer bufer ;
        for (int i = 0; i < glukNummerArray.length; i++) {
            while (true){
                bufer = rand.nextInt(1, 50);
                if(arrList.contains(bufer)){
                    //System.out.println("bufer is in arr!"+bufer);//proof tool
                    continue;
                }else {
                    arrList.add(bufer);
                    glukNummerArray = arrList.toArray(glukNummerArray);
                   // System.out.println("glukNummerArray : " + Arrays.toString(glukNummerArray));//proof tool
                    break;
                }
            }
        }
        System.out.println("Final gluk numbers are: "+Arrays.toString(glukNummerArray));
        return glukNummerArray;
    }
}
