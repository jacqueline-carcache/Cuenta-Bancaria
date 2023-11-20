public class App {

public static void main(String[] args) throws Exception {
   // Crear una instancia de CuentaBancaria
   
   CuentaBancaria micuenta = new CuentaBancaria("455554697", 100, "jacqueline", "jacqueline@gmail.com", "88686011");             
    System.out.println("Saldo: " + micuenta.mostrarSaldo());
     micuenta.retirar(120);
     micuenta.depositar(500);
        ClienteVIP yo1 = new ClienteVIP();  // Constructor vacío
        ClienteVIP yo2 = new ClienteVIP("anna", 500.0);  // Constructor con 2 parámetros
        ClienteVIP yo3 = new ClienteVIP("luis", 1000.0, "luis@gmail.com");  // Constructor con todos los campos
         
                 
   System.out.println("Nombre de yo1: " + yo1.mostrarNombre());
   System.out.println("Límite de crédito de yo2: " + yo2.mostrarLimiteCredito());
   System.out.println("Correo electrónico de yo3: " + yo3.mostrarCorreoElectronico());            
 }
}

