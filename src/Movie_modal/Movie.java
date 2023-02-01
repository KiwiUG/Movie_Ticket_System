package Movie_modal;

public class Movie extends Category{
    String name;
    String director;
    String time;
    int price;

    public Movie(boolean sofa, int seat, String genre, String name, String director, String time, int price) {
        super(sofa, seat, genre);
        this.name = name;
        this.director = director;
        this.time = time;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void GetInfo() {
        System.out.println("Name: "+this.name);
        System.out.println("Director: "+this.director);
        System.out.println("Time: "+this.time);
        System.out.println("Price: "+this.price);
        super.GetInfo();
    }
}
