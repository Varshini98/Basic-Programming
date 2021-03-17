\*
There are three integers k,m,n. You have to convert the number k to m by performing the given operations:

    Multiply k by n
     Decrease k by 2.
     Decrease k by 1.

You have to perform the above operations to convert the integer from k to m and find the minimum steps.
*\
import java.util.*;

class MinimumSteps {

  public static void main(String args[]) throws Exception {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    while (t-- > 0) {
      int k = sc.nextInt();

      int m = sc.nextInt();

      int n = sc.nextInt();

      int count = 0;

      int x = 0;

      while (k < m) {
        if (m % n == 0) {
          m = m / n;

          count++;
        } else {
          x = (n - (m % n));

          m += (n - (m % n)) / 2 * 2 + (n - (m % n)) % 2;

          count += x / 2 + x % 2;
        }
      }

      if (k > m) {
        count += (k - m) / 2 + (k - m) % 2;
      }

      System.out.println(count);
    }
  }
}
