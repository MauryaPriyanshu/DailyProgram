package Multitreading.priyanshu.com;

public class Solution {
    public static void main(String[] args){
        Rectange r = new Rectange(2,3,4);
        System.out.println("Area of rectange is " + r.area());
        System.out.println("Volume of rectange is " + r.volume());

        Circle c = new Circle(2,3,4);
        System.out.println("Area of circle is " +c.area());
        System.out.println("Volume of circle is " + c.volume());

        Cylinder cy = new Cylinder(7,3,1);
        System.out.println("Area of cylinder is " + cy.area());
        System.out.println("Volume of cylinder is " + cy.volume());

        Sphere sp = new Sphere(5,4,1);
        System.out.println("Area of sphere is "+ sp.area());
        System.out.println("Volume of sphere is " + sp.volume());

        Square sq = new Square(3,0,1);
        System.out.println("Area of square is "+ sq.area());
        System.out.println("Volume of square is " + sq.volume());
    }
}
