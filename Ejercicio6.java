package ejercicio6;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        boolean estanevando;
        boolean estalloviendo;
        double ambiente;
        int n;
        int m;

        System.out.println("Si esta nevando ingrese 1, si no, ingrese 0: ");
        n=scan.nextInt();
        if (n==1) {
            estanevando = true;
        }else{
            estanevando= false;
        }

        System.out.println("Si esta lloviendo ingrese 1, si no, ingrese 0: ");
        m=scan.nextInt();
        if (m==1) {
            estalloviendo = true;
        }else{
            estalloviendo= false;
        }

        System.out.println("Ingrese la temperatura del ambiente");
        ambiente=scan.nextDouble();

        if ((estanevando|| estalloviendo == true) || ambiente<10){
            System.out.println("Nos quedamos en casa!");
        } else {
            System.out.println("Vamos afuera!");
        }

    }
}
