package Circle;

import java.util.Comparator;

public class ComparatorCircle extends Circle implements Comparator<Circle> {
    public ComparatorCircle() {
    }

    public ComparatorCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return getRadius()+","+getColor()+","+isFilled();
    }
}
