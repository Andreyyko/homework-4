package shapes;

import Vertices.Vertices3;

import java.util.Arrays;

public class SquarePyramid extends SpaceShape {
    private double width;
    private double height;

    public SquarePyramid(Vertices3 baseCentre, double width, double height) {
        super(baseCentre);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        double heightSlant = Math.sqrt(Math.pow(height, 2) + Math.pow(width / 2, 2));
        double triangleSquare = 0.5 * heightSlant * width;
        return 4 * triangleSquare;
    }
    private double calculateBaseArea() {
        return width * width;
    }

    public double getVolume() {
        return calculateBaseArea() * height / 3;
    }

    @Override
    public String toString() {
        return "SquarePyramid{" +
                "width=" + width +
                ", height=" + height +
                ", centre=" + super.toString() +
                super.getAreaAndVolume() +
                '}';
    }
}
