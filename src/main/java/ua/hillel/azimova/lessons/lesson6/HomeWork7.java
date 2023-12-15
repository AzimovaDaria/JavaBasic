package ua.hillel.azimova.lessons.lesson6;

import java.util.Scanner;

public class HomeWork7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = 0;
        x = (int) (Math.random() * 11);
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter integer from 1 and 10 to win");
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num == x) {
                    System.out.println("You won by picking the whole number " + num);
                    break;
                } else if (num > 10) {
                    System.out.println("Only from 1 to 10!!!");
                } else {
                    System.out.println("Nice try, but no");
                }
            } else {
                System.out.println("Wrong data! Try again");
            }
            scanner.nextLine();
        }




        }


    }