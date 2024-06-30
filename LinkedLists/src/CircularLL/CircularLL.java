package CircularLL;
public class CircularLL
{
   public int size ;
    private Node tail ;
    CircularLL()
    {
        this.tail = null ;
    }
    public void insertFirst()
    {

    }
    public void insertLast (int val)
    {
        Node node = new Node(val) ;
        if (tail == null) {
            node.next = node;
            tail = node;
            return;
        }
        node.next = tail.next ;
        tail.next = node ;
        tail = node;
        size++;
    }
    public void deleteFirst()
    {
        if(tail == null)
        {
            return  ;
        }
        if(tail.next == null)
        {
            tail = null ;
            return;
        }
        Node temp = tail.next ;
        tail.next = temp.next ;




    }
    public void deleteLast()
    {
        Node temp = tail.next ;
        while (temp.next != tail)
        {
            temp = temp.next ;
        }
        temp.next = tail.next ;
      tail = temp ;
        size-- ;
    }
    public void deleteAtPos(int pos)
    {
        Node temp = tail.next ;
        int x = 1 ;
        if(pos > size)
        {
            System.out.println("Node doesn't exist");
        }
if(pos == 0)
{
    deleteFirst();
    return;
}
        while(x < pos)
        {
            temp = temp.next ;
            x++;
        }
       temp.next = temp.next.next ;
        size-- ;
    }
    public  void display()
    {
       Node temp = tail.next ;


           do{
               System.out.print(temp.val + "--> ");

               temp = temp.next ;
           }while(temp != tail.next) ;
        System.out.println();
       }

    public class Node
    {
        public int val ;
        public Node next ;

      public  Node(int val)
        {
            this.val = val ;
        }
    }
}
