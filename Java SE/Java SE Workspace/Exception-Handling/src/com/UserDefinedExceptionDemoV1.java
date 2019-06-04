package com;

import java.util.prefs.NodeChangeEvent;

public class UserDefinedExceptionDemoV1 {

	public static void main(String[] args) {
		String hotels[] = { "Abc", "Xyz", "Test" };

		boolean found = false;
		for (String hotelName : hotels) {
			if (hotelName.equals("Abc1")) {
				found = true;
			}
		}

		// ----------------

		if (!found) {
			throw new NoSuchHotelFoundExceptionV1("Kakatiya Hotel Name is Not Found");

		} else {
			System.out.println("Hotel Found");
		}

	}

}
