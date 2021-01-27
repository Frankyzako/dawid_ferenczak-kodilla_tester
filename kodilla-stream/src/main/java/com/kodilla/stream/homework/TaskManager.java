package com.kodilla.stream.homework;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
/*
    public static void main(String[] args) {
        List<LocalDate> deadlines = TaskRepository.getTasks()
                .stream()
                .filter(u -> u.getDeadline())
                .map(TaskManager::getDate)
                .collect(Collectors.toList());
        System.out.println(deadlines);
    }

    public static Task getDate(Task task) {

        boolean isBefore = task.getDeadline().isBefore(LocalDate.now());



            if (isBefore == true) {
                return task;

        }

        return task;
    } */
}
