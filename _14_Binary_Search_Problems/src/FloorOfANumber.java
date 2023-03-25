public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18, 21, 22, 33, 45, 54};
        int target = 1;
        int res = find(arr, target);
        System.out.println(res + ", " +  arr[res]);
    }
    static int find(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            int middle = left + (right-left) / 2;
            if (arr[middle] < target){
                left = middle + 1;
            } else if (arr[middle] > target){
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return right;
    }
}
