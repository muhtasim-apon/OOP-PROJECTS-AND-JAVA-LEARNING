import java.util.Scanner;
public class Task4 {
public static void main(String[]args){
try{
Scanner sc=new Scanner(System.in);
int x,n=sc.nextInt();
int a[]=new int[n];
a[5]=99;
x=n/0;
}
catch(ArrayIndexOutOfBoundsException e){
 System.out.println("The Error is:");
 System.out.println(e);
}
catch(ArithmeticException e)
 {
     System.out.println("The Error is:");
  System.out.println(e);
 }
 catch(Exception e)
 {
    System.out.println("The Error is:");
    System.out.println(e);
 }
finally{
    System.out.println("THE END");
}
}
}
