Problem Statement: FizzBuzz

Write a method: public static void fizzBuzz(int n)
For each integer from 1 through n:  Print Fizz if the number is divisible by 3.
                                    Print Buzz if it is divisible by 5.
                                    Print FizzBuzz if it is divisible by both.
                                    Otherwise, print the number.
Example for n = 15:
                        1
                        2
                        Fizz
                        4
                        Buzz
                        Fizz
                        7
                        8
                        Fizz
                        Buzz
                        11
                        Fizz
                        13
                        14
                        FizzBuzz

Note: check divisibility by both 3 and 5 before checking divisibility by either one separately.



    ----------------------------------------------------------------------------------------------------------------------------------------------------
Code Solution:



import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            if(i%3==0 && i%5 == 0){
                System.out.println("FizzBuzz");
            }else if(i%3 == 0){
                System.out.println("Fizz");
            }else if(i%5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }  
}
