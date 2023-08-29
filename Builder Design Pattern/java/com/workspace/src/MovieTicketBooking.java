package com.workspace.src;

public class MovieTicketBooking {
    private final String movieName;             //Required
    private final int totalTickets;             //Required
    private final int  popcorn;                 //Optional
    private final int pizza;                    //Optional
    private final int burger;                   //Optional
    private final int coke;                     //Optional

    public MovieTicketBooking(Builder builder) {
        this.movieName = builder.movieName;
        this.totalTickets = builder.totalTickets;
        this.popcorn = builder.popcorn;
        this.pizza = builder.pizza;
        this.burger = builder.burger;
        this.coke = builder.coke;
    }

    public static class Builder{
        private final String movieName;         //Required
        private final int totalTickets;         //Required
        private int popcorn;                    //Optional
        private int pizza;                      //Optional
        private int burger;                     //Optional
        private int coke;                       //Optional

        public Builder(String movieName, int totalTickets) {
            this.movieName = movieName;
            this.totalTickets = totalTickets;
        }

        public Builder popcorn(int val) {
            popcorn = val;
            return this;
        }
        public Builder pizza(int val){
            pizza = val;
            return this;
        }
        public Builder burger(int val){
            burger = val;
            return this;
        }
        public Builder coke(int val){
            coke = val;
            return this;
        }
        public MovieTicketBooking build(){
            return new MovieTicketBooking(this);
        }
    }

    @Override
    public String toString() {
        return "MovieTicketBooking{" +
                "movieName='" + movieName + '\'' +
                ", totalTickets=" + totalTickets +
                ", popcorn=" + popcorn +
                ", pizza=" + pizza +
                ", burger=" + burger +
                ", coke=" + coke +
                '}';
    }
}
