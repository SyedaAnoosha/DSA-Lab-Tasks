package Lab3;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j;
        FireAir f = new FireAir();
        while(true){
            f.menu();
            System.out.println("Enter the option: ");
            j = sc.nextInt();
            if (j == 1) {
                f.display_songs();
            } else if (j == 2) {
                System.out.println("Enter the song you want to search:  ");
                String song = sc.next();
                f.search_songs(song);
            } else if (j == 3) {
                System.out.print("Enter at which position you want to add: ");
                int pos =sc.nextInt();
                System.out.println("Enter song: ");
                String song1 = sc.nextLine();
                f.add_songs(pos,song1);
            } else if (j == 4) {
                System.out.println("Enter song you want to replace: ");
                String Song1= sc.nextLine();
                System.out.println("Enter song you want to replace with it: ");
                String Song2 = sc.nextLine();
                f.update_songs(Song1,Song2);
            } else if (j == 5) {
                System.out.println("Song you want to delete: ");
                String del = sc.nextLine();
                f.delete_songs(del);
            } else if (j == 6) {
                System.exit(0);
            }
        }
    }

}
