package util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Cardoso on 27-Feb-16.
 */
class Student{
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public Double getScore() {
        return this.score;
    }

}

public class Anonymous{

    List<Student> students = new ArrayList<>();

    Anonymous () {
        Student s1 = new Student("Niels", 17.5);
        Student s2 = new Student("Karl", 15.5);
        Student s3 = new Student("Sue", 14.3);
        students.add(s1);
        students.add(s2);
        students.add(s3);
    }

    public static void main (String[]args){
        Anonymous anonymous = new Anonymous();
        //sorting by name
        anonymous.sortStudentsByName();
        anonymous.printStudents();
        System.out.println();
        //sorting by ascending score
        anonymous.sortStudentsByScore();
        anonymous.printStudents();
        System.out.println();
        //sorting by descending score
        anonymous.sortStudentsByInverseScore();
        anonymous.printStudents();
    }

    private void printStudents(){
        for (Student student: students){
            System.out.println(student.getName()+ ":" + student.getScore());
        }
    }

    private void sortStudentsByName() {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    //sorting by ascending order
    private void sortStudentsByScore() {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getScore().compareTo(o2.getScore());
            }
        });
    }

    //sorting by descending order
    private void sortStudentsByInverseScore() {
        Collections.sort(students, Collections.reverseOrder(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getScore().compareTo(o2.getScore());
            }
        }));
    }
}
