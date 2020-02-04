/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg1;

import java.util.Scanner;

/**
 *
 * @author Alumnat
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
        public static void ejercicio1() {
            System.out.println("entra los valores");
            int [] valores = new int [5];
            
            for (int i = 0; i < 5; i++){
            Scanner entrada = new Scanner(System.in);
                int entradaValida = entrada.nextInt();
                valores[i] = entradaValida;
            }
            System.out.println("los valores introducidos en el orden que se an añadido");
            for (int i=0; i<valores.length;i++){               
                System.out.print(valores[i]);
            }            
    }
        public static void ejercicio2(){
            System.out.println("entra los valores");
              int [] valores = new int [5];
            
            for (int i = 0; i < 5; i++){
                Scanner entrada = new Scanner(System.in);
                int entradaValida = entrada.nextInt();
                valores[i] = entradaValida;
            }
            System.out.println("los valores introducidos en el orden inverso al que se añadieron");
            for (int i=4; i> 0; i--){
                System.out.println(valores[i]);
            }   
            
        }
        public static void ejercicio3(){
            System.out.println("entra los valores");
            int [] valores = new int [5];
            int  positivos = 0;
            int cont_positivos = 0;
            int negativos = 0;
            int cont_negativos = 0;
            int ceros = 0;
            
            for (int i = 0; i < 5; i++){
                Scanner entrada = new Scanner(System.in);
                int entradaValida = entrada.nextInt();
                valores[i] = entradaValida;            
            }
            for (int i=0; i <valores.length; i++){
               if (valores[i]>0){
                   positivos=positivos+valores[i];
                   cont_positivos=cont_positivos+1;
                   
               } else if (valores[i]<0){
                   negativos=negativos+valores[i];
                   cont_negativos=cont_negativos+1;
                }else if (valores[i]==0){
                    ceros= ceros+1;
                }
            }
            if (positivos>0){
            System.out.println("media positivos");
            System.out.println(positivos/cont_positivos);
            }
            if (negativos!=0){
            System.out.println("media negativos");
            System.out.println(negativos/cont_negativos);
            }
            System.out.println("ceros totales");
            System.out.println(ceros);
            
        }
        public static void ejercicio4(){
            System.out.println("entra los valores");
            int [] valores = new int [10];
            
            for (int i = 0; i < 10; i++){
            Scanner entrada = new Scanner(System.in);
                int entradaValida = entrada.nextInt();
                valores[i] = entradaValida;
            }
            int contador = 0;
            for (int i=0; i <5;i++){
                if (i==0){
                    System.out.print(valores[0]+",");                    
                    System.out.print(valores[9]+",");
                    System.out.print(" ");
                    
                }else{
                    System.out.print(valores[0+contador]+",");
                    System.out.print(valores[9-contador]+",");
                    System.out.print(" ");
                }
               contador++;   
            }
        }
        public static void ejercicio5(){
            System.out.println("entra los valores");
            int [] valores = new int [10];
            int [] valores2 = new int [10];
            for (int i = 0; i < 20; i++){
                Scanner entrada = new Scanner(System.in);
                if (i==10){
                    System.out.println("segunda tabla");
                }if (i<10){           
                int entradaValida = entrada.nextInt();
                valores[i] = entradaValida;
            }else{
                  int entradaValida = entrada.nextInt();
                valores2[i-10] = entradaValida;  
                }
            }
            int [] valores_salida = new int [20];
            int contador = 0;
            for (int i =0; i < 10; i++ ){
                valores_salida[i+contador]=valores[i];
                contador++;
                valores_salida[i+contador]=valores2[i];
        }
            for (int i =0; i<20;i++){
                System.out.print(valores_salida[i]+",");
            }
        }
        public static void ejercicio6(){
            System.out.println("entra los valores");
            int [] valores = new int [12];
            int [] valores2 = new int [12];
            
            for (int i = 0; i < 24; i++){
                Scanner entrada = new Scanner(System.in);
                if (i==12){
                    System.out.println("segunda tabla");
                }if (i<12){           
                int entradaValida = entrada.nextInt();
                valores[i] = entradaValida;
            }else{  
                int entradaValida = entrada.nextInt();
                valores2[i-12] = entradaValida;
                }
            }
            int contador = 0;
            int contador2 = 0;
            int [] valores_salida = new int [24];
            for (int i = 0; i <4 ;i++){
                if (i>1){
                    contador2+=3;
                }
                for (int f = 0; f < 3 ;f++){
                    if (i%2==0 || i==0){
                        valores_salida[f+contador]=valores[f+contador2]; 
                    }else{
                        valores_salida[f+contador]=valores2[f+contador2];
                    }                   
                }contador+=3;                 
            }
            for (int i = 0; i <24;i++){
                System.out.print(valores_salida[i]+",");
            }
    }
        
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int menu = lector.nextInt();
      switch (menu){
          case 1:{
              ejercicio1();
              break;
          }
          case 2:{
              ejercicio2();
              break;
          }
          case 3:{
              ejercicio3();
              break;
          }
          case 4:{
              ejercicio4();
              break;             
          }
          case 5:{
              ejercicio5();
              break;             
          }
            case 6:{
              ejercicio6();
              break;             
          }default:{
            System.out.println("introduce un valor valido");
              break;
          }
       
      }
    }


    
}
