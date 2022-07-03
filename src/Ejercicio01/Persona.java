package Ejercicio01;

import java.util.Scanner;

public class Persona {

    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {

    }

    public void crearPersona() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Nombre");
        nombre = scan.next();
        System.out.println("Edad");
        edad = scan.nextInt();
        System.out.println("Sexo ('H' hombre, 'M' mujer, 'O' otro)");
        sexo = scan.next().charAt(0);
        System.out.println("Peso");
        peso = scan.nextDouble();
        System.out.println("Altura");
        altura = scan.nextDouble();
    }

    public boolean esMayorDeEdad() {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

}
