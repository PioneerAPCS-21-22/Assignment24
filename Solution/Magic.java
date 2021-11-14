/**
 * Assignment 24 Solution
 * @author Mr. King
 * @version 11/10/2021
 */


import java.util.Scanner;

public class Magic
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = in.nextInt();
        printMagic(n);
    }
   
    /**
     * Prints first n magic squares, which are perfect squares that are
     * the sum of consecutive integers starting from 1.
     *
     * @param n - the number of magic squares to find
     */
    public static void printMagic(int n)
    {
        long currentSqrt = 1;
        long currentSum = 0;
        long currentAdd = 0;
        
        /* Computation time (optional) */
        long time = System.currentTimeMillis();
        
        for(int i = 0; i < n; i++)
        {
            long square = currentSqrt * currentSqrt;
            
            while(square != currentSum)
            {
                currentAdd++;
                currentSum += currentAdd;
                
                if(currentSum > square)
                {
                    currentSqrt++;
                    square = currentSqrt * currentSqrt;
                }
            }
            System.out.println(square + "(1 to " + currentSum + ")");
            currentSqrt++;
        } 
        
        /* Computation time (optional) */
        time = System.currentTimeMillis() - time;
        System.out.println("Time: " + (time / 1000.0) + "s");
    }
}
