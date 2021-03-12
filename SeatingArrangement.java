/* 
You will be given a seat number, find out the seat number facing you and the seat type, i.e. WS, MS or AS.

INPUT
First line of input will consist of a single integer T denoting number of test-cases. Each test-case consists of a single integer N denoting the seat-number.

OUTPUT
For each test case, print the facing seat-number and the seat-type, separated by a single space in a new line.
*/

import java.util.*;

class SeatingArrangement {

  public static void main(String args[]) throws Exception {
    Scanner s = new Scanner(System.in);

    int T = s.nextInt();

    for (int i = 0; i < T; i++) {
      int N = s.nextInt();

      if (N % 12 == 1) {
        N = N + 11;

        System.out.println(N + " WS");
      } else if (N % 12 == 2) {
        N = N + 9;

        System.out.println(N + " MS");
      } else if (N % 12 == 3) {
        N = N + 7;

        System.out.println(N + " AS");
      } else if (N % 12 == 4) {
        N = N + 5;

        System.out.println(N + " AS");
      } else if (N % 12 == 5) {
        N = N + 3;

        System.out.println(N + " MS");
      } else if (N % 12 == 6) {
        N = N + 1;

        System.out.println(N + " WS");
      } else if (N % 12 == 7) {
        N = N - 1;

        System.out.println(N + " WS");
      } else if (N % 12 == 8) {
        N = N - 3;

        System.out.println(N + " MS");
      } else if (N % 12 == 9) {
        N = N - 5;

        System.out.println(N + " AS");
      } else if (N % 12 == 10) {
        N = N - 7;

        System.out.println(N + " AS");
      } else if (N % 12 == 11) {
        N = N - 9;

        System.out.println(N + " MS");
      } else if (N % 12 == 0) {
        N = N - 11;

        System.out.println(N + " WS");
      }
    }
  }
}
