package Stack;

public class main {


    public static void main(String[] args) {
        LinkedStack<Integer> lStack = new LinkedStack<Integer>();
        lStack.push(10);
        lStack.push(20);
        lStack.push(30);
        lStack.push(40);
        lStack.push(50);
        System.out.println("the top is ="+lStack.top());

        while (!lStack.isEmpty()){

            System.out.println("element removed "+lStack.pop());

        }
    }
}
