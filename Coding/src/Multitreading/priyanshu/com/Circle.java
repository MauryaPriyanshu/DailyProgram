package Multitreading.priyanshu.com;

//Surface area of cyliender = 2*pi*r*h + 2*pi*r*r
public class Circle extends Shape{
    Circle(int dim1){
       super(dim1,-1);
    }
    public double area(){
        return Math.PI* this.dim1*this.dim2;
    }
}
