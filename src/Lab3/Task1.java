package Lab3;

import java.util.Scanner;

class ContactApp{
    String[][] Contact= new String[20][2];
    int count=0;
    String input;
    Scanner sc = new Scanner(System.in);
    public void display(){
        for(int i=0 ; i<count;i++) {
            System.out.println("Name : "+Contact[i][0] );
            System.out.println("Number : "+Contact[i][1]);
        }
    }
    public void add(){
        System.out.println("Enter the name of the contact ");
        Contact[count][0]=sc.next();
        System.out.println("Enter the number of "+Contact[count][0]);
        Contact[count][1]=sc.next();
        count++;
    }
    public void update(){
        System.out.println("Enter the person whose number you want to update");
        input = sc.next();
        for(int i=0;i<count;i++) {
            if(input.equalsIgnoreCase(Contact[i][0].toString())) {
                System.out.println("Enter the new name of "+Contact[i][0]);
                Contact[i][0]= sc.next();
            }
        }
    }
    public void delete() {
        System.out.println("Enter the person whose number you want to delete");
        input = sc.next();
        for(int i=0;i<count;i++) {
            if(input.equalsIgnoreCase(Contact[i][0].toString())) {
                System.out.println("Contact for "+Contact[i][0]+" has been deleted");
                Contact[i][0]="";
                Contact[i][1]="";
                count--;
            }
        }
    }

    public void search(){
        System.out.println("Enter the person whose number you want to search");
        input = sc.next();
        for(int i=0;i<count;i++) {
            if(input.equalsIgnoreCase(Contact[i][0].toString())) {
                System.out.println("Name : "+Contact[i][0] );
                System.out.println("Number : "+Contact[i][1]);

            }
        }
    }
    public void menu() {
        System.out.println("\n1. Display all contact\n2. Search a contact \n3. Add a new contact\n4. Update the contact \n5. Delete any contact\n6. Exit\n");
    }
}
public class Task1 {
    public static void main(String[] args) {
        ContactApp abc = new ContactApp();
        Scanner sc = new Scanner(System.in);

        while(true){
            abc.menu();
            System.out.println("Enter the option: ");
            int j = sc.nextInt();
            if (j == 1) {
                abc.display();
            } else if (j == 2) {
                abc.search();
            } else if (j == 3) {
                abc.add();
            } else if (j == 4) {
                abc.update();
            } else if (j == 5) {
                abc.delete();
            } else if (j == 0) {
                System.exit(0);
            }

        }
    }

}