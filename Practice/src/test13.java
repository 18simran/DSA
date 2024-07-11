public class test13 {
    public  static  void print (int n)
    {
        System.out.println("hello");

       if(n  == 6)
    {
        return;
    }
      else{
          print(n + 1);
       }
    }
    public static void main(String[] args) {
        int n = 1 ;
        print(n);
    }
}
