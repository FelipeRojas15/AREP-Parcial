/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.app.sparkWeb;
import edu.escuelaing.arem.app.*;
import java.io.IOException;
import static spark.Spark.*;
import spark.Request;
import spark.Response;
/**
 *
 * @author rojas
 */


public class SparkWeb {
    public static void main(String[] args){
        port(getPort());
        staticFiles.location("/public");
        
        get("/",(req, res)-> homePage(req, res));
        get("/calculator",(req, res)-> calculatorPage(req,res));
        get("/result",(req, res)-> resultPage(req,res));
        
    }
    public static int getPort(){
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; 
    }
    private static String homePage(Request req, Response res) {
        
        String home = "<!DOCTYPE html>\n"
                + "<html>\n"
                + "   \n"
                + "   <head>\n"
                + "      <title>Home Page</title>\n"
                + "   </head>\n"
                + "	\n"
                + "   <body>\n"
                + "<center>"
                + "      <h2>Bienvenidos a la Calculadora de Media y Desviación Estandar</h2>\n"
                + "      <p>Esta calculadora permite ingresar una cantidad n de numeros y calcular su media y desviación estandar.\n\n</p>\n"
                + "      <p>\n\nClick en el link para ir a la calculadora</p>\n"
                + "      <a href = \"/calculator\" target = \"_self\">Calculadora</a>\n"
                + "</center>"
                + "   </body>\n"
                + "	\n"
                + "</html>";
        return home;
    }
    private static String calculatorPage(Request req, Response res) throws IOException{
        
            String calculosHtml = "<!DOCTYPE html>\n"
                + "<html>\n"
                + "   \n"
                + "   <head>\n"
                + "      <title>Calculadora</title>\n"
                + "   </head>\n"
                + "	\n"
                + "<body>"
                + "<center>"
                + "      <h2>Ingrese los datos</h2>\n"
                + "      <p>Ingrese los numeros separados por espacios en blanco.</p>\n"
                + "       <form action=\"/result\">\n"
                + "           Conjunto de numeros:<br> <br>\n"
                + "           <input type=\"text\" placeholder=\"Numeros\" name=\"inputData\" ><br><br>\n"
                + "           <input type=\"submit\" value=\"Calcular\">\n"
               // + "      
                + "       </form>\n"
                + "</center>\n"
                + "</body>\n"
                + "</html>";
            
        
        
        
        return calculosHtml;
        
        
    }
   private static String resultPage(Request req, Response res) throws IOException{
        String result = req.queryParams("inputData");
        DataReader data = new DataReader();
        String listas = data.ordenamiento(result);
        LinkedList<Float> lista =data.readForm(result);
        float media = (float)lista.get(1).getValue();
        float sum = (float)lista.get(0).getValue();
        
        
        
        
        
        //System.out.println(lista.dataList(2));
        String resultado = ("<!DOCTYPE html>"
                + "<html>\n"
                + "   <head>\n"
                + "      <title>Resultado</title>\n"
                + "   </head>\n"
                + "	\n"
                + "<body>"
                + "<h2>Media Estadística:"+ media +"</h2>"
                    + "<h2>Sumatoria:" + sum+ " </h2>"
                 + "<h2>Lista:" + listas+ " </h2>"
                + " <a href = \\\"/\\\" target = \\\"_self\\\">Home Page</a>\\n\""
                + "</body>"
                + "</html>");
        
        return resultado;
    
    }
}
