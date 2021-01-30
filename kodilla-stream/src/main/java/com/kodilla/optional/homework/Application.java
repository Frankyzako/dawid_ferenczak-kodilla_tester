package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Szymon");
        Teacher teacher2 = new Teacher("Marek");
        Teacher teacher3 = new Teacher("Sławek ");


        List<Student> students = new ArrayList<>();

        students.add(new Student("Dawid", teacher1));
        students.add(new Student("Bartek", teacher3));
        students.add(new Student("Sławek", null));
        students.add(new Student("Wiesiek", teacher2));

        for (Student student : students) {
            Teacher teacher = Optional.ofNullable(student.getTeacher())
                   .orElse(new Teacher("<undefined>"));
            System.out.println(student);
        }

    }
}
