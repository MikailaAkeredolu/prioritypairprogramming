package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("jake", 19));
        students.add(new Student("jane", 9));

        //Create a comparator object
        Comparator<Student> studentComparator = new AgeComparator();
        //now use Collects.sort
        Collections.sort(students,studentComparator );
        //print out the result
        for(Student student: students){
            System.out.println(student);
        }
    }
}
