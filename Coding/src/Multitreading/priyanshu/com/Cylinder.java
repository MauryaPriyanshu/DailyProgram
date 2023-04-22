package Multitreading.priyanshu.com;

//Surface area of cyliender = 2*pi*r*h + 2*pi*r*r
public class Cylinder extends Shape{
    Cylinder(int dim1, int dim2, int dim3){
        super(dim1,dim2,dim3);
    }
    public double area(){
        return 2*Math.PI* this.dim1*(this.dim1 + this.dim2);
    }
    public double  volume() {
        return Math.PI*this.dim1 * this.dim1 * this.dim3;
    }
}
