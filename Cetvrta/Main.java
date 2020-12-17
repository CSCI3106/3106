import java.util.*;

class Main {
  public static void main(String[] args) {
    //System.out.println("Give me 3 cordinates, and I will give you the last one");
    Scanner keyboard = new Scanner(System.in);
    int[][] arr = new int [2][3];
    arr[0][0] = keyboard.nextInt();
    arr[1][0] = keyboard.nextInt();
    arr[0][1] = keyboard.nextInt();
    arr[1][1] = keyboard.nextInt();
    arr[0][2] = keyboard.nextInt();
    arr[1][2] = keyboard.nextInt();

    for (int i=0; i<2; i++) {
      int first = arr[i][0];
      if (arr[i][1] == first) {
        System.out.print(arr [i][2]+" ");
      }

      else if (arr [i][2] == first){
        System.out.print(arr[i][1]+ " ");
      }
      else 
        System.out.print(first + " ");
    }

  }
}