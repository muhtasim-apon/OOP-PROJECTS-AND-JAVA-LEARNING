//package com.mycompany.lab2;
class student{
    String name;
    int id;
    double cgpa;
    //constructor creation
    student(String myName, int myID, double myCgpa){
        name=myName;
        id=myID;
        cgpa=myCgpa;
    }
    void printdetails()
    {
        System.out.println("Name:"+name +",ID:"+id +",CGPA:"+cgpa);
    }
}
public class prlm4{
    public static void main(String[] args)
    {
        student std1= new student("SYED MUHTASIM ALAM APON",202304,3.95);
        std1.printdetails();
        student std2= new student("FARHAN LABIB AHAN",202308,3.94);
        std2.printdetails();
        student std3= new student("MD.ABDULLAH BIN SAROWAR CHOWDHURY",202322,3.94);
        std3.printdetails();
    }
}