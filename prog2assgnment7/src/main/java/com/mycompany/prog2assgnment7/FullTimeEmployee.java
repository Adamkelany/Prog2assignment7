/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog2assgnment7;

/**
 *
 * @author AGHA SMART STORE
 */
class FullTimeEmployee implements Employee {
    
    private int id;
    private String name;
    private double monthlySalary;
    
    public FullTimeEmployee(int id, String name, double monthlySalary) {
        this.id = id;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }
    
    public double calculateSalary() {
        return monthlySalary;
    }
    
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + monthlySalary);
    }
}
