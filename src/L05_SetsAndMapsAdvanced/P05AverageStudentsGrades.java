package L05_SetsAndMapsAdvanced;

import java.util.*;

import static java.lang.System.in;

public class P05AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Map<String, List<Double>> studentsAndGrades = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String studentName = input[0];
            double studentGrade = Double.parseDouble(input[1]);

            if (!studentsAndGrades.containsKey(studentName)){
                //add all
                studentsAndGrades.put(studentName, new ArrayList<>());
                studentsAndGrades.get(studentName).add(studentGrade);
            } else {
                List<Double> tempSet = studentsAndGrades.get(studentName);
                tempSet.add(studentGrade);
                studentsAndGrades.put(studentName, tempSet);
            }

        }

        for (Map.Entry<String, List<Double>> student : studentsAndGrades.entrySet()) {
            System.out.print(student.getKey() + " -> ");
            double gradesSum = 0.0;
            for (Double grade : student.getValue()) {
                System.out.printf("%.2f ", grade);
                gradesSum += grade;

            }
            //int temp = student.getValue().size();
            System.out.printf("(avg: %.2f)\n",gradesSum / student.getValue().size());

        }
    }
}
