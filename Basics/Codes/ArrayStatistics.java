Problem Statement: Array statistics

Write methods that calculate:

  public static int findMin(int[] nums)
  public static int findMax(int[] nums)
  public static long sumArray(int[] nums)
  public static double average(int[] nums)

Test with: int[] nums = {10, 20, 30, 40, 50};
Expected results: Minimum: 10
                  Maximum: 50
                  Sum: 150
                  Average: 30.0
Additional tests: int[] nums = {-10, -5, -20};
Expected results: Minimum: -20
                  Maximum: -5
                  Sum: -35
                  Average: -11.666666666666666

Your methods should handle negative numbers correctly.
You may assume the array is nonempty. Ensure the average uses floating-point division.


  ----------------------------------------------------------------------------------------------------------------------------------------------------------
Code Solution:



import java.util.Arrays;
import java.util.Scanner;
public class ArrayStats {

    public static void validateArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException(
                    "Array must not be null or empty"
            );
        }
    }
    public static int findMin(int[] nums){
        validateArray(nums);
        int min = nums[0];
        for(int i : nums){
            if(i < min){
                min = i;
            }
        }
        return min;
    }
    public static int findMax(int[] nums){
        validateArray(nums);
        int max = nums[0];
        for(int i : nums){
            if(i > max){
                max = i;
            }
        }
        return max;
    }
    public static long sumArray(int[] nums){
        long sum=0;
        for(int i : nums){
            sum+=i;
        }
        return sum;
    }
    public static double avg(int[] nums){
        validateArray(nums);
        return (double) sumArray(nums)/nums.length;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for( int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: "+ Arrays.toString(arr));
        System.out.println(findMin(arr));
        System.out.println(findMax(arr));
        System.out.println(sumArray(arr));
        System.out.println(avg(arr));
        sc.close();
    }
}
