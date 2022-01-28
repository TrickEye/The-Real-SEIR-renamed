import java.util.Random;
import java.util.Scanner;

public class Main {
    static person[] People;
    static place[] City;
    static int amountPerson = 100;
    static int amountPlace = 100;

    public static void main(String[] Args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        amountPerson = Math.min(scan.nextInt(), amountPerson);
        amountPlace = Math.min(scan.nextInt(), amountPlace);

        People = new person[amountPerson];
        City = new place[amountPlace];

        for (int i = 0; i < amountPerson; i++) {
            People[i] = new person("person No." + i, rand.nextInt() % 4 + 1);
        }
        for (int i = 0; i < amountPlace; i++) {
            City[i] = new place("place No." + i, rand.nextInt() % 4 + 1);
        }
    }
}
