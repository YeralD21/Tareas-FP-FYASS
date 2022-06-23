package pe.edu.upeu.app;

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
        
    }
}
