package com.differencebetweendates;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Main {

    public static void main(String[] args) {
	    Scanner scnr = new Scanner(System.in);
	    String userDate1;
	    String userDate2;

	    System.out.println("Enter first date (format YYYY/MM/DD): ");
	    userDate1 = scnr.nextLine();

	    System.out.println("Enter second date (format YYYY/MM/DD: ");
	    userDate2 = scnr.nextLine();

	    //initializing firstDate and secondDate to their respected userDate strings after conversion
        LocalDate firstDate = convertStringToLocal(userDate1);
        LocalDate secondDate = convertStringToLocal(userDate2);

        if (firstDate.isAfter(secondDate)) {         // reversing the order to output only positive numbers
            Period diff1 = Period.between(secondDate, firstDate);

            System.out.print("Difference between dates is: " + diff1.getYears() + " years, ");
            System.out.println(diff1.getMonths() + " months, and " + diff1.getDays() + " days.");
        }
        else {
            Period diff2 = Period.between(firstDate, secondDate);

            System.out.print("Difference between dates is: " + diff2.getYears() + " years, ");
            System.out.println(diff2.getMonths() + " months, and " + diff2.getDays() + " days.");
        }

        return;
    }

    public static LocalDate convertStringToLocal(String userDate){ //converting userDate strings to integers
        int userYear = Integer.parseInt(userDate.substring(0, 4));
        int userMonth = Integer.parseInt(userDate.substring(5, 7));
        int userDay = Integer.parseInt(userDate.substring(8, 10));

        LocalDate date = LocalDate.of(userYear, userMonth, userDay); //combine all 3 integers back to YYYY-MM-DD format


        return date;

    }

}
