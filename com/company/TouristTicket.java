package com.company;

import java.util.Arrays;

public class TouristTicket extends Ticket{
    public  String HotelAddress;
    String location;
    public String[] selectTouristLocation;

    public String[] getHotelAddress(){
        selectTouristLocation[0..5] ;
        return selectTouristLocation;

    }
    public String getTouristLocation(){
        selectTouristLocation[0]="USA";
        selectTouristLocation[1]="Uk";
        selectTouristLocation[2]="Dubai";
        return HotelAddress;

    }
    public String removeTouristLocation(String location){
         selectTouristLocation=Arrays.stream(selectTouristLocation).reduce();

    }
    public void addTouristLocation(String location){
        System.out.println("Add tourist location");
        selectTouristLocation[3]=location;


    }



}
