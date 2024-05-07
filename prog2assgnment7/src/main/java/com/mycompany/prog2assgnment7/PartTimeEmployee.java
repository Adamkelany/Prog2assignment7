/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog2assgnment7;

/**
 *
 * @author AGHA SMART STORE
 */
class PartTimeEmployee implements Employee {
    private int id;
    private String name;
    private double hourlyRate;
    private int hoursWorked;
    
    public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        this.id = id;
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
    
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + calculateSalary());
    }
}
