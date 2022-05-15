/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientconsole8;

import java.util.Scanner;

/**
 *
 * @author Usiel Alonso
 */
public class ClientConsole8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int j=1;
        int k=1;
        //int res=add(j,k);
        //System.out.println("Resultado:"+res);
        String response="S";
        do{
        System.out.println("Productos \n\t 1.- Lapiceros Modelo 34-G $20\n\t 2.- LapiZ Modelo 2A $10");
        System.out.println("\t3.- Borradores de Goma $5\n\t 4.- Correctores(Liquidos) $15");
         System.out.println("\t5.- Paquete Geometria $50\n\t 6.- Reglas $10");
         Scanner sc = new Scanner(System.in);
         Scanner sc2 = new Scanner(System.in);
         System.out.println("Seleccione el ID del Producto");
          int seleccion = sc.nextInt();
          System.out.println("Indique cuantos productos necesita");
          int stock= sc.nextInt();
          float precio,total;
                switch(seleccion){
          case 1:
              precio=20;
              break;
          case 2:
              precio=10;
              break;
          case 3:
              precio=5;
              break;
          case 4:
              precio=15;
              break;
          case 5:
              precio=50;
              break;
          case 6:
              precio=10;
              break;
          default:
              precio=0;
              break;
      }
          total=precio*stock;
          Boolean resp1=comprar(seleccion,precio,stock,total);//Verificar el Stock
          if(resp1==true)
          {
              System.out.println("Procesando el Pago.......");
              System.out.println("Inserte los datos de la tarjeta");
              System.out.println("Nombre Completo:");
              String nombre;
              nombre = sc2.nextLine();
              System.out.println("Tarjeta:");
              int tarjeta=sc.nextInt();
              System.out.println("El monto sera de:"+total);
              System.out.println("CVV");
              int cvv=sc.nextInt();
              System.out.println("¿Desea finalizar su compra? S/N");
              String finalizar=sc.next();
              if(finalizar.equals("S") || finalizar.equals("s"))
              {
                  Boolean resp2=pagar(tarjeta,total,cvv,nombre);//Pago de Tarjeta
                  if(resp2==true)
                  {
                      System.out.println("La Transaccion Fue Exitosa\nPago Completado");
                  }
                  else
                  {
                      System.out.println("No se pudo realizar la Transaccion\nPago No Completado");
                  }
              }
              else
              {
                  System.out.println("Cancelando Compra.......");
              }
          }
          else
          {
              System.out.println("No existe suficiente stock");
          }
            System.out.println("¿Desea volver a comprar?");
            
            response=sc.next();
    }while(response.equals("s") ||response.equals("S"));
    }

    private static Boolean comprar(int idProducto, float precio, int nProductos, float total) {
        clientconsole8.Backend_Service service = new clientconsole8.Backend_Service();
        clientconsole8.Backend port = service.getBackendPort();
        return port.comprar(idProducto, precio, nProductos, total);
    }

    private static Boolean pagar(int tarjeta, float monto, int cvv, java.lang.String nombre) {
        clientconsole8.Backend_Service service = new clientconsole8.Backend_Service();
        clientconsole8.Backend port = service.getBackendPort();
        return port.pagar(tarjeta, monto, cvv, nombre);
    }

    private static Integer add(int j, int k) {
        clientconsole8.Backend_Service service = new clientconsole8.Backend_Service();
        clientconsole8.Backend port = service.getBackendPort();
        return port.add(j, k);
    }

   
    
}
