package Clone;
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    // Copy constructor for deep copying
    Person(Person other) {
        this.name = other.name;
    }
}

class DeepCopyExample {
    int age;
    Person person;

    DeepCopyExample(int age, Person person) {
        this.age = age;
        this.person = person;
    }

    // Deep copy constructor
    DeepCopyExample(DeepCopyExample other) {
        this.age = other.age;
        this.person = new Person(other.person);
    }
    public static void main(String[] args) {
        Person person1 = new Person("John");
        DeepCopyExample original = new DeepCopyExample(25, person1);
        DeepCopyExample deepCopy = new DeepCopyExample(original);

        // Check if the person field refers to a different object
        System.out.println(original.person == deepCopy.person); // false
        System.out.println(deepCopy.age);
        deepCopy.age = 500 ;
        System.out.println(original.age);
        System.out.println(deepCopy.age);
    }
}



