public class BoardSpace {
    public int purchasePrice;
    public int[] rentCost;
    public Player owner;
    public int color;
    public int buildType;

    public BoardSpace (int purchasePrice, int[] rentCost, int color, int buildType) {
        this.purchasePrice = purchasePrice;
        this.rentCost = rentCost;
        owner = null;
        this.color = color;
        this.buildType = buildType;
    }
}
