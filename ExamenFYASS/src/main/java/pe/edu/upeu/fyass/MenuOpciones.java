package pe.edu.upeu.fyass;

import java.util.Scanner;

import pe.edu.upeu.fyass.examen.ResolucionExamen;
import pe.edu.upeu.fyass.utils.LeerTeclado;


public class MenuOpciones {
    
   
    LeerTeclado leerT = new LeerTeclado();

    Scanner sc=new Scanner (System.in);
   Scanner lt=new Scanner(System.in);
    public void menuPrincipal() { 
        System.out.println("------------------------------------Elija una Opción------------------------------");
        
        String menu = "";
        menu += "1. Pregunta 02 (Impuesto_Automoviles)\n";
        menu += "2. Pregunta 03 (x_arterisco)\n";
        menu += "3. Pregunta 04 (n_numeros_perfectos)\n";
        menu += "4. Pregunta 05 (decimal_a_binario)\n";
        System.out.println(menu);
        System.out.println("Ingrese una opción");
        int opciones = sc.nextInt();
        do {
            switch (opciones) {
                case 1:
                new ResolucionExamen().Impuesto_Automoviles();
                   break;
                case 2:
                new ResolucionExamen().x_arterisco();
                   break;
                case 3: 
                new ResolucionExamen().n_numeros_perfectos(); 
                    break;
                case 4: 
                new ResolucionExamen().decimal_a_binario();
                   break;
                
                
                   
    
                default: System.out.println("Opcion Invalida!"); break;
            }
            String continuar=leerT.leer("", "Desea Continuar? S=Si/N=No").charAt(0)=='S'?"S":"N";
            if (continuar.charAt(0)=='S') {
                opciones=leerT.leer(0, "Eliga una operacion:\n"+menu);
            }else{opciones=0;}
        } while (opciones != 0);
    }
    
    
    }
   

   

  