package lab10;

public class Question4 {
    public static int BinarySearch(int[] a, int l, int h, int x) {
        if (l > h) {
            return -1;
        }
        int mid = (l + h)/2;
        if (a[mid] == x) {
            return mid;
        } else if (a[mid] < x) {
            return BinarySearch(a, mid+1, h, x);
        } else {
            return BinarySearch(a, l, mid-1, x);
        }
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};
        System.out.println(BinarySearch(arr,0,arr.length-1,6));
    }
}
