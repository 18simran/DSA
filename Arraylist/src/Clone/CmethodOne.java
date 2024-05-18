package Clone;
//cloning using assignment operator
public class CmethodOne {
    int x , y ;
    CmethodOne()
    {


        x = 15;
        y = 20 ;
    }

    public static void main(String[] args) {
        CmethodOne obj1 = new CmethodOne();
        System.out.println(obj1.x + " " + obj1.y );
        CmethodOne obj2 = obj1 ;
        System.out.println(obj2.x + " " + obj2.y );
        System.out.println(obj2.x);
         obj1.x = 100 ;
        System.out.println(obj2.x);
    }
}
