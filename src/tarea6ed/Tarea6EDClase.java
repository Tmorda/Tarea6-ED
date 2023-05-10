/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6ed;

/**
 *
 * @author David
 */
public class Tarea6EDClase {
        public void aplicarDescuento(double valorProducto, int numProductos){     double Total;
    if(numProductos>3)
        valorProducto-=DescuentoPorVolumen;
            if (numProductos!=0){
            Total = valorProducto*0.8;
            MostrarPorPantalla(Total);
        }else {
            Total = valorProducto*0.95;
            MostrarPorPantalla(Total);
        }   

    }
    private static final int DescuentoPorVolumen = 5;

    private void MostrarPorPantalla(double Total) {
        System.out.println("El total a pagar es:"+Total);
        System.out.println("Enviado");
    }

}
