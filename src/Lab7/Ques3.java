/*
package Lab7;
class node <T>{
    T data;
    node<T> next;
    public node(){}
    public node(T data) {
        this.data = data;
        this.next = null;
    }
    public node(T data, node<T> next) {
        this.data = data;
        this.next = next;
    }
}
class LinkedList<T>{

    node<T> head;
    public boolean isEmpty(){
        if(head == null){
            return true ;
        }
        return false;
    }

    public int getSize() {
        int count = 0 ;
        for( node<T> start= head ; start != null ; start=start.next){
            count++;
        }
        return count;
    }

    public void insertAtLast (T data){

        node<T> addTo = new node<>(data);
        if(head==null){
            addTo.next= null;
            head=addTo;
            return;
        }
        node<T> last = head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=addTo;
    }

    public void insertAtFirst( T data ){
        node<T> add= new node<>(data);
        if( head ==  null ){
            head = add;
            return;
        }
        add.next=head;
        head=add;
    }

    public void insertAtPosition (T data , int pos ){

        node<T> addTo = new node<>(data);
        if( head ==  null ){
            head = addTo;
            return;
        }
        node<T> prev = head;
        for (int i = 0; i < pos-1; i++) {
            prev=prev.next;
        }
        addTo.next=prev.next;
        prev.next=addTo;
    }

    public void deleteFirst(){
        if (head == null){
            return;
        }
        head=head.next;
    }
    public void deleteLast(){
        if (head == null){
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }

        node<T> prev = head;
        while (prev.next.next != null)
            prev = prev.next;

        prev.next = null;

    }
    public void deletePosition(int pos){
        if (pos == 0){
            deleteFirst();
        }
        if(head.next==null){
            head=null;
            return;
        }

        node<T> prev= head;
        for (int i = 0; i < pos-1; i++) {
            prev = prev.next;
        }
        prev.next=prev.next.next;
    }

    public boolean search(T data){
        for(node<T> start = head; start != null ; start=start.next){
            if(data== start.data) {
                return true;
            }
        }
        return false;
    }
    public void deleteValue (T key){
        node<T> temp = head;
        node<T> prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null){
            return;
        }

        prev.next = temp.next;
    }
    public void print(){
        for(node<T> start = head; start != null ; start=start.next){
            System.out.println(start.data);
        }
    }
}

public class Ques3 {
    public static void main(String[] args) {

        LinkedList<Integer> L = new LinkedList<Integer>();
        System.out.println("Task # 1 : isEmpty: "+L.isEmpty());
        System.out.println();

        System.out.println("Task # 2 : Size: "+L.getSize());
        System.out.println();

        System.out.println("Task # 3 : Insert at last: ");
        L.insertAtLast(0);
        L.insertAtLast(3);
        L.print();
        System.out.println();

        System.out.println("Task # 4 : Insert at first: ");
        L.insertAtFirst(1);
        L.insertAtFirst(2);
        L.insertAtFirst(7);
        L.insertAtFirst(9);
        L.print();
        System.out.println();

        System.out.println("Task # 5 : Insert at any position: ");
        L.insertAtPosition(5,3);
        L.print();
        System.out.println();

        System.out.println("Task # 11 : Print: ");
        L.print();
        System.out.println();

        System.out.println("Task # 6 : Delete First: ");
        L.deleteFirst();
        L.print();
        System.out.println();

        System.out.println("Task # 7 : Delete last: ");
        L.deleteLast();
        L.print();
        System.out.println();

        System.out.println("Task # 8 : Delete at any position: ");
        L.deletePosition(2);
        L.print();
        System.out.println();

        System.out.println("Task # 9 : Search: "+L.search(6));
        System.out.println();

        System.out.println("Task # 10 : Delete at any value: ");
        L.deleteValue(3);
        L.print();
        System.out.println();




    }
}
*/
