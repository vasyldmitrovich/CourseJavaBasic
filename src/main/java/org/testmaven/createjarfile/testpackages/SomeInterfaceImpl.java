package org.testmaven.createjarfile.testpackages;

public class SomeInterfaceImpl implements SomeInterface{
    /*Only for testing interface*/
    @Override
    public void printSome() {
        System.out.println("this is some plus: "+blablabla+" this number from interface");
    }
}
