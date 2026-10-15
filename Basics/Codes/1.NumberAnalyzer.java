Problem Statement: Number analyzer

Write a method: public static void analyzeNumber(int n)
It should print:
    - Whether the number is positive, negative, or zero.
    - Whether the number is even or odd, when applicable.
    - The square of the number.
Example input:      -4
Expected output:
                    Negative
                    Even
                    Square: 16
Important: Zero is neither positive nor negative, and it is even.
           Consider whether calculating the square using int could overflow.

    -------------------------------------------------------------------------------------------------------------------------------------------------------
Code Solution: 

    
import java.util.Scanner; // necessary to use the scanner method for taking inputs
public class NumberAnalyzer {
    public static void numberAnalyzer(int num){
        // positive, negative, zero
        if(num>0){
            System.out.println("Positive");
        }else if(num==0){
            System.out.println("Zero");
        }else{
            System.out.println("Negative");
        }
        // even, odd
        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        //square
        long square = (long) num*num; // edge case that the square can be a large number
        System.out.println(square);
    }
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number  = sc.nextInt();
        numberAnalyzer(number);
    }
}

