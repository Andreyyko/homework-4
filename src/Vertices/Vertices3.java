package Vertices;

public class Vertices3 extends Vertices2{
    double x;
    double y;
    double z;

    public Vertices3(double x, double y, double z) {
        super(x , y);
        this.z = z;

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vertices3{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
