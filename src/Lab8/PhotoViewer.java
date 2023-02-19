package Lab8;


import java.util.Scanner;

public class PhotoViewer {
    node head, prev = null;
    public boolean replace(String image, String replacement){
        node p = head;
        while (p.next!=null) {
            if (image.equals(p.image)) {
                p.image = replacement;
                return true;
            }
            p = p.next;
        }
        return false;
    }
    public void delete(String image){
        int pos = search(image);
        if(pos==0){
            head= head.next;
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        node prev= head;
        for (int i = 0; i < pos-1; i++) {
            prev= prev.next;
        }
        prev.next=prev.next.next;
    }
    public int search(String image){
        int counter = 1;
        node p = head;
        while(p!=null){
            if(image.equalsIgnoreCase(p.image)){
                return counter;
            }
            counter++;
            p=p.next;
        }
        return -1;
    }
    public int counter() {
        int count = 1 ;
        for( node start= head ; start != null ; start=start.next){
            count++;
        }
        return count;
    }
    public void insert(String image){
        node newNode =  new node(image);
        if(head==null){
            head=prev=newNode;
            newNode.next=null;
            newNode.prev=null;
            return;
        }

        newNode.next=head;
        newNode.prev=null;
        head=newNode;

    }

    public void SlideShow(){
        node start = head;
        while(start!=null){
            System.out.println(start.image);
            start=start.next;
        }
    }
    public String PreviousImage(){
        node start = head;
        return start.prev.image;
    }

    public String NextImage(){
        node start = head;
        return start.next.image;
    }

    public void menu(){
        System.out.println();
        System.out.println("  ***  Photo Viewer App  ***  ");
        System.out.println();
        while(true){
            System.out.println();
            System.out.println("1. Previous\n" +
                    "2. Next \n" +
                    "3. SlideShow\n4. Add new image\n" +
                    "5. Rename/Update an image\n" +
                    "6. Delete an image\n" +
                    "7. Search any image\n" +
                    "8. Counter\n0. Exit");

            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            if (i==1){
                if(head.prev==null){
                    head=head.next;
                    System.out.println("No prev image");
                    menu();
                }
                System.out.println(PreviousImage());
            } else if (i == 2) {
                System.out.println(NextImage());
            } else if (i == 3) {
                SlideShow();
            } else if (i == 4) {
                sc.nextLine();
                System.out.println("Enter image wants to be inserted");
                String add = sc.nextLine();
                insert(add);
            } else if (i == 5) {
                sc.nextLine();
                System.out.println("Enter image wants to be replaced");
                String replaced = sc.nextLine();
                System.out.println("Enter new image name");
                String newReplace = sc.nextLine();
                replace(replaced, newReplace);
            } else if (i == 6) {
                sc.nextLine();
                System.out.println("Enter image wants to be deleted: ");
                String delete = sc.nextLine();
                delete(delete);
            } else if (i == 7) {
                sc.nextLine();
                System.out.println("Enter image wants to be searched: ");
                String searched = sc.nextLine();
                System.out.println(search(searched));
            } else if (i == 8) {
                System.out.println("Number of total images: "+counter());
            } else if (i == 0) {
                System.exit(0);
            }
        }
    }
    public static void main(String[] args) {
        PhotoViewer P = new PhotoViewer();
        P.insert("Cat");
        P.insert("Dog");
        P.insert("Goat");
        P.insert("Cow");
        P.menu();
    }
}
