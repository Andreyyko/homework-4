package shapes;

import Vertices.Vertices2;



public class Circle extends PlaneShape{

    private double radius;
    public Circle(Vertices2 o, double radius) {
        super(o);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return 2 * Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", centre=" + super.toString() +
                super.getAreaAndPerimeter() +
                '}';
    }
}
