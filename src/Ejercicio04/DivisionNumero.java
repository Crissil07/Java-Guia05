package Ejercicio04;

public class DivisionNumero {

    int numero1;
    int numero2;

    public DivisionNumero() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void Division() throws ArithmeticException {
        int division = 0;
        division = numero1 / numero2;
        if (numero2 == 0) {
            throw new ArithmeticException("No esta permitido dividir un numero por 0");
        }
        System.out.println("El resultado de la division es: "+division);
    }
}
