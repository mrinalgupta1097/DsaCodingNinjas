package DSA.Milestone3.OOPS1;

public class ComplexNumber {
    private int real;
    private int imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void add(ComplexNumber c2){
        int real = this.getReal() + c2.getReal();
        int imaginary = this.getImaginary() + c2.getImaginary();
        this.setReal(real);
        this.setImaginary(imaginary);
    }

    public void multiply(ComplexNumber c2){
        int real = this.getReal() * c2.getReal();
        int imaginary = this.getImaginary() * c2.getImaginary();
        this.setReal(real);
        this.setImaginary(imaginary);
    }
    public void print() {
        System.out.println("complex number is: " + real + " + i" + imaginary);
    }
}
