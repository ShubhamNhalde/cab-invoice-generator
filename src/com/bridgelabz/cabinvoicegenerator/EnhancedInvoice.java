package com.bridgelabz.cabinvoicegenerator;

public class EnhancedInvoice {

	final int COSTPERKM = 10;
	final int COSTPERMIN = 1;
	final int MINFARE = 5;

	public static void main(String[] args) {
		CalculateFare cabInvoiceGenerator = new CalculateFare();
		System.out.println(cabInvoiceGenerator.calculateFare(5, 20) + " Rs");
	}

	public double calculateFare(double distance, double time) {
		double fare = COSTPERKM * distance + COSTPERMIN * time;
		if (fare > MINFARE)
			return fare;
		else
			return MINFARE;
	}

	public double calculateFareForMultipleRides(Ride[] ridesArray) {
		double totalFare = 0;
		for (Ride ride : ridesArray) {
			totalFare += calculateFare(ride.distance, ride.time);
		}
		return totalFare;
	}

	public InvoiceSummary invoiceSummaryCalculation(Ride[] ridesArray) {
		double totalFare = 0;
		for (Ride ride : ridesArray) {
			totalFare += this.calculateFare(ride.distance, ride.time);
		}
		return new InvoiceSummary(ridesArray.length, totalFare);
	}

}
