package Collection_Frameworks;

import java.util.ArrayList;
import java.util.Vector;

public class VectorClass
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Vector<Integer> vec = new Vector<>();
        list.add(20);
        list.add(30);
        System.out.println("Arraylist" + list);
        vec.add(20);
        vec.add(30);
        System.out.println("Vector Class" + vec);
    }
}
