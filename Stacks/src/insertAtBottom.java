import java.util.Stack;

public class insertAtBottom {
    public static void main(String[] args)
    {
        System.out.println("Enter element Aryana");
        String s  = "Aryana" ;
        int index = 5 ;
        Stack<String> st  = new Stack<>() ;
        st.push("simran") ;
        st.push("Akriti") ;
        st.push("Sohani") ;
        st.push("Manvi");
        st.push("Siman") ;
        System.out.println(st);
                Stack<String> temp = new Stack<>() ;
                while(st.size() > index)
                {
                  temp.push(st.pop()) ;
                }
                System.out.println(temp);
                st.push(s) ;
                while(temp.size() > 0)
                {
                    st.push(temp.pop()) ;
                }
                System.out.println(st);
    }
}