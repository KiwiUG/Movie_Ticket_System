package Movie_modal;

public class Category extends Main_Catagory{
    String genre;

    public Category(boolean sofa, int seat, String genre) {
        super(sofa, seat);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void GetInfo() {
        System.out.println("Genre: "+this.genre);
        super.GetInfo();
    }
}
