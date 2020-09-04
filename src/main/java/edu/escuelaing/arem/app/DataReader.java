/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.escuelaing.arem.app;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
        

/**
 *
 * @author rojas
 */
public class DataReader {
    /**
     * Method to read the node file
     * @param archivo
     * @return lista LinkedList
     */
    public LinkedList readFile(String archivo){
        LinkedList lista = null;
        try{
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            lista= new LinkedList();
            String bfLector;
            while ((bfLector = lector.readLine())!= null){
                lista.add(Float.parseFloat(bfLector));    
            }
            lector.close();
                    
        }catch(Exception e){
            System.err.println("Direccion de archivo equivocada");
        } 
        return lista;
    
    }
    
    public LinkedList<Float>  readForm (String form) throws FileNotFoundException, IOException{
        LinkedList lista = new LinkedList();
        
        String[] num = form.split(" ");
        for(int i=0;i<form.length()-(form.length()/2);i++){
          
                float a = Float.parseFloat(num[i]);
                
                lista.add(a);
        }
            
        
        
        //System.out.println("aca voy, cansado pero voy");
        List<String> list = null;
        Calculator operator = new Calculator(lista);
        LinkedList<Float> result =  new LinkedList<Float>();
        result.bubbleSort(lista);
        
        result.add(operator.sumatoria());
        result.add(operator.mean());
        
        
      
        //float mean = operator.mean();
        
        //result.add(mean);
        
        return result;
    
    
    }
    
    
}
