package DoublyLL;

public class DoublyLL
{
private Node head ;
private Node tail ;
private int size ;

public void insertFirst(int val)
{
    Node node = new Node(val);
    node.next = head ;
    node.prev = null ;
    if(head != null)
    {
        head.prev = node ;
    }
    head = node ;
}
public void display()
{
     Node node = head ;
     while(node!= null)
     {
         System.out.print(node.value + " -> ");
         node = node.next ;
     }
}
DoublyLL() {
    this.size = 0;
}
    class Node
    {
         int value ;
         Node next ;
       Node prev ;
        Node(int val ,Node next, Node prev )
        {
            this.value = val ;
            this.next= next;
            this.prev = prev ;
        }
        Node(int val)
        {
            this.value = val ;
        }


    }

}
