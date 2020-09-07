/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajos.curso.utn;

import java.util.Scanner;

/**
 *
 * @author Rodry-Asus
 */
public class TP1Ej1 {
   
    public void ingresoTeclado(){
        int x=0;
        int y=0;
        Scanner leer = new Scanner(System.in);
     System.out.println("Ingrese un numero entero");
        x=leer.nextInt();
        System.out.println("Ingrese un numero entero");
        y=leer.nextInt();
        System.out.println("los numeros son ="+x+" y "+y);
    }
     public void ingresoNombre(){
        String Nomb;
        Scanner leer = new Scanner(System.in);
     System.out.println("Ingrese un nombre");
        Nomb=leer.nextLine();
        System.out.println("Buenos dias "+Nomb);
        
    }
     public void aumentoNumero(){
        int x=0;
        Scanner leer = new Scanner(System.in);
     System.out.println("Ingrese un numero entero");
        x=leer.nextInt();
       
        System.out.println("El doble es ="+2*x+" y el triple es "+3*x);
    }
     
       public void centigradosFaren(){
        double x=0.0;
        double y=0.0;
        Scanner leer = new Scanner(System.in);
     System.out.println("Ingrese los Grados centigrados");
        x=leer.nextDouble();
       y=(32+(9*x/5));
        System.out.println(x+"° centigrado es igual a ="+y+" F");
    }
    public void farenCentigrados(){
        double x=0.0;
        double y=0.0;
        Scanner leer = new Scanner(System.in);
     System.out.println("Ingrese los Grados Fahrenheit");
        x=leer.nextDouble();
       y=((x-32)/9)*5;
        System.out.println(x+"° Fahrenheit es igual a ="+y+" Centigrados");
     
     
    }
    
    public void kmsMs(){
        double x=0.0;
        double y=0.0;
        Scanner leer = new Scanner(System.in);
     System.out.println("Ingrese los Km/h");
        x=leer.nextDouble();
       y=x*1000/3600;
        System.out.println(x+" Km/h  es igual a = "+y+" m/s");
     
     
    }
    public void pitagoras(){
        double x=0.0;
        double y=0.0;
        double hip=0.0;
        Scanner leer = new Scanner(System.in);
     System.out.println("Ingrese el 1° Cateto opuesto");
        x=leer.nextDouble();
     System.out.println("Ingrese el 2° Cateto opuesto");
        y=leer.nextDouble();
       hip=Math.sqrt((x*x)+(y*y));
        System.out.println("La hipotenusa es = "+hip);
     
    }
     public void volumenEsfera(){
        double l=0.0;
        double r=0.0;
        double v=0.0;
        Scanner leer = new Scanner(System.in);
     System.out.println("Ingrese la longitud de la esfera en (m)");
        l=leer.nextDouble();
        r=l/2;
        v=(4*(Math.PI)*(Math.pow(r, 3)))/3;
        System.out.println("La Volumen de la esfera es de = "+v+" m^3");
     
     
    }
}
