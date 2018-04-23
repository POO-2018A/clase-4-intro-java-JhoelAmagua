package Ejercicio4;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String []args) {
        Scanner scan=new Scanner(System.in);
        System.out.printf("Ingrese un numero: ");
        int numero=scan.nextInt();
        if (numero%2==0){
            System.out.println("El numero ingresado es par");
        }else{
            System.out.println("El numero ingresado es impar");
        }
    }
}
