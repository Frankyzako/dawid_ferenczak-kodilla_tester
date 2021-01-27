package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Szymon");
        Teacher teacher2 = new Teacher("Marek");
        Teacher teacher3 = new Teacher("");


        List<Student> students = new ArrayList<>();

        students.add(new Student("Dawid", teacher1));
        students.add(new Student("Bartek", teacher3));
        students.add(new Student("Sławek", teacher3));
        students.add(new Student("Wiesiek", teacher2));

        for (Student student : students) {
            Optional<Student> optionalStudent = Optional.ofNullable(student);
            Teacher teacher0 = new Teacher("<undefined>");
            student = optionalStudent.orElse(new Student(student.getName(), teacher0));
            System.out.println(student);
        }
    }
}
