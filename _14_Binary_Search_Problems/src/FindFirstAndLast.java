import java.util.Arrays;

/*
34. Find First and Last Position of Element in Sorted Array
https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

 */
public class FindFirstAndLast {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 7, 7, 7, 8, 8, 10};
        int target = 1; // return [2, 5]
        int[] res = helper(arr, target);
        System.out.println(Arrays.toString(res));

    }
    static int[] helper(int[] arr, int target){
        return new int[]{findFirst(arr, target) , findLast(arr, target)};
    }
    static int find(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start<=end){
            int middle = start + (end-start) / 2;
            if (arr[middle]>target){
                end = middle - 1;
            } else if (arr[middle]<target) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
    static int findFirst(int[] arr, int target){
        int initial = find(arr, target);
        if (initial == -1){
            return -1;
        }
        while (arr[initial]==target){
            initial--;
        }
        return initial+1;
    }
    static int findLast(int[] arr, int target){
        int initial = find(arr, target);
        if (initial == -1){
            return -1;
        }
        while (arr[initial]==target){
            initial++;
        }
        return initial-1;
    }
}
