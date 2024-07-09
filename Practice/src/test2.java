import java.util.Scanner ;
public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element");
        int a  = sc.nextInt();
        if(a % 2 ==0)
        {
            System.out.println("its even number ");
        }
        else{
            System.out.println("its odd");
        }
    }
}