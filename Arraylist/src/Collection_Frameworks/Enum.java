package Collection_Frameworks;

public class Enum {
    enum Week {
        Monday,Tuesday, Wednesday,Thursday,Friday,Saturday,Sunday ;
        //these are enum constants.
        //public , static and final
        //since its final you can create child enums
        //type is week
Week(){
//    System.out.println("enum constructor");
    System.out.println("Constructor called for " + this);

}

    }

    public static void main(String[] args) {
        Week week ;
        week  = Week.Monday ;
        System.out.println(week);
        System.out.println(week.ordinal());
        System.out.println(week.hashCode());

    }
}
