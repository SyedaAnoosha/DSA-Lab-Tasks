package lab10;
import java.util.Scanner;
public class Question1 {
    public static long fac(int n){
        if(n<=0 || n==1) {
            return 1;
        }
        return n*fac(n-1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        long ans = fac(n);
        System.out.println("Factorial of "+n+" = "+ans);
    }
}
