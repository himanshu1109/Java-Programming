class Complex{
    public double realPart;
    public double imaginaryPart;

    public Complex(){
        realPart = 0;
        imaginaryPart = 0;
    }

    public Complex(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Complex add(Complex num){
        Complex result = new Complex();
        result.realPart = num.getRealPart() + this.getRealPart();
        result.imaginaryPart = num.getImaginaryPart() + this.getImaginaryPart();
        return result;
    }

    public Complex subtract(Complex num){
        Complex result = new Complex();
        result.realPart = num.getRealPart() - this.getRealPart();
        result.imaginaryPart = num.getImaginaryPart() - this.getImaginaryPart();
        return result;
    }

    public Complex multiply(Complex num){
        Complex result = new Complex();
        result.realPart = num.getRealPart()* this.getRealPart() - num.getImaginaryPart()*this.getImaginaryPart();
        result.imaginaryPart = num.getImaginaryPart()*this.getRealPart() + this.getImaginaryPart()*num.getRealPart();
        return result;
    }

    public Complex divide(Complex num){
        Complex result = new Complex();
        result.realPart = (((this.getRealPart() * num.getRealPart()) + (this.getImaginaryPart() * num.getImaginaryPart())) / (Math.pow(num.getRealPart(), 2) + Math.pow(num.getImaginaryPart(), 2)));
        result.imaginaryPart = (((this.getRealPart() * num.getImaginaryPart()) - (this.getImaginaryPart() * num.getRealPart())) / (Math.pow(num.getRealPart(), 2) + Math.pow(num.getImaginaryPart(), 2)));
        return result;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public String toString(){
        return realPart + "+" + imaginaryPart + "i";
    }
}

public class ComplexDemo {
    public static void main(String[] args) {
        Complex c1 = new Complex(1, 2);
        System.out.println("Complex Number 1 is : " + c1);
        Complex c2 = new Complex(2, 1);
        System.out.println("Complex Number 2 is : " + c2);
        Complex cAdd = c1.add(c2);
        System.out.println("Complex Number Add is : " + cAdd);
        Complex cSubtract = c1.subtract(c2);
        System.out.println("Complex Number Subtract is : " + cSubtract);
        Complex cMultiply = c1.multiply(c2);
        System.out.println("Complex Number Multiply is : " + cMultiply);
        Complex cDivide = c1.divide(c2);
        System.out.println("Complex Number Divide is : " + cDivide);
    }
}
