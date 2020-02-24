package org.testmaven.createjarfile;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        /*ternary operator*/
        int haveMoney = 5000;
        String message = haveMoney > 700 ? "Ok we go to the shop" : "We do not go to the shop";
        System.out.println(message);
        boolean tired = true;
        String mesTwo = haveMoney > 700 & tired ? "And We go to the party" : "Or maybe we stay home";
        System.out.println(mesTwo);

        /*Testing GURU*/
        int [][] arrayDimension = {{1,4,7,5}, {9,2,0,2},{3,8,9,4}};
        int search = 8;
        GURU:
        for (int i=0;i<arrayDimension.length;i++){
            for (int j=0;j<arrayDimension[i].length;j++){
                if (arrayDimension[i][j] == search){
                    System.out.println("Found " + search + " at position " + i + "," + j);
                    break GURU;
                }
            }
        }



    }
}