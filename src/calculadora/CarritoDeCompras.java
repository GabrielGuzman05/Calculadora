/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Gabriel
 */
public class CarritoDeCompras {
    
    String producto[] = new String [5];
    int precio[] = new int [5];
    
    int carrito[] = new int[5];
    
    public void iniciar(){
        producto[0]="Shampoo";
        producto[1]="Jabon";
        producto[2]="Balsamo";
        producto[3]="Gel";
        producto[4]="Shampoo con Escencia Natural";
        
        precio[0]=1500;
        precio[1]=500;
        precio[2]=2500;
        precio[4]=3000;
        precio[4]=5000;
        
        for(int i=0;i<5;i++){
            System.out.println("¿Cuantas unidades quiere de :"+producto[i]+"?");
            carrito[i]=ingresarDatoEntero();
        }
        
        System.out.println("El total de su carrito de compras es:"+totalCarrito());
    
    }
    
    public int ingresarDatoEntero(){
        int numero=0;
        boolean error;
        do{
            error=false;
            try{
                Scanner leer = new Scanner(System.in);
                numero=leer.nextInt();
            }catch(InputMismatchException e){
                error=true;
                System.out.println("Error - Por favor ingrese nuevamente el numero");
            }
        }while(error||numero<0);
        return numero;
    }
    
    public int totalCarrito(){
        Calculadora myCalculadora = new Calculadora();
        int total=0;
        for(int i =0;i<5;i++){
            myCalculadora.setNum1(carrito[i]);
            myCalculadora.setNum2(precio[i]);
            int aux=(int)myCalculadora.multiplicar();
            myCalculadora.setNum1(total);
            myCalculadora.setNum2(aux);
            total=(int)myCalculadora.sumar();
        }
        return total;
    }
}
