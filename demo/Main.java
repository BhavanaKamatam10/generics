package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2){
        return Integer.compare(student1.getId(), student2.getId());
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(100,"Bhav"),
                new Student(143,"Nik") ,
                new Student(3, "Ajay"));

        ArrayList<Student> studentsAl = new ArrayList<>(students);
        System.out.println(studentsAl);

        Collections.sort(studentsAl);
        System.out.println("Desc" + studentsAl);
        studentsAl.sort(new AscendingStudentComparator());
        System.out.println("AscendingStudentComparator" + studentsAl);

    }
}
