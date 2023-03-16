package shapes;

import Vertices.Vertices2;
import interfaces.AreaMeasurable;
import interfaces.PerimeterMeasurable;

public class PlaneShape extends Shape implements PerimeterMeasurable , AreaMeasurable {
    protected PlaneShape(Vertices2... vertices) {
        super(vertices);
    }

    public String getAreaAndPerimeter() {
        return " Area = " + getArea() + ", Volume = " + getPerimeter();
    }


    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
