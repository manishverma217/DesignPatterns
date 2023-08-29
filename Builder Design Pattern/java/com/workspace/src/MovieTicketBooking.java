package com.workspace.src;

public class MovieTicketBooking {
    private final String movieName;
    private final int totalTickets;
    private final int popcorn;
    private final int pizza;
    private final int burger;
    private final int coke;

    public MovieTicketBooking(Builder builder) {
        this.movieName = builder.movieName;
        this.totalTickets = builder.totalTickets;
        this.popcorn = builder.popcorn;
        this.pizza = builder.pizza;
        this.burger = builder.burger;
        this.coke = builder.coke;
    }

    public static class Builder{
        private final String movieName;
        private final int totalTickets;
        private int popcorn;
        private int pizza;
        private int burger;
        private int coke;

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
