package LeetcodeQuestions;
public class Middle {
    Noode head ;
    void insert(int val)
    {
        Noode node = new Noode(val) ;
        node.next = head ;
        head = node ;
    }
    Noode deleteMiddle(Noode head)

    {
        if(head.next == null)
        {
            return null ;
        }
        Noode slow = head ;
        Noode fast = head ;
        while(fast.next.next!= null && fast.next.next.next != null)
        {
            slow = slow.next ;
            fast = fast.next.next ;
        }
        slow.next = slow.next.next ;
        return slow ;
    }
    void display()
    {
        Noode temp = head ;
        while(temp != null)
        {
            System.out.print(temp.val + "--> ");
            temp = temp.next ;
        }
        System.out.println();
    }
    Noode MiddleNode(Noode head )
    {
        Noode slow = head;
        Noode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;

            fast = fast.next.next;
        }

  return slow ;
    }

}
class Noode
{
    Noode next ;
    int val ;
    Noode(int val)
    {
        this.val = val ;
    }

}
class MiddleMain
{
    public static void main(String[] args) {
        Middle n = new Middle() ;
        n.insert(5);
        n.insert(10);
        n.insert(15);
        n.insert(20);
        n.insert(25);
        n.insert(30);
        n.display() ;
        Noode middleNode = n.MiddleNode(n.head);
        if (middleNode != null) {
            System.out.println("The middle node value is: " + middleNode.val);
        } else {
            System.out.println("The linked list is empty.");
        }
      n.deleteMiddle(n.head);
      n.display();

    }
}