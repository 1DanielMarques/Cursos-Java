package contribuintes.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos contribuintes? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

        }


        sc.close();
    }
}
