/*
package Lab8;

public class lab888 {
}
import java.util.Scanner;

class Nodep {
    String data;
    Nodep next;
    Nodep prev;
    public Nodep(String data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class LinkedList{
    public void next(Nodep n){
        System.out.print(n.data+" : ");
    }
    public void previous(Nodep n){
        System.out.print(n.prev.data+" : ");
    }
    public void slideshow(Nodep n){
        try{
            while (n != null) {
                Thread.sleep(1000);
                System.out.println(n.data);
                n=n.next;
            }

        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
    public Nodep add(Nodep head,String name){
        Nodep n=new Nodep(name);
        n.next=head;
        head=n;
        return head;
    }
    public boolean rename(Nodep head,String name,String replacement){
        int position=search(head,name);
        Nodep temp=head;
        if(position>=0){
            for(int i=1;i<position;i++)
                temp=temp.next;
            temp.data=replacement;
            return true;
        }
        return false;
    }
    public Nodep delete(Nodep head,String name){
        int position=search(head,name);
        if(position>=0){
            if(position==1)return head.next;
            Nodep temp=head;
            for (int i=2;i<position;i++)temp=temp.next;
            temp.next=temp.next.next;
            System.out.println("Picture deleted successfully!");
        }
        else System.out.println("Picture with this name does not exist in your gallery");
        return head;
    }
    public int search(Nodep head,String name){
        int counter=0;
        for(Nodep n=head;n!=null;n=n.next){
            counter++;
            if(name.equals(n.data))return counter;
        }
        return -1;
    }
    public int counter(Nodep head){
        int count=0;
        for (Nodep n=head;n!=null;n=n.next)count++;
        return count;
    }

}

public class lab8 {
    public static void main(String[] args) {
        Nodep head = new Nodep("tea");
        head.next = new Nodep("apple");
        head.next.next = new Nodep("home");
        head.next.next.next = new Nodep("baby");
        head.next.next.next.next = new Nodep("cat");


        head.prev = null;
        head.next.prev = head;
        head.next.next.prev = head.next;
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next.prev = head.next.next.next;

        LinkedList list = new LinkedList();
        String input;
        Nodep temp = head;
        System.out.println("            **   PhotoViewer App   **");
        System.out.println("0.Exit  1.Next  2.Previous  3.Slideshow  4.Add  5.Rename  6.Delete  7.Search  8.Counter");
        System.out.println("The first picture is: " + temp.data);
        Scanner scan = new Scanner(System.in);
        do {
            input = scan.nextLine();
            switch (input) {
                case "1" -> {
                    temp = temp.next;
                    if (temp == null) temp = head;
                    list.next(temp);
                }
                case "2" -> {
                    if (temp.prev == null) {
                        System.out.println("No previous image found!");
                        System.exit(0);
                    } else {
                        list.previous(temp);
                        temp = temp.prev;
                    }
                }
                case "3" -> list.slideshow(temp);
                case "4" -> {
                    System.out.print("Enter picture name: ");
                    String name = scan.nextLine();
                    head = list.add(head, name);
                    System.out.println("New picture added successfully.");
                    temp = head;
                }
                case "5" -> {
                    System.out.print("Enter name of picture to rename: ");
                    String pic = scan.nextLine();
                    System.out.print("Enter replacement: ");
                    String replace = scan.nextLine();
                    if (list.rename(head, pic, replace)) System.out.println("Picture renamed successfully");
                    else System.out.println("Picture with this name does not found!");
                }

                case "6" -> {
                    System.out.print("Enter name of picture: ");
                    String pic = scan.nextLine();
                    head = list.delete(head, pic);
                    temp = head;
                }
                case "7" -> {
                    System.out.print("Enter name of picture: ");
                    String pic = scan.nextLine();
                    System.out.println("Found at position: " + list.search(head, pic));
                }
                case "8" -> System.out.println("There are total " + list.counter(head) + " pictures in your gallery");

            }
        } while (!input.equals("0"));
    }

}



*/
