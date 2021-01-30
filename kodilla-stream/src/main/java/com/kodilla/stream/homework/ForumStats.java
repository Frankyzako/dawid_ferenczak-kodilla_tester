package com.kodilla.stream.homework;


import com.kodilla.stream.UsersRepository;


public class ForumStats {
    public static void main(String[] args) {

        double avgPostElderUsers = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .mapToDouble(u -> u.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println(avgPostElderUsers);

        double avgPostYoungerUsers = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .mapToDouble(u -> u.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println(avgPostYoungerUsers);


    }


}




