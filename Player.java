import java.util.ArrayList;
public class Player { // Carson and Shreyes
    public int balance;
    public ArrayList<BoardSpace> properties;
    public char icon;
    public boolean inJail;
    public boolean dead;

    public Player (char icon){
        balance = 1500;
        properties = new ArrayList<BoardSpace>();
        this.icon =  icon;
        inJail = false;
        dead = false;
    }
}
