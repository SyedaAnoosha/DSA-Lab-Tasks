package DemoLab3;

import java.util.Arrays;

public class COntact {
    private String[][] contacts = {{"Aaron", "0968965672"}, {"Berkley", "223615371"}, {"Charlotte", "031987213"}, {"Dylan", "1231232134"}, {"Ella", "321312315"}};

    public void menu() {
        System.out.println("1. Display all contact\n2. Search a contact \n3. Add a new contact\n4. Update the contact \n5. Delete any contact\n6. Exit");
    }

    public void display_contacts() {
        String s = Arrays.deepToString(contacts);
        System.out.println(s);
    }

    public void search_contacts(String name) {
        for (int i = 0; i < contacts.length; i++) {
            for (int j = 0; j < contacts[i].length; j++) {
                if (name.equals(contacts[i][j])) {
                    System.out.println("Name: " + name);
                    System.out.println("Number: " + contacts[i][j + 1]);
                    break;
                }
            }
        }
    }

    public void add_contact(int pos, String name, String num) {
        String[][] newContacts = new String[contacts.length+1][];

        for (int i = 0; i < newContacts.length; i++) {
            newContacts[i]= new String[contacts[i].length];
            for (int j = 0; j < newContacts[i].length; j++) {
                    newContacts[i][j] = contacts[i][j];

            }
        }
        System.out.println(Arrays.deepToString(newContacts));
        /*
        int[][] copyArray =new int[myArray.length][];
      for (int i = 0; i < copyArray.length; ++i) {
         copyArray[i] = new int[myArray[i].length];
         for (int j = 0; j < copyArray[i].length; ++j) {
            copyArray[i][j] = myArray[i][j];
         }
      }
      System.out.println(Arrays.deepToString(copyArray));*/
    }

   /* public void update_contacts(String replace_element, String new_element) {
        System.out.println();
        for (int i = 0; i < contacts.length; i++) {
            if (replace_element.equals(contacts[i])) {
                contacts[i] = new_element;
                System.out.println("Updated");
                break;
            }
        }
        System.out.println(Arrays.toString(contacts));
    }

    public void delete_contact(String name) {

        String[] newName = new String[contacts.length - 1];
        //String[] newNum = new String[number.length - 1];

        for (int i = 0, k = 0; i < contacts.length; i++) {
            if (!name.equals(contacts[i])) {
                newName[k] = contacts[i];
            }
        }
        System.out.println(Arrays.toString(newName));

        for (int i = 0, k = 0; i < number.length; i++) {
            if (!num.equals(number[i])) {
                newNum[k] = number[i];
            }
        }

    }*/
}

