/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte_1;

import com.sun.javafx.scene.layout.region.Margins;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oscar
 */
public class ciudadanos{
    public String Nombre;
    public int Edad;
    public int Experiencia;
    
    protected void SetNombre(String Name){
        this.Nombre = Name;
    }
    protected void SetEdad(int e){
        this.Edad = e;
    }
    protected void SetExperiencia(int exp){
        this.Experiencia = exp;
    }
    protected String getNombre(){
        return Nombre;
    }
    protected int getEdad(){
        return Edad;
    }
    protected int getExperiencia(){
        return Experiencia;
    }
}

class ciudadano {
    
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
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ciudadanos c = new ciudadanos();
    String texto;

    try{
        salida("Digite su edad:");
        String e = entrada();
        int edad = Integer.parseInt(e);
        salida("Digite su nombre:");
        String name = entrada();
        salida("Digite la cantidad de años de experiencia:");
        String ex = entrada();
        int exp = Integer.parseInt(ex);
        
        
        c.SetEdad(edad);
        c.SetExperiencia(exp);
        c.SetNombre(name);
        
        
        int Experiencia = c.getExperiencia();
        int Edad = c.getEdad();
        String Nombre = c.getNombre();
        
        salida(Nombre + " a sus: " + Edad + " años de edad, cuenta con: " + Experiencia + " años de experiencia." );

    }catch(Exception e){
        e.getMessage().toString();
    }
    System.out.print("Hola Mundo!");
    }
    
}
