public class LLmain {
    public static void main(String[] args) {
        singlyLL list = new singlyLL();
        list.inserAtFirst(9);
        list.inserAtFirst(90);
        list.inserAtFirst(659);
        list.inserAtFirst(78);
        list.inserAtFirst(23);
        list.inserAtFirst(2);
        list.insertAtPosition(67, 3);
        list.display();
        list.deleteFrist();
        list.display();
        list.deleteLast();
        list.display();
        list.deleteFromIndex(2);
        list.display();

        // DoublyLL list = new DoublyLL();
        // list.insertFirst(76);
        // list.insertFirst(23);
        // list.insertFirst(12);
        // list.insertFirst(100);
        // list.insertLast(88);
        // list.insertAt(23, 01);
        // list.display();

        // CLL list = new CLL();
        // list.insert(90);
        // list.insert(76);
        // list.insert(23);
        // list.insert(12);
        // list.insert(1);
        // list.delete(23);
        // list.display();
    }

}
    

