package fibonacci;
import java.util.*;
public class Fibonacci
{
 static int a=1,b=1,c;
 static float sum=0.0f;
	 public static void main(String[] args)
 {
	 System.out.println("The first 20 Fibonacci numbers are:");
	 System.out.print(a+" "+b);
	 for(int i=2;i<20;i++)
 {
   c=a+b;
	 System.out.print(" "+c);
	 sum=sum+c;
	 a=b;
	 b=c;
	 }
	 System.out.print("\n");
	 System.out.print("The average is "+ sum/20);
	 }
}
