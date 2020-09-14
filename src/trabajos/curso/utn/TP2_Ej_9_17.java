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
     
     public void mesesSel(){
         Scanner leer = new Scanner(System.in);
         int mes;
         System.out.println("Ingrese el mes");
         mes = leer.nextInt();
         switch(mes){
             case 1:
                 System.out.println("Enero 31 dias");
                 break;
             case 2:
                 System.out.println("Febrero 28 dias");
                 break;
             case 3:
                 System.out.println("Marzo 31 dias");
                 break;
             case 4:
                 System.out.println("Abril 30 dias");
                 break;
             case 5:
                 
                 System.out.println("Mayo 31 dias");
                 break;
             case 6:
                 
                 System.out.println("Junio 30 dias");
                 break;
             case 7:
                 System.out.println("Julio 31 dias");
                 break;
             case 8:
                 System.out.println("Agosto 31 dias");
                 break;
             case 9:
                 System.out.println("Septiembre 30 dias");
                 break;
             case 10:
                 System.out.println("Octubre 31 dias");
                 break;
             case 11:
                 System.out.println("Noviembre 30 dias");
                 break;
             case 12:
                 System.out.println("Diciembre 31 dias");
                 break;
             default:
                 System.out.println("No existe ese mes");
                 
         }
         
       
     }
      public void contadWhil(){
            int i=1;
          while(i<101){
              System.out.println("i= "+i);
              i+=1;
          }
        }
      public void contadFor(){
            
          for(int i=1;i<101;i++){
              System.out.println("i= "+i);
             
          }
        }
       public void contadDowhil(){
            int i=1;
          do{
              System.out.println("i= "+i);
              i+=1;
          }while(i<101);
        }
}    