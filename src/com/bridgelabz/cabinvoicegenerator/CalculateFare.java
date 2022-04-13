package com.bridgelabz.cabinvoicegenerator;

/**
 * Purpose : Given distance and time, the invoice generator should return the
 * total fare for the journey.
 * 
 * @author ShubhamNhalde
 * @since 13/04/2022
 *
 */

public class CalculateFare {
	// Defining global Variable
	final int COSTPERKM = 10;
	final int COSTPERMIN = 1;
	final int MINFARE = 5;

	// Main method to calculate fare by giving distance and time
	public static void main(String[] args) {
		CalculateFare cabInvoiceGenerator = new CalculateFare();
		System.out.println(cabInvoiceGenerator.calculateFare(5, 20) + " Rs");
	}

	// Method to calculate fare should return the total fare of the journey
	public double calculateFare(double distance, double time) {
		double fare = COSTPERKM * distance + COSTPERMIN * time;
		if (fare > MINFARE)
			return fare;
		else
			return MINFARE;
	}

}
