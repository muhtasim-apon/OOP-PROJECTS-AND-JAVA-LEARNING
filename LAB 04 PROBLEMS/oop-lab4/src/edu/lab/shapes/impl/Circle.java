package edu.lab.shapes.impl;
import edu.lab.shapes.api.Shape;

public class Circle implements Shape {
    private double radius;
    public Circle(double radius){ this.radius = radius; }
    public double getRadius(){ return radius; }

    @Override public double area(){
        // TODO: Math.PI * r * r
        throw new UnsupportedOperationException("TODO");
    }
    @Override public double perimeter(){
        // TODO: 2 * Math.PI * r
        throw new UnsupportedOperationException("TODO");
    }
    @Override public String toString(){
        // TODO: "Circle{r=.., area=.., perim=..}"
        throw new UnsupportedOperationException("TODO");
    }
}
