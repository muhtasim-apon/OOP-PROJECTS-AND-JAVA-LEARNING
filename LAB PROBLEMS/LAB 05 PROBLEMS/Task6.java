import java.util.Scanner;
class Root
{
    public static double root(double A, double B, double C)throws IllegalArgumentException {
            if(A==0)
        {
            throw new IllegalArgumentException("Discriminant < 0.");
        }
        else
        {
        
             double disc=B*B-4*A*C;
            if(disc<0)
             {
                 throw new IllegalArgumentException("Discrimant<0");
             }
            return (-B+Math.sqrt(disc))/(2*A);            
         }
    }
}
public class Task6
{
    public static void main(String[] args)
    {
        String s1;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("Type yes to Continue. Otherwise no");
             s1=sc.nextLine();
            if(s1.equalsIgnoreCase("no"))break;
        try{
            System.out.println("Enter Value of A:");
            int a=sc.nextInt();
            System.out.println("Enter Value of B:");
            int b=sc.nextInt();
            System.out.println("Enter Value of C:");
            int c=sc.nextInt();
            Root r=new Root();
           double val= r.root(a, b, c);
           System.out.println("The Larger Root is "+ val);
        }
        catch(Exception e)
        {
            System.out.println("Error Occured in finding Roots");
            sc.nextLine();
        }
    }while(s1.equalsIgnoreCase("yes"));
    sc.close();
    System.out.println("Program Ended");
}
}