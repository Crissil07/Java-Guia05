package Ejercicio01;

public class Main {

    public static void main(String[] args) {
        
         Persona persona;

        try {
            
            persona = null;
            
            persona.esMayorDeEdad();
            
        }catch (Exception e){
            System.out.println("Hay un error");
        }
    }
}
