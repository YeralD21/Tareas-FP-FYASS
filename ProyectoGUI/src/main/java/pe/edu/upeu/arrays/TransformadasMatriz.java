package pe.edu.upeu.arrays;

import java.util.Scanner;

public class TransformadasMatriz {
    Scanner cs=new Scanner(System.in);

    public void transformadas01() {
        System.out.println("Ingrese Dimension Matriz:");
        int dimension=cs.nextInt();
        System.out.println("Ingrese valor de Inicio:");
        int valorInit=cs.nextInt();
        String[][] matriz=new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                if(c<dimension-f){
                    matriz[f][c]=String.valueOf(valorInit+(f+c)*(f+c+1)/2+f);
                }else{matriz[f][c]="";}
               
            }
        }
        imprimirMatrices(matriz);

    }

    public void imprimirMatrices(String[][] m) {
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m[0].length; c++) {
                System.out.print(m[f][c]+"\t");               
            }
            System.out.println("");
        }
        
    }


    public static void main(String[] args) {
        new TransformadasMatriz().transformadas01();
    }
}