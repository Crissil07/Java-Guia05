package Ejercicio02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        int[] num = new int[5];

        System.out.println("Ingrese numeros del 1 al 10");
        for (int i = 0; i < 5; i++) {
            num[i] = scan.nextInt();
        }

        System.out.println("Los nomeros ingresados fueron");
        for (int i = 0; i < 6; i++) {
            try {
                System.out.println("[" + num[i] + "]");
            } catch (ArrayIndexOutOfBoundsException a) {
                System.out.println("Error, el indice no es correcto");
            }

        }

    }

}
