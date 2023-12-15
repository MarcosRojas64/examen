package practica04;

import java.util.Scanner;

/*  orientacion a objetos
 * @Marcos Rojas 
 */
public class Persona {
 private Scanner scanner;
 private String Nombre;
  private int edad;

  public void inicializar(){
  scanner = new Scanner(System.in);
  System.out.print("Ingrese Nombre:");
  Nombre = scanner.nextLine();
   System.out.print("Digite Edad");
    edad = scanner.nextInt();
}
public void Imprimir(){
    
 System.out.println("Nombre Ingresado="+Nombre);
 System.out.println("Edad digitado="+edad);

}


 public void buscaMayor(){
 if (edad >=18) {
     System.out.println(edad+" es mayor de edad=");
 } else{
 System.out.println(edad+" Menor de edad");

 }
 


}   // para que pueda imprimir y verse

     public static void main(String[] args) {
        Persona persona = new Persona();
       persona.inicializar(); 
      persona.Imprimir();
      persona.buscaMayor();

    
    }
}
        













    

