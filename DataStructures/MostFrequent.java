/* 
Input:
First line of input contains N, number of integers.
Second line will contains N spaces separated integers.

Output:
Print the most frequent integer.
*/
import java.util.Scanner;

public class MostFrequent {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int i, j, a, c, d = 0, e = 0;

    a = sc.nextInt();

    int arr[] = new int[a];

    for (i = 0; i < a; i++) {
      arr[i] = sc.nextInt();
    }

    for (i = 0; i < a; i++) {
      c = 0;

      for (j = 0; j < a; j++) {
        if (arr[i] == arr[j]) {
          c += 1;

          if (c > d) {
            d = c;

            e = arr[i];
          }
        }
      }
    }

    System.out.println(e);
  }
}
