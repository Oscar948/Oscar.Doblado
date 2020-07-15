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
import parte2.Pais;

/**
 *
 * @author Oscar
 */

public abstract class Pais{
    private String pais;
    private String presidente;
    
    public Pais(String pais, String presidente){
        this.pais = pais;
        this.presidente = presidente;
    }
    
    public abstract String Mensaje(); 
    
    public String getPresidente(){
        return presidente;
    }
    
    public String getPais(){
        return pais;
    }
    
}