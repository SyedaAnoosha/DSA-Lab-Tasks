package DSALab2Tasks;

import java.util.Arrays;

public class ContactApp {
    public void menu(){
        System.out.println("1. Display all contact\n2. Search a contact \n3. Add a new contact\n4. Update the contact \n5. Delete any contact\n6. Exit");
    }
    public void display_contacts(String[] name, String[] num){
        System.out.print("[");
        for (int i = 0; i < num.length-1; i++) {
            System.out.println(name[i]+" "+num[i]+",");
        }
        System.out.println(name[name.length-1]+" "+num[num.length-1]+"]");
    }
    public void add_contact(int pos, String name, String num, String[] Names, String[] Numbers){

        String[] newName = new String[Names.length + 1] ;
        String[] newNum = new String[Numbers.length + 1];

        for (int i = 0; i < Names.length; i++) {
            if(pos==i){
                newName[i] = name;
            }
            else{
                newName[i]=Names[i-1];
            }
        }
        System.out.println(Arrays.deepToString(newName));

        for (int i = 0; i < Numbers.length; i++) {
            if(pos==i){
                newNum[i] = num;
            }
            else{
                newNum[i]=Numbers[i-1];
            }
        }
        System.out.println(Arrays.deepToString(newNum));
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
    public void update_contacts(String replace_element, String new_element, String[] Names){
        System.out.println();
        for (int i = 0; i < Names.length; i++) {
            if (replace_element.equals(Names[i])){
                Names[i]=new_element;
            }
        }
        System.out.println(Arrays.toString(Names));
    }


}
