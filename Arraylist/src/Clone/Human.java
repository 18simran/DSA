package Clone;
//we are making Human class obj clone therfore needs to implement Cloneable interface
public class Human implements Cloneable{
    int age ;
    String name ;
    public Human(int age, String name)
    {
        this.age = age ;
        this.name = name ;
    }

    public Object clone() throws  CloneNotSupportedException
    {
      return super.clone(); // calling super.clone() mthod to obtain the cloned object referance

    }

}
