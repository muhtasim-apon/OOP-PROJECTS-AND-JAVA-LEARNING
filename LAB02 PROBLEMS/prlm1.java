//package com.mycompany.lab2;
import java.util.Scanner;

public class prlm1 {
    public static void main(String[] args)
    {
        String name;
        int age;
        double height;
        char gender;
        boolean isstudent;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name:");
        name=sc.nextLine();
        System.out.println("Enter Age:");
        age=sc.nextInt();
        System.out.println("Enter Height(in meters):");
        height=sc.nextDouble();
        System.out.println("Enter Gender('M'/'F'):");
        gender=sc.next().charAt(0);
        System.out.println("Are you a student?(true/false):");
        isstudent=sc.nextBoolean();
        System.out.println("Name:"+ name);
        System.out.println("Age:"+ age);
        System.out.println("Height:"+ height);
        System.out.println("Gender:"+ gender);
        System.out.println("Student:"+ isstudent);
        sc.close();
    }
}
