package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson22Helper2 {
    public Integer[] kunArr() {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        Integer[] arr = new Integer[5];
        Scanner reader = new Scanner(System.in);
        Integer bufer ;
        for (int i = 0; i < 5; i++) {
            while (true) {
                bufer = getKundenNumber();
                if (arrList.contains(bufer)) {
                    System.out.println("Please inser the number diferent from: " + bufer);
                    continue;
                } else {
                    arrList.add(bufer);
                    arr = arrList.toArray(arr);
                    System.out.println("Please insert next number: " + Arrays.toString(arr));
                    break;
                }
            }
        }
        System.out.println("You insert the next numbers: " + Arrays.toString(arr));
        return arr;
    }
    //end of public Integer[] kunArr()
    public  Integer getKundenNumber() {
        Boolean flag = true;
        Integer num = null;
        while (flag) {
            Scanner reader = new Scanner(System.in);
            System.out.println("Input random number from 1 to 50:");
            num = reader.nextInt();
            if (num > 0 && num < 50) {
                break;
            } else {
                System.out.println("Input corect number!");
                flag = true;
            }
        }
        return num;
    }
    // end of public  Integer getKundenNumber()
}
