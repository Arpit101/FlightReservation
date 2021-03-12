package com.company;

public class Passenger {
     private static int counterId;
     int Passenger_id;
     public static class Contact{
         String Name,Contact,Email;
         public void getContactDetails(String Name,String Contact,String Email){
                     this.Name=Name;
                     this.Contact=Contact;
                     this.Email=Email;
         }
     }
     private Contact contact;

     public static class Address {
         String street,City,State;
         public void getAddressDetails(String street, String City, String State){
             this.street=street;
             this.City=City;
             this.State=State;
         }
     }
     private Address address;
     static {
         counterId=0;
     }
    public int Passenger(){
        Passenger_id=++counterId;
        this.address = new Address();
        this.contact = new Contact();
        return Passenger_id;
        }
     }


