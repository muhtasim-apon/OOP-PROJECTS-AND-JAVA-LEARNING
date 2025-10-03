package edu.lab.model;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;

    public Employee(int id, String name){
        this.id = id; this.name = name;
    }
    public int getId(){ return id; }
    public String getName(){ return name; }

    @Override
    public int compareTo(Employee other){
        return this.name.compareToIgnoreCase(other.name);
    }

    @Override
    public String toString(){
        // TODO: "Employee{id=ID, name='NAME'}"
        return "Employee{id="+id+", name='"+name+"'}";

    }

    @Override
    public boolean equals(Object o){
        // TODO: consistent with compareTo on name (case-insensitive)
        if(this==o)return true;
        Employee e=(Employee)o;
        if(this.name.compareToIgnoreCase(e.name)==0)return true;
        return false;
    }
    @Override
    public int hashCode(){
        // TODO: consistent with equals
        return Objects.hash(name.toUpperCase());
    }
}
