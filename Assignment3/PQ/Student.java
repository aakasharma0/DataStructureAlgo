package PQ;

public class Student implements Comparable<Student> {
    String name;
    int rollNum;
    String Class;

    public Student(String name, int rollNum, String class1) {
        this.name = name;
        this.rollNum = rollNum;
        Class = class1;
    }

    @Override
    public int compareTo(Student o) {
        System.err.println("Hie i am called from class");
        return Integer.compare(this.rollNum, o.rollNum);
    }

}
