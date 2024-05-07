/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog2assgnment7;

/**
 *
 * @author AGHA SMART STORE
 */
class ContractEmployee implements Employee {
    private int id;
    private String name;
    private double totalSalary;
    private int durationInDays; 
    
    public ContractEmployee(int id, String name, double totalSalary, int durationInDays) {
        this.id = id;
        this.name = name;
        this.totalSalary = totalSalary;
        this.durationInDays = durationInDays;
    }
    
    public double calculateSalary() {
        return totalSalary;
    }
    
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Duration: " + durationInDays + " days");
        System.out.println("Salary: $" + totalSalary );
    }
}