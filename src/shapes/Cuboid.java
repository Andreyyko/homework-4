package shapes;

import Vertices.Vertices3;

import java.util.Arrays;

public class Cuboid extends SpaceShape {
    private double height;
    private double width;
    private double depth;

    public Cuboid(Vertices3 point, double height, double width, double depth) {
        super(point);
        this.width = width;
        this.height = height;
        this.depth = depth;
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

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public double getArea() {
        return 2 * (width * depth + depth * height + width * height);
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                ", point=" + Arrays.toString(vertices) +
                super.getAreaAndVolume() +
                '}';
    }
}
