package Practice.Try;
public class Main1
{
    public static void main(String[] args)
    {
     LLpractice n = new LLpractice();
     n.insertFirst(10);
     n.insertFirst(15);
     n.insertFirst(20);
     n.insertFirst(30);
     n.display();
     System.out.println("hii");
     n.displayR(LLpractice.head) ;
     System.out.println(n.indexn);
     n.insertAtIndex(25, 0);
     n.display();
    // System.out.println(n.indexn);
        System.out.println();
        n.deleteAtIndex(0);
        n.display();
    }

}
