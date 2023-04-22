package Multitreading.priyanshu.com;

public class Square extends Shape{
    Square(int dim1, int dim2){
        super(dim1,-1);
    }
    public int area(){
        return this.dim1*this.dim1;
    }
}
