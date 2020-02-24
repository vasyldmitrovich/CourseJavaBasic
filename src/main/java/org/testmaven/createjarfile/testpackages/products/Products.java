package org.testmaven.createjarfile.testpackages.products;

import java.util.Objects;

public class Products {
    private long id;
    private int Price;
    private String Manufacturer;
    private int Year;

    public Products(){}

    public Products(long id, int price, String manufacturer, int year) {
        this.id = id;
        Price = price;
        Manufacturer = manufacturer;
        Year = year;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return id == products.id &&
                Price == products.Price &&
                Year == products.Year &&
                Objects.equals(Manufacturer, products.Manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Price, Manufacturer, Year);
    }
}
