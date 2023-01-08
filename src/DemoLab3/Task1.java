package DemoLab3;

import java.util.Scanner;

class ContactApp{
    Scanner scan=new Scanner(System.in);
    static int size=5;
    String[][] contacts=new String[size][2];
    static int index;
    public void displayAllContacts(){
        System.out.println("Name    Mobile Number");
        for (String[] contact : contacts) {
            System.out.println(contact[0] + "    " + contact[1]);
        }
    }
    public boolean searchContact(String name){
        index=-1;
        boolean found=false;
        for (String[] contact : contacts) {
            index++;
            if (name.equals(contact[0])) {
                found = true;
                break;
            }
        }
        return found;
    }

    public void addNewContact(String name,String mobile){
        try{
            for (int i=0;i<contacts.length;i++) {
                if(contacts[i][0]==null){
                    contacts[i][0]=name;
                    contacts[i][1]=mobile;
                    break;
                }
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.print("Storage is full!");
        }
    }
    public void updateContact() {
        System.out.println("Enter name of contact you want to update: ");
        String name1=scan.nextLine();
        if(searchContact(name1)){
            System.out.println("1->Change name: \n2->Change mobile number: ");
            String choice=scan.nextLine();
            if(choice.equals("1")){
                System.out.print("Enter new name: ");
                String updatedName=scan.nextLine();
                contacts[index][0]=updatedName;
            }else if(choice.equals("2")){
                System.out.print("Enter new number: ");
                String no= scan.nextLine();
                contacts[index][1]=no;
            }
        }else System.out.println("Contact not found! ");

    }

    public void deleteContact(String name){
        if(searchContact(name)){
            for(int i=index;i>0;i--){
                contacts[i][0]=contacts[i-1][0];
                contacts[i][1]=contacts[i-1][1];
            }
            contacts[0][0]=null;
            contacts[0][1]=null;
        }else System.out.println("Contact not found!");
    }

    public void menu(){
        System.out.println("\nEnter your choice: ");
        System.out.println("1. Display all contacts");
        System.out.println("2. Search a contact");
        System.out.println("3. Add a new contact");
        System.out.println("4. Update a contact");
        System.out.println("5. Delete a contact\n");
    }

}
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContactApp contactApp = new ContactApp();

        contactApp.contacts[0][0]="Alex";
        contactApp.contacts[0][1]="0000000";
        contactApp.contacts[1][0]="Ava";
        contactApp.contacts[1][1]="1111111";
        contactApp.contacts[2][0]="Aaron";
        contactApp.contacts[2][1]="2222222";
        contactApp.contacts[3][0]="Rhys";
        contactApp.contacts[3][1]="3333333";
        contactApp.contacts[4][0]="Bridget";
        contactApp.contacts[4][1]="4444444";

        int n=10;

        while(n!=0){
            contactApp.menu();
            n= scanner.nextInt();
            System.out.println();
            switch (n){
                case 1 :{
                    contactApp.displayAllContacts();
                    break;
                }
                case 2 :{
                    scanner.nextLine();
                    System.out.println("Enter name you want to search: ");
                    String name =  scanner.nextLine();
                    contactApp.searchContact(name);
                    break;
                }
                case 3 :{
                    scanner.nextLine();
                    System.out.println("Enter name: ");
                    String enterName = scanner.nextLine();
                    System.out.println("Enter number: ");
                    String enterNum = scanner.nextLine();
                    contactApp.addNewContact(enterName,enterNum);
                    break;
                }
                case 4:{
                    contactApp.updateContact();
                    break;
                }
                case 5:{
                    scanner.nextLine();
                    System.out.println("Enter name: ");
                    String delName = scanner.nextLine();
                    contactApp.deleteContact(delName);
                }
                default:{
                    scanner.nextLine();
                    System.out.println("Enter valid choice");
                }
            }
        }
    }
}
