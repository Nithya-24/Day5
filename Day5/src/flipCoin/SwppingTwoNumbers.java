package flipCoin;

import java.util.*;

public class SwppingTwoNumbers {

	public static void main(String[] args) {
		
		 int x, y, temp; 
	       Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter the value of x");  
	       x = sc.nextInt();  
	       System.out.println("Enter the value of y");
	       y = sc.nextInt();  
	       sc.close();
	       
	       System.out.println("Before swapping: "+x +"  "+ y);  
	       //swapping  
	       temp = x;  
	       x = y;  
	       y = temp;  
	       System.out.println("After swapping: "+x +"   " + y);  
	       System.out.println( );  
	    }    
	}  