package pe.edu.upeu.arrays;

import java.util.Scanner;

import pe.edu.upeu.modelo.Persona;

public class ArraysEjemplos {

    public void vectorX() {
        int [] edades=new int[10]; 
        edades[0]=20;
        edades[9]=22;
        System.out.println(edades[9]);

        int edadesX[] ={20,22,18,30,16,40};
        System.out.println(edadesX.length);
    }

    public void vectorObjeto() {
        Persona[] p=new Persona[4];
        p[0]=new Persona("202212461","Fabrizio Sanchez",false);
        p[1]=new Persona("2022","Fabrizio",false);
        System.out.println(p[0].nombres);
        
    }

    public void registroAsistencia() {
        Persona[] p={
            new Persona("20221246","Fabrizio",false),
            new Persona("2022126","Yerald",false),       
            };
            Scanner cs=new Scanner(System.in);
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].nombres+ "Presente?: (S/N)");
            if(cs.next().toLowerCase().equals("s")) p[i].asistencia=true;
            System.out.println("");
        }
        //Mostrar   
        for (int i = 0; i < p.length; i++) {
            System.out.println((i+1)+"\t" +p[i].codigo+"\t" +p[i].nombres+"\t"+ (p[i].asistencia==true?"Presente":"Ausente"));
        }



}
    
   
    public static void main(String[] args) {
        ArraysEjemplos objX=new ArraysEjemplos();
        //objX.vectorX();
          objX.registroAsistencia();
    }

}
