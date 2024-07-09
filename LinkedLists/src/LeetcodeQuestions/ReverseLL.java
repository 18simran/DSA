package LeetcodeQuestions;
public class ReverseLL
{
   Node head ;
   public void insertFirst(int data)
   {
       Node node = new Node( data) ;
       node.next = head ;
       head = node ;
   }
   void display()
   {
       Node temp = head ;
       while(temp!= null)
       {
           System.out.print(temp.data + "--> ");
           temp = temp.next ;
       }
   }
   void displayreverse()
   {
       Node temp = head ;
       while(temp != null)
       {
           System.out.print(temp.data + "--> ");
           temp = temp.next ;
       }
   }
}
class Node
{
    int data ;
    Node next ;
    Node(int data)
    {
        this.data = data ;
    }
}