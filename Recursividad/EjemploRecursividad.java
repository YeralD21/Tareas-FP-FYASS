package Recursividad;

/**
 * EjemploRecursividad
 */
public class EjemploRecursividad {



    

    



    
    public static int factorialR(int n) {
        if (n>1) {
           return factorialR(n-1)*n;
        }
           return 1;
    }

    public static int fibonacciR(int n) {
        if (n>1) {
            return fibonacciR(n-1)+fibonacciR(n-2);
        }
            return n;
    }
    
    public static int sumanumerosR(int n) {
        if (n == 1){
            return 1;
        }
            return n + sumanumerosR(n-1);
    }

    public static int suma(int n) {
        if (n>1) {
            return suma(n-1)+n;
        }
            return n;
    }

    private static int potenciaR(int b, int e){
        if(e == 1){
            return b;
        }else if (e == 0){
            return 1;
        }else {
            return b * potenciaR(b,e-1);

        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial:");
        System.out.println(factorialR(5));
        System.out.println("------------------");
        System.out.println("Fibonacci:");
        System.out.println(fibonacciR(8));
        System.out.println("------------------");
        System.out.println("GAUSS");
        System.out.println(sumanumerosR(100));
        System.out.println("------------------");
        System.out.println("GAUSS 2.0");
        System.out.println(suma(100));
        System.out.println("------------------");
        System.out.println("potencia");
        System.out.println(potenciaR(2,4));
    }
}