/* A simple java program to Print out the value of a Fibonacci function at a given index using Iterative Method */

import java.util.*;

public class FibIteration{

  public static int fibonacci(int n)
  {
    int x = 0, y = 1, z =1;

    for(int i = 0; i<n-2; i++){   //fib(1)=0, fib(2)=1, When z is initialized as 1, fib(2 is already calculated, so we use n-2)
        x = y;
        y = z;
        z = x+y;
        System.out.println(""+x+"+"+y+"="+z);

      }

      return x;
  }
  public static void main(String [] as){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the base of fibonacci sequence:");
    int n = sc.nextInt();
    fibonacci(n);

  }
}
