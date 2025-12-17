package CircularLinkedList;

public class Main {


    public static void main(String[] args) {
        CircularLinkedList<String> list=new CircularLinkedList<String>();
        list.addFirst("Mero");
        list.addFirst("Ahmed");
        list.addFirst("Arwa");
        list.addLast("huda");
        list.removeFirst();
        list.removeFirst();
        list.display();
    }
}
