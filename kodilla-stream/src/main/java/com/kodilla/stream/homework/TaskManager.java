package com.kodilla.stream.homework;



import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> deadlines = TaskRepository.getTasks()
                .stream()
                .filter(u -> u.getDeadline().isBefore())
                .map(TaskManager::getDate)
                .collect(Collectors.toList());
        System.out.println(deadlines);
    }
    public static String getDate(Task task) {
        LocalDate currentDate = LocalDate.now();

        if(currentDate > task.getDeadline()){
            return task.getDeadline();
        } else return ;
    }
}
