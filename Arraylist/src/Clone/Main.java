package Clone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human  simran  = new Human(24,"simran");
        Human smaeyra = new Human(25,"smaeyra");
        Human twin = (Human)simran.clone() ;
        System.out.println(simran.age + " " + simran.name);
        System.out.println(twin.age + " " + twin.name);
    }
}
