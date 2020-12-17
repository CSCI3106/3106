package hangingout3;

import java.util.*;

/**
 *
 * @author weiyihuang
 */
public class Hangingout3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int peopleMax = keyboard.nextInt();
        int events = keyboard.nextInt();
        //break "enter 3" and "leave 1" into 2 separate tokens

        //int count = keyboard.nextInt();
        int peopleEnter = 0;
        int peopleLeaving = 0;

        //call nextLine - reads everything in the line
        for (int i = 0; i < events; i++) {
            String status = keyboard.next(); //read status for each event,next()- read the only word
            int people = keyboard.nextInt();// read the number in the input 
            if (status.equals("enter")) {
                if (peopleEnter+people > peopleMax) {
                    peopleLeaving++;
                } else {
                    peopleEnter = peopleEnter + people;
                }

            } else {
                peopleEnter = peopleEnter - people;
            }

        }

        System.out.println(peopleLeaving);//num of groups not allowed to go in
    }

}
