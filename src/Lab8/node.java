package Lab8;

public class node {
    String image;
    Lab8.node next;
    Lab8.node prev;

    public node(String image) {
        this.image = image;
        this.next = null;
        this.prev = null;
    }
}

