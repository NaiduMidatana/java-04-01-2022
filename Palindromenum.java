package javatraining;
import java.util.*;
public class Palindromenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc =new Scanner(System.in);
      int r, sum = 0;
      int n;
      System.out.println("Enter your number..");
      n = sc.nextInt();
      int temp = n;
      while (n>0) {
    	  r = n% 10;
    	  sum = (sum*10) + r;
    	  n =n/10;
      }
		if (temp == sum) {
			System.out.println("palinrome number");
			
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
