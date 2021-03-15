
import java.util.*;

class Factorial {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int f = 1;
    
        for(int i = 1; i <= N; ++i)
        {
            f = f * i;   
        }
        System.out.println(+f);
        
    }
}
