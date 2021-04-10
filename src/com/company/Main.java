package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your total marks =>");
        float total_Mark = sc.nextFloat();
        System.out.print("Enter your optain marks =>");
        float optain_Mark = sc.nextFloat();
        float total_per = optain_Mark / total_Mark * 100;

        char grade;

        if (total_per >= 90) {
            grade = 'A';
        } else if (total_per >= 80) {
            grade = 'B';
        } else if (total_per >= 70) {
            grade = 'C';
        } else if (total_per >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        ;

        System.out.println("Your total marks => " + total_Mark);
        System.out.println("Your optain marks => " + optain_Mark);
        System.out.println("Your total per is ==> " + total_per);
        System.out.println("Your grade is ==>  " + grade);


    }
}
