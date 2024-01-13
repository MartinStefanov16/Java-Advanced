package L05_SetsAndMapsAdvanced;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P08AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsAndGrades = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();


            List<Double> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .map(Double::parseDouble)
                    .collect(Collectors.toList());

            studentsAndGrades.put(name, list);



        }

        for (Map.Entry<String, List<Double>> student : studentsAndGrades.entrySet()) {
            System.out.printf("%s is graduated with ", student.getKey());
            double gradeSum = 0.0;
            for (Double grades : student.getValue()) {
                gradeSum += grades;

            }
            int longy = student.getValue().size();
            System.out.println(gradeSum / longy);

        }
        

    }
}
