import java.util.*;

public class Company {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void add(Employee e){
// TODO: prevent duplicate id; else throw IllegalArgumentException
        for(Employee emp: employees)
        {
            if(emp.getId()==e.getId())
            {
                throw new IllegalArgumentException("Duplicate ID can't be added");
            }
        }
            employees.add(e);
    }

    public Employee richest(){
        // TODO: return employee with highest getPayment() (null if empty)
        if(employees.size()==0)
        {
            return null;
        }
        else
        {
            double highestpayment=-1;
            for(Employee emp: employees)
            {
                if(emp.getPayment()>highestpayment)
                {
                    highestpayment=emp.getPayment();
                }
            }
            for(Employee emp: employees)
            {
                if(emp.getPayment()==highestpayment)
                {
                    return emp;
                }
            }
            return null;
        }
        
    }

    public void raiseAll(double pct){
         // TODO: call raiseByPercent on all employees
        for(Employee emp: employees)
        {
            emp.raiseByPercent(pct);
        }
    }

    public int size(){ return employees.size(); }
}
