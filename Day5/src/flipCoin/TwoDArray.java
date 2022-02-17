package flipCoin;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class TwoDArray {
	 public static void main(String args[]) {
		 
		    // initialize here
		    int row, col, i, j;
		    int arr[][] = new int[10][10];
		    Scanner scan = new Scanner(System.in);

		    System.out.print("Enter row for the array (max 10): ");
		    row = scan.nextInt();
		    System.out.print("Enter column for the array (max 10): ");
		    col = scan.nextInt();

		    // enter array elements
		    System.out.println("Enter " + (row * col) + " Array Elements: ");
		    for (i = 0; i < row; i++) {
		      for (j = 0; j < col; j++) {
		        arr[i][j] = scan.nextInt();
		      }
		    }
		    String filename = "Array.txt";
		    
		    PrintWriter writer = null;
		    try {
		    	
		    	writer = new PrintWriter( filename );
		    } catch (FileNotFoundException e) {
		    	e.printStackTrace();
		    }
		    
		    
		    // the 2D array 
		    System.out.println ( "The Array is: " );
		    for (i = 0; i < row; i++) {
		      for (j = 0; j < col; j++) {
		        writer.println(arr[i][j] + "  ");
		      }
		      System.out.println();
		    }
		    
		    writer.flush();
		    writer.close();
		  }
		}


