package lab15.sict.must.edu.mn;

public class Multiplication {
    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiplyByZero(int a) {
        return multiply(a, 0);
    }

    public int multiplyNegative(int a, int b) {
        return multiply(a, -b);
    }
}
