package pe.edu.upeu.arrays;

public class SumaMatrices {
    //Mal HECHO Por mi Parte

    public void sumayrestaDeMatrices() {
        int matriz_uno[][] = {{3,-8},{5,9}};
        int matriz_dos[][] = {{-9,11},{1,-5}};
        int matriz_resultante[][] = new int [2][2];

        //Llenado primer matriz
        for (int i = 0; i < matriz_resultante.length; i++) {
            for (int j = 0; j < matriz_resultante.length; j++) {
                matriz_uno[i][j] = (int) (Math.random() * 5);
            }
        }
        //Llenado segundo matriz
        for (int i = 0; i < matriz_resultante.length; i++) {
            for (int j = 0; j < matriz_resultante.length; j++) {
                matriz_dos[i][j] = (int) (Math.random() * 5);
            }
        }
        //Suma o resta de matrices
        for (int i = 0; i < matriz_resultante.length; i++) {
            for (int j = 0; j < matriz_resultante.length; j++) {
                matriz_resultante[i][j] = matriz_uno[i][j] + matriz_dos [i][j];
                //matriz_resultante[i][j] = matriz_uno[i][j] - matriz_dos [i][j];
            }
        }
        //Imprimiendo Matrices
        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_uno.length; j++) {
                System.out.println("[ "+ matriz_uno[i][j] +  "]");
            }

            System.out.println("\t\t");

            for (int j = 0; j < matriz_dos.length; j++) {
                System.out.println("[" + matriz_dos[i][j] + "]");
            }
        }
    }
    public static void main(String[] args) {
        new SumaMatrices().sumayrestaDeMatrices();
       
    }
}
