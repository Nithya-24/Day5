package flipCoin;

import java.util.*;

public class GreaterNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
	    System.out.println("Enter the value of a: ");  
	    int a = sc.nextInt();  
	    System.out.println("Enter the value of b: ");  
	    int b = sc.nextInt(); 
	    System.out.println("Enter the value of c: ");  
	    int c = sc.nextInt(); 
	    sc.close();
	    
		if( a >= b && a >= c )  
		System.out.println( a+" is the largest Number" );  
		//comparing b with a and b with c  
		//if both conditions are true, prints b  
		else if ( b >= a && b >= c )  
		System.out.println( b+" is the largest Number" );  
		else  
		//prints c if the above conditions are false  
		System.out.println( c+" is the largest number" );  
 

	}

}
