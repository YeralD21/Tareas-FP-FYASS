package pe.edu.upeu.app;

import java.io.CharArrayWriter;
import java.io.Console;

import pe.edu.upeu.modelo.UsuarioTO;
import pe.edu.upeu.util.LeerTeclado;

public class MenuOpciones {
    LeerTeclado leerT=new LeerTeclado();
    UsuarioTO uTO=new UsuarioTO();
    Console cons=System.console();

    public void login() {
        System.out.println("************Bienvenidos al Sistema de Ventas**************");   
        System.out.println("*****************Valide sus credenciales******************");
        uTO.usuario=leerT.leer("","Ingrese su Usuario:");
        System.out.println("Ingrese su clave"); 
        char[] clavex=cons.readPassword();
        uTO.clave=String.valueOf(clavex);

        if (uTO.usuario.equals("yeraldss")&& uTO.clave.equals("123456")) {
            menuPrincipal();
        }else{
            System.out.println("Intente Nuevamente¡¡ Sus credenciales son Invalidos");
            login();
        }

    }

    public void menuPrincipal() {
        System.out.println("-----------------------Sistema de Ventas---------------------");
        int opciones=1;
        String menu="";
        menu+="Registro de Productos\n";
        menu+="Regristro de Ventas\n";
        System.out.println(menu);
        do {

            switch (opciones) {
                case 1: System.out.println("Registro Productos"); break;
            
                default: System.out.println("Opcion Invalida!"); break;
            }
            String continuar=leerT.leer("",
             "Desea Continuar ? S=Si/N=No").charAt(0)=='S'?"S":"N";
             if (continuar.charAt(0)=='S') {
                opciones=leerT.leer(0, "Elija una operacion:\n"+menu);
             }else{opciones=0;}
        } while (opciones!=0);


        System.out.println(); 
    }
}
