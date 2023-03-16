package shapes;

import Vertices.Vertices2;

public class Rectangle extends PlaneShape {
    private double height;
    private double width;

    public Rectangle(Vertices2 point, double height, double width) {
        super(point);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return 2 * width * height;
    }@Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", point=" + super.toString() +
                super.getAreaAndPerimeter() +
                '}';
    }
}