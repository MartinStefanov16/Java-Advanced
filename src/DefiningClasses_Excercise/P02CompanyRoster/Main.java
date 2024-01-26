package DefiningClasses_Excercise.P02CompanyRoster;

import java.util.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Set<Employee>> employees = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];

            Employee employee;

            switch (input.length) {
                case 4:
                    employee = new Employee(name, salary, position, department);
                    break;
                case 5:
                    if (input[4].contains("@")) {
                        employee = new Employee(name, salary, position, department, input[4]);
                    } else {
                        employee = new Employee(name, salary, position, department, Integer.parseInt(input[4]));
                    }
                    break;
                default:
                    employee = new Employee(name, salary, position, department,input[4], Integer.parseInt(input[5]));
                    break;
            }
            employees.putIfAbsent(department, new TreeSet<>(Comparator.comparing(Employee::getSalary)));

            employees.get(department).add(employee);



            
        }


        double highestSalaryAverage = 0.0;
        String bestDepartment = "";

        for (Map.Entry<String, Set<Employee>> department : employees.entrySet()) {

            double combinedSalary = 0.0;
            for (Employee employee : department.getValue()) {
                combinedSalary+= employee.getSalary();

            }

            combinedSalary /= department.getValue().size();

            if (combinedSalary > highestSalaryAverage) {
                highestSalaryAverage = combinedSalary;
                bestDepartment = department.getKey();
            }
            
        }

        System.out.printf("Highest Average Salary: %s\n",bestDepartment);

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (Map.Entry<String, Set<Employee>> department : employees.entrySet()) {
            if (department.getKey().equals(bestDepartment)) {
                for (Employee employee : department.getValue()) {
                    stack.push(employee.toString());
                }
            }
        }

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
