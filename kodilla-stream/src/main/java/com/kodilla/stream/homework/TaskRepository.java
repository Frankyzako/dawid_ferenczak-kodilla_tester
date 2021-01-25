package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Sprzatanie", LocalDate.of(2020, 01, 20), LocalDate.of(2020, 01, 27)));
        tasks.add(new Task("Pranie", LocalDate.of(2020, 01, 19), LocalDate.of(2020, 01, 23)));
        tasks.add(new Task("Mycie okien", LocalDate.of(2020, 01, 18), LocalDate.of(2020, 01, 26)));

        return tasks;
    }
}
