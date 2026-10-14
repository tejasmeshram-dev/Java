import java.util.Scanner;
public class ArrayMinMax {
    public static int MinMax(int[] nums, String s) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        if (!"max".equals(s) && !"min".equals(s)) {
            throw new IllegalArgumentException("Operation must be 'max' or 'min'");
        }
        int result = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if ("max".equals(s)) {
                if (result < nums[i]) {
                    result = nums[i];
                }
            }
            if ("min".equals(s)) {
                if (result > nums[i]) {
                    result = nums[i];
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Enter Array Length: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Array length must be positive.");
            sc.close();
            return;
        }
        int[] numbers = new int[n];
        System.out.println("Enter Array Numbers: ");
        for(int i=0;i<n;i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Maximum is  "+MinMax(numbers, "max"));
        System.out.println("Minimum is "+MinMax(numbers, "min"));
    }
}
