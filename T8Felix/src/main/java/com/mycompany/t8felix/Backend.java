/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.t8felix;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Usiel Alonso
 */
@WebService(serviceName = "Backend")
public class Backend {
       float monto_tarjeta;
    Backend()
       {
           monto_tarjeta=1000;
       }
    public void set_monto_tarjeta(float monto_tarjeta)
    {
        this.monto_tarjeta=monto_tarjeta;
    }
    public float get_monto_tarjeta()
    {
        return monto_tarjeta;
    }
       
    /**
     * This is a sample web service operation
     */
    /**
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
 */
    /**
     * Web service operation
     */
    @WebMethod(operationName = "add")
    public Integer add(@WebParam(name = "j") int j, @WebParam(name = "k") int k) {
        //TODO write your implementation code here:
        k=j+k;
        return k;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "pagar")
    public Boolean pagar(@WebParam(name = "tarjeta") int tarjeta, @WebParam(name = "monto") float monto, @WebParam(name = "cvv") int cvv, @WebParam(name = "nombre") String nombre) {
        //TODO write your implementation code here:
        int t,tcvv;
        float tmonto;
        t=123456;
        tmonto=get_monto_tarjeta();
        tcvv=1234;
        if(tarjeta==t && monto<=tmonto && cvv == tcvv )
        {
            set_monto_tarjeta(tmonto-monto);
            return true;
        }
        else
        {
            return false;
        }
        
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "comprar")
    public Boolean comprar(@WebParam(name = "id_producto") int id_producto, @WebParam(name = "precio") float precio, @WebParam(name = "n_productos") int n_productos, @WebParam(name = "total") float total) {
        //TODO write your implementation code here:
      int stock;
      switch(id_producto){
          case 1:
              stock=5;
              break;
          case 2:
              stock=100;
              break;
          case 3:
              stock=100;
              break;
          case 4:
              stock=100;
              break;
          case 5:
              stock=100;
              break;
          case 6:
              stock=100;
              break;
          default:
              stock=100;
              break;
      }
         
        return n_productos<=stock;

    }
}
