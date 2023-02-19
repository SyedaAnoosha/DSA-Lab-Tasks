package lab10;

import java.util.Scanner;

public class Question2 {
    public static void printNum(int n){
        if(n<0) return;

        printNum(n-1);
        System.out.println(n);// print in ascending

//        System.out.println(n);
//        printNum(n-1); //print in descending

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        printNum(n);
    }
}
