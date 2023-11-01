public class Complex {
    private int re;
    private int im;

    public Complex(int re, int im) {
        this.re = re;
        this.im = im;
    }

    public Complex() {
        this(0, 0);
    }

    public Complex add(Complex second) {
        return new Complex(this.re + second.re, this.im + second.im);
    }

    public Complex substract(Complex second) {
        return new Complex(this.re - second.re, this.im - second.im);
    }

    public Complex multiplyScalar(int scalar) {
        return new Complex(this.re * scalar, this.im * scalar);
    }

    public Complex multiplyComplex(Complex second) {
        int newRe = this.re * second.re - this.im * second.im;
        int newIm = this.re * second.im + this.im * second.re;
        return new Complex(newRe, newIm);
    }

    @Override
    public String toString() {
        String reString = this.re != 0 ? String.valueOf(this.re) : "";
        reString += !reString.isEmpty() && this.im != 0 ? " + " : "";
        String imString = this.im != 0 ? this.im + "i" : "";
        if (this.re == 0 && this.im == 0) {
            return "0";
        }
        return reString + imString;
    }
}