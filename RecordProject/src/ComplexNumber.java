import com.sun.source.tree.BreakTree;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber (double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal(){
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary){
         this.real = real + this.real;
         this.imaginary = imaginary + this.imaginary;

    }

    public void add(ComplexNumber one){
//        double y = ((one.real + this.real) + (one.imaginary + this.imaginary));
//        return y;
        this.add(one.getReal(),one.getImaginary());
    }

    public void subtract(double real, double imaginary){
        this.real = this.real - real;
        this.imaginary = this.imaginary - imaginary;
    }

    public void subtract(ComplexNumber two){
        subtract(two.getReal(),two.getImaginary());
    }
}
