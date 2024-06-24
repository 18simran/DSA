package Practice.Try;

public class Main1
{
    public static void main(String[] args)
    {
     LLpractice n = new LLpractice();
     n.insertFirst(10);
     n.insertFirst(15);
     n.insertFirst(20);
     n.insertLast(25);
     n.insertFirst(20);
     n.deleteFirst();
     n.deleteLast();
     n.display();
    }

}
