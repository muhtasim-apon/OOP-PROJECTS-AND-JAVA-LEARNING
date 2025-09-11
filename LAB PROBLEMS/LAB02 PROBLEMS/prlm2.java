//package com.mycompany.lab2;
import java.util.Scanner;

public class prlm2 {
    public static void main(String[] args)
    {
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        num1=sc.nextInt();
        System.out.println("Enter second number:");
        num2=sc.nextInt();
        System.out.println("Sum= "+ (num1+num2));
        System.out.println("Differece= "+ (num1-num2));
        System.out.println("Product= "+ num1*num2);
        if(num2!=0)
        {
            System.out.println("Quoitent(double)"+ num1/(double)num2 );
            System.out.println("Quoitent(int)"+ num1/num2);

        }
        else
        {
            System.out.println("Undefined");
        }
        sc.close();
    }

}
