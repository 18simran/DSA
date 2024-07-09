
public class Test1 {
    public static void main(String[] args) {
        int mark = 83 ;
        if(mark > 30)
        {
            System.out.println("Student is pass");
            if(mark > 50 && mark < 80)
            {
                System.out.println("Student has grade C");
            }
            if(mark > 80 && mark < 90)
            {
                System.out.println("Student has grade B");
            }
            if(mark > 90 )
            {
                System.out.println("Student has grade A");
            }

        }
        else {
            System.out.println("student is fail");
        }
    }
}
