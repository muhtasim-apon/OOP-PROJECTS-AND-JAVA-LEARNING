import java.util.Scanner;
class NotIntegerException extends Exception
{
String s;
public NotIntegerException(String s1)
{
    s=s1;
}
public String toString(){
    return "This is not an Integer Number";
}
}
class Test
{
    String s1;
    int c;
    public Test(String s){s1=s;}
    public int readInteger() throws NotIntegerException{
        if(s1.contains(".") || s1.contains("f") || s1.contains("F"))
        {
            throw new NotIntegerException(s1);
        }
        else
        {
            try{
             c=Integer.parseInt(s1);
             return c;
        }
        catch(Exception e)
        {
            throw new NotIntegerException(s1);
        }
    }
}
}
public class Task5{
    public static void main(String[] args)
    {
        try{
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            Test a=new Test(s);
            int value=a.readInteger();
            System.out.println("The Integer Number is:"+ value);
        }
        catch(NotIntegerException e)
        {
            System.out.println(e);
        }
    }
}