package com;

import java.util.prefs.NodeChangeEvent;

public class UserDefinedExceptionDemo {

	public static void main(String[] args) {
		String hotels[] = { "Abc", "Xyz", "Test" };

		boolean found = false;
		for (String hotelName : hotels) {
			if (hotelName.equals("Kakatiya")) {
				found = true;
			}
		}

		// ----------------

		try {
			if (!found) {
				throw new NoSuchHotelFoundException("Kakatiya Hotel Name is Not Found");
			}
		} catch (NoSuchHotelFoundException nsff) {
			nsff.printStackTrace();
		}

	}

}
