package semOO.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;
        double areaX, areaY;
        System.out.println("Valores triangulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Valores triangulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();
        double p = (xA + xB + xC) / 2;
        areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
        p = (yA + yB + yC) / 2;
        areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
        System.out.println("Area X: " + String.format("%.4f",areaX));
        System.out.println("Area Y: " + String.format("%.4f",areaY));

        if(areaX > areaY){
            System.out.println("Maior area: X");
        }else{
            System.out.println("Maior area: Y");
        }

        sc.close();

    }
}
