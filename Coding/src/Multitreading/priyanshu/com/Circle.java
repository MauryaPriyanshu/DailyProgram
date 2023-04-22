package Multitreading.priyanshu.com;

//area of circle is :pi * r * r
public class Circle extends Shape{
    Circle(int dim1,int dim2,int dim3){
       super(dim1,dim2,dim3);
    }
    public double area(){
        return Math.PI* this.dim1*this.dim1;
    }
    public double  volume() {
        return Math.PI*this.dim1 * this.dim1 * this.dim3;
    }
}
