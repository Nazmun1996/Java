/* A java program to check whether a given number is a Prime Number or not */

import java.util.*;

public class PrimeNumber{
  public static void main(String []as){

    boolean isPrime = false;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int n = sc.nextInt();

    for(int i =2; i<n/2; ++i){
      if(n%i==0){
        isPrime = true;
      }
    }
    if(isPrime == false){
      System.out.println(n+" Is a Prime Number");
    }
    else{
      System.out.println(n+" Is not a Prime Number");
    }
  }
}
