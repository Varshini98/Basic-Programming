/* Bob's crush's name starts with a vowel. That's the reason Bob loves vowels too much. 
He calls a string "lovely string" if it contains either all the lowercase vowels or all the uppercase vowels or 
both, else he calls that string "ugly string".  */

    import java.io.BufferedReader;
    import java.io.InputStreamReader;

    import java.util.*;
 
     
    class vowel {
        public static void main(String args[] ) throws Exception {
            
     
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
            int T = Integer.parseInt(br.readLine());    
            for(int k=0;k<T;k++){
                String str = br.readLine();
                if(str.contains("a")&& str.contains("e")&&str.contains("i")&& str.contains("o") && str.contains("u"))
                    System.out.println("lovely string");
                else if (str.contains("A")&& str.contains("E")&&str.contains("I")&& str.contains("O") && str.contains("U"))
                    System.out.println("lovely string");
                else    
                    System.out.println("ugly string");       
             }
     
        }
    }


