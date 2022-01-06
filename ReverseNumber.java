package javatraining;
import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		int reverse = 0;
		System.out.println("Please enter your number..");
		n= sc.nextInt();
		while(n!=0) {
			int remainder = n%10;
			reverse=(reverse*10)+remainder;
			n=n/10;
		}
		System.out.println("reverse output = " + reverse);
	}

}
