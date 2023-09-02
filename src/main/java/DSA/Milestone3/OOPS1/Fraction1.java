package DSA.Milestone3.OOPS1;

public class Fraction1 {
    private int numerator;
    private int denominator;

    public Fraction1(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    private void simplify() {
        int gcd =1;
        int smaller = Math.min(numerator,denominator);
        for(int i =2;i <=smaller; i++){
            if (numerator%1 ==0 && denominator%i ==0){
                gcd = i;
            }
            numerator = numerator/gcd;
            denominator = denominator/gcd;
        }
    }

    public void print(){
        System.out.println("numerator: " + numerator + ", denominator: " + denominator);
    }


}
