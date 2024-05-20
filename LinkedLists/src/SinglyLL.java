import Practice.Try.LLpractice;

public class SinglyLL
{
    private Node head ;
    private Node tail;
    private int size ;

    public SinglyLL()
    {
        this.size = 0 ;
    }
    public void display()
    {
        Node temp = head ;

        while(temp != null)
        {
            System.out.print(temp.value + " --> ");
            temp = temp.next ;
        }

    }
    public void insertFirst(int val)
    {
        Node node  = new Node(val) ;
        node.next = head ;
        head = node ;

        if(tail == null)
        {
            tail = head ;
        }
        size+= 1 ;

    }
    public void insertLast(int val)
    {
        if(tail == null)
        {
            System.out.println("gaya");
            insertFirst(val);
            return;
        }
  Node node = new Node(val)  ;
        tail.next = node;
        tail = node ;

        size += 1 ;
    }

    private class Node{
        private int value ;
        private Node next ; //null by default
        public Node(int value)
        {
            this.value = value ;
        }
        public Node(int value, Node next)
        {
            this.value = value ;
            this.next = next ;
            System.out.println(this.value );
        }
    }
}

// By using these constructors, you can create nodes and link them to form a linked list.
// For example, new Node(5) creates a node with value 5, and new Node(5, new Node(10)) creates a
// node with value 5 that points to another node with value 10.