package com.bridgelabz.hotelreservation;

public class HotelReservationMain {
	public static void main(String[] args) {
		System.out.println(" Welcome To Hotel Reservation");
		HotelReservationIF hotelReservation = new HotelReservation();
		hotelReservation.addHotel();
		hotelReservation.printHotelList();
	}
}
