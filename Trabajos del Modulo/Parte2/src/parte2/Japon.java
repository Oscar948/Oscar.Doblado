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
public class Japon extends Pais{
    private String president;
    private String pais;
    
    
    public Japon(String presidente){
        super("Japon",presidente);
        this.pais = "Japon";
        this.president = presidente;
    }
    
    public String Mensaje(){
        return "La máxima representación legal de: " + pais + " es: " + president;
    }
}