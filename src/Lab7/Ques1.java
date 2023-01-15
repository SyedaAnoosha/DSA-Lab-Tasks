package Lab7;
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
    public boolean search(String data){
        for(node1 start = head; start != null ; start=start.next){
            if(data.equals(start.data)) {
                return true;
            }
        }
        return false;
    }
    public void print(){
        for(node1 start = head; start != null ; start=start.next){
            System.out.println(start.data);
        }
    }
}
public class Ques1 {
    public static void main(String[] args) {
        FireAir F = new FireAir();
        F.insertAtEnd("Memories");
        F.insertAtStart("Shape of you");
        F.insertAtStart("Dreamers");
        F.insertAtEnd("");
    }
}
