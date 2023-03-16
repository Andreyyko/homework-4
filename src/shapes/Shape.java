package shapes;

import Vertices.Vertices2;

import java.util.Arrays;

public abstract class Shape {
    public Vertices2[] vertices;

    Shape(Vertices2... vertices) {
        this.vertices = vertices.clone();
    }


    public String toString() {


        return Arrays.toString(vertices);
    }
}
