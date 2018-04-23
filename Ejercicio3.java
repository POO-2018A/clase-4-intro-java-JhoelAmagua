package ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String []args){
        Scanner scan= new Scanner(System.in);

        System.out.printf("Ingrese su edad: ");
        double edad= scan.nextDouble();
        if (edad<18){
            System.out.println("Usted es menor de edad");
        }else{
            System.out.println("Usted es mayor de edad");
        }
    }
}
