public class Main {
    //comparators
    public static void main(String[] args) {

        Student simran = new Student("simran", 95);
        Student pinju = new Student("pinju",85);
        if(simran.compareTo(pinju) < 0)
        {
            System.out.println(simran.compareTo(pinju));
            System.out.println("pinju has more  marks.");
        }

    }
}