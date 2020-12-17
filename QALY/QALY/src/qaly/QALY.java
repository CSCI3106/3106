package qaly;
import java.util.*;

/**
 *
 * @author weiyihuang
 */
public class QALY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        double sum = 0;
        double sum2 = 0;

        for (int i = 0; i < n; i++) {
            double q = keyboard.nextDouble();
            double y = keyboard.nextDouble();
            sum = q * y;
            sum2 = sum2 + sum;
        }
            
        //round to 3 decimal places
        System.out.format("%.3f", sum2);
    }

}
