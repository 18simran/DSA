class Animal{
    void color()
    {
        System.out.println("my color: ");
    }
    void sound()
    {
        System.out.println("hiii");
    }
}
class Dog extends Animal
{
    void sound()
    {
        System.out.println("byy");
    }
}
class Heloo extends Dog
{
    void hii()
    {
        System.out.println("hiii");
    }
}
class Cat extends Heloo
{
    public void  sound() {
        super.sound(); //The 'super' keyword allows referencing the parent class or superclass of a subclass in Java.
        System.out.println("cat meaoww");
    }
}
public class test5 {
    public static void main(String[] args) {
        Cat obj = new Cat() ;
        obj.sound();
    }
}
