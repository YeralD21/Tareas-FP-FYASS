package pe.edu.upeu.arrays;

import java.util.Scanner;

public class TransformadasMatriz {
    Scanner cs=new Scanner(System.in);

    public void transformada01() {
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

    //--------------Transformada12
    public void Transformada12() {
        System.out.println("Ingrese Dimension Matriz:");
        int dimension=cs.nextInt();
        System.out.println("Ingrese valor de Inicio:");
        int valorInit=cs.nextInt();  
        String[][] matriz=new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = matriz[0].length-1; c>=(0+f) ; c--) {
                matriz[f][c]=String.valueOf(valorInit);
                valorInit++;
            }
        }
        imprimirMatrices(matriz);
    }
    //--------------
    public void imprimirMatrices(String[][] m) {
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m[0].length; c++) {
                if (m[f][c]==null) {
                    System.out.print("\t");
                }else{
                    System.out.print(m[f][c]+"\t");  

                }        
            }
           System.out.println("");
        }
        
    }


    public static void main(String[] args) {
        //new TransformadasMatriz().transformada01();
        new TransformadasMatriz().Transformada12();
    }
}