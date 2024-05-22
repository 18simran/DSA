package SinglyLL;

public class Main
{
    public static void main(String[] args)
    {
        SinglyLL list = new SinglyLL();
        list.insertFirst(5);
//        list.insertFirst(10);
//        list.insertFirst(15);
//        list.insertFirst(20);
//        list.display();
//        list.insert(25,3);
//        list.display();
        list.DeleteFirst();
        System.out.println();
        list.display();
//        list.DeleteLast();
//        System.out.println();
//        list.display();
//        System.out.println();
//        list.Delete(3);
//        list.display();
    }
}