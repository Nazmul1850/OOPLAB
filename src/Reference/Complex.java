package Reference;

public class Complex {
    private double real;
    private double imag;
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex add(Complex z2) {
        Complex result = new Complex(real+z2.real, imag+z2.imag);
        return result;
    }

    public Complex sub(Complex z2) {
        return new Complex(this.real - z2.real, this.imag - z2.imag);
    }

    @Override
    public String toString() {
        return "Complex{" + real + " + " + imag + "i}";
    }
}
