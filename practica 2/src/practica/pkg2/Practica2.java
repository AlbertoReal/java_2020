/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg2;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Alumnat
 */
public class Practica2 {
public static void ejercicio1(){
    int [][] bidimensional = new int [5][5];
    for (int i = 0; i < 5; i++){ 
            for (int j = 0; j < 5; j++){
                bidimensional[i][j]=i+j;
            }
    }
    for (int i = 0; i <5; i++){
        for (int j = 0; j <5; j++){
             System.out.println("arr[" + i + "][" + j + "] = "
                                   + bidimensional[i][j]); 
        }
    }
    menu();
}    
public static void ejercicio2(){
    int [][] bidimensional = new int [4][4];
    int contador = 0;
    boolean es_simetrica = true;
    for (int i = 0; i <4; i++){
        for (int j = 0; j <4; j++){
            bidimensional[i][j]=1;
        }
    }while(es_simetrica==true){
        for (int i = 0; i <4; i++){
            for (int j = 0; j<4; j++){
                if (i==j){               
                }else{
                    if (bidimensional[i][j]==bidimensional[j][i]){
                contador++;
                es_simetrica=true;
                    }else{
                        es_simetrica=false;
                    }
                }
            }
            es_simetrica=false;
        }
    }
    if (contador == 12){
        System.out.println("es simetrica");
    }else{
        System.out.println("no es simetrica");
    }
    for (int i = 0; i <4; i++){
        for (int j = 0; j <4; j++){
             System.out.println("arr[" + i + "][" + j + "] = "
                                   + bidimensional[i][j]); 
        }
    }
    menu();
}
public static void ejercicio3(){
    int [][] matriz1 = new int [3][3];
    int [][] matriz2 = new int [3][3];
    int [][] matriz_resultado = new int [3][3];
    int salida=0;
    for(int i = 0; i<3; i++){
        for (int j = 0; j<3; j++){
            matriz1[i][j]=1+j;
            matriz2[i][j]=3+j;
        }
    }
    for (int i = 0; i <3; i++){
        for (int j = 0; j<3;j++){
            salida=matriz1[i][j]+matriz2[i][j];
            System.out.println("la suma de las posisciones:" + i + ":"+ j+ " es" + salida);
        }
    }
    menu();
}
public static void ejercicio4(){
    int [][] bidimensional = new int [7][7];
    
    for (int i = 0; i <7; i++){
        for (int j = 0; j< 7; j++){
            if (i==j){
                bidimensional[i][j]=1;
            }else{
                bidimensional[i][j]=0;
            }
        }
    }
    for (int i = 0; i <7; i++){
        for (int j = 0; j <7; j++){
             System.out.println("arr[" + i + "][" + j + "] = "
                                   + bidimensional[i][j]); 
        }
    }
    menu();   
}
public static void ejercicio5(){
    int [][] bidimensional = new int [8][6];
    
    for (int i = 0; i<8; i++){
        for (int j = 0; j<6; j++){
            if (i==0 || i==7){
                bidimensional[i][j]=1;
            }else{
                if (j==0 || j==5 ){
                    bidimensional[i][j]=1;
                }
            }
        }
    }
    for (int i = 0; i <8; i++){
        for (int j = 0; j <6; j++){
             System.out.println("arr[" + i + "][" + j + "] = "
                                   + bidimensional[i][j]); 
        }
        
    }
    System.out.println(Arrays.deepToString(bidimensional));
    menu();
}
public static void ejercicio6(){
    System.out.println("introduce los valores para el \n"
            + " tamaño de la arraid bidimensional");
    Scanner lector = new Scanner(System.in);
    System.out.println("priemr valor:");
    int matriz1 = lector.nextInt();
    System.out.println("segundo valor:");
    int matriz2 = lector.nextInt();   
    int [][] bidimensional = new int [matriz1][matriz2];
    for (int i = 0; i<matriz1; i++){
        for (int j = 0; j<matriz2; j++){
            if (i==0 || i==matriz1-1){
                bidimensional[i][j]=1;
            }else{
                if (j==0 || j==matriz2-1 ){
                    bidimensional[i][j]=1;
                }
            }
        }
    }
    for (int i = 0; i <matriz1; i++){
        for (int j = 0; j <matriz2; j++){
             System.out.println("arr[" + i + "][" + j + "] = "
                                   + bidimensional[i][j]); 
        }   
    }
    System.out.println(Arrays.deepToString(bidimensional));
    menu();
    
}
public static void menu(){
    System.out.println("introduce el numero de ejercicio para ejecutar\n"
                + "1 array bidimensional 5x5 valores "
                + "= a la suma de sus posiciones\n"
                + "2 array bidimensional comprovar simetria por defecto simetrica\n"
                + "3 sumar 2 arrays bidimensionales\n"
                + "4 array bidimensional 7x7 la diagonal vale 1 el resto 0\n"
                + "5 array marco 8x6 los bordes valen 1 el resto 0\n"
                + "6 array marco tamaño definido por el usuario los bordes"
                + "valen 1 el resto 0 ");
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
             menu();
          }
       
      }
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
        
        // TODO code application logic here
    }
    
}
