package Practice.Try;

public class LLpractice
{
    private   Node head ;
    private Node tail ;
    private int  size ;
    LLpractice()
    {
        this.size =  0 ;
    }
  public  void insertFirst(int val)
    {
        Node node = new Node(val) ;
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
            insertFirst(val);
            return;
        }
       Node node = new Node(val)  ;
           tail.next = node;
          tail = node ;

       size += 1 ;
    }
 public void display()
    {
        Node temp = head ;
        while(temp != null)
        {
            System.out.print(temp.value + " --> ");
            temp=temp.next ;

        }
    }
    public class Node
    {
    public int value ;
       private Node next ;
       Node(int value)
       {
          this.value = value ;
       }
       Node(int value, Node next)
       {
           this.value = value ;
           this.next  = next ;
       }
    }

}
