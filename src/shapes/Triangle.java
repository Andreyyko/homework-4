package shapes;

import Vertices.Vertices2;

import java.util.Arrays;

public class Triangle extends PlaneShape {


    public Triangle(Vertices2 a, Vertices2 b, Vertices2 c) {
        super(a, b, c);


    }

    private double distanceCalculate(Vertices2 X1, Vertices2 X2) {
        return Math.sqrt(Math.pow((X2.getX() - X1.getX()), 2) + Math.pow((X2.getY() - X1.getY()), 2));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "vertices=" + super.toString() +
                super.getAreaAndPerimeter() +
                '}';
    }

    public double getArea() {

        double HeronsFormula = getPerimeter() / 2;
        double oppositeA = distanceCalculate(vertices[1], vertices[2]);
        double oppositeB = distanceCalculate(vertices[0], vertices[2]);
        double oppositeC = distanceCalculate(vertices[1], vertices[2]);
        return Math.sqrt(HeronsFormula * (HeronsFormula - oppositeA) * (HeronsFormula - oppositeB) * (HeronsFormula - oppositeC));
    }

    public double getPerimeter() {
        return distanceCalculate(vertices[0], vertices[1]) + distanceCalculate(vertices[1], vertices[2]) + distanceCalculate(vertices[0], vertices[2]);
    }
}
