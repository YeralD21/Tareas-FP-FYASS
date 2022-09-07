package pe.edu.upeu.examen;

/**
 * examen
 */
public class examen {
    static int n=5;
    public static void main(String args[]) {
        
        int cola=n;
        int punta=0;
        for ( int i=0; i < n ;i++){
            for (int j=0;  j<n;j++){
              if(j==cola-1 || j==punta) 
              {System.out.print('*');}
              else
              {System.out.print("_");}
            }
            System.out.println();
            cola--;
            punta++;
          }
    }
}