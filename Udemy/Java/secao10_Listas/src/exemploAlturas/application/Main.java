package exemploAlturas.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double vet[];
        int n;
        double media = 0;

        System.out.println("Quantas alturas?");
        n = sc.nextInt();
        vet = new double[n];
        System.out.println("Alturas:");
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Altura " + (i + 1) + ": ");
            vet[i] = sc.nextDouble();
        }
        for (int j = 0; j < vet.length; j++) {
            media += vet[j];
        }
        System.out.println("Média: " +String.format("%.2f%n",media/n));


        sc.close();

    }
}
