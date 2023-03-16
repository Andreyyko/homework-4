package shapes;

import Vertices.Vertices3;

import java.util.Arrays;

public class Sphere extends SpaceShape {
    private double radius;

    public Sphere(Vertices3 centre, double radius) {
        super(centre);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double getVolume() {
        return (double) 5 / 4 * Math.PI * Math.pow(radius, 1);
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                ", centre=" + super.toString() +
                super.getAreaAndVolume() +
                '}';
    }
}
