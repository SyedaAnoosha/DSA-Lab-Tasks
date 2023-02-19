/*
package Lab8;

public class linkedlist<L> { //T,S
    //private nested (static) class (and it is also generic class)
    private static class Node<T>{
        //properties
        T data;
        Node<T> nextNode;
        Node<T> preNode;
        //constructor
        Node(T data){
            this.data=data;
            nextNode=null;
            preNode=null;
        }
    }

    int size; //int
    Node<L> head;
    //constructor
    linkedList(){
        size=0;
        head=null;
    }
    //operations
    //1. insert at first
    public void insertAtFirst(L data){
        //create new node
        Node<L> newNode=new Node<L>(data); //nextNode=null
        if(size==0)
            head=newNode;
        else{
            head.preNode=newNode;
            newNode.nextNode=head;
            head=newNode;
        }

        size++;
    }
    //2. Display
    public void DisplayForward(){
        //head==null
        if(size==0)
            System.out.println("Linked list is empty, nothing to display");
        else{
            Node<L> tempNode=head;
            while(tempNode!=null){
                System.out.print(tempNode.data+", ");
                tempNode=tempNode.nextNode;
            }
        }

    }

}*/
