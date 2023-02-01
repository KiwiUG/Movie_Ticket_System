package etc_modal;

import Movie_modal.Movie;

import java.util.ArrayList;

public class Ticket {
    ArrayList<Seat> seats;
    User users;
    Movie movies;

    public Ticket(ArrayList<Seat> seats, User users, Movie movies) {
        this.seats = seats;
        this.users = users;
        this.movies = movies;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    public User getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users = users;
    }

    public Movie getMovies() {
        return movies;
    }

    public void setMovies(Movie movies) {
        this.movies = movies;
    }

    public void Gettickets() {
        System.out.println("User: "+ users.getName());
        
    }
}
