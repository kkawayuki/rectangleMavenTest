package rectangle;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be positive");
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean isSquare() {
        return width == height;
    }

    @Override
    public String toString() {
        return "Rectangle[width=" + width + ", height=" + height + "]";
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(3, 3);
        Rectangle r3 = new Rectangle();

        for (Rectangle r : new Rectangle[] { r1, r2, r3 }) {
            System.out.println(r);
            System.out.println("  Area:      " + r.getArea());
            System.out.println("  Perimeter: " + r.getPerimeter());
            System.out.println("  Is square: " + r.isSquare());
        }

        r1.setWidth(10);
        System.out.println("After resizing r1: " + r1 + ", area = " + r1.getArea());
    }
}
