package DSALab2Tasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr={2,3,4,5};
        Lab2 a = new Lab2();
        a.arrInput();
        a.arrSearch(numArr);
        a.arrOutput(numArr);

        if(a.arrSearch(numArr)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }

        a.menu();
        System.out.print("Enter the option: ");
        int op = sc.nextInt();
        while(op!=4){
            switch (op) {
                case 1 -> {
                    a.arrInput();
                    break;
                }
                case 2 -> {
                    a.arrOutput(numArr);
                    break;
                }
                case 3 -> {
                    a.arrSearch(numArr);
                }
            }
        }

    }
}
