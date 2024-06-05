public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary; // Initialize imaginary field
    }
    
    public ComplexNumber add(ComplexNumber other) {
        // Perform addition without modifying the current object
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }
    public String toString() {
        return real + " + " + imaginary + "i";
    }
        public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(3, 2);
        ComplexNumber num2 = new ComplexNumber(1, -4);
        ComplexNumber sum = num1.add(num2);
        System.out.println("Sum of the Complex Numbers: " + sum);
    }
}
/*The constructor of the ComplexNumber class doesn't initialize the imaginary field.
 * The add method contains a division by zero, which will cause a runtime error.
 * The add method modifies the current object's state, which is not typical for an addition operation on immutable objects.
 */