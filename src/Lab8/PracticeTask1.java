/*

Write a program to create a doubly linked list with three nodes having char data and print the list. Insert a node using addAfter() and remove
a node using deleteByPosition(). Print the list.

*//*

package Lab8;
class Node{
    char data;
    Node next;
    Node prev;
    Node(char d){
        data=d;
        next=null;
        prev=null;
    }
}
public class PracticeTask1 {
    Node head;
    public void addAfter(char data, char after){
        Node start = head;
        Node newNode = new Node(data);

        while(start != null && start.data != after){
            start = start.next;
        }

        while (start != null ){
            newNode.prev = start;
            newNode.next = start.next;
            start.next = newNode;
        }

    }
    public void printList(){
        for( Node start = head ; start != null ; start = start.next ){
            System.out.println(start.data);
        }
    }

    public static void main(String[] args) {

//        Node n1 = new Node('1');
//        Node n2 = new Node('2');
//        Node n3 = new Node('3');
//        Node start = n1;
//        n1.next=n2;
//        n2.prev=n1;
//        n3.prev=n2;
//        n2.next=n3;

        PracticeTask1 P  = new PracticeTask1();
        P.printList();


    }
}
*/
