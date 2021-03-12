package com.company;
public class Flight{
        public String FlightNumber,Airline;
        public int Capacity;
        private int BookedSeat;

    public String getFlightDetails(){
        return FlightNumber;

    }
    public boolean CheckAvailability(){
        return false;
    }
    public int IncrementBookingCounter(){
        BookedSeat++;
        return BookedSeat;
    }
}
