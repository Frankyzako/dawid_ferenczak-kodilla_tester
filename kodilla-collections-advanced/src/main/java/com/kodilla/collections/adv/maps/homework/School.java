package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;

import java.util.List;

public class School {
    private List<Double> students = new ArrayList<>();

    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public School(String schoolName, double... students) {

        for (double student : students) {
            this.students.add(student);
        }
        this.schoolName = schoolName;
    }

    public int getStudents() {
        int sum = 0;
        for (double student : students)
            sum += student;
        return sum;
    }

    @Override
    public String toString() {
        return schoolName + ", " + students.size()  + ", " + students ;
    }
}


