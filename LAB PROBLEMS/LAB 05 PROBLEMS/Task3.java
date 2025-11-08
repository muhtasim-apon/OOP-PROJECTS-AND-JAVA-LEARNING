import java.util.Scanner;
public class Task3{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int x,n=sc.nextInt();
int a[]=new int[n];
try{
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
finally{
    System.out.println("THE END");
}
sc.close();
}
}