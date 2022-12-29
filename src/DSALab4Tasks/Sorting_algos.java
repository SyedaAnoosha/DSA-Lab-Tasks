package DSALab4Tasks;
import java.util.Arrays;

public class Sorting_algos {
    public void SelectionSort1D(int[] A){
        int temp,min;
        for (int i = 0; i < A.length-1; i++) {
            min=i;
            for (int j = i+1; j < A.length; j++) {
                if(A[j]<A[min]){
                    min=j;
                }
            }
            temp=A[i];
            A[i]=A[min];
            A[min]=temp;
        }
        System.out.println(Arrays.toString(A));
    }

    public void BubbleSort1D(int[] A){

        System.out.println(Arrays.toString(A));
    }
    public void InsertionSort1D(int[] A){

        System.out.println(Arrays.toString(A));
    }

    public void QuickSort1D(int[] A){

        System.out.println(Arrays.toString(A));
    }


}
