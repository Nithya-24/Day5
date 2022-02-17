package flipCoin;

import java.util.*;

public class QuoRemainder {

	public static void main(String[] args) {
				
		System.out.println("Enter the divident Number");
		Scanner num1 = new Scanner (System.in);
		int dividend = num1.nextInt();
		
		System.out.println("Enter the divident Number");
		Scanner num2 = new Scanner (System.in);
		int divisor = num2.nextInt();
		
		num1.close();
		num2.close();
		
		int quotient = dividend / divisor;
        int remainder = dividend % divisor;
  
        System.out.println("The Quotient is " + quotient);
        System.out.println("The Remainder is " + remainder);
		
	}

}
