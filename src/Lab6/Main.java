package Lab6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] height={180,165,150,170,145};

        SortingAlgorithms S = new SortingAlgorithms();

        System.out.println("Bubble Sort:");
        long before = System.nanoTime();
        S.BubbleSort1D(height);
        long after = System.nanoTime();

        System.out.println("Selection Sort:");
        long before1 = System.nanoTime();
        S.SelectionSort1D(height);
        long after1 = System.nanoTime();

        System.out.println("Insertion Sort:");
        long before2 = System.nanoTime();
        S.InsertionSort1D(height);
        long after2 = System.nanoTime();

        System.out.println("Quick Sort:");
        long before3 = System.nanoTime();
        S.QuickSort1D(height,0, height.length-1);
        System.out.println(Arrays.toString(height));
        long after3 = System.nanoTime();

        System.out.println("Time took by bubble sort : "+(after-before));
        System.out.println("Time took by selection sort : "+(after1-before1));
        System.out.println("Time took by insertion sort : "+(after2-before2));
        System.out.println("Time took by quick sort : "+(after3-before3));

        int[][] arr = {{2,10,15},{5,1,3},{6,9,4}};
        int[] cArr = S.convert(arr);

        System.out.println("Bubble Sort:");
        S.BubbleSort1D(cArr);
        System.out.println("Selection Sort:");
        S.SelectionSort1D(cArr);
        System.out.println("Insertion Sort:");
        S.InsertionSort1D(cArr);
        System.out.println("Quick Sort:");
        S.QuickSort1D(cArr,0, cArr.length-1);
        System.out.println(Arrays.toString(cArr));

    }
}
