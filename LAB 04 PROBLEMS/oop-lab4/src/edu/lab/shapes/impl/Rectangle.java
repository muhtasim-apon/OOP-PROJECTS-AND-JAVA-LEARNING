package edu.lab.shapes.impl;
import edu.lab.shapes.api.Shape;

public class Rectangle implements Shape {
    private double width, height;
    public Rectangle(double width, double height){ this.width=width; this.height=height; }
    public double getWidth(){ return width; }
    public double getHeight(){ return height; }

    @Override public double area(){
        // TODO: w * h
        throw new UnsupportedOperationException("TODO");
    }
    @Override public double perimeter(){
        // TODO: 2*(w+h)
        throw new UnsupportedOperationException("TODO");
    }
    @Override public String toString(){
        // TODO: "Rectangle{w=.., h=.., area=.., perim=..}"
        throw new UnsupportedOperationException("TODO");
    }
}
