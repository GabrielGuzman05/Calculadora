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
    Calculadora myCalculadora = new Calculadora();
    public void iniciar() {
        System.out.println("Ingrese dos numeros");
        myCalculadora.setNum1(enterNumber());
        myCalculadora.setNum2(enterNumber());
        
        System.out.println("Ingrese que opercion quiere hacer");
        System.out.println("1 para suma - 2 para resta");
        System.out.println("3 para dividir - 4 para multiplicar");
        
        int option=0;
        option=chooseOperation();
        String resultado=callOperation(option);
        System.out.println(resultado);
    }
    
    public int chooseOperation(){
        int option=0;
        boolean error;
        do{
            error=false;
            try{
                Scanner leer = new Scanner(System.in);
                option=leer.nextInt();
            }catch(InputMismatchException e){
                error=true;
                System.out.println("Error - Por favor ingrese nuevamente el numero");
            }
        }while(error||option<1||option>4);
        return option;
    }
    
    public String callOperation(int i){
        String resultado="";
        switch(i){
            case 1:
                resultado="El resultado es "+myCalculadora.sumar();
                break;
                
            case 2:
                resultado="El resultado es "+myCalculadora.restar();
                break;    
        
            case 3:
                if(myCalculadora.getNum2()==0){
                    resultado="Error - Division por 0 no aceptada";
                }else{
                    resultado="El resultado es "+myCalculadora.dividir();
                }
                break;
                
            case 4:
                resultado="El resultado es "+myCalculadora.multiplicar();
                break;
        }
        return resultado;
    }
    
    public double enterNumber(){
        double numero=0;
        boolean error;
        do{
            error=false;
            try{
                Scanner leer = new Scanner(System.in);
                numero=leer.nextDouble();
            }catch(InputMismatchException e){
                error=true;
                System.out.println("Error - Por favor ingrese nuevamente el numero");
            }
        }while(error);
        return numero;
    }
}
