import java.util.*;

class CostOFBalloons{

public static void main(String ar[]){
Scanner sc=new Scanner(System.in);
int green;
int purple;
int n;
int first=0,second=0;
int t=sc.nextInt();
for(int i=0;i<t;i++)
  {
    green=sc.nextInt();
    purple=sc.nextInt();
    n=sc.nextInt();
    for(int j=0;j<n;j++)
      {
        if(sc.nextInt()==1){
        first++;
      }
        else{}
    if(sc.nextInt()==1){
    second++;
    }
else{}
  }
int x=green*first+purple*second;
int y=purple*first+green*second;
if(x<y)
  {
System.out.println(x);
  }
else
{
System.out.println(y);
}
first=0;second=0;
}
}
}
