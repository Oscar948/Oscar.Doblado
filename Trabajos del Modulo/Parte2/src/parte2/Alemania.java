/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte2;

/**
 *
 * @author Oscar
 */
public class Alemania extends Pais{
    private String president;
    private String pais;
    
    
    public Alemania(String presidente){
        super("Alemania",presidente);
        this.pais = "Alemania";
        this.president = presidente;
    }
    
    public String Mensaje(){
        return "La máxima representación legal de: " + pais + " es: " + president;
    }
}