package com.epam.training.student_Hamlet_Alumyan.Fundamentals.main_task;

public class Task4 {
    public static void main(String[] args) {
        int a = 6;
        int b = 26;
        int num = Integer.parseInt(args[0]);
        for (int i = 0; i < num; i++) {
        System.out.println( a+ (int) (Math.random()*b));
        }
    }
}
