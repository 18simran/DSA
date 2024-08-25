import java.util.Stack;

public class basicOfStacks {
    public static void main(String[] args)
    {
        //Built in stack
        Stack<Integer> st = new Stack<>() ;
        st.push(5) ;
        st.push(10) ;
        st.push(15) ;
        st.push(20) ;
        st.push(25) ;

        System.out.println(st);
        System.out.println("st.peek() --> " + st.peek());
        st.pop() ;
        System.out.println("After st.pop() --> " + st );
        System.out.println(st.get(0));
        System.out.println(st.get(2));
        System.out.println(st.isEmpty());



    }
}