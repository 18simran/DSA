public class IntersectionLL {

    Node headA;
    Node headB;
    public int size1;
    public int size2;

    public void getIntersectionNode(Node headA, Node headB) {
        Node tempA = headA;
        Node tempB = headB;

        int lengthA = size1;
        int lengthB = size2;
        if (lengthA > lengthB) {
            for (int i = 1; i <= lengthA - lengthB; i++) {
                tempA = tempA.next;
            }
        } else if (lengthB > lengthA) {
            for (int i = 1; i <= lengthB - lengthA; i++) {
                tempB = tempB.next;
            }
        }

        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;

        }
        System.out.println(tempA);
    }


    public void insertFirstList1(int data) {
        Node node = new Node(data);
        Node temp = headA;
        node.data = data;
        node.next = temp;
        headA = node;
        size1++;
    }

    public void insertFirstList2(int data) {
        Node node = new Node(data);
        Node temp = headB;
        node.data = data;
        node.next = temp;
        headB = node;
        size2++;
    }

    public void displayList1() {
        Node temp = headA;
        while (temp != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void displayList2() {
        Node temp = headB;
        while (temp != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class Main {
    public static void main(String[] args) {
        IntersectionLL list = new IntersectionLL();
        list.insertFirstList1(10);
        list.insertFirstList1(12);
        list.insertFirstList1(5);
        list.insertFirstList1(14);
        list.insertFirstList1(13);
        list.insertFirstList1(100);
        list.displayList1();
        list.insertFirstList2(10);
        list.insertFirstList2(12);
        list.insertFirstList2(5);
        list.insertFirstList2(19);
        list.insertFirstList2(90);
        list.displayList2();
        list.getIntersectionNode(list.headA, list.headB);
    }
}
