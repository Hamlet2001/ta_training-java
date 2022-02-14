package com.epam.training.student_Hamlet_Alumyan.Fundamentals.main_task;

public class Task5 {
    public static void main(String[] args) {
        String [] arr = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int index = Integer.parseInt(args[0]);
        if (index <= 12 && index >= 1) {
            System.out.println(arr[index - 1]);
        } else System.out.println("There is no such month");
    }
}




