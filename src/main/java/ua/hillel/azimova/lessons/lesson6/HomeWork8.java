package ua.hillel.azimova.lessons.lesson6;

import java.util.Scanner;

public class HomeWork8 {

    public static void main(String[] args) {

        int counter = 0;
        for (int i = 1;  ; i++) {
            if (i / 10 != 4 && i % 10 != 4 && i / 10 != 9 && i % 10 != 9) {
                counter++;
                System.out.println(i);
            } if (counter == 100) {
                break;
            }

        }
        System.out.println("counter = " + counter);




    }
}
