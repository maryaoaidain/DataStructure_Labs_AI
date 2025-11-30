package Arrays;


import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Arrayss arr = new Arrayss();
        int []number={1,2,3,4,5,6,7,8,9,10,12,11};
        Arrays.sort(number);

        number[3]=7;
        int []number2=new int[5];
        arr.input(number2);
        arr.Traversal(number);
        arr.Traversal2(number);
        arr.ReverseTraversal(number);
        arr.Traversal(number2);
        arr.update(number,2,7);
        arr.delete(number, 1);

        arr.LinearSearch(number, 1);

        int result = arr.BinarySearch(number, 0,number.length-1,4);
        if(result!= -1)
            System.out.println("Value found at index : "+ result);
        else
            System.out.println("Value not found");
        //System.out.println(Arrays.toString(number))

    }
}
