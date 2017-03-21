/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Gabriel
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    private double num1;
    private double num2;
    
    public void setNum1(double num){
        num1=num;
    }
    public void setNum2(double num){
        num2=num;
    }
    public double getNum1(){
        return num1;
    }
    public double getNum2(){
        return num2;
    }
    
    public double sumar(){
        return (num1+num2);
    }
    public double restar(){
        return (num1-num2);
    }
    public double dividir(){
        return (num1/num2);
    }
    public double multiplicar(){
        return (num1*num2);
    }
}
