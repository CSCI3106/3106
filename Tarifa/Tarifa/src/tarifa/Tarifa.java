package tarifa;
import java.util.*;
/**
 *
 * @author weiyihuang
 */
public class Tarifa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner keyboard = new Scanner (System.in);
       int x = keyboard.nextInt();
       int n = keyboard.nextInt();
       int pi = x *(n+1);
       
       for (int i = 0; i<n; i++){
           pi -= keyboard.nextInt();
       }
        System.out.println();
        System.out.println(pi);
    }
    
}
