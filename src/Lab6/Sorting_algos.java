package Lab6;
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
        int temp;
        for (int i = 0 ; i < A.length - 1 ; i++) {
            for (int j = 0; j < A.length - 1 - i; j++) {
                if (A[j] > A[j + 1]) {
                    temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(A));
    }

    public void InsertionSort1D(int[] A){
        for (int i = 1; i < A.length ; i++) {
            int temp=A[i];
            int j=i-1;
            while( j>=0 && A[j]>temp ){
                A[j+1]=A[j];
                j--;
            }
            A[j+1]=temp;
        }
        System.out.println(Arrays.toString(A));
    }

    int partition(int[] A, int low, int high){

        int pivot=A[low];
        int count = 0;

        for (int i = low + 1; i <= high ; i++) {
            if(A[i]<=pivot){
                count++;
            }
        }

        int pivIndex = count + low;

        int temp = A[pivIndex];
        A[pivIndex] = A[low];
        A[low] = temp;

        int s = low, e  = high;

        while(s < pivIndex && e > pivIndex){
            if(A[s]<=pivot){
                s++;
            }
            if(A[e]>pivot){
                e--;
            }
            if(s < pivIndex && e > pivIndex){
                int loc = A[s];
                A[s] = A[e];
                A[e] = loc;
            }
        }

        return pivIndex;
    }
    public void QuickSort1D(int[] A, int low, int high){
        if(low<high){
            int pivot_index = partition(A,low,high);
            QuickSort1D(A,low,pivot_index-1);
            QuickSort1D(A,pivot_index+1,high);
        }
    }

    public void BubbleSort2D(int[][] A){

        int temp;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length - 1; j++) {
                for (int k = 0; k < A[i].length - 1 - j; k++) {
                    if (A[i][k] > A[i][k + 1]) {
                        temp = A[i][k];
                        A[i][k] = A[i][k + 1];
                        A[i][k + 1] = temp;
                    }
                }

            }
        }
        System.out.println(Arrays.deepToString(A));
    }

    public void SelectionSort2D(int[][] A){
        int temp,min;

        for (int i = 0; i < A.length ; i++) {
            for (int j = i+1; j < A[i].length; j++) {
                for (int k = 0; k < A.length-1 ; k++) {
                    min=i;
                    for (int l = k+1; l < A.length; l++) {
                        if(A[i][j]<A[i][min]){
                            min=j;
                        }
                    }
                    temp=A[i][k];
                    A[i][k]=A[i][min];
                    A[i][min]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(A));
    }
}
