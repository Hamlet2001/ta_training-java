package com.epam.training.student_Hamlet_Alumyan.Classes.main_task.Student;

import com.epam.training.student_Hamlet_Alumyan.Classes.main_task.Customer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

class MainTaskClasses {

    public static void main(String[] args) {

        //Students
        Student student1 = new Student(9000066, "Hakob", "Hakobyan", "Hakobi", LocalDate.parse("1990-03-06"), "Arcaxi66", 33000006, "High", "Mathematics", 1, 2);
        Student student2 = new Student(9999909, "Aram", "Aramyan", "Arami", LocalDate.parse("1984-03-08"), "Njdehi66", 33666606, "High", "Electronics", 2, 1);
        Student student3 = new Student(9999099, "Ara", "Arayan", "Arai", LocalDate.parse("1988-04-08"), "Njdehi86", 33666066, "Low", "Electronics", 3, 2);
        Student student4 = new Student(9990999, "Artash", "Aramyan", "Arayiki", LocalDate.parse("1992-03-08"), "Njdehi6", 33660666, "Low", "Mathematics", 4, 3);
        Student student5 = new Student(9909999, "Artur", "Vardanyan", "Arseni", LocalDate.parse("1996-06-08"), "Arcaxi6", 33606666, "Low", "Electronics", 2, 1);
        Student student6 = new Student(9099999, "Karen", "Karapetyan", "Kareni", LocalDate.parse("1986-07-08"), "Njdehi96", 33066666, "High", "Mathematics", 1, 2);

        //Array of Students
        Student[] students = {student1, student2, student3, student4, student5, student6};

        // Condition a - Students of the Mathematics faculty
        for (Student student : students)
            if (student.faculty == "Mathematics")
                System.out.println("Students of the Mathematics faculty " + student);
        System.out.println();

        // Condition b - lists of students for each course
        int courseNumber;
        for (courseNumber = 1; courseNumber < 5; courseNumber++) {
            for (Student student : students) {
                if (student.course == courseNumber) {
                    System.out.println("Students of " + courseNumber + " course " + student);
                }
            }
        }
        System.out.println();

        // Condition c - Students born after 1990
        for (Student student : students) {
            if (student.birthDay.getYear() >= 1990) {
                System.out.println("Students born after 1990 " + student);
            }
        }
        System.out.println();

        //Customers
        Customer customer1 = new Customer(666666, "Vaxinak", "Karapetyan", "Kareni", "Syuniqi66", 500600700, 247000001);
        Customer customer2 = new Customer(666667, "Gnel", "Karapetyan", "Kareni", "Syuniqi66", 400300800, 247000002);
        Customer customer3 = new Customer(666668, "Aram", "Karapetyan", "Kareni", "Syuniqi66", 600700600, 247000003);
        Customer customer4 = new Customer(666669, "Narek", "Karapetyan", "Kareni", "Syuniqi66", 600700606, 247000006);

        //Array of Customers

        Customer[] customers = {customer1, customer2, customer3,customer4};

        //Sorted by name
        ArrayList customerName = new ArrayList();

        customerName.add(customer1.getName());
        customerName.add(customer2.getName());
        customerName.add(customer3.getName());
        customerName.add(customer4.getName());

        Collections.sort(customerName);

        for (Object sortedName : customerName) {
            System.out.println(sortedName);
        }
        System.out.println();

        //General information of sorted customers
        Customer sortedCustomers;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            boolean thereAreChanges = false;
                for (int i = 0; i < customers.length - 1; i++) {
                    if (customers[i].getName().charAt(0) > customers[i + 1].getName().charAt(0)) {
                        sortedCustomers = customers[i];
                        customers[i] = customers[i + 1];
                        customers[i + 1] = sortedCustomers;
                        thereAreChanges = true;
                        // System.out.println("List of sorted customers ar " + sortedCustomers);
                    }
                    //   System.out.println("List of sorted customers a " + customers[i].toString());
                }
                if (thereAreChanges) {
                    sorted = false;
                }
        }
        for (int i = 0; i < customers.length; i++) {
            System.out.println("List of sorted customers are " + customers[i].toString());
        }
    }
}









