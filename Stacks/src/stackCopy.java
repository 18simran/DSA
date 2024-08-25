import java.util.Scanner;
import java.util.Stack;

public class stackCopy {
    public static void main(String[] args) {
        Stack<Integer>  st = new Stack<>() ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the size of stack : ");
        int n = sc.nextInt() ;
        for (int i = 1 ; i <= n ;i++) {
            st.push(sc.nextInt()) ;
        }
        System.out.println(st);
//        Stack<Integer> rs = new Stack<>() ;
//        while (st.size() > 0)
//        {
//            rs.push(st.pop());
//        }
//        System.out.println(rs);
//        Stack<Integer> stCopy = new Stack<>();
//        while(rs.size() >0)
//        {
//            stCopy.push(rs.pop()) ;
//        }
//        System.out.println(stCopy);
        //with array
        int[] arr = new int[n] ;
        for (int i =  n -1 ;i >=0  ;i--) {
            arr[i] = st.pop();
        }
        for (int i = 0  ; i < n; i++)
        {
            System.out.print(arr[i] + " ");
            st.push(arr[i]) ;
        }
        System.out.println();
        System.out.println(st);
    }
}
