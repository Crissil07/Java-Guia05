package Ejercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        
        int division;

        
        System.out.println("Ingrese 2 numeros enteros para dividir");

        try {
            
            division = num1 / num2;
        } catch (NumberFormatException e1) {
            System.out.println("No ha ingresado un numero entero");
        } catch (ArithmeticException e2) {
            System.out.println("");
        }

    }
    
    public void nextLine(){  
        int num1;
        int num2;
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese 2 numeros enteros para dividir");
        num1 = Integer.parseInt(scan.nextLine());
        num2 = Integer.parseInt(scan.nextLine());
    }
    
}
