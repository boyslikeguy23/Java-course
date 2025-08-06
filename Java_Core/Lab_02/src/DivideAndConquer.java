public class DivideAndConquer {
    public static int findMax(int[] arr, int left, int right){
        if(left == right){
            return arr[left];
        }

        int mid = (left + right)/2;
        int maxLeft=findMax(arr, left, mid);
        int maxRight=findMax(arr, mid + 1, right);
        return Math.max(maxLeft, maxRight);


    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 0, 0, 0, 0, 0, 0};
        int max = findMax(arr, 0, arr.length - 1);
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
    }
}
