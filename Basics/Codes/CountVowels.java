import java.util.Scanner;
public class CountVowels {
    public static int isVowel(String s){
        int count = 0;
        s= s.toLowerCase();
        for(int i=0;i<s.length(); i++){
            char ch =s.charAt(i);
            if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ){
                count++;
            }   
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(isVowel(sentence));
    }
}
