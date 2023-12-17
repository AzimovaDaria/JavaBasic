package ua.hillel.azimova.lessons.lesson6;

import java.util.Scanner;

public class HomeWork8 {

    public static void main(String[] args) {

        int counter = 0;
//        int x = 0;
        for (int i = 1; ; i++) {
            if (i / 10 != 4 && i % 10 != 4 && i / 10 != 9 && i % 10 != 9) {
                System.out.println(i);;
            } else if (i % 10 != 4 && i / 10 != 4 && i % 10 != 9 && i / 10 != 9) {
//                int x = i % 10;
//                i = i / 10;
                    System.out.println(i);;
            }
            if (counter == 100) {
                break;
            }
            counter++;
            System.out.println(i);

        }
        System.out.println("counter = " + counter);
////
        }
    }


