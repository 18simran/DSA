import java.util.*;
public class test12 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(2) ;
        list.add(3);
        list.add(4) ;
        list.add(5);
        System.out.println(list);
        list.remove(3);
        Collections.sort(list);
        System.out.println(list);
        System.out.println( list.contains(2));

    }
}
