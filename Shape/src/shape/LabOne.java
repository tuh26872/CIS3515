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
public class LabOne 
{
    public static void main (String[] args)
    {
        Square square = new Square("square");
        square.setDimensions(2.0,2.0);
        System.out.println("Square name is: " + square.getName());
        square.printDimensions();
        System.out.println("Area of Square is: " + square.getArea());
        System.out.println("");
        
        Circle circle = new Circle("circle");
        circle.setDimensions(2.0);
        System.out.println("Circle name is: " + circle.getName());
        circle.printDimensions();
        System.out.println("Area of Circle is: " + circle.getArea());
        System.out.println("");
        
        Triangle triangle = new Triangle("triangle");
        triangle.setDimensions(3.0,4.0,5.0);
        System.out.println("Triangle name is: " + triangle.getName());
        triangle.printDimensions();
        System.out.println("Area of Triangle is: " + triangle.getArea());
        System.out.println("");
        
        EquilateralTriangle eq = new EquilateralTriangle("eq");
        eq.setDimensions(2.0);
        System.out.println("EquilateralTriangle name is: " + eq.getName());
        eq.printDimensions();
        System.out.println("Area of EquilateralTriangle is: " + eq.getArea());
        
        
    }
    
}
