package LeetcodeQuestions;
public class Middle {
    Node head ;
    void insert(int val)
    {
        Node node = new Node(val) ;
        node.next = head ;
        head = node ;
    }
    void display()
    {
        Node temp = head ;
        while(temp != null)
        {
            System.out.print(temp.val + "--> ");
            temp = temp.next ;
        }
        System.out.println();
    }
    Node Middle(Node head )
    {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;

            fast = fast.next.next;
        }

        return slow;
    }

}
class Node
{
    Node next ;
    int val ;
    Node(int val)
    {
        this.val = val ;
    }

}
class Main
{
    public static void main(String[] args) {
        Middle n = new Middle() ;
        n.insert(5);
        n.insert(10);
        n.insert(15);
        n.insert(20);
        n.insert(25);
        n.display() ;
        Node middleNode = n.Middle(n.head);
        if (middleNode != null) {
            System.out.println("The middle node value is: " + middleNode.val);
        } else {
            System.out.println("The linked list is empty.");
        }
    }
}