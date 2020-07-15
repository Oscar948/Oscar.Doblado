/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Parte2 {

    public static void salida(Object i){
       System.out.println(i.toString());
    }
    public static String entrada(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String m = br.readLine().toString();
            return m;
        } catch (IOException ex) {
            return ex.getMessage().toString();
        }
    }
   
    public static void main(String[] args)
    {    
        Russia pais1 = new Russia(" el presidente Vladímir Putin");
        Japon pais2 = new Japon(" el primer ministro Shinzō Abe");
        Alemania pais3 = new Alemania("Frank-Walter Steinmeier");

        salida(pais1.Mensaje());
        salida(pais2.Mensaje());
        salida(pais3.Mensaje());
    }
    
}
