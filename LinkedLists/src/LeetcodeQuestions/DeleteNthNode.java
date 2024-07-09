package LeetcodeQuestions;

import SinglyLL.SinglyLL;

//delete nth node from the end
public class DeleteNthNode
{
    public Node head ;
    public Node tail ;
    public void insertFirst(int val)
    {
        Node node  = new Node(val) ;
        node.next = head ;
        head = node ;

        if(tail == null)
        {
            tail = head ;
        }


    }
    public void display()
    {
     Node temp = head ;

        while(temp != null)
        {
            System.out.print(temp.val + " --> ");
            temp = temp.next ;
        }
        System.out.println();
    }

   public void Delete(int n )
    {
         Node slow = head ; ;
         Node fast = head  ;
        for(int  i = 1 ;i <= n ;i++)
        {
            fast = fast.next ;
        }
        if(fast == null)
        {
           head = head.next ;
           return ;
        }
        while(fast.next != null)
        {
            slow = slow.next ;
            fast = fast.next ;
        }
        slow.next = slow.next.next ;

    }



 public class Node
    {
        public int val;
        public Node next ;
        public Node(int val)
        {
            this.val = val ;
        }
    }

    public static void main(String[] args)
    {
        DeleteNthNode node = new DeleteNthNode() ;
        node.insertFirst(5);
        node.insertFirst(10);
        node.insertFirst(15);
        node.insertFirst(20);
        node.insertFirst(25);
        node.display();
        node.Delete(5);
        node.display() ;

    }
}
