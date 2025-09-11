//package com.mycompany.lab2;
import java.util.Scanner;
class car{
    String color;
    int fuel=100;
    int position=0;
    void move(int distance)
    {
        position+=distance;
        fuel-=distance;
    }
    void printstatus()
    {
        System.out.println("Car Color:"+ color+", Position:"+position+", Fuel left:"+ fuel);

    }
}
public class prlm5{
    public static void main(String [] args)
    {
        car RollsRoyce=new car();
        RollsRoyce.color="Black";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Distance");
        int mv=sc.nextInt();
        RollsRoyce.move(mv);
        RollsRoyce.printstatus();
         System.out.println("Enter Second Distance");
         mv=sc.nextInt();
        RollsRoyce.move(mv);
        RollsRoyce.printstatus(); 
        sc.close();
    }
}
