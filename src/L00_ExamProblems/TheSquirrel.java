package L00_ExamProblems;

import java.util.Scanner;

import static java.lang.System.in;

public class TheSquirrel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int size = Integer.parseInt(scanner.nextLine());
        String[] commands = scanner.nextLine().split(", ");

        int hazelnut = 0;

        char[][] field = new char[size][size];

        int squirrelRow = 0;
        int squirrelCol = 0;


        // FILL
        for (int row = 0; row < field.length; row++) {
            String line = scanner.nextLine();

            for (int col = 0; col < field[row].length; col++) {
                field[row][col] = line.charAt(col);

                if (line.charAt(col) == 's') {
                    squirrelRow = row;
                    squirrelCol = col;
                }
            }
        }
        // FILLED

//            • You win if the squirrel collects 3 of the hazelnuts.
//            • The squirrel collects less than 3 hazelnuts.
//            • The squirrel steps on a trap.
//            • The squirrel moves out of the field.


        for (String move : commands) {

            switch (move) {
                case "left":

                    if (squirrelCol == 0) {
                        System.out.println("The squirrel is out of the field.");
                        System.out.printf("Hazelnuts collected: %d", hazelnut);
                        return;
                    } else if (field[squirrelRow][squirrelCol-1] == 't') {
                        System.out.println("Unfortunately, the squirrel stepped on a trap...");
                        System.out.printf("Hazelnuts collected: %d", hazelnut);
                        return;
                    } else {
                        field[squirrelRow][squirrelCol] = '*';
                        if (field[squirrelRow][squirrelCol-1] == 'h') {
                            hazelnut++;
                        }
                        field[squirrelRow][squirrelCol-1] = 's';
                        squirrelCol--;
                    }

                    break;
                case "right":
                    if (squirrelCol == field.length - 1) {
                        System.out.println("The squirrel is out of the field.");
                        System.out.printf("Hazelnuts collected: %d", hazelnut);
                        return;
                    } else if (field[squirrelRow][squirrelCol+1] == 't'){
                        System.out.println("Unfortunately, the squirrel stepped on a trap...");
                        System.out.printf("Hazelnuts collected: %d", hazelnut);
                        return;
                    } else {
                        field[squirrelRow][squirrelCol] = '*';
                        if (field[squirrelRow][squirrelCol+1] == 'h') {
                            hazelnut++;
                        }
                        field[squirrelRow][squirrelCol+1] = 's';
                        squirrelCol++;
                    }


                    break;
                case "up":

                    if (squirrelRow == 0) {
                        System.out.println("The squirrel is out of the field.");
                        System.out.printf("Hazelnuts collected: %d", hazelnut);
                        return;
                    } else if (field[squirrelRow-1][squirrelCol] == 't'){
                        System.out.println("Unfortunately, the squirrel stepped on a trap...");
                        System.out.printf("Hazelnuts collected: %d", hazelnut);
                        return;
                    } else {
                        field[squirrelRow][squirrelCol] = '*';
                        if (field[squirrelRow-1][squirrelCol] == 'h') {
                            hazelnut++;
                        }
                        field[squirrelRow-1][squirrelCol] = 's';
                        squirrelRow--;
                    }

                    break;
                case "down":
                    if (squirrelRow == field.length - 1) {
                        System.out.println("The squirrel is out of the field.");
                        System.out.printf("Hazelnuts collected: %d", hazelnut);
                        return;
                    } else if (field[squirrelRow+1][squirrelCol] == 't'){
                        System.out.println("Unfortunately, the squirrel stepped on a trap...");
                        System.out.printf("Hazelnuts collected: %d", hazelnut);
                        return;
                    } else {
                        field[squirrelRow][squirrelCol] = '*';
                        if (field[squirrelRow+1][squirrelCol] == 'h') {
                            hazelnut++;
                        }
                        field[squirrelRow+1][squirrelCol] = 's';
                        squirrelRow++;
                    }
                    break;
            }




        }

        if (hazelnut == 3) {
            System.out.println("Good job! You have collected all hazelnuts!");
        } else {
            System.out.println("There are more hazelnuts to collect.");
        }
        System.out.printf("Hazelnuts collected: %d", hazelnut);
    }
}
