package Lab7;
class node {
    String data;
    node next;
    public node(){}
    public node(String data) {
        this.data = data;
        this.next = null;
    }
    public node(String data, node next) {
        this.data = data;
        this.next = next;
    }
}
class LinkedList{

    node head;
    public int getSize() {
        int count = 0 ;
        for( node start= head ; start != null ; start=start.next){
            count++;
        }
        return count;
    }

    public void insertAtLast (String data){

        node addTo = new node(data);
        if(head==null){
            addTo.next= null;
            head=addTo;
            return;
        }
        node last = head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=addTo;
    }

    public void insertAtFirst( String data ){
        node add= new node(data);
        if( head ==  null ){
            head = add;
            return;
        }
        add.next=head;
        head=add;
    }

    public void insertAtPosition (String data , int pos ){

        node addTo = new node(data);
        if( head ==  null ){
            head = addTo;
            return;
        }
        node prev = head;
        for (int i = 0; i < pos-1; i++) {
            prev=prev.next;
        }
        addTo.next=prev.next;
        prev.next=addTo;
    }
    public void print(){
        System.out.println("My route from my home to MUET: ");
        node start = head;
        while(start.next != null){
            System.out.print(start.data+" -> ");
            start=start.next;
        }
        System.out.println(start.data);
    }
}

public class Ques2 {
    public static void main(String[] args) {
        LinkedList L = new LinkedList();
        LinkedList l = new LinkedList();

        L.insertAtFirst("Home");
        L.insertAtPosition("Qasim Banquet",1);
        L.insertAtPosition("Gulistan e sajjad",2);
        L.insertAtPosition("Hyderabad bypass",3);
        L.insertAtPosition("Jamshoro Toll PLaza",4);
        L.insertAtPosition("Clover Leaf Interchange, Jamshoro",5);
        L.insertAtLast("MUET");

        L.print();
        System.out.println();
    }
}
