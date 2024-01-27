package temp.Line;

import java.util.Scanner;

import static java.lang.System.in;

public class MainNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        //TODO, add CharAt, replace function

        Line myLine = new Line();
        myLine.addChar('a');
        System.out.println(myLine.length());

        myLine.addChar('a');
        System.out.println(myLine.length());

        myLine.addChar('a');
        System.out.println(myLine.length());
    }
}
