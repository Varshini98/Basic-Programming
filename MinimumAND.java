/* Input format

    First line: A single integer 

 denoting the number of test cases
For each test case:

    First line contains a single integer 

, denoting the size of the array
Second line contains
 space-separated integers 

Output format

For each test case, print a single line containing one integer that represents the minimum value of the given expression
*/

import java.io.*;
import java.util.*;

class MinimumAND {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int tc = sc.nextInt();
    for(int j = 0; j < tc; j++){
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
    solution(arr);
}    
}
public static void solution(int[] arr) {
    Arrays.sort(arr);
    int ans = Integer.MAX_VALUE;
    for(int i= 0; i < arr.length - 1; i++){
        ans = Math.min(ans,arr[i] ^ arr[i+1]);  
    }
    System.out.println(ans);
}
}




   
     
       
         