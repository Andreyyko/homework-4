package shapes;

import Vertices.Vertices2;
import Vertices.Vertices3;
import interfaces.AreaMeasurable;
import interfaces.VolumeMeasurable;

public class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
    protected SpaceShape(Vertices3... vertices) {
        super(vertices);
    }
    public String getAreaAndVolume() {
        return " Area = " + getArea() + ", Volume = " + getVolume();
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getVolume() {
        return 0;
    }
}
