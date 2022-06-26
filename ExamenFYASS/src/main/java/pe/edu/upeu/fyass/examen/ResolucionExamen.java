package pe.edu.upeu.fyass.examen;

import java.util.Scanner;

import pe.edu.upeu.fyass.utils.LeerTeclado;

public class ResolucionExamen {

   
    public void Impuesto_Automoviles () {
    Scanner lt=new Scanner(System.in);
    String claveV, hayMas="S";
        int cantVC1=0, cantVC2=0, cantVC3=0;
        double precioVC1=0, precioVC2=0, precioVC3=0,
        impVC1=0, impVC2=0, impVC3=0, totalImpV=0;

        while (hayMas.equals("S")) {
            System.out.println("Ingrese la clave del Vehiculo \nVehiculo_Clave_1 = 1\nVehiculo_Clave_2 = 2\nVehiculo_Clave_3 = 3");
            claveV=lt.next().toUpperCase();
            if (claveV.equals("1")) {
                System.out.println("Ingres cantidad de Vehiculo con clave "+claveV+":");
                cantVC1=cantVC1+lt.nextInt();
                if(precioVC1==0){
                System.out.println("Ingres el precio del Vehiculo con clave "+claveV+":");
                precioVC1=lt.nextDouble();
                }
                impVC1=precioVC1*0.10;
            }else if (claveV.equals("2")){
                System.out.println("Ingres cantidad de Vehiculo con clave "+claveV+":");
                cantVC2=cantVC2+lt.nextInt();
                if(precioVC2==0){
                System.out.println("Ingres el precio del Vehiculo con clave "+claveV+":");
                precioVC2=lt.nextDouble();
                }
                impVC2=precioVC2*0.07;                
            }else if(claveV.equals("3")){
                System.out.println("Ingres cantidad de Vehiculo con clave "+claveV+":");
                cantVC3=cantVC3+lt.nextInt();
                if(precioVC3==0){
                System.out.println("Ingres el precio del Vehiculo con clave "+claveV+":");
                precioVC3=lt.nextDouble();
                }
                impVC3=precioVC3*0.05;   
            }else{ System.out.println("La clave de vehiculo es incorrecto"); }
            System.out.println("Hay mas vehiculos?: S=SI, N=NO");
            hayMas=String.valueOf(lt.next().toUpperCase().charAt(0));            
        }
        System.out.println("Impuesto de Vehiculo VC1 es:"+impVC1);
        System.out.println("Impuesto de Vehiculo VC2 es:"+impVC2);
        System.out.println("Impuesto de Vehiculo VC3 es:"+impVC3);

        System.out.println("Impuesto Total de Vehiculo VC1 es:"+(impVC1*cantVC1));
        System.out.println("Impuesto Total de Vehiculo VC2 es:"+(impVC2*cantVC2));
        System.out.println("Impuesto Total de Vehiculo VC3 es:"+(impVC3*cantVC3));        

        totalImpV=(impVC1*cantVC1)+(impVC2*cantVC2)+(impVC3*cantVC3);
        System.out.println("Total impuesto a pagar de "+(cantVC1+cantVC2+cantVC3)+" es:"+totalImpV);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Total a pagar de todos los Autos con impuesto es : "+(precioVC1+precioVC3+precioVC3+totalImpV));
    }

    
    


public void x_arterisco () {
    
            
  Scanner lt=new Scanner(System.in);
  System.out.println("Introducir un número MAYOR a 3 e impar ");
 
  int j=lt.nextInt();
    
  if (j > 3 && j %2!=0){
    for (int fil = 1; fil <= j; fil++){
      for (int col = 1; col <= j; col++){
        if ((fil == col) || (col == (j-fil)+1)){
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }

  }else{
    System.out.println("ERROR¡ Poner un Numero mayor a 3 e Impar");
  }
}     
public void n_numeros_perfectos() {
  int f, c;
  int suma;
  System.out.println("Primeros Numeros Perfectos: ");

  for(f=1;f <= 10000;f++){      
      suma = 0;
      for(c = 1;c < f;c++){                          
           if(f % c==0){
              suma = suma + c; 
           }
      }
    if(f == suma){                          
       System.out.println(f);
       
    }
  }
}

    
public void decimal_a_binario() {

  Scanner lt= new Scanner(System.in);
  int n;
  do {
      System.out.println("Introduce un numero mayor que 0: ");
      n = lt.nextInt();
  } while (n < 0);
  System.out.println();
  System.out.print("Binario: ");
  decBin(n);
  System.out.println();
}

public static void decBin(int n) {
  if (n < 2) {
      System.out.print(n);
      return;
  } else {
      decBin(n / 2);
      System.out.print(n % 2);
      return;
  }
}
    
  
}
