package DSALab1Tasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 65) {
            System.out.println("ticket is $7 ");
        } else if (age > 13) {
            System.out.println("ticket is $10");
        }else if (age < 13) {
            System.out.println("ticket cost is $5");
        }
    }
}