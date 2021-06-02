
public class testSLinkedList {
    public static void main(String[] args) {
        SLinkedList myList = new SLinkedList();

        myList.insertFirst(10);
        myList.insertFirst(20);
        myList.insertFirst(13);
        myList.insertLast(12);
        myList.insertLast(12);

        myList.printList();

    }
}
