import java.io.*;
import java.util.*;

public class IsPrime{
    public static void main(String[] args) throws Exception {
        int remainder;
        boolean isPrime=true;

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=2;i<num/2;i++){
            remainder=num%i;
            if(remainder==0){
                isPrime=false;
                break;
            }
        }
if(isPrime)
System.out.println("primenumber");
else
System.out.println("primenumber");
    }
}




   
     
       
         
