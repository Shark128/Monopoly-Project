import java.util.*;

public class BoardSpace { // Carson and Shreyes
    public String name;
    public int purchasePrice;
    public int[] rentCost;
    public Player owner;
    public ArrayList<Boolean> occupier;
    public int color;
    public int buildType;
    public int upgrades;


    public BoardSpace (String name, int purchasePrice, int[] rentCost, int color, int buildType) {
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.rentCost = rentCost;
        owner = null;
        occupier = new ArrayList<Boolean>(6);
        Collections.fill(occupier, false);
        this.color = color;
        this.buildType = buildType;
        upgrades = 0;

    }
}
