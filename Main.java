package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lesson22Helper1 help1 = new Lesson22Helper1();
        Lesson22Helper2 help2 = new Lesson22Helper2();
        Lesson22Helper3 help3 = new Lesson22Helper3();
        // Lesson22Helper4 help4  = new Lesson22Helper4();//reserv class
        Integer[] kunArray = help2.kunArr();
        Integer[] glukArray = help3.setGlukNumber();
        help1.getCoinsideKundenAndGluk(kunArray, glukArray);
    }
}
