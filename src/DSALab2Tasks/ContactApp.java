package DSALab2Tasks;

import java.util.Arrays;

public class ContactApp {
    public void menu(){
        System.out.println(
                "1. Display all contact\n" +
                "2. Search a contact \n" +
                "3. Add a new contact\n" +
                "4. Update the contact \n" +
                "5. Delete any contact\n");
    }
    public void display_contacts(String[] name, String[] num){
        System.out.print("[");
        for (int i = 0; i < num.length-1; i++) {
            System.out.println(name[i]+" "+num[i]+",");
        }
        System.out.println(name[name.length-1]+" "+num[num.length-1]+"]");
    }
    public void search_contacts(String name, String[] Names, String[] Numbers){
        for (int i = 0; i < Names.length; i++) {
            if (name.equals(Names[i])){
                System.out.println( "Name: " + name );
                System.out.println( "Number: " + Numbers[i] );
                break;
            }
        }
    }
    public void update_contacts(String name1, String name2, String[] Names){
        System.out.println();
        for (int i = 0; i < Names.length; i++) {
            if (name1.equals(Names[i])){
                Names[i]=name2;
            }
        }
        System.out.println(Arrays.toString(Names));
    }


}
