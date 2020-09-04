/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.app;

/**
 *
 * @author rojas
 */
public class App {
    public static void main(String[] args){
    DataReader data = new DataReader();
    LinkedList lista = data.readFile("data.txt");
    LinkedList listaDos  = data.readFile("dataDos.txt");
    Calculator operation = new Calculator(lista);
    Calculator operacion = new Calculator(listaDos);
    System.out.println("#Case 1");
    //System.out.printf("La media es: %.2f %n",operation.mean());
    //System.out.printf("La desviacion estandar es: %.2f %n",operation.standarDeviation());
    System.out.println("#Case 2");
    //System.out.printf("La media es: %.2f %n",operacion.mean());
    //System.out.printf("La desviacion estandar es: %.2f %n",operacion.standarDeviation());
    }
    
}
