package temp.Line;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String example = "helo";
        Set<Integer> set = new HashSet<>();
        set.add(1);


        Line newLine = new Line();




        // simulation of object method
        // assumed "empty" Line , size 0
        char[] myArray = new char[0];
        //myArray[0] = 'a';


        String input = scanner.nextLine();

        while (!input.equals("end")){
            char charToAdd = input.charAt(0);

            if (myArray.length == 0){
                myArray = new  char[1];
                myArray[0] = charToAdd;
                //empty
            } else {
                //has at least 1 char

                int arrayLastIndex = myArray.length -1;


                // making a temp array, 1 cell bigger
                char[] tempArray = new char[myArray.length + 1];

                // copy elements from old array to new one
                for (int i = 0; i <= arrayLastIndex; i++) {
                    tempArray[i] = myArray[i];
                }

                // resize old array, to match new array
                myArray = new char[myArray.length + 1];
                // update index
                arrayLastIndex = myArray.length -1;

                // full the old array
                for (int i = 0; i <= arrayLastIndex; i++) {
                    myArray[i] = tempArray[i];
                }
                myArray[arrayLastIndex] = charToAdd;
            }

            // debug print
            for (char c : myArray) {
                System.out.print(c);
            }
            System.out.println();
            System.out.println(myArray.length);
            //System.out.println(Arrays.toString(myArray).replaceAll("[\\[\\]]", ""));


            input = scanner.nextLine();
        }
        //end of sim








    }
}