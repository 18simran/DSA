package LeetcodeQuestions;

 public class middle_Node
{
    Node head ;

    Node tail ;
    int size ;
    public void insertFirst(int data)
    {
        Node node = new Node( data) ;
        node.next = head ;
        head = node ;
        size++;
    }
    void display()
    {
        Node temp = head ;
        while(temp != null)
        {
            System.out.print(temp.data + "--> ");
            temp = temp.next ;
        }
        System.out.println();
    }
    void displayLeftMiddle() {
        Node slow = head  ;
        Node fast = head  ;
        if(size%2 ==0) {
            while (fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            System.out.println( slow.data );
        }

    }
    void displayRightMiddle()
    {
        Node slow = head ;
        Node fast = head ;
        if(size%2 ==0) {
            while (fast != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            System.out.println(slow.data);
        }

    }
    void displayMiddle()
    {
        Node slow = head;
        Node fast = head;
        if(size%2 != 0) {
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            System.out.println(slow.data);
        }
    }


}
class middle_Node_Main
{
    public static void main(String[] args) {
         middle_Node node = new middle_Node();
         node.insertFirst(5);
         node.insertFirst(10);
         node.insertFirst(15);
         node.insertFirst(20);
         node.insertFirst(25);
         node.insertFirst(30);
         node.insertFirst(35);
         node.insertFirst(40);
         node.display() ;
         node.displayLeftMiddle() ;
         node.displayRightMiddle() ;
         node.displayMiddle();

    }
}
