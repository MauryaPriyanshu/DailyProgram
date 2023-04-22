package Multitreading.priyanshu.com;

// area of Rectange : length * width
public class Rectange extends Shape{
    Rectange(int dim1, int dim2, int dim3){
        super(dim1,dim2,dim3);

    }
public int area(){
     return this.dim1*this.dim2;
}
public int  volume(){
        return this.dim1*this.dim2*this.dim3;
}
}
