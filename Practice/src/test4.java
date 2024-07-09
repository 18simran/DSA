public class test4 {
    test4()
    {
        System.out.println("hello");
    }
    void test4(int a)
    {

        System.out.println(a);
    }
    public static void main(String[] args)
    {
        test4 obj = new test4();

        obj.test4(5);
    }
}
