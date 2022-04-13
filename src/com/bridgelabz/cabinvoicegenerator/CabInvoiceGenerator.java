package com.bridgelabz.cabinvoicegenerator;

/**
 * Purpose : The invoice generator should now take in multiple rides, and
 * calculate aggregate total for all
 * 
 * @author ShubhamNhalde
 * @since 13/04/2022
 *
 */
public class CabInvoiceGenerator {

	final int COSTPERKM = 10;
	final int COSTPERMIN = 1;
	final int MINFARE = 5;

	// Method to calculate fare should return the total fare of the journey
	public double calculateFare(double distance, double time) {
		double fare = COSTPERKM * distance + COSTPERMIN * time;
		if (fare > MINFARE)
			return fare;
		else
			return MINFARE;
	}

//Metod to calculate fare for multiple rides and should return the TotalFare
	public double calculateFareForMultipleRides(Ride[] ridesArray) {
		double totalFare = 0;
		for (Ride ride : ridesArray) {
			totalFare += calculateFare(ride.distance, ride.time);
		}
		return totalFare;
	}

}
