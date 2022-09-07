package pe.edu.upeu.examen;

import java.util.Scanner;

/**
 * asdasd
 */
public class asdasd {

 

            public static void main(String[] args) {
              
              Scanner lt=new Scanner(System.in);
             
            System.out.println("Introduzca un número mayor a 3 e impar ");
           
            int h=lt.nextInt();
              
            if (h > 3 && h %2!=0){
              for (int fil = 1; fil <= h; fil++){
                for (int col = 1; col <= h; col++){
                  if ((fil == col) || (col == (h-fil)+1)){
                    System.out.print("*");
                  } else {
                    System.out.print(" ");
                  }
                }
                System.out.println();
              }
        
            }else{
              System.out.println("No es un número valido");
            }
          }  
              
       }
           
          