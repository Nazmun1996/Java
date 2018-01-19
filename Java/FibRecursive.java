/* A simple java program to Print out the value of a Fibonacci function at a given index Using Recursive Method*/


import java.util.*;

public class FibRecursive{
   public int fibonacci(int n){
    if((n==0) ||(n==1))     //Base Case
      return n;

    else
      return fibonacci(n-1)+fibonacci(n-2);
    }

    public void main(String[]as){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the base of fibonacci sequence:");
      int n = sc.nextInt();
      for(int i =0; i<n; i++)
        System.out.println("Base "+i+" Fibonacci:"+fibonacci(n));
    }
}
