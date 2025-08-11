// Given an array of integers, determine if it exhibits a continuous mountain and valley pattern.
// A continuous mountain and valley pattern means that the array elements strictly alternate between increasing and decreasing. That is:
// Either a[0] < a[1] > a[2] < a[3] > a[4] ..., or
// a[0] > a[1] < a[2] > a[3] < a[4] ....
// Note:
// If the array has only one element, return 1.
// Print 1 if the array follows the continuous mountain and valley pattern, otherwise print 0.

import java.util.*;
public class mountainAndValley{
    public static int isMountainValley(int[] arr) {
        int n = arr.length;
        if (n == 1) return 1; 
        // Check Pattern 1: a[0] < a[1] > a[2] < a[3] ...
        boolean pattern1 = true;
        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 0) { // Expect <
                if (arr[i] >= arr[i + 1]) {
                    pattern1 = false;
                    break;
                }
            } else { // Expect >
                if (arr[i] <= arr[i + 1]) {
                    pattern1 = false;
                    break;
                }
            }
        }
        // Check Pattern 2: a[0] > a[1] < a[2] > a[3] ...
        boolean pattern2 = true;
        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 0) { 
                if (arr[i] <= arr[i + 1]) {
                    pattern2 = false;
                    break;
                }
            } else { 
                if (arr[i] >= arr[i + 1]) {
                    pattern2 = false;
                    break;
                }
            }
        }
        return (pattern1 || pattern2) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n:");
        int n = sc.nextInt(); 
        int[] arr = new int[n];
        System.out.println("enter array element:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Result="+isMountainValley(arr));
    }
}
