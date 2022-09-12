package exVetores.ex11.application;

import exVetores.ex11.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double altura, somaMulher = 0, mediaMulher = 0, maior, menor;
        char sexo;
        int qtdHomem = 0, qtdMulher = 0;
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        Pessoa vet[] = new Pessoa[n];
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            altura = sc.nextDouble();
            System.out.print("Sexo da " + (i + 1) + "a pessoa: ");
            sexo = sc.next().charAt(0);
            vet[i] = new Pessoa(altura, sexo);
            if (sexo == 'M' || sexo == 'm') {
                qtdHomem++;
            } else {
                qtdMulher++;
                somaMulher += altura;
            }
        }
        mediaMulher = somaMulher / qtdMulher;
        maior = vet[0].getAltura();
        menor = vet[0].getAltura();
        for (int i = 0; i < vet.length; i++) {
            if (vet[i].getAltura() > maior) {
                maior = vet[i].getAltura();
            } else if (vet[i].getAltura() < menor) {
                menor = vet[i].getAltura();
            }
        }
        System.out.printf("Menor altura = %.2f%n", menor);
        System.out.printf("Maior altura = %.2f%n", maior);
        System.out.printf("Media das alturas das mulheres = %.2f%n", mediaMulher);
        System.out.println("Numero de homens = " + qtdHomem);

        sc.close();
    }
}
