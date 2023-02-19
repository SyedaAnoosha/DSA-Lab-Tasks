package lab10;

import java.util.Scanner;

public class Question3 {
    public static long fab(int n){
        if(n<1) return 0;
        if(n<3) return 1;
        return fab(n-1)+fab(n-2);
    }
    public static void main(String[] args) {

        System.out.println("Enter number of fibonacci series: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fab(n));

    }
}
