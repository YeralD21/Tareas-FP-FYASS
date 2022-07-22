package pe.edu.upeu.arrays;

import java.util.Scanner;

public class TransformadasMatriz {
    Scanner cs=new Scanner(System.in);

    
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
    

    //TAREAAAAAA¡¡¡¡

    public void transformada06() {
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c <= f; c++) {
                matriz[f][c] = "" + valor;
                valor++;
            }
        }
        imprimirMatrices(matriz);
    }

    public void transformada07() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];  
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c <= (matriz.length - 1) - f; c++) {
                matriz[f][c] = "" + valor;
                valor++;
            }
        }
        imprimirMatrices(matriz);
    }

    public void transformada08() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = f; c < matriz[f].length; c++) {
                matriz[f][c] = "" + valor;
                valor++;        
            }          
        }
        imprimirMatrices(matriz);
    }

    public void transformada09() {
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = (matriz[0].length - 1) - f; c <= matriz[0].length - 1; c++) {
                matriz[f][c] = "" + valor;
                valor++;
            }
        }
        imprimirMatrices(matriz);
    }

    public void transformada13() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int c = 0; c < matriz.length; c++) {
            for (int f = 0; f <= (matriz.length - 1) - c; f++) {
                matriz[f][c] = "" + valor;
                valor++;
            }
        }
        imprimirMatrices(matriz);
    }

    public void transformada14() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt(); 
        matriz = new String[dimension][dimension];
        for (int c = 0; c < matriz.length; c++) { 
            for (int f = 0; f <= c ; f++){
           
            matriz[f][c] = "" + valor;
            valor++;    
            }  
    }
    imprimirMatrices(matriz);
    }


    public void transformada20() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = (matriz[0].length - 1); f >= 0; f--) {
            for (int c = matriz[f].length-1; c >= f; c--) {
                matriz[c][f] = "" + valor;
                valor++;        
            }          
        }
        imprimirMatrices(matriz);
    }


     //Transformadas Completas 

    public void transformada21() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int c = 0; c < matriz.length; c++) {
            if (c % 2 == 0) {
                for (int f = 0; f < matriz.length; f++) {
                    matriz[f][c] = "" + valor;
                    valor++;
                }
            } else {
                for (int f = matriz.length - 1; f >= 0; f--) {
                    matriz[f][c] = "" + valor;
                }
            }

        }
        imprimirMatrices(matriz);
    }

    public void transformada22() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];
        /*Aca podemos hacer for (int c = 0; c < matriz.length; c++) 
        - SIN EL [0] e igual corre <3 */
        for (int c = 0; c < matriz[0].length; c++) {
            if (c % 2 == 0) {
                for (int f = matriz.length - 1; f >= 0; f--) {
                    matriz[f][c] = "" + valor;
                    valor++;
                }
            } else {
                for (int f = 0; f < matriz.length; f ++   ) {
                    matriz[f][c] = "" + valor;
                    valor++;
                }
            }

        }
        imprimirMatrices(matriz);
    }

    public void transformada23() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int c = matriz.length - 1; c >= 0; c--) {
            if (c % 2 == 0) {
                for (int f = 0; f < matriz.length; f++) {
                    matriz[f][c] = "" + valor;
                    valor++;
                }
            } else {
                for (int f = matriz.length - 1; f >= 0; f--) {
                    matriz[f][c] = "" + valor;
                    valor++;
                }
            }

        }
        imprimirMatrices(matriz);
    }

    public void transformada24() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int c = matriz.length - 1; c >= 0; c--) {
            if (c % 2 == 0) {
                for (int f = matriz.length - 1; f >= 0; f--) {
                    matriz[f][c] = "" + valor;
                    valor++;
                }
            } else {
                for (int f = 0; f < matriz.length; f++) {
                    matriz[f][c] = "" + valor;
                    valor++;
                }
            }

        }
        imprimirMatrices(matriz);
    }

    public void transformada25() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            if (f % 2 == 0) {
                for (int c = 0; c < matriz.length; c++) {
                    matriz[f][c] = "" + valor;
                    valor++;
                }
            } else {
                for (int c = matriz.length - 1; c >= 0; c--) {
                    matriz[f][c] = "" + valor;
                    valor++;
                }
            }

        }
        imprimirMatrices(matriz);
    }

    public void transformada26() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            if (f % 2 == 0) {
                for (int c = matriz.length - 1; c >= 0; c--) {
                    matriz[f][c] = "" + valor;
                    valor++;
                }
            } else {
                for (int c = 0; c < matriz.length; c++) {
                    matriz[f][c] = "" + valor;
                    valor++;
                }
            }

        }
        imprimirMatrices(matriz);
    }

    public void transformada27() {
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int f = matriz.length - 1; f >= 0; f--) {
            if (f % 2 == 0) {
                for (int c = (matriz.length - 1); c >= 0; c--) {
                    matriz[f][c] = "" + valor;
                    valor++;
                }
            } else {
                for (int c = 0; c < matriz.length; c++) {
                    matriz[f][c] = "" + valor;
                    valor++;
                }
            }
        }
        imprimirMatrices(matriz);
    }

    //Transformadas Caracol
    public void transformada30() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int v = 0; v < dimension / 2; v++) {
            for (int ld = v; ld < matriz.length - 1 - v; ld++) {
                matriz[ld][matriz.length - 1 - v] =""+valor;
                valor++;
            }
            for (int lin = matriz.length - 1 - v; lin > v; lin--) {
                matriz[matriz.length - 1 - v][lin] = ""+valor;
                valor++;
            }
            for (int liz = matriz.length - 1 - v; liz > v; liz--) {
                matriz[liz][v] = ""+valor;
                valor++;
            }
            for (int ls = v; ls < matriz.length - 1 - v; ls++) {
                matriz[v][ls] = ""+valor;
                valor++;
            }
        }
        if (dimension % 2 != 0) {
            matriz[dimension / 2][dimension / 2] = String.valueOf(valor);
        }
        imprimirMatrices(matriz);
    }

    public void transformada31() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int v = 0; v < dimension / 2; v++) {
            for (int lin = matriz.length - 1 - v; lin > v; lin--) {
                matriz[matriz.length - 1 - v][lin] = ""+valor;
                valor++;
            }
            for (int liz = matriz.length - 1 - v; liz > v; liz--) {
                matriz[liz][v] = ""+valor;
                valor++;
            }
            for (int ls = v; ls < matriz.length - 1 - v; ls++) {
                matriz[v][ls] = ""+valor;
                valor++;
            }
            for (int ld = v; ld < matriz.length - 1 - v; ld++) {
                matriz[ld][matriz.length - 1 - v] = ""+valor;
                valor++;
            }
        }
        if (dimension % 2 != 0) {
            matriz[dimension / 2][dimension / 2] = ""+valor;
        }
        imprimirMatrices(matriz);
    }

    public void transformada32() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int v = 0; v < dimension / 2; v++) {
            for (int liz = matriz.length - 1 - v; liz > v; liz--) {
                matriz[liz][v] = ""+valor;
                valor++;
            }
            for (int ls = v; ls < matriz.length - 1 - v; ls++) {
                matriz[v][ls] = ""+valor;
                valor++;
            }
            for (int ld = v; ld < matriz.length - 1 - v; ld++) {
                matriz[ld][matriz.length - 1 - v] = ""+valor;
                valor++;
            }
            for (int lin = matriz.length - 1 - v; lin > v; lin--) {
                matriz[matriz.length - 1 - v][lin] = ""+valor;
                valor++;
            }
        }
        if (dimension % 2 != 0) {
            matriz[dimension / 2][dimension / 2] = String.valueOf(valor);
        }
        imprimirMatrices(matriz);
    }

