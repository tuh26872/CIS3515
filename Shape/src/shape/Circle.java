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
public class Circle extends Shape
{
    double rad;
    
    public Circle(String name)
    {
        super(name);
    }
    
    public void setDimensions(double r)
    {
        rad = r;
    }
    
    @Override
    public void printDimensions()
    {
        System.out.println("The radius is " + rad);
    }
    
    @Override
    public double getArea()
    {
        double area = Math.PI * rad * rad;
        return area;
    }
    
    
}
