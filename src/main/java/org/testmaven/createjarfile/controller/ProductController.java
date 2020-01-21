package org.testmaven.createjarfile.controller;
import org.testmaven.createjarfile.model.Product;
import org.testmaven.createjarfile.utils.CreateObject;
import org.testmaven.createjarfile.view.ProductShow;

public class ProductController {

    public void listProduct () {
        Product [] products = CreateObject.getProducts();
        ProductShow productShow = new ProductShow();
        productShow.listAllProduct(products);
    }

    public void showProduct () {
        Product [] products = CreateObject.getProducts();
        ProductShow productShow = new ProductShow();
        productShow.showProduct(products);
    }
}
