package flipCoin;

import java.util.*;

public class FlipCoin
{
    public static void main(String[] args)
    {
        int heads = 0;
        int tails = 0;
        int counter = 1;
        double randNum = 0.0;
        Scanner sc = new Scanner(System.in);
         
        System.out.println("How many times will the coin be flipped? ");
        int flips = sc.nextInt();
        sc.close(); 
        
        while(counter <= flips)
        {
            randNum = Math.random();
            System.out.print(counter + " " );
             
            if(randNum < 0.5)
            {
                heads++;
                System.out.println(" heads");
            }
            else
            {
                tails++;
                System.out.println(" tails");
               }
            counter++;      
        }
        
        int percentHead = heads * 100 / flips ;
        int percentTail = tails * 100 /flips ;
        
        System.out.println();
        System.out.println("Percentage of Heads = " + percentHead);
        System.out.println("Percentage of Tails = " + percentTail);
         
         
         
    }
}