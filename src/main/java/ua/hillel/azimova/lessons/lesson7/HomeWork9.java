package ua.hillel.azimova.lessons.lesson7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class HomeWork9 {
    public static void main(String[] args) {

        double t1 = 0;
        double t2 = 0;
        int[] team1 = new int[25];
        for (int i = 0; i < team1.length; i++) {
            team1[i] = 18 + (int) (Math.random() * 23);
            t1 += team1 [i];
        }
        System.out.println("Вік гравців першої команди " + Arrays.toString(team1));

        int[] team2 = new int[25];
        for (int i = 0; i < team2.length; i++) {
            team2[i] = 18 + (int) (Math.random() * 23);
            t2 += team2 [i];
        }
        System.out.println("Вік гравців другої команди " + Arrays.toString(team2));

        System.out.println("Середній вік гравців першої команди " + t1 / team1.length);
        System.out.println("Середній вік гравців другої команди " + t2 / team2.length);


















//
//
//
    }
}
