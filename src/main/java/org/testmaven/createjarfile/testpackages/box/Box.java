package org.testmaven.createjarfile.testpackages.box;

import java.io.Serializable;
import java.util.Objects;

public class Box implements Comparable<Box>, Serializable {
    /*Describe simple box */
    private static final long serialVersionUID = 1L;
    double width;
    double length;

    public Box(){}

    public Box(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    private double getArea(){
        return getWidth()*getLength();
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return Double.compare(box.width, width) == 0 &&
                Double.compare(box.length, length) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length);
    }

    @Override
    public int compareTo(Box box) {
        return Double.compare(getArea(),box.getArea());
    }
}
