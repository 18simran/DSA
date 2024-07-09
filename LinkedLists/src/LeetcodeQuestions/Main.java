package LeetcodeQuestions;

public class Main {
        public static void main(String[] args) {
            ReverseLL node = new ReverseLL() ;
            node.insertFirst(5);
            node.insertFirst( 10);
            node.insertFirst(15);
            node.insertFirst(20);
            node.display();
            node.displayreverse();

        }
    }

