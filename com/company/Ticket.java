package com.company;

public class Ticket {
    public String Pnr;
    public String From,To;
    int DeparturedateTime,ArrivalDateTime;
    public Float Price;
    public Boolean Cancelled;
    public String SeatNo;
     public  void TicketDetails(String pnr, int Duration){
        System.out.println(Price);
        System.out.println(pnr);
        System.out.println("From" +From+ "to"+To+" ");
        System.out.println(getFlightDuration());
        System.out.println(CheckStats());
    }

    public String CheckStats(){
        return SeatNo;

    }
    public int getFlightDuration(){
        return DeparturedateTime-ArrivalDateTime;
    }
    public void Cancel(){
        System.out.println(Cancelled);

    }
}
