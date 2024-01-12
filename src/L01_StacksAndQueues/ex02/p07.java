package L01_StacksAndQueues.ex02;

import java.util.ArrayDeque;
import java.util.Scanner;

import static java.lang.System.in;

public class p07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder text = new StringBuilder();
        //TEMP
        //text.append("abc");
        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> removedText = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String commandFull = scanner.nextLine();
            String command = commandFull.split(" ")[0];

            switch (command){
                case "1":
                    String textToAdd = commandFull.split(" ")[1];
                    stack.push(commandFull);
                    text = add(text, textToAdd);
                    //System.out.println(text);
                    break;
                case "2":
                    stack.push(commandFull);
                    int countToDelete = Integer.parseInt(commandFull.split(" ")[1]);

                    saveDeletedText(text, removedText, countToDelete);


                    text = remove(text, countToDelete);
                    //System.out.println(text);
                    break;
                case "3":
                    int index = Integer.parseInt(commandFull.split(" ")[1]);
                    System.out.println(text.charAt(index -1));
                    break;
                case "4":
                    String commandUndoFull = stack.pop();
                    String commandToUndo = commandUndoFull.split(" ")[0];

                    if (commandToUndo.equals("1")) {
                        String textToDelete = commandUndoFull.split(" ")[1];
                        text = remove(text, textToDelete.length());
                        //System.out.println(text);
                    } else {
                        //int restoreCount = Integer.parseInt(commandUndoFull.split(" ")[1]);
                        text = add(text, removedText.pop());
                        //System.out.println(text);

                    }

                    break;
            }

        }
    }

    private static void saveDeletedText(StringBuilder text, ArrayDeque<String> removedText, int countToDelete) {
        String newText = text.toString();
        newText = newText.substring(newText.length() - countToDelete);
        removedText.push(newText);
    }


    private static StringBuilder remove(StringBuilder text, int countToDelete) {
        int textLength = text.length();

        for (int i = 1; i <= countToDelete; i++) {
            text.deleteCharAt(text.length() - 1);
        }

        return text;
    }

    private static StringBuilder add(StringBuilder text, String textToAdd) {
        return text.append(textToAdd);
    }


}
