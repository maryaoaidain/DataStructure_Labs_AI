package DoublyLinkedList;

import org.w3c.dom.Node;

public class DoublyLinkedList<E>{
    private Node<E>header;
    private Node<E>tailer;
    private int size=0;

    public DoublyLinkedList(){
        header=new Node (null, null , null);
        tailer=new Node (header, null , null );
        header.setNext(tailer);
    }
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }
    private void addBetween(Node<E>left, E data, Node<E>right){
        Node<E>newNode=new Node(left,data,right);
        left.setNext(newNode);
        right.setPrev(newNode);
        size++;
    }
    public void addFirst(E data){
        addBetween(header,data,header.getNext());
    }
    public void addLast(E data){
        addBetween(tailer.getPrev(),data,tailer);
    }
    public E getFirst(){
        if (isEmpty())return null;
        return header.getNext().getData();
    }

    public E getLast(){
    if (isEmpty())return null;
    return header.getPrev().getData();
    }



    private E remove(Node<E>deleteNode){
        if(header.getNext()==tailer)return null;
        E delete= deleteNode.getData();
        Node<E>left=deleteNode.getPrev();
        Node<E>right=deleteNode.getNext();
        left.setNext(right);
        right.setPrev(left);
        size--;
        return delete;

    }
    public E removeFirst(){

        return remove(header.getNext());
    }

    public E removeLast(){

    return remove(tailer.getPrev());
     }

    public void display(){
        if (isEmpty()) {
            System.out.println("List Is Empty");
            return;
        }
        Node<E>temp=header.getNext();
        System.out.print("null<---------Header<---------->");
           while (tailer != temp){
               System.out.println(temp.getData()+"<---->");
               temp=temp.getPrev();

           }
        System.out.println("tailar------->null");


    }


    class Node<E>{
        private Node<E> prev;
        private E data;
        private Node<E>next;

        public Node(Node<E> prev, E data, Node<E> next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public void setData(E data) {
            this.data = data;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }


}