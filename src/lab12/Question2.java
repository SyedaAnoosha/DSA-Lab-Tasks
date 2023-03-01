package lab12;
class BST1{
    Node root;

    static class Node{
        String val;
        Node left, right;
        public Node(String val){
            this.val =val;
        }
    }     // end of class Node

    public void insert(String val){
        root = insert(root, val);
    }
    public Node insert(Node root, String val){
        if (root==null){      // base condition to stop recursive call
            root = new Node(val);
            return root;
        }
        if (val.compareTo(root.val) < 0){
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public void inOrder(){
        inOrder(root);
    }
    public void inOrder(Node root){
        if (root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
}


public class Question2 {
    public static void main(String[] args) {

        BST1 bst = new BST1();

        bst.insert("A");
        bst.insert("B");
        bst.insert("C");
        bst.insert("D");
        bst.insert("E");
        bst.insert("F");
        bst.insert("G");
        bst.insert("H");
        bst.insert("I");
        bst.insert("J");
        bst.insert("K");
        bst.insert("L");
        bst.insert("M");
        bst.insert("N");
        bst.insert("O");
        bst.insert("P");

        bst.inOrder();

    }

}
