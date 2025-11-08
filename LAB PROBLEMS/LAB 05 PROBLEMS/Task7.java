import java.util.Scanner;
class NotPrimeException extends Exception
{
Integer a1;
public NotPrimeException(Integer a)
{
    a1=a;
}
public String toString(){
    return a1+" is not a Prime Number";
}
}
class TestPrimeException
{
    boolean testPrime(int a) throws NotPrimeException
    {
        if(a==2)return true;
        if(a<=1)
        {
            throw new NotPrimeException(a);
        }
        for(int i=2;i<=Math.sqrt(a);i++)
        {
            if(a%i==0)
            {
                throw new NotPrimeException(a);
            }
        }
        return true;
    }
}
public class Task7{
    public static void main(String[] args)
    {
        try{
            Scanner sc=new Scanner(System.in);
            Integer s=sc.nextInt();
            TestPrimeException t=new TestPrimeException();
            t.testPrime(s);
            System.out.println(s+" Is a Prime Number.");
        }
        catch(NotPrimeException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
              System.out.println("Unexpected Error Ocuured");
              System.out.println(e);
        }
    }
}