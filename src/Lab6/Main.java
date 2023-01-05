package Lab6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //declared different arrays for every sorting technique because after bubble sorting the array
        // will become sorted and as a parameter to different functions, the already sorted array is passed.


        int[] heightS={180,165,150,170,145};
        int[] heightB={180,165,150,170,145};
        int[] heightI={180,165,150,170,145};
        int[] heightQ={180,165,150,170,145};

        Sorting_algos s = new Sorting_algos();

        System.out.println("\nBubble Sort:");
        long beforeB = System.nanoTime();
        s.BubbleSort1D(heightB);
        long afterB = System.nanoTime();

        System.out.println("\nSelection Sort:");
        long beforeS = System.nanoTime();
        s.SelectionSort1D(heightS);
        long afterS = System.nanoTime();

        System.out.println("\nInsertion Sort:");
        long beforeI = System.nanoTime();
        s.InsertionSort1D(heightI);
        long afterI = System.nanoTime();

        System.out.println("\nQuick Sort:");
        long beforeQ = System.nanoTime();
        s.QuickSort1D(heightQ,0, heightQ.length-1);
        System.out.println(Arrays.toString(heightQ));
        long afterQ = System.nanoTime();

        System.out.println();
        System.out.println("Time took by bubble sort : "+(afterB-beforeB));
        System.out.println("Time took by selection sort : "+(afterS-beforeS));
        System.out.println("Time took by insertion sort : "+(afterI-beforeI));
        System.out.println("Time took by quick sort : "+(afterQ-beforeQ));
        System.out.println();

        int[][] arrB = { { 2,0,15 } , { 5,1,3 } , { 6,9,4 } };
        s.SelectionSort2D(arrB);
        //s.BubbleSort2D(arrB);
    }
}
