package Movie_modal;

public class Main_Catagory {
    boolean sofa;
    int seat;

    public Main_Catagory(boolean sofa, int seat) {
        this.sofa = sofa;
        this.seat = seat;
    }

    public boolean isSofa() {
        return sofa;
    }

    public void setSofa(boolean sofa) {
        this.sofa = sofa;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public void GetInfo(){
        System.out.println("Sofa Available: "+ this.sofa);
        System.out.println("No. of seat: "+this.seat);
    }
}
