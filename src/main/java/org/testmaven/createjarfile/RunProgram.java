package org.testmaven.createjarfile;

import org.testmaven.createjarfile.controller.ProductController;
import org.testmaven.createjarfile.controller.UsersController;
import org.testmaven.createjarfile.model.Product;
import org.testmaven.createjarfile.model.Users;
import org.testmaven.createjarfile.utils.CreateObject;
import org.testmaven.createjarfile.view.UsersShow;

import java.util.Scanner;

public class RunProgram {
    
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.listProduct();
        UsersController usersController = new UsersController();
        usersController.showUser();
        while (true) {
            usersController.firstMessage();
            productController.showProduct();
            int productNumber = inputNumber();
            usersController.replaceBalanceToSpend(productNumber);
        }
    }

    public static int inputNumber(){
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        return result;
    }
}
