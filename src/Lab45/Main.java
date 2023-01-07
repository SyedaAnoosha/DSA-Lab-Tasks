package Lab45;
public class Main {
    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] B = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int key = 5;

        SearchingAlgos s = new SearchingAlgos();

        long before1 = System.nanoTime();
        s.LinearSearch1D(A, key);
        long after1 = System.nanoTime();

        long before2 = System.nanoTime();
        s.LinearSearch2D(B, key);
        long after2 = System.nanoTime();

        long before = System.nanoTime();
        s.BinarySearch1D(A, key, 0, A.length - 1);
        long after = System.nanoTime();

        long before3 = System.nanoTime();
        s.BinarySearch2D(B, key);
        long after3 = System.nanoTime();
        System.out.println();

        System.out.println("Execution time of LinearSearch1D is : " + (after1 - before1));
        System.out.println("Execution time of LinearSearch2D is : " + (after2 - before2));
        System.out.println("Execution time of BinarySearch1D is : " + (after - before));
        System.out.println("Execution time of BinarySearch2D is : " + (after3 - before3));
    }
}
