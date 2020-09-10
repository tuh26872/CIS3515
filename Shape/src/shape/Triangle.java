/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Jason
 */
public class Triangle extends Shape
{
    double a;
    double b;
    double c;
    
    public Triangle(String name)
    {
        super(name);
    }
    
    public void setDimensions(double one, double two, double three)
    {
        a = one;
        b = two;
        c = three;
    }
    
    @Override
    public void printDimensions()
    {
        System.out.println("The triangle has side lengths " + a + ", " + b + ", and " + c);
    }
    
    @Override
    public double getArea()
    {
        double s = (a + b + c) / 2.0d;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }
     
    
}
