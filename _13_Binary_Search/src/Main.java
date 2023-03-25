class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arr, 122));

    }
    static boolean binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while (left<=right){
            int middle = (right + left) / 2;
            System.out.println("Left: " + left + ", Middle: " + middle + ", Right: " + right);
            if (arr[middle] == target){
                return true;
            } else if (arr[middle] < target){
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return false;
    }
}