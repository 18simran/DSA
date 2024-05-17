import java.util.ArrayList;
import java.util.Arrays;

public class CustomArraylist<T>
{
    private Object [] data; //we'll keep it private as we don't want user to directly access it but through functions .
private static int DEFAULT_SIZE = 10;
private int size = 0;
public CustomArraylist()
{
    data = new Object[DEFAULT_SIZE];
}
public void add(T num)
{
    if(isFull())
    {
        resize();
    }
    data[size++] = num ;
}

    private void resize() {
    Object[] temp = new Object[data.length * 2] ;
    for (int i = 0; i < data.length ;i++)
    {
        temp[i] = data[i] ;
    }
    data = temp ;
    }

    private boolean isFull() {
    return size == data.length ;
    }
    public T remove()
    {
        T removed = (T)data[--size];
        return removed ;
    }
    public T get(int index)
    {
        return (T) data[index] ;
    }
public int size()
{
    return size ;
}
public void set(int index , T value)
{
    data[index] = value ;
}
@Override
public String toString()
{
    return "CustomArrayList{" +"data=" + Arrays.toString(data)+",size="  + size +'}';
}
    public static void main(String[] args) {
CustomArraylist list = new CustomArraylist();
//list.add(3);
//list.add(5);
        for (int i = 0 ; i < 14 ; i++)
        {
            list.add(2 * i);
        }
        System.out.println(list);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("simran");
        CustomArraylist<String> list3 = new CustomArraylist<>() ;
        list3.add("simran");
        list3.add("harman");
        System.out.println(list3);
    }
}
