package practica04;
public class Banco{
public Cliente  Cliente1,Cliente2,Cliente3;
  //constructor
 public Banco(){
 Cliente1 = new Cliente("pablo");
 Cliente1 = new Cliente ("Julia");
 Cliente1 = new Cliente ("sofia");


 }

public void operar(){
 Cliente1.depositar(50000);
 Cliente2.depositar(150000);
 Cliente3.extraer(1000000);
}
 public void MostrarTotalesCliente(){
  System.out.println("Total del cliente," + Cliente1.retornarMonto() + " = " + Cliente1.retornarMonto());
    System.out.println("Total del cliente," + Cliente2.retornarMonto() + " = " + Cliente2.retornarMonto());
      System.out.println("Total del cliente," + Cliente3.retornarMonto() + " = " + Cliente3.retornarMonto());
 }

 public void MostrarTotalBanco(){
  int total = Cliente1.retornarMonto() + Cliente2.retornarMonto() + Cliente3.retornarMonto();
  System.out.println("Total del Banco" + total);


 }

   public static void main(String[] args) {
     Banco banco = new Banco();
     banco.operar();
     banco.MostrarTotalesCliente();




   }

}