package temp.Line;

import java.util.Arrays;

public class Line {
    private char[] text;

    public Line() {
        this.text = new char[0];
    }

    public Line(char text) {
        this.text = new char[1];
        this.text[0] = text;
    }

    public int length(){
        int counter = 0;

        for (char c : text) {
            counter++;
        }

        return counter;
    }

    public void addChar(char ch){

        if (text.length == 0){
            text = new  char[1];
            text[0] = ch;
            //empty
        } else {
            //has at least 1 char

            int arrayLastIndex = text.length -1;


            // making a temp array, 1 cell bigger
            char[] tempArray = new char[text.length + 1];

            // copy elements from old array to new one
            for (int i = 0; i <= arrayLastIndex; i++) {
                tempArray[i] = text[i];
            }

            // resize old array, to match new array
            text = new char[text.length + 1];
            // update index
            arrayLastIndex = text.length -1;

            // full the old array
            for (int i = 0; i <= arrayLastIndex; i++) {
                text[i] = tempArray[i];
            }
            text[arrayLastIndex] = ch;
        }

    }

    @Override
    public String toString() {
        return Arrays.toString(text).replaceAll("[\\[\\]]", "")
                .replaceAll("(,\\s{1})", "");
    }
// char at
    // length
}
