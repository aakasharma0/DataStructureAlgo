package PQ;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        // PriorityQueue<Student> pqStudents = new PriorityQueue<>(new
        // Comparator<Student>() {

        // @Override
        // public int compare(Student o1, Student o2) {
        // System.out.println("I am called from comparator");
        // return o1.rollNum - o2.rollNum;
        // }

        // });
        PriorityQueue<Student> pqStudents = new PriorityQueue<>();
        Student s1 = new Student("Akash", 1, "First");
        Student s2 = new Student("alice", 2, "First");
        Student s3 = new Student("bob", 3, "First");
        Student s4 = new Student("ram", 4, "First");
        pqStudents.addAll(Arrays.asList(s1, s2, s3, s4));
    }
}

// Original Order acscending order
// integer reverse : Collections.reverseOrder();