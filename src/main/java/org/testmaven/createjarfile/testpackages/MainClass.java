package org.testmaven.createjarfile.testpackages;

import org.testmaven.createjarfile.testpackages.box.Box;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MainClass {
    /*Testing some interesting moment*/
    public static void main(String[] args) {
        SomeInterfaceImpl someInterface = new SomeInterfaceImpl();
        someInterface.printSome();

        Collection<Double> collection = new ArrayList<>();
        collection.add(22.8);
        collection.add(58.6);
        List<Double> list = (List<Double>) collection;
        ArrayList<Double> arrayList = (ArrayList<Double>) list;
        for (Double d: arrayList
             ) {
            System.out.println(d+" this is array list from interface Collection across List.");
        }

        /*Work with Box*/
        Box emptyBox = new Box();
        Box smallBox = new Box(10,11);
        Box middleBox = new Box(20,25);
        Box bigBox = new Box(44,10);
        Box theBiggestBox = new Box(288,400);
        Box[] arrayBox = {emptyBox,smallBox,theBiggestBox,bigBox,middleBox};
        for (Box b: arrayBox
             ) {
            System.out.println("Before sorting: "+b);
        }
        Arrays.sort(arrayBox);
        for (Box b: arrayBox
             ) {
            System.out.println("After sorting: "+b);
        }
        /*write box*/
            try {
                FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/box/box.txt");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(middleBox);
                objectOutputStream.writeObject(smallBox);
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (Exception ex){
                ex.printStackTrace();
            }
        /*read box*/
        Box box;
            try {
                File fileDir = new File("src/main/resources/box/box1.txt");
                FileInputStream fileInputStream = new FileInputStream("src/main/resources/box/box.txt");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                box = (Box) objectInputStream.readObject();
                fileInputStream.close();
                objectInputStream.close();
                System.out.println(box);


            } catch (Exception e){
                e.printStackTrace();
            }


    }
}
