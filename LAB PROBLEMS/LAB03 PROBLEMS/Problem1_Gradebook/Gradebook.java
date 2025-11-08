import java.util.*;

public class Gradebook {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s){
        // TODO: Prevent duplicate IDs (case-sensitive). If duplicate, throw IllegalArgumentException.
        for(Student std: students)
        {
            if(std.getId().equals(s.getId()))
            {
                throw new IllegalArgumentException("Duplicate rejected");
            }
            }
        students.add(s);
        }
// TODO: Return student with matching id or null if not found
    public Student findById(String id){
        for(Student std: students)
        {
            if(std.getId().equals(id))
            {
                return std;
            }
            }
            return null;
        }

    public double classAverage(){
        // TODO: Average of student averages (0 if empty)
        if(students.isEmpty())return 0;
        double sum=0;
        for(Student std: students)
        {
            sum+=std.average();
        }
        return sum/(double)students.size();
    }

    public ArrayList<Student> topK(int k){
        // TODO: Return top-k by average (descending). If k > size, return all.
       // if(students.isEmpty())return new ArrayList<>();
        ArrayList<Student>std = new ArrayList<>(students);
        std.sort((s1,s2)->Double.compare(s2.average(), s1.average()));
        if(k>students.size())return std;
        return new ArrayList<>(std.subList(0, k));
    }
}