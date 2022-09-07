package pe.edu.upeu.arrays;

public class SumaMatrices2 {
    //Hecho Por el profesor 

    public void sumaMatrices() {
        int[][] mA={{3,-8},{5,9}};
        int[][] mB={{-9,11},{1,-5}};
        int[][] mR=new int[mA.length][mA[0].length];
        for (int i = 0; i < mA.length; i++) {
            for (int j = 0; j < mA[0].length; j++) {
                mR[i][j]=mA[i][j]+mB[i][j];
            }
        }
        imprimirMatrix(mR);
    }
    
    public void imprimirMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    public void imprimirMatrix(Object[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
         //new MatricesEjemplo().matricesBasicos();
    new SumaMatrices2().sumaMatrices();
    }
    
}
