package Queue;

import DoublyLinkedList.DoublyLinkedList;

public class DLinkedQueue<E> implements Queue<E>{
    DoublyLinkedList<E> dlast = new DoublyLinkedList<E>();

    @Override
    public boolean isEmpty() {
        return dlast.isEmpty();
    }

    @Override
    public int size() {
        return dlast.size();
    }

    @Override
    public void enqueue(E data) {
        dlast.addLast(data);

    }

    @Override
    public E dequeue() {
        return dlast.removeFirst();
    }

    @Override
    public E front() {
        return dlast.getFirst();
    }
 }

