import java.util.Scanner;
public class NumberAnalyzer {
    public static void Analyzer(int num){
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
        System.out.println(num*num);
    }
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number  = sc.nextInt();
        Analyzer(number);
    }
}
