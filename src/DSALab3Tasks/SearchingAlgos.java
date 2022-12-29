package DSALab3Tasks;

public class SearchingAlgos{
    public void LinearSearch1D(int[] A, int key){
        for (int i = 0; i < A.length; i++) {
            if(key==A[i]){
                System.out.println(key+ " found at: "+i);
            }
        }

    }
    public void LinearSearch2D(int[][] A, int key){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (key == A[i][j]) {
                    System.out.println(key+" found at index: " + i + ":" + j);
                    return;
                }
            }
        }
        System.out.println(key+" not found");
    }
    public void BinarySearch1D(int[] A, int key, int first, int last){
        int mid = (first + last)/2;
        while( first <= last ){
            if (A[mid] == key ){
                System.out.println(key+" is found at index: " + mid);
                break;
            }
            if ( A[mid] < key ){
                first = mid + 1;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println(key+" is not found!");
        }
    }
    public void BinarySearch2D(int[][] B,int key){
        int r = 0;
        int c = B[r].length - 1;
        while (r < B.length && c >= 0) {
            if (B[r][c] == key) {
                System.out.println(key+ " found at: ["+r +":"+ c+"]");
            }
            if (B[r][c] < key) {
                r++;
            }
            else {
                c--;
            }
        }

    }
}
