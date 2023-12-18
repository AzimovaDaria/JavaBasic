package ua.hillel.azimova.lessons.lesson8;
import java.util.Arrays;
public class HomeWork10 {
    public static void main(String[] args) {

        int[] lottery = new int[7];
        int n = lottery.length;
        for (int i = 0; i < n; i++) {
            lottery[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (lottery[j] < lottery[minIndex]) {
                    minIndex = j;
                }
            }
            int c = lottery[i];
            lottery[i] = lottery[minIndex];
            lottery[minIndex] = c;
        }


        int[] players = new int[7];
        int n2 = players.length;
        for (int i = 0; i < n2; i++) {
            players[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < n - 1; i++) {
            int minIndex2 = i;
            for (int j = i + 1; j < n; j++) {
                if (players[j] < players[minIndex2]) {
                    minIndex2 = j;
                }
            }
            int h = lottery[i];
            players[i] = players[minIndex2];
            players[minIndex2] = h;
        }


        System.out.println(Arrays.toString(lottery));
        System.out.println(Arrays.toString(players));

        System.out.print("Збіглися індекси: ");
        int index = -1;
        int indexN = 0;
        for (int i = 0; i < n; i++) {
            if (lottery[i] == players[i]) {
                index = i;
                System.out.print(index + "й, ");
                indexN++;
            }
        }
        System.out.println("Кількість збігів: " + indexN);



    }
}
