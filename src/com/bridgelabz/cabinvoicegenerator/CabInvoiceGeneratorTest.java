package com.bridgelabz.cabinvoicegenerator;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CabInvoiceGeneratorTest {

	@Test
	void given_DistanceAndTime_ShouldReturnTotalFare() {
		CabInvoiceGenerator CalculateFare = new CabInvoiceGenerator();
		int distance = 5, time = 20;
		double fare = CalculateFare.calculateFare(distance, time);
		Assertions.assertEquals(70, fare);

	}

}
