/* A simple java program to check whether a given input string is palinidrome or not */

import java.util.*;

public class CheckPalindrome{
  public static void main(String[] as) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a String:");
    String s = input.nextLine();
    int low = 0;
    int high = s.length()-1;

    boolean isPalindrome = false;

    while(low<high){
      if(s.charAt(low)==s.charAt(high)){
        isPalindrome = true;
        break;
      }

      low++;
      high--;
    }
    if(isPalindrome){
      System.out.println(s+ " is a Palindrome");
    }
    else{
      System.out.println(s+ " is not a Palindrome");
    }
  }

}
