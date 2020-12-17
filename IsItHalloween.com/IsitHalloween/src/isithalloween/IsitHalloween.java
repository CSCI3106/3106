package isithalloween;
import java.util.*;

/**
 *
 * @author weiyihuang
 * Check if the date is Halloween: 10/31, 12/25 If not, output: nope.
 */
public class IsitHalloween {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String date = keyboard.nextLine();
        //int date = keyboard.nextInt();
        if (date.equals("OCT 31") || (date.equals("DEC 25"))) {
            System.out.println("yup");
        }
        else 
            System.out.println("nope");
    }
    
}
