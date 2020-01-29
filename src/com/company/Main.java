package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double salary;
        double installment;
        double remain;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter salary:");
        salary = input.nextDouble();
        System.out.println("Enter monthly installment:");
        installment = input.nextDouble();
        remain = salary - installment;
        System.out.println("Salary = "+salary);
        System.out.println("installment = "+installment);
        System.out.println("-----------");
        System.out.println("Remain = "+remain);
    }
}
