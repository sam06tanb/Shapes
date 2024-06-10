package entities;

public class Circle implements Shape {

    private final double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }



}
