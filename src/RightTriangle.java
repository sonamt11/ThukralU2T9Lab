public class RightTriangle {

    //instance variables
    private double base;
    private double height;

    //constructor with base and height parameters
    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    //returns the length of the hypotenuse using the Pythagorean Theorem
    public double hypotenuse() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }
}
