package org.testmaven.createjarfile;

public class Test {
    public static void main(String[] args) {
        String string = "234234";

        /*Check for integer variable*/
        int integerString = 0;
        boolean temp;
        temp = checkString(string);
        if (temp) {
            integerString = Integer.parseInt(string);
        }
        System.out.println(integerString);

        /*Swap variables*/
        int a = 7;
        int b = 10;
        System.out.println("this is a: "+a+" this is b: "+b);
        a=a+b-(b=a);
        System.out.println("this is a: "+a+" this is b: "+b);

        /*Write program, with output on display integer from 1 to 100.
        * instead of numbers divisible by three, the program should show the word Fizz,
        * and instead of numbers divisible by five, the program should show the word Buzz.
        * If word divisible by fifteen the program should show the word FizzBuzz.*/
        for (int i = 1; i < 101; i++) {
            boolean boolThree = i%3==0;
            boolean boolFive = i%5==0;
            String iterator = String.valueOf(i);
            String fizz = "Fizz";
            String bizz = "Bizz";
            if (i%3!=0) fizz = ""; else iterator = "";
            if (i%5!=0) bizz = ""; else iterator = "";
                System.out.println(iterator+fizz+bizz);

        }
    }

    public static boolean checkString(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
