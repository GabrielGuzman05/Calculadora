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
public class MaquinaPGA {
    double[] promedios;
    double[] horasAsignaturas;
    double PGA;
    int THS;
    Calculadora myCalculadora = new Calculadora();
    
    public void iniciar(){
        setDatos(setTotalAsignaturas());
        calcularTHS();
        calcularPGA();
        System.out.println("El PGA es "+PGA);
    }
    
    public void setDatos(int n){
        promedios = new double[n];
        horasAsignaturas= new double[n];
        for(int i=0;i<n;i++){
            System.out.println("Ingrese el promedio de la asignatura numero "+(i+1));
            double a=ingresarDatoDecimal();
            promedios[i]=a;
            System.out.println("Ingrese las horas de la asignatura numero "+(i+1));
            double b=ingresarDatoEntero();
            horasAsignaturas[i]=b;
        }
    }
    
    public double ingresarDatoDecimal(){ //corresponde a ingresar el promedio de una asignatura
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
        }while(error||numero<(0.1));
        return numero;
    }
    
    public double ingresarDatoEntero(){
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
        }while(error||numero<1);
        return numero;
    }
    
    public static int setTotalAsignaturas(){
        int total=0;
        boolean error;
        System.out.println("Ingrese el total de asignaturas que tiene");
        do{
            error=false;
            try{
                Scanner leer = new Scanner(System.in);
                total=leer.nextInt();
            }catch(InputMismatchException e){
                error=true;
                System.out.println("Error - Por favor ingrese nuevamente el numero");
            }
        }while(error||total<1);
        return total;
    }
    
    public void calcularTHS(){
        for(int i=0;i<horasAsignaturas.length;i++){
            myCalculadora.setNum1(THS);
            myCalculadora.setNum2(horasAsignaturas[i]);
            THS=(int) (myCalculadora.sumar());
        }
    }
    public void calcularPGA(){
        for(int i=0;i<promedios.length;i++){
            myCalculadora.setNum1(horasAsignaturas[i]);
            myCalculadora.setNum2(THS);
            double aux=myCalculadora.dividir();
            myCalculadora.setNum1(aux);
            myCalculadora.setNum2(promedios[i]);
            aux=myCalculadora.multiplicar();
            myCalculadora.setNum1(aux);
            myCalculadora.setNum2(PGA);
            PGA=myCalculadora.sumar();
        }
    }
}
