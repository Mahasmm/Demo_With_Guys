
class node { // Creating the node
    public int data;
    public node next;

    public node(int data) { // Cons creating
        this.data = data;
        next = null;
    }

}

class SLinkedList {
    node head;

    SLinkedList() { 
        head = null;
    }

    public void insertFirst(int data) {
        node newNode = new node(data);
        newNode.next = head;
        head = newNode;

    }

    public void insertLast(int data) {
        node newNode = new node(data);
        node current = head;

        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;

    }

    public void printList() {
        node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }

    }
}
