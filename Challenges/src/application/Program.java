package application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();


        for(int i = 0; i < n; i ++){
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);
                
            list.add(emp);
        
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int employeeId = sc.nextInt();

        Employee id = list.stream().filter(x -> x.getId() == employeeId).findFirst().orElse(null);
        if(id == null){
            System.out.println("This id does not exist!");
        }
        else{
            System.out.print("Enter the percentage: ");
            Double percentage = sc.nextDouble();
            id.increaseSalary(percentage);
            System.out.println("List of employees");
            for(Employee emp : list){
                System.out.println(emp);
            } 
        }

        sc.close();
    }
}