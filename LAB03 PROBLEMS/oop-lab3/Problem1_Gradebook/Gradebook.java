import java.util.*;

public class Gradebook {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s){
        for( Student st: students)
        {
            if(st.getId().equals(s.getId()))
            {

        throw new UnsupportedOperationException("Duplicate ID rejected");
    }
}
    students.add(s);
}


    public Student findById(String id){
        for( Student st: students)
        {
            if(st.getId().equals(id))
            {
                return st;
            }
        }
        return null;
    }

    public double classAverage(){
        if(students.size()==0)return 0.0;
        else
        {
            int sum=0;
            for(Student st:students)
            {
                sum+=st.average();
            }
            double avg=sum/(double)students.size();
            return avg;
        }

    }

    public ArrayList<Student> topK(int k){
        ArrayList<Student> revsort=new ArrayList<>(students);
        Collections.sort(revsort,Collections.reverseOrder(Comparator.comparingDouble(Student::average)));
        if(k>=students.size())
        {
            return new ArrayList<>(revsort.subList(0,students.size()));
        }
        else
        {
            return new ArrayList<>(revsort.subList(0,k));

        }
        
    }
}
