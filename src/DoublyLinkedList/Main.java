package DoublyLinkedList;

public class Main {


    public static void main(String[] args) {
        DoublyLinkedList<String>dlist=new DoublyLinkedList<String>();
        dlist.addFirst("Maria");
        dlist.addFirst("Tassneem");
        dlist.addLast("Bushra");
        dlist.addLast("Maha");
        dlist.removeFirst();
        dlist.removeLast();
        dlist.display();

    }
}
