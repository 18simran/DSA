package Practice.Try;
import SinglyLL.SinglyLL;
public class LLpractice
{
    private Node head ;
    private Node tail ;
    public int size ;
  public   LLpractice()
  {
      this.size = 0;
  }
  public void insertFirst(int val )
  {
      Node node = new Node(val);
      node.next = head ;
      head = node ;
      if(tail == null)
      {
          tail = head ;
      }
   size += 1;
  }
  public void insertLast(int val)
  {
      Node node = new Node(val);
      tail.next = node ;
      tail = node ;
      size += 1 ;

  }
public void deleteFirst()
{
    Node temp = head ;
    head = temp.next ;
    size-- ;
}
public void deleteLast()
{
    Node secondlast = head ;
    Node last = head.next ;
    while(last.next != null)
    {

      last = last.next ;
      secondlast = secondlast.next ;
    }
     tail = secondlast ;
    tail.next = null ;
    size-- ;
}
  public void display()
  {
      Node temp =head ;
      while(temp != null)
      {
          System.out.print(temp.val + "--> ");
          temp = temp.next ;
      }

  }
    class Node
    {
        private int val ;
        private Node next ;
        public Node(int val)
        {
            this.val = val;

        }
        public Node(int val , Node next)
        {
            this.val =0 ;
            this.next = next ;
        }
    }
}
