package ca.bcit.comp1510.lab08;

import java.util.Scanner;

/**
 * Represent a valid Gregorian date on or after 24 February 1582. 
 * @author Munyoung Cho 
 * @version 2023
 */
public class Date {
    /** day of month.  1 .. max days in month */
    private int day;
    
    /** month of year.  1 .. 12 */
    private int month;
    
    /** year in Gregorian calendar.  1001 .. 2999 */
    private int year;
    
    /**
     * Create a constructor for Date class. 
     * @param theDay
     *          as a integer
     * @param theMonth
     *          as a integer
     * @param theYear   
     *          as a integer
     */
    public Date(int theDay, int theMonth, int theYear)  {
        if (!isDateValid(theMonth, theDay, theYear)) {
            throw new IllegalArgumentException("Invalid date!"); 
        } 
        theDay = day; 
        theMonth = month; 
        theYear = year; 
    }
    
    /**
     * Create a boolean method of isMonthValid. 
     * @param m
     *          as an integer
     * @return the valid month 
     */
    public static boolean isMonthValid(int m) {
        final int twelve = 12;
        return m >= 1 && m <= twelve;
    }
    
    /**
     * Create a boolean method of isYearValid. 
     * @param year
     *          as an integer
     * @return the valid year
     */
    public static boolean isYearValid(int year) {
        final int lowerYear = 1582; 
        final int upperYear = 2999; 
        return year >= lowerYear && year <= upperYear;
    }
    
    /**
     * Create a boolean method of isLeapYear. 
     * @param year
     *          as an integer
     * @return the whether or not the year is leapyear. 
     */
    public static boolean isLeapYear(int year) {
        final int four = 4;
        final int hundred = 100;
        final int fourHundred = 400;
        return (year % four == 0 && year % hundred != 0) 
                || (year % fourHundred == 0);
    }
    
    /**
     * Create a method of daysInMonth. 
     * @param month
     *          as an integer
     * @param isLeapYear
     *          as boolean 
     * @return the right date for the month that user prompt
     */
    public static int daysInMonth(int month, boolean isLeapYear) {
        final int apr = 4;
        final int jun = 6;
        final int sept = 9;
        final int nov = 11;
        final int twentyNine = 29; 
        final int twentyEight = 28; 
        final int thirty = 30; 
        final int thirtyOne = 31; 
        switch (month) {
            case 2:
                return isLeapYear ? twentyNine : twentyEight; 
            case apr:
            case jun:
            case sept:
            case nov:
                return thirty;
            default:
                return thirtyOne;
 
        }
    }
    
    /**
     * Create the boolean method of isDateValid. 
     * @param day
     *          as an integer
     * @param month
     *          as an integer
     * @param year
     *          as an integer
     * @return the true or false that the date is valid
     */
    public static boolean isDateValid(int day, int month, int year) {
        if (!isYearValid(year)) {
            return false; 
        } 
        if (!isMonthValid(month)) {
            return false; 
        }
        int maxDays = daysInMonth(month, isLeapYear(year)); 
        if (day < 1 || day > maxDays) {
            return false; 
        }
        return true; 
    }
    
    /**
     * Main method to drive the date method. 
     * @param args unused
     */
    public static void main(String[] args) { 
        //date read in from user
        
        int month;
        int day;
        int year;
        //true if parts of input from user is valid
        boolean monthValid;
        boolean yearValid;
        boolean dayValid;  
        //number of days in month read in
        int daysInMonth;
        //true if user's year is a leap year
        boolean leapYear;
        
        Scanner scan = new Scanner(System.in);
        //Get integer month, day, and year from user
        System.out.print("Enter month (1-12): ");
        month = scan.nextInt();
        System.out.print("Enter day (1-31): ");
        day = scan.nextInt();
        System.out.print("Enter year (1582-2999): ");
        year = scan.nextInt();
        //Use the methods to check to see if month is valid
        monthValid = Date.isMonthValid(month);
        if (!monthValid) {
            daysInMonth = 0;
        }

        //Use the methods to check to see if year is valid
        yearValid = Date.isYearValid(year);
        //Use the methods to determine whether it's a leap year
        leapYear = Date.isLeapYear(year);
        //Use the methods to determine number of days in month
        daysInMonth = Date.daysInMonth(month, leapYear);
        //Use the methods to see if day is valid
        dayValid = day >= 1 && day <= daysInMonth;
        //Use the methods to determine whether date is valid
        if (monthValid && yearValid && dayValid 
                && isDateValid(day, month, year)) {
            //   and print appropriate message
            System.out.println("Date is valid.");
            if (leapYear) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } else {
            System.out.println("Date is not valid.");
            new Date(day, month, year);
        }
        scan.close();
    } 
} 

