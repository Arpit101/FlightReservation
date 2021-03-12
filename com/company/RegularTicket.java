package com.company;

import java.util.SortedMap;

public class RegularTicket extends Ticket{
     public Boolean SpecialService;
     public String getSpecialService(){
          if(SpecialService=true){
               System.out.println("Passenger  will get Special Services");

          }
          return null;
     }
     public void upDateSpecialService(Boolean SpecialService){
          System.out.println("Updation of Special service has been completed");

     }


}
