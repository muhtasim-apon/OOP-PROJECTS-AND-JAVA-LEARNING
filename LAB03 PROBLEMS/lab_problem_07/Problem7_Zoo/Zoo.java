import java.util.*;

public class Zoo {
    private ArrayList<Animal> animals = new ArrayList<>();

    public void add(Animal a){ animals.add(a); }

    public void feedAll(){
        for(Animal ani: animals)
        {
            System.out.println("<" + ani.getName()+ "> eats. Sound: <"+ ani.makeSound()+">");
        }
    }

    public Animal oldest(){
        int oldestage=-1;
        for(Animal ani: animals)
        {
            if(ani.getAge()>oldestage)
            {
                oldestage=ani.getAge();
            }
        }
        for(Animal ani: animals)
        {
            if(ani.getAge()==oldestage)
            {
                return ani;
            }
        }
        return null;
        
    }

    public int size(){ return animals.size(); }
}
