package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        executeOperations();
    }

    public static void executeOperations() {
        HealthPlan healthPlan = new HealthPlan(1, "MyHealthPlan", Plan.BASIC);
        System.out.println(healthPlan.toString());

        Employee employee = new Employee(1, "John Doe", "john@example.com", "password123", new String[3]);
        System.out.println(employee.toString());

        Company company = new Company(1, "Example Inc.", 10000.0, new String[10]);
        System.out.println(company.toString());
    }
}