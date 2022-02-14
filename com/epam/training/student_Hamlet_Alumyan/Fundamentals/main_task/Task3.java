package com.epam.training.student_Hamlet_Alumyan.Fundamentals.main_task;

public class Task3 {
    public static void main(String[] args) {
        int sum = 0;
        int mult = 1;
        for (int i = 0; i < args.length; i++) {
            sum = sum + Integer.parseInt(args[i]);
            mult = mult * Integer.parseInt(args[i]);
        }
        System.out.println("Sum = " + sum);
        System.out.println("Mult = " + mult);
    }
}