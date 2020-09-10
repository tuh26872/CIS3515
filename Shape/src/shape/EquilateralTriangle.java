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
public class EquilateralTriangle extends Triangle
{
    double side;
    
    public EquilateralTriangle (String name)
    {
        super(name);
    }
    
    public void setDimensions(double s)
    {
        side = s;
    }
    
    @Override
    public void printDimensions()
    {
        System.out.println("The triangle has 3 sides of length " + side);
    }
    
    @Override
    public double getArea()
    {
        double perimeter = (side * 3) / 2.0d;
        double area = Math.sqrt(perimeter * (perimeter - side) * (perimeter - side) * (perimeter - side));
        return area;
    }
}
