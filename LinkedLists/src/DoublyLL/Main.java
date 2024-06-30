package DoublyLL;

public class Main
{
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertFirst(15);
        list.insertFirst(20);
        list.insertFirst(25);
        list.insertFirst(30);
        list.insertFirst(5);
        list.insertFirst(40);
        list.display();
        list.deleteLast();
        list.display();
        list.insertLast(100);
        list.display();
        list.insertLast(200);
        list.display();
        list.deleteFirst();
        list.display();
        list.insert(500,4);
        list.display();
        list.delete(4);
        list.display();
       int item =  list.find(25);
        System.out.println(item );
        list.reverseTraverse();
        list.display();

    }
}
