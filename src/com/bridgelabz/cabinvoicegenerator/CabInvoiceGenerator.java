package com.bridgelabz.cabinvoicegenerator;

import java.util.HashMap;
import java.util.Map;

/**
 * Purpose : Given a user id, the invoice service gets the list of rides from
 * the RideRepository, and return the invoice
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

	public InVoiceSummary getInvoice(int userId) {
		Map<Integer, Ride[]> map = new HashMap<Integer, Ride[]>();
		Ride[] rides2 = { new Ride(2.0, 5), new Ride(0.1, 1) };
		Ride[] rides3 = { new Ride(5.0, 10), new Ride(1, 1) };

		Ride[] rides4 = { new Ride(8.0, 15), new Ride(1, 10) };
		map.put(1, rides2);
		map.put(2, rides3);
		map.put(3, rides4);

		for (Map.Entry<Integer, Ride[]> entry : map.entrySet()) {
			if (userId == entry.getKey()) {
				System.out.println(entry.getKey());
				Ride[] ridesArray = entry.getValue();
				return calculateFare(ridesArray);
			}
		}
		return null;
	}

}
