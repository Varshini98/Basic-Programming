/* Input

First line contains an integer T, denoting the number of test cases.

Each of the next lines contains a string, string contains both lower case and upper case .

Output

Print the vowel sum
Answer for each test case should be printed in a new line.
*/

import java.util.*;

class VowelRecognition {

  public static void main(String args[]) throws Exception {
    Scanner s = new Scanner(System.in);

    int l = s.nextInt();

    for (int i = 0; i < l; i++) {
      String str = s.next().toLowerCase();

      char[] ch = new char[str.length()];

      long n = str.length();

      long count = 0;

      for (int j = 0; j < n; j++) {
        char vowel = str.charAt(j);

        if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
          count += ((n - j) * (j + 1));
        }
      }

      System.out.println(count);
    }
  }
}
