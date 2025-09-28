//package com.mycompany.lab2;
import java.util.Scanner;

public class prlm3{
    public static void main(String[] args)
    {
        System.out.println("Enter 5 numbers(integers):");
        int[] numbers=new int[5];
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for(int i=0;i<5;i++)
        {
            numbers[i]=sc.nextInt();
            sum+=numbers[i];
        }
        System.out.println("Numbers: ");
        for(int i=0;i<5;i++)
        {
            System.out.print(numbers[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("Sum="+ sum);
        System.out.println("Average="+ sum/(double)5);
        sc.close();
    }
}