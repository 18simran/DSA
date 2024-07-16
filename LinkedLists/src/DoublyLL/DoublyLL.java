package DoublyLL;

public class DoublyLL
{
private Node head ;
private Node tail ;
private int size ;

    DoublyLL(int size )
    {
        this.size = 0 ;
    }
public void insertFirst(int val)
{
    Node node = new Node(val);
    node.prev = null ;
    if(head != null)
    {
        head.prev = node ;
    }
    head = node ;
    size+=1 ;
}
public void insertLast(int val)
{
    Node node = new Node(val);
    Node temp = head ;
    while (temp.next !=  null)
    {
        temp = temp.next ;
    }
    temp.next = node ;
    node.prev = temp ;
    node.next = null ;
size += 1 ;
}
void insert(int val,int index )
{
    Node node = new Node(val) ;
    Node temp = head ;
    if(index == 0)
    {
        insertFirst(val);
        return;
    }
    if(index == size - 1)
    {
        insertLast(val);
        return;
    }
    if(index >= size)
    {
        System.out.println("index out of bound");
        return;
    }
    for(int i = 1  ;i < index  ;i++)
    {
        temp = temp.next ;
    }

    node.value = val ;
    node.next = temp.next ;
    temp.next = node ;
    node.prev = temp ;
size += 1 ;
}
public void deleteFirst()
    {
if(head == null)
{
    tail = null ;
}
head = head.next ;
head.prev = null ;
        size-- ;
    }
public void deleteLast()
{
    Node temp = head ;
if(size <= 1) {
     deleteFirst();
    return;
}
    while(temp.next.next != null)
    {
        temp = temp.next ;

    }
    tail = temp ;
    tail.next = null;
    size--;
}
void delete(int index)
{
    if(index == 0)
    {
        deleteFirst();
        return;
    }
    if(index == size -1 )
    {
        deleteLast();
        return;
    }
    Node temp = head ;
 for(int i = 1;i < index ;i++)
 {
     temp = temp.next ;
 }
 Node temp2 = temp.next ;
 temp.next = temp2.next ;
 temp2.next.prev = temp ;
 size--;

}
public int find(int item)
{
    Node temp = head ;
        int index = 0;
    while(temp !=null)
    {
        if (temp.value == item)
        {
            return index;
        }
        temp = temp.next ;
        index++ ;
    }
    return -1 ;
}

void reverseTraverse()
{
    Node temp = head  ;
    while(temp.next != null)
    {
        temp =temp.next ;
    }
    while(temp != null )
    {
        System.out.print(temp.value + " -> ");
        temp = temp.prev ;
    }
    System.out.println();
}
public void display()
{
     Node node = head ;
     while(node!= null)
     {
         System.out.print(node.value + " -> ");
         node = node.next ;
     }
    System.out.println();
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
            this.value = val
            ;
        }
    }
}
