public class ComplexNumber {
    private double real;
    private double imaginary;

    public void add(double real, double imaginary) {
        add(new ComplexNumber(real, imaginary));
    }

    public void add(ComplexNumber complexNumber) {
        real += complexNumber.getReal();
        imaginary += complexNumber.getImaginary();
    }

    public void subtract(double real, double imaginary) {
        subtract(new ComplexNumber(real, imaginary));
    }

    public void subtract(ComplexNumber complexNumber) {
        real -= complexNumber.getReal();
        imaginary -= complexNumber.getImaginary();
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}
