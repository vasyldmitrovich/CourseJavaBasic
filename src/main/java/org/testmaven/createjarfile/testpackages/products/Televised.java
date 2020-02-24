package org.testmaven.createjarfile.testpackages.products;

import java.util.Objects;

public class Televised extends Products {
    private int ScreenDiagonal;

    public Televised(){}

    public Televised(int screenDiagonal) {
        ScreenDiagonal = screenDiagonal;
    }

    public Televised(long id, int price, String manufacturer, int year, int screenDiagonal) {
        super(id, price, manufacturer, year);
        ScreenDiagonal = screenDiagonal;
    }

    public int getScreenDiagonal() {
        return ScreenDiagonal;
    }

    public void setScreenDiagonal(int screenDiagonal) {
        ScreenDiagonal = screenDiagonal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Televised televised = (Televised) o;
        return ScreenDiagonal == televised.ScreenDiagonal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ScreenDiagonal);
    }

    @Override
    public String toString() {
        return "Televised{" +
                "ScreenDiagonal=" + ScreenDiagonal +
                '}';
    }
}
