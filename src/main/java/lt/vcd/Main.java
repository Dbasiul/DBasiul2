package lt.vcd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Įveskite valandas (h): ");
        int h = scanner.nextInt();

        System.out.print("Įveskite minutes (m): ");
        int m = scanner.nextInt();

        System.out.print("Įveskite sekundes (s): ");
        int s = scanner.nextInt();

        // Pridedam vieną sekundę
        s++;

        if (s == 60) {
            s = 0;
            m++;
        }
        if (m == 60) {
            m = 0;
            h++;
        }
        if (h == 24) {
            h = 0;
        }

        System.out.println("Laikas po 1 sekundės: " + h + " val., " + m + " min., " + s + " sek.");

        scanner.close();
    }
}
