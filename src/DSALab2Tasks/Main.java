package DSALab2Tasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

        String[] contacts = {"Aaron","Berkley","Charlotte","Dylan","Ella"};
        String[] number = {"0968965672","223615371","031213","1231232134","321312315"};

        ContactApp c= new ContactApp();

        c.menu();
        System.out.println("Enter the option: ");
        int i = sc.nextInt();
        if (i == 1) {
            c.display_contacts(contacts, number);
        } else if (i == 2) {
            System.out.println("Enter the name you want to search:  ");
            String name = sc.next();
            c.search_contacts(name,contacts,number);
        } else if (i == 3) {
            System.out.print("Enter name you want to edit: ");
            String name1= sc.nextLine();
            System.out.print("Enter name you want to replace with it: ");
            String name2 = sc.nextLine();
            c.update_contacts(name1,name2,contacts);
        }


        c.update_contacts("Aaron","Alex",contacts);
    }
}
