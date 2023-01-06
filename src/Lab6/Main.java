package Lab6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] height={180,165,150,170,145};

        Sorting_algos s = new Sorting_algos();

        System.out.println("\nBubble Sort:");
        long beforeB = System.nanoTime();
        s.BubbleSort1D(height);
        long afterB = System.nanoTime();

        System.out.println("\nSelection Sort:");
        long beforeS = System.nanoTime();
        s.SelectionSort1D(height);
        long afterS = System.nanoTime();

        System.out.println("\nInsertion Sort:");
        long beforeI = System.nanoTime();
        s.InsertionSort1D(height);
        long afterI = System.nanoTime();

        System.out.println("\nQuick Sort:");
        long beforeQ = System.nanoTime();
        s.QuickSort1D(height,0, height.length-1);
        System.out.println(Arrays.toString(height));
        long afterQ = System.nanoTime();

        System.out.println();
        System.out.println("Time took by bubble sort : "+(afterB-beforeB));
        System.out.println("Time took by selection sort : "+(afterS-beforeS));
        System.out.println("Time took by insertion sort : "+(afterI-beforeI));
        System.out.println("Time took by quick sort : "+(afterQ-beforeQ));

        int[][] arr2D = { { 2,10,15 } , { 5,1,3 } , { 6,9,4 } };
        int[] convertedArr = s.convert(arr2D);

        System.out.println("\nBubble Sort:");
        s.BubbleSort1D(convertedArr);

        System.out.println("\nSelection Sort:");
        s.SelectionSort1D(convertedArr);

        System.out.println("\nInsertion Sort:");
        s.InsertionSort1D(convertedArr);

        System.out.println("\nQuick Sort:");
        s.QuickSort1D(convertedArr,0, convertedArr.length-1);
        System.out.println(Arrays.toString(convertedArr));

    }
}
