package Ejercicio03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        int n = 0;
        int cont = 0;

        System.out.println("Adivine el numero generado de manera aleatoria de 0 a 500");
        int numero = (int) (Math.random() * 10+1);

        do {
            try {
                n = scan.nextInt();
                if (n > numero) {
                    System.out.println("El numero ingresado soprepaso el numero incognito");
                } else if (n < numero) {
                    System.out.println("El numero ingresado es menor al numero incognito");
                } else if (n == numero) {
                    System.out.println("Felicitaciones, acertaste el numero");
                }
                cont++;
            } catch (Exception e) {
                System.out.println("Lo ingresado no es un numero");
                cont++;
            }
        } while (n != numero);
        System.out.println("Cantidad de intentos: " + cont);

    }

}
