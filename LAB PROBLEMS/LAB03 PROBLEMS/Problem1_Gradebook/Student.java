import java.util.*;

public class Student {
    private String id;
    private String name;
    private HashMap<String, Integer> marks = new HashMap<>(); // subject -> marks

    public Student(String id, String name){
        this.id = id;
        this.name = name;
    }

    // TODO: addSubjectMark(String subject, int mark)
    // - Overwrite if subject already exists
    // - Validate: 0 <= mark <= 100, else throw IllegalArgumentException
    public void addSubjectMark(String subject, int mark){
        if(mark>=0 && mark<=100)
        {
            marks.put(subject, mark);
        }
        else{
        throw new IllegalArgumentException("Invalid Mark");
    }
}

    // TODO: average() -> double
    // - Return average marks across all subjects (0 if no subjects)
    public double average(){
        if(marks.isEmpty()) return 0;
        int sum=0;
        for(Map.Entry<String, Integer>marks:marks.entrySet())
        {
            sum+=marks.getValue();
        }
        return sum/(double)marks.size();
    }

    // TODO: highestSubject() -> String (subject name)
    // - Return subject with highest mark (null if none)
    public String highestSubject(){
        if(marks.isEmpty())return null;
        String highestSubject="";
        int highestmark=-1;
        for(Map.Entry<String, Integer>marks:marks.entrySet())
        {
            if(marks.getValue()>highestmark)
            {
                highestmark=marks.getValue();
                highestSubject=marks.getKey();
            }
        }
        return highestSubject;

    }

    // TODO: lowestSubject() -> String (subject name)
    // - Return subject with lowest mark (null if none)
    public String lowestSubject(){
         if(marks.isEmpty())return null;
        String lowestSubject="";
        int lowestmark=101;
        for(Map.Entry<String, Integer> marks:marks.entrySet())
        {
            if(marks.getValue()<lowestmark)
            {
                lowestmark=marks.getValue();
                lowestSubject=marks.getKey();
            }
        }
        return lowestSubject;

    }

    public String getId(){ return id; }
    public String getName(){ return name; }
    public Map<String,Integer> getMarksView(){ return Collections.unmodifiableMap(marks); }
}