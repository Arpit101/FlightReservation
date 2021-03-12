package com.company;

public class Main {
    public static void main(String [] args) {
            RegularTicket.getSpecialService(true);
            TouristTicket.getTouristLocation();

            System.out.println(Passenger.Contact.getContactDetails("John","9999988888","john@123@gmail.com"));
            System.out.println(Passenger.Address.getAddressDetails("2nd street", "Bengaluru",
                    "Karnataka"));
            System.out.println( Ticket.TicketDetails("ABVCHJSHSK",2););
            System.out.println(TouristTicket.getTouristLocation());

    }
}
