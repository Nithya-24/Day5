package flipCoin;

import java.util.*;

public class Harmonic {
	public static void main(String[] args) {
		
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.print("The Harmonic Series is: ");
        double result = 0.0;
        while(num > 0)
          {
               result = result + (double) 1 / num;
               num--;
               System.out.print(result +"  ");
          }
        System.out.println("");
        System.out.println("Harmonic Series is "+result);
    }
}


