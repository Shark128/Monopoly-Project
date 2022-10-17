import java.util.*;
public class Player {
    public int balance;
    public ArrayList<BoardSpace> properties;
    public char icon;

    public Player (char icon){
        balance = 1500;
        properties = new ArrayList<BoardSpace>();
        this.icon =  icon;
    }

}
