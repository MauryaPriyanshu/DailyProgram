package Multitreading.priyanshu.com;

// area of spher : 4* pi * r * r

public class Sphere extends Shape{
    Sphere(int dim1, int dim2, int dim3){
        super(dim1, dim2, dim3);
    }
    public double area(){
        return 4*Math.PI * this.dim1 * this.dim1;
    }
    public double  volume() {
        return 4/3* Math.PI * this.dim1 * this.dim1 * this.dim1 ;
    }
}
