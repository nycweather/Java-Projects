/*
744. Find Smallest Letter Greater Than Target
https://leetcode.com/problems/find-smallest-letter-greater-than-target/
Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.

 */
public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'f';
        char res = find(letters, target);
        System.out.println(res);
    }
    static char find(char[] arr, char target){
        int start = 0;
        int end = arr.length - 1;
        if (arr[end]< target){
            return arr[0];
        }
        while (start<=end){
            int middle = start + (end - start) / 2;
            if (arr[middle]>target){
                end = middle - 1;
            } else  {
                start = middle + 1;
            }
        }
        return arr[start % arr.length];
    }
}
