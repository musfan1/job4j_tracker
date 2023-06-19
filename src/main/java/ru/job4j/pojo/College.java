package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivan Petrov");
        student.setEnterDate(LocalDate.now());
        student.setGroup("23-1");
        System.out.println("Full name: " + student.getFullName()
                + " enter date: " + student.getEnterDate()
                + " group: " + student.getGroup());
    }
}
