package com.workspace.src;

public class Client {
    public static void main(String[] args) {
        MovieTicketBooking movieTicketBooking = new MovieTicketBooking.Builder("3 Idiots" , 3)
                                                    .popcorn(3)
                                                    .pizza(1)
                                                    .coke(2)
                                                    .burger(4)
                                                    .pizza(3)
                                                    .build();
        System.out.println(movieTicketBooking);
    }


}
