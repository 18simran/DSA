package CircularLL;

public class CMain {
    public static void main(String[] args) {
        CircularLL node =  new CircularLL() ;
        node.insertLast(10);
        node.insertLast(15);
        node.insertLast(20);
        node.insertLast(25);
        node.insertLast(30);
        node.display();
        System.out.println("deleting first node ");
        node.deleteFirst();
        node.display();
        System.out.println("deleting last node ");
        node.deleteLast();
        node.display();
        System.out.println("deleting particular node ");
        node.deleteAtPos(0);
        node.display();

    }
}