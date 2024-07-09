 class A
{
    int amount = 50 ;
    String name ="Alex";
}
class B extends A{
    String color = "red ";
    void Hello()
    {
        System.out.println("helllo");
    }
}
class C extends B {
    void BYY()
    {
        System.out.println("bye bye ");
    }
}
public class test3  extends  C {

    public static void main(String[] args) {

        test3 obj = new test3() ;
        new test3().BYY(); // anonymous  object
        int a  =  obj.amount  ;
        System.out.println(a);
        obj.Hello();
        obj.BYY();
    }
}
