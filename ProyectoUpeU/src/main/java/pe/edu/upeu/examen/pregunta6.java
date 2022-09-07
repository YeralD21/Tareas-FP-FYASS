package pe.edu.upeu.examen;

/**
 * pregunta6
 */
public class pregunta6 {

    public static void main(String[] args) {

        int i, j, suma;
        System.out.println("Primeros Numeros Perfectos: ");
        for(i=1;i <= 10000;i++){      
            suma = 0;
            for(j = 1;j < i;j++){                          
                 if(i % j==0){
                    suma = suma + j; 
                 }
            }
          if(i == suma){                          
             System.out.println(i);
             
          }
        }
        
    }
    
}