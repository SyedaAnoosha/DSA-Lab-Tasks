package DSALab4Tasks;
public class Main {
    public static void main(String[] args) {

        int[] heights={180,165,150,170,145};

        Sorting_algos s = new Sorting_algos();

        System.out.println("\nBubble Sort:");
        long beforeB = System.nanoTime();
        s.BubbleSort1D(heights);
        long afterB = System.nanoTime();

        System.out.println("\nSelection Sort:");
        long beforeS = System.nanoTime();
        s.SelectionSort1D(heights);
        long afterS = System.nanoTime();

        System.out.println("\nInsertion Sort:");
        long beforeI = System.nanoTime();
        s.InsertionSort1D(heights);
        long afterI = System.nanoTime();

        System.out.println("\nQuick Sort:");
        long beforeQ = System.nanoTime();
        s.QuickSort1D(heights);
        long afterQ = System.nanoTime();

        System.out.println();
        System.out.println("Time took by bubble sort : "+(afterB-beforeB));
        System.out.println("Time took by selection sort : "+(afterS-beforeS));
        System.out.println("Time took by insertion sort : "+(afterI-beforeI));
        System.out.println("Time took by quick sort : "+(afterQ-beforeQ));
    }
}
