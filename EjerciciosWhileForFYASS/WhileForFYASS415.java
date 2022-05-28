import java.util.Scanner;
/**
 * WhileForFYASS415
 */
public class WhileForFYASS415 {
    static Scanner lt=new Scanner(System.in);

    public static void NCubo() {

        System.out.println("Introduzca un NUMERO");
        int n=lt.nextInt();

        for (int i = n; i <= 10; i++) {
            System.out.println(i + " El resultado elevado al Cubo es :" + i*i*i);
        }

        
    }

    public static void main(String[] args) {
        NCubo();
    }
}