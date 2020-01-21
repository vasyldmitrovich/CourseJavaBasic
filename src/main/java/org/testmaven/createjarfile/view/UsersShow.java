package org.testmaven.createjarfile.view;

import org.testmaven.createjarfile.model.Product;
import org.testmaven.createjarfile.model.Users;
import org.testmaven.createjarfile.utils.CreateObject;

public class UsersShow {

    public void showUser(Users user) {
        System.out.println(user);
    }

    public void firstMessage (Users user) {
        System.out.println("\t \t \t \t Hello: "+user.getName()+"\t Your balance is: "+user.getBalance()+
                "\t You spend: "+user.getSpend());
    }

    public void replaceBalanceToSpend (Users user, Product [] products, int productNumber) {
        System.out.println(user.getName()+" is buy  "+products[productNumber].getManufacturer()+
                " by "+products[productNumber].getPrice()+". Your product was sent to the warehouse");
    }

    public void printDoNot () {
        System.out.println("You do not have enough money, choice another product");
    }

    public void printDoNotExist () {
        System.out.println("This product do not exist. Please choice product which we offers");
    }
}
