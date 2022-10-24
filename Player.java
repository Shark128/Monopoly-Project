import java.util.ArrayList;
public class Player { // Carson and Shreyes
    public String name;
    public int balance;
    public ArrayList<BoardSpace> properties;
    public char icon;
    public boolean inJail;
    public boolean dead;
    public BoardSpace currBS;

    public Player (String name, char icon){
        this.name = name;
        balance = 1500;
        properties = new ArrayList<BoardSpace>();
        this.icon =  icon;
        inJail = false;
        dead = false;
        currBS = null;
    }
}
