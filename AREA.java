

package ue.area;

import java.util.Scanner;
public class AREA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        CIRCLE circle = new CIRCLE(radius);
      //  quadraticEquation root = new quadraticEquation(a,b,c);

        double area = circle.calculateArea();
        double circumference = circle.calculateCircumference();        

        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);
        
        System.out.print("Enter the coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the coefficient c: ");
        double c = scanner.nextDouble();

        quadraticEquation equation = new    quadraticEquation(a, b, c);
        equation.calculateRoots();
    }
}
        
    



    

