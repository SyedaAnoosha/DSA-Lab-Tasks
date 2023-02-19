package lab9;
public class Question1 <T> {
    public static void main(String[] args) {
        ArrayStack<String> stack = new ArrayStack<>(10);
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

class ArrayStack <T>{
    T[] stack_array;
    int peek,size;
    public ArrayStack(int size){
        this.size=size;
        this.stack_array=(T[]) new Object[size];
        this.peek=-1;
    }
    public void display(){
        for (int i = 0; i < size ; i++) {
            System.out.println(stack_array[i]);
        }
    }
    void push(T data){
        if(isFull())
            System.out.println("Overflow: stack is full");
        else{
            stack_array[++peek]=data;
            System.out.println("Element push "+data);
        }
    }
    T pop(){
        if(isEmpty()){
            System.out.println("Underflow: stack is empty");
        }
        T val=stack_array[peek];
        peek--;
        return val;

    }
    boolean isEmpty(){
        return (peek<=0);
    }
    boolean isFull(){
        return (size-1==peek);
    }
    int search(T data){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        for(int i=0; i<stack_array.length; i++){
            if(stack_array[i].equals(data)){
                System.out.println("\nAt index: ");
                return i;
            }
        }
        return -1;
    }
    T peek(){
        return stack_array[peek];
    }
    int getSize(){
        return size;
    }
}
