package DSA.Milestone3.OOPS1;

public class ComplexNumberGenerator {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(2, 3);
        c1.print();
        ComplexNumber c2 = new ComplexNumber(3,5);
        c2.print();

//        c1.add(c2);
        c1.multiply(c2);
        c1.print();
    }
}
