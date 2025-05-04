package Basics;
import java.util.*;
public class Collections {
    private static void arrayList(){
        List al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.indexOf(30));
        System.out.println(al.remove(2));
        System.out.println(al);
        al.add(2,30);
        System.out.println(al);
        System.out.println(al.contains(30));
    }

    private static void linkedList(){
        List<Integer> li = new LinkedList<>();
        li.add(20);
        li.add(20);
        li.add(30);
        li.add(10);
        System.out.println(li);

    }


    public static void main(String[] args) {
        arrayList();
        linkedList();
    }
}
