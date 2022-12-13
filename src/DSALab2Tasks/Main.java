package DSALab2Tasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        ContactApp c = new ContactApp();

        while(true){
            c.menu();
            System.out.println("Enter the option: ");
            i = sc.nextInt();
            if (i == 1) {
                c.display_contacts();
            } else if (i == 2) {
                System.out.println("Enter the name you want to search:  ");
                String name = sc.next();
                c.search_contacts(name);
            } else if (i == 3) {
                System.out.print("Enter at which position you want to add: ");
                int pos =sc.nextInt();
                System.out.println("Enter name: ");
                String name = sc.nextLine();
                System.out.println("Enter number: ");
                String num = sc.nextLine();
                c.add_contact(pos,name,num);
            } else if (i == 4) {
                System.out.println("Enter name you want to replace: ");
                String name1= sc.nextLine();
                System.out.println("Enter name you want to replace with it: ");
                String name2 = sc.nextLine();
                c.update_contacts(name1,name2);
            } else if (i == 5) {
                System.out.println("Name you want  to delete: ");
                String del = sc.nextLine();
                c.delete_contact(del);
            } else if (i == 6) {
                System.exit(0);
            }
        }


        /* int[] numArr={2,3,4,5};
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
*/

    }
}
