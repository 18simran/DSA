package Clone;
class Star
{
    int x , y ;
}

public class ShallowCopyExample implements Cloneable
{
    int a ;
    String name ;
    Star s = new Star() ; // Reference field 's' of type 'Star', initialized with a new 'Star' object.
    public Object clone() throws CloneNotSupportedException {
        return super.clone() ;
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        ShallowCopyExample obj1 = new ShallowCopyExample();
        obj1.a = 10 ;
        obj1.name = "simran" ;
        obj1.s.x = 20 ;
        obj1.s.y = 30 ;
        ShallowCopyExample obj2 = (ShallowCopyExample) obj1.clone();
        obj2.a = 100 ;
        obj2.s.x = 200 ;
        obj2.s.y = 300 ;
        System.out.println(obj1.a + " " + obj1.name + " " + obj1.s.x + " " +obj1.s.y );
        System.out.println(obj2.a + " " + obj2.name + " " + obj2.s.x + " " + obj2.s.y );
    }
}
