package edu.lab.shapes.impl;
import edu.lab.shapes.api.Shape;

public class Circle implements Shape {
    private double radius;
    public Circle(double radius){ this.radius = radius; }
    public double getRadius(){ return radius; }

    @Override public double area(){
        // TODO: Math.PI * r * r
        return Math.PI*radius*radius;
    }
    @Override public double perimeter(){
        // TODO: 2 * Math.PI * r
        return 2*Math.PI*radius;
    }
    @Override public String toString(){
        // TODO: "Circle{r=.., area=.., perim=..}"
        String str="Circle{r="+radius+", area="+area()+", perim="+perimeter()+"}";
        return str;
    }
}
