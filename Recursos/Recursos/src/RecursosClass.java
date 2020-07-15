
import java.io.Console;
import java.util.Scanner;
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Axel Omar
 */
public class RecursosClass {
        
    public static String futuro(){
        System.out.print("\nEstoy aprendiendo, pero seré el mejor programador del mundo.");
        return "";
    }
    
    public static String calificacion(int n){
        String mensaje = "";
        
        if(n >= 70){
            mensaje = "\nAprovado";
        }else{
            mensaje = "\nReprobado";        
        }
        return mensaje;
    }
    
    public static int division(int n1, int n2){
        int res = 0;
        res = n1/n2;
        return res;
    }
    
    public static int conteo(int x){
        for(int c = 1; c<= x;c++){
            System.out.print("\n"+c);
        }
        return 0;
    }
    
    public static void main(String[] args){
        System.out.print("\n///Primero:");
        futuro();
        
        System.out.print("\n///Segúndo:");
        int notaAprobada = 71;
        int notaReprobada = 69;
        System.out.print(calificacion(notaAprobada));
        System.out.print(calificacion(notaReprobada));
        
        System.out.print("\n///Tercero");  
        Scanner lector = null;
        lector = new Scanner(System.in);
        System.out.print("\nIngrese el divisor: ");
        int n1 = Integer.parseInt(lector.next());
        System.out.print("\nIngrese el dividendo: ");
        int n2 = Integer.parseInt(lector.next());
        if((n1 >= 1) && (n2 >= 1)){
            int r = division(n1,n2);
            System.out.print("\nResultado de: " + n1 + " entre " + n2 + " : " + r);
        }else{
            System.out.print("Favor ingresar dos valores numericos mayores o iguales a 1");
        }
        
        System.out.print("\n///Cuarto");
        System.out.print("\nIngrese el número(mayor o igual a 1) con el cúal finalizzara el conteo: ");
        int c1 = Integer.parseInt(lector.next());
        if(c1 > 0){
            conteo(c1);
        }
        System.out.print("\n");
        //String usuario = System.console().readLine();
        //String valor = "10.25";
        
        //Float n1 = Float.parseFloat(valor);
        
    }
}