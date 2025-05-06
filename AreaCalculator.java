public class AreaCalculator {

    // Area of Circle
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Area of Rectangle
    public double area(double length, double width) {
        return length * width;
    }

    // Area of Triangle
    public double area(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        } else {
            return base * height;
        }
    }

    // Area of Square
    public int area(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();

        System.out.println("Area of Circle: " + calc.area(5.0));                   // Circle
        System.out.println("Area of Rectangle: " + calc.area(4.0, 6.0));           // Rectangle
        System.out.println("Area of Triangle: " + calc.area(4.0, 5.0, true));      // Triangle
        System.out.println("Area of Square: " + calc.area(4));                     // Square
    }
}

