package DemoLab3;

import java.util.Scanner;

public class Lab2 {
    Scanner sc = new Scanner(System.in);
    public int[] arrInput(){
        System.out.print("Enter length of array: ");
        int x= sc.nextInt();
        int[] arr = new int[x];
        for(int i =0 ;i<arr.length; i++){
            System.out.print("Enter element : "+(i+1)+" ");
            arr[i]= sc.nextInt();
        }
        return arr;
    }
    public void arrOutput(int[] arr){
        int num;
        System.out.print("[");
        for(int i =0;i< arr.length-1;i++){
            num=arr[i];
            System.out.print(num+",");
        }
        System.out.print(arr[arr.length-1] + "]");
    }


    //linear search

    public boolean arrSearch(int[] arr){

        boolean found= false;
        System.out.println("Enter the number you want to search:  ");
        int a= sc.nextInt();
        for (int j : arr) {
            if (j == a) {
                found = true;
                break;
            } else {
                found = false;
            }
        }
        return found;
    }

    public void menu(){
        System.out.println("Few operations: ");
        System.out.println("1. Input Operation");
        System.out.println("2. Output Operation");
        System.out.println("3. Search Operation");
        System.out.println("4. Exit");
    }
}
