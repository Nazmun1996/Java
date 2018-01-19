/* This Program changes a given amount of monet into smaller units
Input taken in Dollars.
Smaller Unites are Cents, Quarters, Dimes, Nickels and Pennies
 */

 import java.util.*;

 public class MoneyChange {
   public static void main(String [] as){

     Scanner input = new Scanner(System.in);
     System.out.println("Enter amount: \n");

     double amount = input.nextDouble();

     int remainingAmount = (int)(amount*100);

     int numberOfDollars = remainingAmount/100;
     remainingAmount = remainingAmount%100;

     int numberOfQuarters = remainingAmount/25;
     remainingAmount = remainingAmount%25;

     int numberOfDimes = remainingAmount/10;
     remainingAmount = remainingAmount%10;

     int numberOfNickels = remainingAmount/5;
     remainingAmount = remainingAmount%5;

     int numberOfPennis = remainingAmount;

     //Display Results
     System.out.println(amount+ "Consists of\n" +numberOfDollars+"Dollars\n" +numberOfQuarters+"Quarters\n"+numberOfDimes+"Dimes\n"+numberOfNickels+"Nickels\n"+numberOfPennis+"Penny");

   }

 }
