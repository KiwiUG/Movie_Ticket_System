import Movie_modal.Movie;
import etc_modal.Seat;
import etc_modal.Ticket;
import etc_modal.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie m1 = new Movie(true,3,"Horror","Khai k","Rajesh dai","10",500);
        User u1 = new User("ug",900000000);
        Seat s1 = new Seat('A');
        Seat s2 = new Seat('B');
        Seat s3 = new Seat('C');



        ArrayList<Seat> s_list = new ArrayList<>();
        s_list.add(s1);
        s_list.add(s2);
        s_list.add(s3);

        Ticket t1 = new Ticket(s_list,u1,m1);

        m1.GetInfo();

        t1.Gettickets();
        for (Seat seats : s_list) {
            System.out.println(seats.getRow());
        }


    }
}
