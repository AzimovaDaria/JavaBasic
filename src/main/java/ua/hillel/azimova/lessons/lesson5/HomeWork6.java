package ua.hillel.azimova.lessons.lesson5;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Team1");
        String team1 = scanner.nextLine();

        System.out.println("Frags1Team:");

        int playerO1 = 0;
        int playerO2 = 0;
        int playerO3 = 0;
        int playerO4 = 0;
        int playerO5 = 0;

        if (scanner.hasNextInt()) {
            playerO1 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program!!!");
            System.exit(0);
        }

        if (scanner.hasNextInt()) {
            playerO2 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program!!!");
            System.exit(0);
        }

        if (scanner.hasNextInt()) {
            playerO3 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program!!!");
            System.exit(0);
        }

        if (scanner.hasNextInt()) {
            playerO4 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program!!!");
            System.exit(0);
        }

        if (scanner.hasNextInt()) {
            playerO5 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program!!!");
            System.exit(0);
        }

        scanner.nextLine();


        System.out.println("Team2");
        String team2 = scanner.nextLine();

        System.out.println("Frags2Team:");

        int playerE1 = 0;
        int playerE2 = 0;
        int playerE3 = 0;
        int playerE4 = 0;
        int playerE5 = 0;

        if (scanner.hasNextInt()) {
            playerE1 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program!!!");
            System.exit(0);
        }

        if (scanner.hasNextInt()) {
            playerE2 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program!!!");
            System.exit(0);
        }

        if (scanner.hasNextInt()) {
            playerE3 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program!!!");
            System.exit(0);
        }

        if (scanner.hasNextInt()) {
            playerE4 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program!!!");
            System.exit(0);
        }

        if (scanner.hasNextInt()) {
            playerE5 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program!!!");
            System.exit(0);
        }

        scanner.nextLine();


        double t1 = ((playerO1 + playerO2 + playerO3 + playerO4 + playerO5) / 5);
        double t2 = ((playerE1 + playerE2 + playerE3 + playerE4 + playerE5) / 5);


        if (t1 > t2) {
            System.out.println("Перемогла команда " + team1 + " набрала " + t1 + " очків");

        } else if (t1 < t2) {
            System.out.println("Перемогла команда " + team2 + " набрала " + t2 + " очків");

        } else if (t1 == t2) {
            System.out.println("Переможця немає, обидві команди набрали по " + t1 + " очків");
        }


    }
}

