import java.util.Scanner; // the class necessary to use scanner

public class EvenOdd { // name of the .java file is EvenOdd
    public static boolean isEven(int num){ // num is the input n taken in the void main method, both parameter types must be the same as well.
            return num%2==0; // returns the boolean value because the boolean is declared in the line above. this emthod must return the same type.
    }
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in); // scanner is used to take inputs from user
        int n= sc.nextInt(); // the input is now stored in the integer variable n
        if(isEven(n)){  // from here on, it's typical if-else condition and the sys.out printing
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
