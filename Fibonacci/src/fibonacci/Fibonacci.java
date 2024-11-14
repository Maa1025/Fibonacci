package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner Asmaan = new Scanner(System.in);
        
        // Input: Ask user for the number up to which the Fibonacci series is to be displayed
        System.out.print("Enter the number up to which the Fibonacci series should be displayed: ");
        int n = Asmaan.nextInt();
        
        // Initialize the first two Fibonacci numbers
        int first = 0; 
        int second = 1;
        
        System.out.println("Fibonacci Series up to " + n + ":");
        
        // Print the first Fibonacci number
        if (n >= 1) {
            System.out.print(first + " ");
        }
        
        // Print the second Fibonacci number
        if (n >= 2) {
            System.out.print(second + " ");
        }
        
        // Calculate and print the remaining Fibonacci numbers
        int next;
        for (int i = 3; i <= n; i++) {
            next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
        
        System.out.println(); // Move to the next line after printing the series
        Asmaan.close();
    }
}
