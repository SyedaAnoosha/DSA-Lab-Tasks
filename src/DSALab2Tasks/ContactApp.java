package DSALab2Tasks;
import java.util.Arrays;

public class ContactApp {

    private String[] contacts = {"Aaron","Berkley","Charlotte","Dylan","Ella"};
    private String[] number = {"0968965672","223615371","031987213","1231232134","321312315"};
    public void menu(){
        System.out.println("1. Display all contact\n2. Search a contact \n3. Add a new contact\n4. Update the contact \n5. Delete any contact\n6. Exit");
    }
    public void display_contacts(){
        System.out.print("[");
        for (int i = 0; i < contacts.length-1; i++) {
            System.out.println(contacts[i]+" "+number[i]+",");
        }
        System.out.println(contacts[contacts.length-1]+" "+number[number.length-1]+"]");
    }
    public void search_contacts(String name){
        for (int i = 0; i < contacts.length; i++) {
            if (name.equals(contacts[i])){
                System.out.println( "Name: " + name );
                System.out.println( "Number: " + number[i] );
                break;
            }
        }
    }
    public void add_contact(int pos, String name, String num){

        String[] newName = new String[contacts.length + 1] ;
        String[] newNum = new String[number.length + 1];

        for (int i = 0 , j = 0; i < newName.length; i++) {
            if(pos==i){
                newName[j] = name;
            }
            else{
                newName[j]=contacts[i+j];
                j++;
            }
        }
        System.out.println(Arrays.deepToString(newName));

        for (int i = 0; i < newNum.length ; i++) {
            if(pos==i){
                newNum[i] = num;
            }
            else{
                newNum[i]=number[i-1];
            }
        }
        System.out.println(Arrays.deepToString(newNum));
    }
    public void update_contacts(String replace_element, String new_element){
        System.out.println();
        for (int i = 0; i < contacts.length; i++) {
            if (replace_element.equals(contacts[i])){
                contacts[i]=new_element;
                System.out.println("Updated");
                break;
            }
        }
        System.out.println(Arrays.toString(contacts));
    }
    public void delete_contact(String name, String num){

        String[] newName = new String[contacts.length - 1];
        String[] newNum = new String[number.length - 1];

        for (int i = 0 , k = 0; i < contacts.length; i++) {
            if(!name.equals(contacts[i])){
                newName[k]=contacts[i];
            }
        }

        for (int i = 0 , k = 0; i < number.length; i++) {
            if(!num.equals(number[i])){
                newNum[k]=number[i];
            }
        }
    }
}
