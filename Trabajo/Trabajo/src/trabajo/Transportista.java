/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Axel Omar
 */

public class Transportista{
	private String color;
	private boolean encendida;
        
        
        private String labor;
        
	/**
	 * El objeto de tipo Lampara puede instanciarse con un color
	 * elegido al instanciarlo, o con el color "Roja" predeterminado.
	 */
        
        public Transportista(int FaseDia){
            switch(FaseDia){
                case 1: 
                    this.labor = "\nChequeo general matutino";
                    break;
                case 2: 
                    this.labor = "\nMantenimiento";
                    break;
                case 3: 
                    this.labor = "\nLimpieza y revisión";
                    break;
                default:
                    this.labor = "\nDefinición de ruta";
            }
        }
        public Transportista(String n){
            this(Integer.parseInt(n));
        }
        public String definirLabor(int n){
            return labor;
        }
 
}

class TrabajoCreate {

    public static String LaborInicial;
    
    public static String motorista(){
        LaborInicial = "\nChequeo rutinario."; 
        return "";
    }


    public static void main(String[] args) {
        
        Calendar calendario = new GregorianCalendar();
        int hora =calendario.get(Calendar.HOUR_OF_DAY);
        int l = 0;
        if(hora == 24 || (hora >= 0 && hora < 7)){
            l = 1;
        }else if(hora >= 7 && hora < 13){
            l = 2;
        }else if(hora >= 13 && hora < 20){
            l = 3;
        }else if(hora >= 21 && hora < 24){
            l = 0;
        }
        Transportista transportista = new Transportista(l);
        //Lampara lampara = new Lampara();
        System.out.println(transportista.definirLabor(l));        
        System.out.println("\nSegún la hora local: " + hora + ", es momento de : " + transportista.definirLabor(4));
    }
    
}
