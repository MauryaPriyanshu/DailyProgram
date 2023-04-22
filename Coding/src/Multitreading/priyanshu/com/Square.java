package Multitreading.priyanshu.com;
//area of Square : a*a
public class Square extends Shape {
    Square(int dim1, int dim2, int dim3) {
        super(dim1, dim2, dim3);
    }

    public int area() {
        return this.dim1 * this.dim1;
    }

    public int volume() {
        return this.dim1 * this.dim1 * this.dim1;
    }
}
