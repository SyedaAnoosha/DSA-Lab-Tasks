package lab9;
public class Question2 {
    public static void main(String[] args) {

        LinkedStack<String> stack = new LinkedStack<>();
        stack.push("apple");
        stack.push("mango");
        stack.push("banana");
        stack.push("kiwi");
        stack.push("apricot");
        stack.push("pomegranate");
        stack.push("orange");
        stack.push("Strawberry");
        stack.push("watermelon");
        stack.push("melon");


        System.out.println("\nisEmpty(): "+stack.isEmpty());
        System.out.println("\ngetSize(): "+stack.getSize());
        System.out.println("\nsearch(): "+stack.search("banana"));
        System.out.println("\npop(): "+stack.pop());
        System.out.println("\nElements in stack");
        stack.display();
    }
}

class LinkedStack <T> {


    private class Node {
        T data;
        Node nextNode;
        Node(T data) {
            this.data = data;
            nextNode = null;
        }
    }

    int size;
    Node peek;

    public LinkedStack() {
        peek = null;
        size = 0;
    }

    boolean isEmpty() {
        return (peek == null);
    }

    void push(T data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            peek = newNode;
        } else {
            newNode.nextNode = peek;
            peek = newNode;
        }
        size++;
        System.out.println("Element pushed: "+data);
    }

    public int getSize() {
        return size;
    }

    T pop() {
        if (isEmpty()) {
            System.out.println("Underflow: stack is empty");
        }
        Node tempNode = peek;
        peek = tempNode.nextNode;
        tempNode.nextNode = null;
        size--;
        return tempNode.data;

    }

    T peek() {
        return peek.data;
    }

    public boolean search(T data) {
        Node tempNode = peek;
        if (isEmpty()) {
            System.out.println("Underflow: stack is empty");
        }
        while (tempNode != null) {
            if (tempNode.data == data) {
                return true;
            }
            tempNode = tempNode.nextNode;
        }
        return false;
    }
    public void display() {
        Node tempNode = peek;
        while (tempNode != null) {
            System.out.println(tempNode.data);
            tempNode = tempNode.nextNode;
        }
    }
}
