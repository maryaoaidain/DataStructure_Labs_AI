package Queue;

import Queue.LinkedQueue;

public class Main {


    public static void main(String[] args) {
      //  LinkedQueue<Integer> lQueue = new LinkedQueue<Integer>();
        ArrayQueue<Integer> aqueue = new ArrayQueue<Integer>();

        aqueue.enqueue(10);
        aqueue.enqueue(20);
        aqueue.enqueue(30);
        aqueue.enqueue(40);
        aqueue.enqueue(50);
        aqueue.dequeue();

        System.out.println("the front is ="+aqueue.front());

        System.out.println("the front element is :" + aqueue.front());
           aqueue.display();

//        while (!lQueue.isEmpty()){
//
//            System.out.println("element removed "+lQueue.dequeue());
//
//        }
    }
}
