package com.svp.oops;

public class IntroductionOfOopsDayOne {

    public static void main(String[] args) {
        // Declare and initialize the Student object
        Student svp = new Student();

        Student ram = new Student();

        // Assign values to the Student object
        svp.rno = 21;
        svp.name = "VaraPrasad";
        svp.marks = 89.5f;

        // Output all student information
        System.out.println("Roll Number: " + svp.rno);
        System.out.println("Name: " + svp.name);
        System.out.println("Marks: " + svp.marks);

        System.out.println("roll number of ram  "+ram.rno);
    }
}

class Student {
    int rno;
    String name;
    float marks;
}
