public class Student implements Comparable<Student> {
    public String name ;
    public int marks ;
 public   Student(String name, int marks)
    {
this.name = name ;
this.marks = marks ;
    }
    @Override
    public int compareTo(Student o) {
        int diff =  (int) (this.marks - o.marks);
        return diff ;
    }
}
