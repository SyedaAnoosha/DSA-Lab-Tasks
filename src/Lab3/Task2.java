package Lab3;

import java.util.Scanner;

class FireAir{
    String[] Song= new String[20];
    String input;
    int count;
    Scanner sc = new Scanner(System.in);
    public void display(){
        for(int i=0 ; i<count;i++) {
            System.out.println("Song Name : "+Song[i]);
        }
    }
    public void add(){
        System.out.println("Enter the name of the Song ");
        Song[count]=sc.nextLine();
        count++;
    }
    public void update(){
        sc.nextLine();
        System.out.println("Enter the song index whose name you want to update");
        input=sc.nextLine();
        System.out.println("Enter the new name of "+Song[Integer.parseInt(input)]);
        Song[Integer.parseInt(input)]=sc.nextLine();

    }
    public void delete() {
        System.out.println("Enter the song name you want to delete");
        input = sc.next();
        for(int i=0;i<count;i++) {
            if(input.equalsIgnoreCase(Song[i].toString())) {
                System.out.println(Song[i]+" has been deleted");
                Song[i]=Song[i+1];
                Song[i+1]="";
                count--;
            }
        }
    }

    public void search(){
        System.out.println("Enter the index of the song you want to search");
        input = sc.next();
        System.out.println("The song at index "+input+" is "+Song[Integer.parseInt(input)]);
    }

    public void menu(){
        System.out.println("\n1. Display all songs\n2. Search a song \n3. Add a new song\n4. Update the song\n5. Delete any song\n0. Exit\n");
    }
}

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FireAir mp3= new FireAir();

        while(true){

            mp3.menu();
            System.out.println("Enter the option: ");
            int j = sc.nextInt();
            if (j == 1) {
                mp3.display();
            } else if (j == 2) {
                mp3.search();
            } else if (j == 3) {
                mp3.add();
            } else if (j == 4) {
                mp3.update();
            } else if (j == 5) {
                mp3.delete();
            } else if (j == 0) {
                System.exit(0);
            }

        }
    }
}