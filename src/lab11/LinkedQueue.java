/*
package lab11;


public class LinkedQueue {
    int size;

    private class Node {
        Object data;
        Node nextNode;
        Node(Object data) {
            this.data = data;
            nextNode = null;
        }
    }
    public void enQueue(Object data){
        //new node
        Node newNode=new Node(data);
        if(isEmpty()){
            front=newNode;
            rear=newNode;
        }
        else{
            getRear().nextNode=newNode;
            rear=getRear();
        }
        size++;
    }

}
*/
