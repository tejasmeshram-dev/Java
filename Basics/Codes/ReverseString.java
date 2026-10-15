import java.util.Scanner;
public class ReverseString {
    public static String reverse(String s) {
        char[] charArray = s.toCharArray();
        char[] reversedArray = new char[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            reversedArray[s.length() - 1 - i] = charArray[i];
        }
        return new String(reversedArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(reverse(sentence));
        sc.close();
    }
}
