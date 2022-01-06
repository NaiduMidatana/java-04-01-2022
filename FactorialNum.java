package javatraining;
import java.util.*;
public class FactorialNum {

	public static void main(String[] args) {
		int factorial = 1;
		int n;
		Scanner sc = new Scanner(System.in);
	    System.out.println("please enter your numbe..r");
	    n = sc.nextInt();
	    for(int i=1;i<=n;i++) {
	    	factorial=factorial*i;
	    }

	    System.out.println("factorial of your number is =" + factorial);
	}

}
