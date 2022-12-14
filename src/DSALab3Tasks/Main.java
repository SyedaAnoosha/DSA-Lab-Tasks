package DSALab3Tasks;
public class Main {
    public static void main(String[] args) {

        int[] A = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int key = 60;
        int[][] B = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int key2 = 5;

        SearchingAlgos s = new SearchingAlgos();

        long before1 = System.nanoTime();
        s.LinearSearch1D(A, key);
        long after1 = System.nanoTime();
        System.out.println("Execution time of LinearSearch1D method is : " + (after1 - before1));

        long before2 = System.nanoTime();
        s.LinearSearch2D(B, key2);
        long after2 = System.nanoTime();
        System.out.println("Execution time of LinearSearch2D method is : " + (after2 - before2));

        long before = System.nanoTime();
        s.BinarySearch1D(A, key, 0, A.length - 1);
        long after = System.nanoTime();
        System.out.println("Execution time of BinarySearch1D method is : " + (after - before));

        long before2D = System.nanoTime();
        s.BinarySearch2D(B, key2);
        long after2D = System.nanoTime();
        System.out.println("Execution time of BinarySearch2D method is : " + (after2D - before2D));
    }
}
