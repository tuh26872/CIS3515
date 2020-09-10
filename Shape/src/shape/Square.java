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
public class Square extends Shape
{
    double length;
    double width;
    
    public Square(String name)
    {
        super(name);
    }
    
    public void setDimensions(double l, double w)
    {
        length = l;
        width = w;
    }
    
    @Override
    public void printDimensions()
    {
        System.out.println("The square has length " + length + " and width " + width);
    }
    
    @Override
    public double getArea()
    {
        double area = length * width;
        return area;
    }
    
    /*
    public static void main (String[] args)
    {
        Square s = new Square("yuh");
        // System.out.println(s.getName());
        s.setDimensions(2.0, 2.0);
        // s.printDimensions();
        //System.out.println("" + s.getArea());      
    }
    */
}
