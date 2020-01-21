package org.testmaven.createjarfile.controller;
import org.testmaven.createjarfile.model.Product;
import org.testmaven.createjarfile.model.Users;
import org.testmaven.createjarfile.utils.CreateObject;
import org.testmaven.createjarfile.view.UsersShow;

public class UsersController {

    public void showUser() {
        Users user = CreateObject.getUsers();
        UsersShow usersShow = new UsersShow();
        usersShow.showUser(user);
    }

    public void replaceBalanceToSpend (int productNumber) {
        Users user = CreateObject.getUsers();
        Product[] products = CreateObject.getProducts();
        UsersShow usersShow = new UsersShow();
        if (productNumber >=0 && productNumber < products.length) {
            if (products[productNumber].getPrice() < user.getBalance()) {
                double temp = products[productNumber].getPrice();
                user.ReduceBalance(temp);
                usersShow.replaceBalanceToSpend(user,products,productNumber);
            }
            else {
                usersShow.printDoNot();
            }
        }
        else {
            usersShow.printDoNotExist();
        }
        CreateObject createObject = new CreateObject();
        createObject.setUsers(user);
    }

    public void firstMessage() {
        Users user = CreateObject.getUsers();
        UsersShow usersShow = new UsersShow();
        usersShow.firstMessage(user);
    }
}
