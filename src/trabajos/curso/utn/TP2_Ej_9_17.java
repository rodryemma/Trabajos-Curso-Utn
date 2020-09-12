/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajos.curso.utn;

import java.util.Scanner;

public class TP2_Ej_9_17 {
    
    
    public void par(){
        int x=0; 
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca un numero para saber si es par");
        x=leer.nextInt();
        if (x%2==0) {
            System.out.println(x+" Es par");}
        else{
            System.out.println(x+" Es impar");        
        } 
    }
    
    
    public void mult10(){
        int x=0; 
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca un numero para saber si multiplo de 10");
        x=leer.nextInt();
        if (x%10==0) {
            System.out.println(x+" Es Multiplo de 10");}
        else{
            System.out.println(x+" No es Multiplo de 10");        
        } 

    }
    
    public void mayuscula(){
        String a;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un caracter");
        a=leer.next();
        if(a.equals(a.toUpperCase())){
            System.out.println("Es Mayuscula");
        } 
        else{
        System.out.println("Es Minuscula");
        }
    }
    
     public void caracteresIguales(){
        String a;
        String b;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un caracter");
        a=leer.next();
        System.out.println("Ingrese otro caracter");
        b=leer.next();
        if(a.equals(b)){
            System.out.println("Son Iguales");
        } 
        else{
        System.out.println("No son iguales");
        }
    }
     
     public void mayorMenor(){
         int a;
         int b;
         int c;
         int aux1;
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese un numero");
         a=leer.nextInt();
         System.out.println("Ingrese otro numero");
         b=leer.nextInt();
         System.out.println("Ingrese otro numero");
         c=leer.nextInt();
        if(a<b){
            aux1=a;
            a=b;
            b=aux1;
        }
        if(a<c){
            aux1=a;
            a=c;
            c=aux1;
        }
        if(b<c){
            aux1=b;
            b=c;
            c=aux1;
        }
        System.out.println("El mayor es:" +a);
        System.out.println("Ordenadoes:" +a+","+b+","+c);

     }
}    