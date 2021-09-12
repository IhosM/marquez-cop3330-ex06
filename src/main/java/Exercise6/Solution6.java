/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Ihosvany Marquez
 */


package Exercise6;

import java.time.LocalDate;
import java.util.Scanner;



public class Solution6
{
    public static void main( String[] args )
    {
        Scanner s = new Scanner(System.in);
        System.out.print("What is your current age? \n");
        int age = s.nextInt();
        System.out.print("At what age would you like to retire? \n");
        int retirementAge = s.nextInt();
        System.out.print("Age entered: " + age + "\n");
        System.out.print("Retirement age goal: " + retirementAge + "\n");
        int retirementCalculator = retirementAge - age;

        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int retirementDate = year + retirementCalculator;

        System.out.println ("You have " + retirementCalculator + " years until you can retire. ");
        System.out.println ("It's " + year + ", so you can retire in " + retirementDate);
    }


}
