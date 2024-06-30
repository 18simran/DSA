package Practice.Try;

public class LLpractice
{
    public static Node head;
    int size ;
    int indexn;
    private Node tail ;
public void insertAtIndex(int val, int index)
{
    if(index == 0)
    {
        insertFirst(val);
        indexn++ ;
        return;
    }
    if(index == indexn)
    {
        //deleteend
    }
    int x = 1 ;
    Node node = new Node(val,index ) ;
    Node temp = head ;
while(x  <  index)
{
    temp = temp.next ;
    x++ ;

}

node.next = temp.next ;
temp.next = node ;
size++ ;
indexn++ ;

}
public void deleteAtIndex(int index)
{
    Node temp = head ;
    int x = 1 ;
    if(index == 0)
    {
        head = temp.next ;
        size-- ;
    }
    if(index == indexn)
    {

    }
    while(x < index) {
        temp = temp.next ;
        x++ ;
    }
    temp.next = temp.next.next ;
    indexn-- ;
}

    public void insertFirst(int val)
    {
        Node node = new Node(val) ;
        node.next = head ;
        head = node ;
        size+= 1 ;
        indexn++;

    }
    public void display()
    {
        Node temp = head ;
        while(temp != null)
        {
            System.out.print(temp.val + "---> ");
            temp = temp.next ;
        }
    }
    public void displayR(Node head)
    {
        if(head == null) return ;
        displayR(head.next) ;
        System.out.print(head.val + " ");

    }
    class Node
    {
        public int val ;
        private Node prev ;
        private  Node next ;
        public int index ;
      public  Node(int val)
        {

            this.val = val;
        }
        public Node(int val, int index )
        {
            this.val = val ;
            this.index = index  ;
        }

    }
}
