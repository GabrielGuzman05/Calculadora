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
public class Interfaz {
    static Calculadora myCalculadora = new Calculadora();
    public static void main(String[] args) {
        System.out.println("Ingrese dos numeros");
        double n1=0;
        double n2=0;
        try{
            Scanner leer = new Scanner(System.in);
            n1=leer.nextDouble();
        }catch(InputMismatchException e){
        
        }
        try{
            Scanner leer = new Scanner(System.in);
            n1=leer.nextDouble();
        }catch(InputMismatchException e){
        
        }
        myCalculadora.setNum1(n1);
        myCalculadora.setNum2(n2);
        
        System.out.println("Ingrese que opercaion quiere hacer");
        System.out.println("1 para suma - 2 para resta");
        System.out.println("3 para dividir - 4 para multiplicar");
        
        int option=0;
        try{
            Scanner leer = new Scanner(System.in);
            option=leer.nextInt();
        }catch(InputMismatchException e){
        
        }
        String resultado="El resultado es ";
        switch(option){
            case 1:
                resultado+=myCalculadora.sumar();
                break;
                
            case 2:
                resultado+=myCalculadora.restar();
                break;    
        
            case 3:
                resultado+=myCalculadora.dividir();
                break;
                
            case 4:
                resultado+=myCalculadora.multiplicar();
                break;
        }
        System.out.println(resultado);
    }
}