//  Sentido antihorario 
    public void transformada33() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];
        
        for (int v = matriz.length - 1; v >= matriz.length / 2; v--) {

            for (int ls = v; ls > (matriz.length - 1) - v; ls--) {
                matriz[(matriz.length - 1) - v][ls] = ""+valor;
                valor++;
            }
            for (int liz = (matriz.length - 1) - v; liz < v; liz++) {
                matriz[liz][(matriz.length - 1) - v] = ""+valor;
                valor++;
            }
            for (int lin = (matriz.length - 1) - v; lin < v; lin++) {
                matriz[v][lin] = ""+valor;
                valor++;
            }
            for (int ld = v; ld > (matriz.length - 1) - v; ld--) {
                matriz[ld][v] =""+valor;
                valor++;
            }
        }
        if (dimension % 2 != 0) {
            matriz[dimension / 2][dimension / 2] = String.valueOf(valor);
        }
        imprimirMatrices(matriz);
    }

    public void transformada34() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];

        for (int v = matriz.length - 1; v >= matriz.length / 2; v--) {
            
            for (int liz = (dimension - 1) - v; liz < v; liz++) {
                matriz[liz][(dimension - 1) - v] = ""+valor;
                valor++;
            }
            for (int lin = (dimension - 1) - v; lin < v; lin++) {
                matriz[v][lin] = ""+valor;
                valor++;
            }
            for (int ld = v; ld > (dimension - 1) - v; ld--) {
                matriz[ld][v] = ""+valor;
            }
            for (int ls = v; ls > (dimension - 1) - v; ls--) {
                matriz[(dimension - 1) - v][ls] = ""+valor;
                valor++;
            }
        }
        if (dimension % 2 != 0) {
            matriz[dimension / 2][dimension / 2] = ""+valor;
        }
        imprimirMatrices(matriz);
    }
    public void transformada36() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];

        for (int v = matriz.length - 1; v >= matriz.length / 2; v--) {

            for (int ld = v; ld > (matriz.length - 1) - v; ld--) {
                matriz[ld][v] = ""+valor;
                valor++;
            }
            for (int ls = v; ls > (matriz.length - 1) - v; ls--) {
                matriz[(matriz.length - 1) - v][ls] = ""+valor;
                valor++;
            }
            for (int liz = (matriz.length - 1) - v; liz < v; liz++) {
                matriz[liz][(matriz.length - 1) - v] = ""+valor;
                valor++;
            }
            for (int lin = (matriz.length - 1) - v; lin < v; lin++) {
                matriz[v][lin] = ""+valor;
                valor++;
            }
        }
        if (dimension % 2 != 0) {
            matriz[dimension / 2][dimension / 2] = String.valueOf(valor);
        }
        imprimirMatrices(matriz);
    }

    //No recuerdo si usted hizo esto en Clase Ingeniero - Pero igual lo hice para practicar mas <3 :,D 

    public void transformada35() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];

        for (int v = matriz.length - 1; v >= matriz.length / 2; v--) {

            for (int lin = (matriz.length - 1) - v; lin < v; lin++) {
                matriz[v][lin] = ""+valor;
                valor++;
            }
            for (int ld = v; ld > (matriz.length - 1) - v; ld--) {
                matriz[ld][v] = ""+valor;
                valor++;
            }
            for (int ls =  v; ls > (matriz.length - 1) - v; ls--) {
                matriz[(matriz.length - 1) - v][ls] = ""+valor;
                valor++;
            }
            for (int liz = (matriz.length - 1) - v; liz < v; liz++) {
                matriz[liz][(matriz.length - 1) - v] = ""+valor;
                valor++;
            }
        }
        if (dimension % 2 != 0) {
            matriz[dimension / 2][dimension / 2] = String.valueOf(valor);
        }
        imprimirMatrices(matriz);
    }




    //INTENTOS FALLIDOS - AQUI NO ME SALIÓ COMO PENSABA EN UN PRINCIPIO :(

   /*  public void transformada36() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        System.out.println("");
        matriz = new String[dimension][dimension];
  
        for (int v = 0; v < matriz.length/2; v++) {

            for (int ld = matriz.length-1-v; ld > v; ld--) {
                matriz[ld][matriz.length - 1 - v] = ""+valor;
                valor++;
            }

            for (int ls = matriz.length-1-v; ls > v; ls--) {
                matriz[v][ls]=""+valor;
                valor++;
            }

            for (int liz = v; liz < matriz.length-1-v; liz++) {
                matriz[liz][v]=""+valor;
                valor++;
            }
            for (int lin = v; lin < matriz.length-1-v; lin++) {
                matriz[matriz.length-1-v][lin]=""+valor;
                valor++;
            
        }

        if (dimension % 2 != 0) {
            matriz[dimension / 2][dimension / 2] = String.valueOf(valor);
        }
        imprimirMatrices(matriz); sd
    }*/
    
    

   
    public static void main(String[] args) {
        //new TransformadasMatriz().transformada01();
        //new TransformadasMatriz().Transformada12();
        new TransformadasMatriz().transformada35();
    }
}
