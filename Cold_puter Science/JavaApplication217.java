package javaapplication217;

import java.util.*;
//coldputer-science

/**
 *
 * @author weiyihuang
 */
public class JavaApplication217 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);

        int totalDays = keyboard.nextInt(); //first num - total days
        int[] totalTemp = new int[totalDays]; //second num - all temperatures (stored in an array)
        //int totalTemp = keyboard.nextInt();
        int negTemp = 0;  // set temp < 0 as 0, so it can count in the loop later 
        //for loop to count the total neg temperature days and add it to negTemp
        for (int i = 0; i < totalDays; i++) {
            totalTemp[i] = keyboard.nextInt();
            if (totalTemp[i] < 0) {
                negTemp++;
                
            //how to fix when output is 1 2 3 4 5
            //should I put the last negTemp?  
                System.out.println(negTemp); //output
            }
            // negTemp += totalTemp[i];

        }

    }

}


