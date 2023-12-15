package practica04;

import java.util.Scanner;
public class Sueldo {
    private Scanner scanner ;
    private int[] sueldo;

    public  Sueldo(){
        scanner = new Scanner(System.in);
        sueldo = new int[5];

    }
    private void capturar(){
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese sueldo "+ (i + 1) + ":" );
            sueldo[i] = scanner.nextInt();
        }
    }
    private void inprimir(){
        for (int i = 0; i < 5; i++) {
            System.out.print("Sueldo ingresado en la posicion  "+ (i + 1) + ":" + sueldo[i] );
            sueldo[i] = scanner.nextInt();
        }
}

 public static void main(String[] args) {
 Sueldo sueldo = new Sueldo();
 sueldo.capturar();
 sueldo.inprimir();
}
}