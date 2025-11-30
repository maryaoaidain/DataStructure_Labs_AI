package Arrays;

import java.util.Scanner;

public class Arrayss{

    Scanner scanner = new Scanner(System.in);

    public void Traversal(int[] a) {

        System.out.println("the elements are:");
        for (int i = 0; i < a.length; i++)
            System.out.println("Index [" + i + "] = " + a[i]);
    }

    public void Traversal2(int[] a) {
        System.out.println("The elements are :");
        for (int e : a)
            System.out.println(e);

    }

    public void ReverseTraversal(int[] a) {

        System.out.println("the elements are:");
        for (int i = a.length - 1; i >= 0; i--)
            System.out.println("Index [" + i + "] = " + a[i]);
    }

    public void input(int[] a) {
        System.out.println("Enter" + a.length + " numbers:");
        for (int i = 0; i < a.length; i++)
            a[i] = scanner.nextInt();
    }

    public void update(int[] a, int index, int value) {
        if (index < 0 || index >= a.length)
            System.out.println("Index is not found");
        else
            a[index] = value;

    }
    public void delete(int[] a, int index) {
        if (index < 0 || index >= a.length)
            System.out.println("Index is not found");
        else
            a[index] = 0;
    }
    public int LinearSearch(int[]a,int s_value){
        for(int i=0; i<a.length;i++ ){
            if(s_value==a[i])
                return i;
        }
        return -1;

    }

    public int BinarySearch(int[]a , int f_index, int l_index, int s_value){
        while(f_index<=l_index){
            int mid =(f_index+l_index)/2;
            System.out.println("mid="+mid);

            if(s_value== a[mid])
                return mid;
            if(s_value> a[mid])
                f_index=mid+1;
            if (s_value< a[mid])
                l_index=mid-1;
        }

        return -1;
    }

}