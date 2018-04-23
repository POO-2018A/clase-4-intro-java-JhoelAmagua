package ejercicio5;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String []args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 12: ");
        int num=scan.nextInt();
            switch (num){
                case 1:
                    System.out.println("ENERO");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("FEBRERO");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("MARZO");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("ABRIL");
                    System.out.println();
                    break;
                case 5:
                    System.out.println("MAYO");
                    System.out.println();
                    break;
                case 6:
                    System.out.println("JUNIO");
                    System.out.println();
                    break;
                case 7:
                    System.out.println("JULIO");
                    System.out.println();
                    break;
                case 8:
                    System.out.println("AGOSTO");
                    System.out.println();
                    break;
                case 9:
                    System.out.println("SEPTIEMBRE");
                    System.out.println();
                    break;
                case 10:
                    System.out.println("OCTUBRE");
                    System.out.println();
                    break;
                case 11:
                    System.out.println("NOVIEMBRE");
                    System.out.println();
                    break;
                case 12:
                    System.out.println("DICIEMBRE");
                    System.out.println();
                    break;

                default:
                    System.out.println("Opcion incorrecta");
                    System.out.println();
                    break;
        }
    }
}
