package SinglyLL;

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
public void insert(int val,int index )
{
    if(index == 0)
    {
        insertFirst(val);
        return ;
    }
    if(index == size)
    {
        insertLast(val);
        return ;
    }
    Node temp = head ;
  for(int i = 1 ;i < index ;i++)
  {
      temp = temp.next ;
  }
  Node node = new Node(val,temp.next ) ;
  temp.next = node ;

  size++ ;
}
public void  DeleteFirst()
{

    head = head.next ;
    if(head == null)
    {
        tail = null ;
    }
    size-- ;

}
public void DeleteLast()
{
    if(size <= 1 )
    {
        DeleteFirst();
    }

Node secondlast = head ;
Node lastnode = head.next ;
while(lastnode.next != null)
{
    lastnode = lastnode.next ;
    secondlast = secondlast.next ;
}
tail = secondlast ;
secondlast.next = null ;


}
public void Delete(int index ) {
    Node temp = head;
    if(index == 0)
    {
        DeleteFirst();
        return ;
    }
if(index >= size )
{
    System.out.println("Array index out of bound ");
    return ;
}
    for (int i = 0; i < index-1; i++) {
        temp = temp.next;

    }
    Node next = temp.next.next ;
    temp.next = next ;
    size-- ;
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