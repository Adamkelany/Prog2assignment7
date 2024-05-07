/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog2assgnment7;

/**
 *
 * @author AGHA SMART STORE
 */
public class Prog2assgnment7 {

    public static void main(String[] args) {
        
        FullTimeEmployee Employee1 = new FullTimeEmployee(101,"Adam",5000.00);
        PartTimeEmployee Employee2 = new PartTimeEmployee(201,"Ahmed",20.00,25);
        ContractEmployee Employee3 = new ContractEmployee(301,"Kelany",3000.00,20);

        System.out.println("Full-Time Employee Details:");
        System.out.println("Calculated Salary: $" + Employee1.calculateSalary());
        Employee1.displayDetails();
        System.out.println();

        System.out.println("Part-Time Employee Details:");
        System.out.println("Calculated Salary: $" + Employee2.calculateSalary());
        Employee2.displayDetails();
        System.out.println();

        System.out.println("Contract Employee Details:");
        System.out.println("Calculated Salary: $" + Employee3.calculateSalary());
        Employee3.displayDetails();
        System.out.println();
    }
}