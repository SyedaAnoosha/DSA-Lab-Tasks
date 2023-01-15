package Lab7;

import java.util.Scanner;

class node1{
    String data;
    node1 next;
    public node1(){}
    public node1(String data) {
        this.data = data;
        this.next = null;
    }
    public node1(String data, node1 next) {
        this.data = data;
        this.next = next;
    }
}
class FireAir{

    node1 head;
    public void insertAtEnd (String data){

        node1 addTo = new node1(data);
        if(head==null){
            addTo.next= null;
            head=addTo;
            return;
        }
        node1 last = head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=addTo;
    }

    public void insertAtStart( String data ){
        node1 add= new node1(data);
        if( head ==  null ){
            head = add;
            return;
        }
        add.next=head;
        head=add;
    }

    public void insertAtMiddle( String data ){
        node1 newNode = new node1(data);

        node1 p = head;
        node1 q = head;

        while (q != null && q.next != null) {
            q= q.next.next;
            p = p.next;

        }
        newNode.next = p.next;
        p.next = newNode;

    }

    public void deleteStart(){
        if (head == null){
            return;
        }
        head=head.next;
    }
    public void deleteEnd(){
        if (head == null){
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }

        node1 prev = head;
        while (prev.next.next != null)
            prev = prev.next;

        prev.next = null;

    }
    public void deleteMiddle() {
    }
    public boolean search(String data){
        for(node1 start = head; start != null ; start=start.next){
            if(data.equals(start.data)) {
                return true;
            }
        }
        return false;
    }
    public void print(){
        int count = 1;
        for(node1 start = head; start != null ; start=start.next){
            System.out.println(count+". "+start.data);
            count++;
        }
    }
    public void menu(){
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("\n-----FIRE AIR-----");
            System.out.println("You can perform following functions:");
            System.out.println("1. Print all songs");
            System.out.println("2. Add a new song (end, start, middle) ");
            System.out.println("3. Delete a song (end, start, middle) ");
            System.out.println("4. Search for a song");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            x=sc.nextInt();
            System.out.println();

            if(x==1){
                print();
                menu();
            } else if (x==2) {
                System.out.println("1. Start");
                System.out.println("2. End");
                System.out.println("3. Middle");
                System.out.print("At which position you want to add :");
                y=sc.nextInt();
                if(y==1){
                    sc.nextLine();
                    System.out.println("Enter song name: ");
                    String songStart = sc.nextLine();
                    insertAtStart(songStart);
                    menu();
                } else if (y==2) {
                    sc.nextLine();
                    System.out.println("Enter song name: ");
                    String songEnd = sc.nextLine();
                    insertAtStart(songEnd);
                    menu();
                } else if (y==3) {
                    sc.nextLine();
                    System.out.println("Enter song name: ");
                    String songMid = sc.nextLine();
                    insertAtStart(songMid);
                    menu();
                }
            } else if (x==3) {
                System.out.println("1. Start");
                System.out.println("2. End");
                System.out.println("3. Middle");
                System.out.print("At which position you want to delete a song :");
                z=sc.nextInt();
                if(z==1){
                    deleteStart();
                    menu();
                } else if (z==2) {
                    deleteEnd();
                    menu();
                } else if (z==3) {
                    deleteMiddle();
                    menu();
                }
            } else if (x==4) {
                sc.nextLine();
                System.out.println("Enter song name to be searched: ");
                String song = sc.nextLine();
                boolean search = search(song);
                if(search){
                    System.out.println("Song Found!!");
                }
                else{
                    System.out.println("Song not found");
                }
            } else if (x==5) {
                System.exit(0);
            }
        }
    }
}
public class Ques1 {
    public static void main(String[] args) {
        FireAir F = new FireAir();
        F.insertAtEnd("Memories");
        F.insertAtStart("Shape of you");
        F.insertAtStart("Dreamers");
        F.insertAtEnd("Blank Space");
        F.insertAtEnd("Liar");
        F.insertAtMiddle("As it Was");
        F.insertAtMiddle("Just like you");
        F.insertAtMiddle("Calm Down");
        F.insertAtEnd("Dusk till dawn");

        F.menu();
    }
}
