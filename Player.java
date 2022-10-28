import java.util.ArrayList;
import java.util.Scanner;

public class Player { // Carson and Shreyes
    public String name;
    public int balance;
    public ArrayList<BoardSpace> properties;
    public char icon;
    public boolean inJail;
    public boolean dead;
    public BoardSpace currBS;

    public Player(String name, char icon) {
        this.name = name;
        balance = 1500;
        properties = new ArrayList<BoardSpace>();
        this.icon = icon;
        inJail = false;
        dead = false;
        currBS = null;
    }

    // Written by Carson
    public void upgradeProperties(BoardSpace[][] colorSets) {
        Scanner sc = new Scanner(System.in);
        // A property cannot be upgraded unless all of the properties of the same color are owned. So, these counters are added to check if a player owns a full set.
        int brownCounter = 1; // Brown and darkBlue start at 1 since there are only 2 properties in those sets.
        int babyBlueCounter = 0;
        int pinkCounter = 0;
        int orangeCounter = 0;
        int redCounter = 0;
        int yellowCounter = 0;
        int greenCounter = 0;
        int darkBlueCounter = 1;
        System.out.println("These are your properties that you could upgrade. Note some may not be shown as properties must be upgraded evenly (you cannot build 2 houses on a property before all others in the set have 1)");
        System.out.println("Please enter the number for which one you want to upgrade.");
        for (int i = 0; i < properties.size(); i++) {
            if (properties.get(i).color == 1) {
                brownCounter++; // For every property a player owns for a certain color, the counter will go up.
            }
            if (properties.get(i).color == 2) {
                babyBlueCounter++;
            }
            if (properties.get(i).color == 3) {
                pinkCounter++;
            }
            if (properties.get(i).color == 4) {
                orangeCounter++;
            }
            if (properties.get(i).color == 5) {
                redCounter++;
            }
            if (properties.get(i).color == 6) {
                yellowCounter++;
            }
            if (properties.get(i).color == 7) {
                greenCounter++;
            }
            if (properties.get(i).color == 8) {
                darkBlueCounter++;
            }
            for (int j = 0; j < properties.size(); j++) {
                if (brownCounter == 3 && properties.get(j).color == 1) { // Player must own all properties in a color set for it to be upgraded.
                    // Each property in a set has to be within 1 upgrade of eachother in order to be upgraded, the following if statements make sure this is true before it is input.
                    if ((properties.get(j).upgrades == colorSets[0][0].upgrades || properties.get(j).upgrades == colorSets[0][0].upgrades + 1) && (properties.get(j).upgrades == colorSets[0][1].upgrades || properties.get(j).upgrades == colorSets[0][1].upgrades + 1)) {
                        if (properties.get(j).upgrades < 6) { // A property can only be upgraded 5 times.
                            System.out.println(j + ": " + properties.get(j).name);
                        }
                    }
                }
                if (babyBlueCounter == 3 && properties.get(j).color == 2) {
                    if ((properties.get(j).upgrades == colorSets[1][0].upgrades || properties.get(j).upgrades == colorSets[1][0].upgrades + 1) && (properties.get(j).upgrades == colorSets[1][1].upgrades  || properties.get(j).upgrades == colorSets[1][1].upgrades + 1) && (properties.get(j).upgrades == colorSets[1][2].upgrades || properties.get(j).upgrades == colorSets[1][2].upgrades + 1)) {
                        if (properties.get(j).upgrades < 6) {
                            System.out.println(j + ": " + properties.get(j).name);
                        }
                    }
                }
                if (pinkCounter == 3 && properties.get(j).color == 3) {
                    if ((properties.get(j).upgrades == colorSets[2][0].upgrades || properties.get(j).upgrades == colorSets[2][0].upgrades + 1) && (properties.get(j).upgrades == colorSets[2][1].upgrades || properties.get(j).upgrades == colorSets[2][1].upgrades + 1) && (properties.get(j).upgrades == colorSets[2][2].upgrades || properties.get(j).upgrades == colorSets[2][2].upgrades + 1)) {
                        if (properties.get(j).upgrades < 6) {
                            System.out.println(j + ": " + properties.get(j).name);
                        }
                    }
                }
                if (orangeCounter == 3 && properties.get(j).color == 4) {
                    if ((properties.get(j).upgrades == colorSets[3][0].upgrades || properties.get(j).upgrades == colorSets[3][0].upgrades + 1) && (properties.get(j).upgrades == colorSets[3][1].upgrades || properties.get(j).upgrades == colorSets[3][1].upgrades + 1) && (properties.get(j).upgrades == colorSets[3][2].upgrades || properties.get(j).upgrades == colorSets[3][2].upgrades + 1)) {
                        if (properties.get(j).upgrades < 6) {
                            System.out.println(j + ": " + properties.get(j).name);
                        }
                    }
                }
                if (redCounter == 3 && properties.get(j).color == 5) {
                    if ((properties.get(j).upgrades == colorSets[4][0].upgrades || properties.get(j).upgrades == colorSets[4][0].upgrades + 1) && (properties.get(j).upgrades == colorSets[4][1].upgrades || properties.get(j).upgrades == colorSets[4][1].upgrades + 1) && (properties.get(j).upgrades == colorSets[4][2].upgrades || properties.get(j).upgrades == colorSets[4][2].upgrades + 1)) {
                        if (properties.get(j).upgrades < 6) {
                            System.out.println(j + ": " + properties.get(j).name);
                        }
                    }
                }
                if (yellowCounter == 3 && properties.get(j).color == 6) {
                    if ((properties.get(j).upgrades == colorSets[5][0].upgrades || properties.get(j).upgrades == colorSets[5][0].upgrades + 1) && (properties.get(j).upgrades == colorSets[5][1].upgrades || properties.get(j).upgrades == colorSets[5][1].upgrades + 1) && (properties.get(j).upgrades == colorSets[5][2].upgrades || properties.get(j).upgrades == colorSets[5][2].upgrades + 1)) {
                        if (properties.get(j).upgrades < 6) {
                            System.out.println(j + ": " + properties.get(j).name);
                        }
                    }
                }
                if (greenCounter == 3 && properties.get(j).color == 7) {
                    if ((properties.get(j).upgrades == colorSets[6][0].upgrades || properties.get(j).upgrades == colorSets[6][0].upgrades + 1) && (properties.get(j).upgrades == colorSets[6][1].upgrades || properties.get(j).upgrades == colorSets[6][1].upgrades + 1) && (properties.get(j).upgrades == colorSets[6][2].upgrades|| properties.get(j).upgrades == colorSets[6][2].upgrades + 1)) {
                        if (properties.get(j).upgrades < 6) {
                            System.out.println(j + ": " + properties.get(j).name);
                        }
                    }
                }
                if (darkBlueCounter == 3 && properties.get(j).color == 8) {
                    if ((properties.get(j).upgrades == colorSets[7][0].upgrades || properties.get(j).upgrades == colorSets[7][0].upgrades + 1) && (properties.get(j).upgrades == colorSets[7][1].upgrades || properties.get(j).upgrades == colorSets[7][1].upgrades + 1)) {
                        if (properties.get(j).upgrades < 6) {
                            System.out.println(j + ": " + properties.get(j).name);
                        }
                    }
                }
            }
        }
        int response = sc.nextInt();
        for (int i = 0; i < properties.size(); i++) {
            if (response == i) { // Matches player's response with the correct property to be upgraded.
                if (properties.get(i).color == 0 || properties.get(i).color == 1) { // The properties on the bottom side of the board cost 25, left cost 50, top costs 75, and right costs 100 to be upgraded. Therefore, there must be 4 different statements for each pricing.
                    System.out.println("Upgrading " + properties.get(i).name + " will cost " + properties.get(i).name + " you $25.");
                    if (this.balance < 25) {
                        System.out.println("You cannot upgrade this property, as you do not have enough money. Sorry!");
                    } else {
                        this.balance = this.balance - 25;
                        properties.get(i).upgrades = properties.get(i).upgrades + 1;
                        System.out.println("Property has been successfully upgraded! Congratulations.");
                    }
                }
                if (properties.get(i).color == 2 || properties.get(i).color == 3) {
                    System.out.println("Upgrading " + properties.get(i).name + " will cost " + properties.get(i).name + " you $50.");
                    if (this.balance < 50) {
                        System.out.println("You cannot upgrade this property, as you do not have enough money. Sorry!");
                    } else {
                        this.balance = this.balance - 50;
                        properties.get(i).upgrades = properties.get(i).upgrades + 1;
                        System.out.println("Property has been successfully upgraded! Congratulations.");
                    }
                }
                if (properties.get(i).color == 4 || properties.get(i).color == 5) {
                    System.out.println("Upgrading " + properties.get(i).name + " will cost " + properties.get(i).name + " you $75.");
                    if (this.balance < 75) {
                        System.out.println("You cannot upgrade this property, as you do not have enough money. Sorry!");
                    } else {
                        this.balance = this.balance - 75;
                        properties.get(i).upgrades = properties.get(i).upgrades + 1;
                        System.out.println("Property has been successfully upgraded! Congratulations.");
                    }
                }
                if (properties.get(i).color == 6 || properties.get(i).color == 7) {
                    System.out.println("Upgrading " + properties.get(i).name + " will cost " + properties.get(i).name + " you $100.");
                    if (this.balance < 100) {
                        System.out.println("You cannot upgrade this property, as you do not have enough money. Sorry!");
                    } else {
                        this.balance = this.balance - 100;
                        properties.get(i).upgrades = properties.get(i).upgrades + 1;
                        System.out.println("Property has been successfully upgraded! Congratulations.");
                    }
                }
            }
        }
    }

    public void sellUpgrades(BoardSpace[][] colorSets) {
        Scanner sc = new Scanner(System.in);
        System.out.println("These are the properties you have upgrades on, enter the number of the property you wish to sell upgrades on.");
        for (int i = 0; i < properties.size(); i++) {
            if (properties.get(i).upgrades > 0) {
                System.out.println(i + ": " + properties.get(i).name);
            }
        }
        int response = sc.nextInt();
        for (int j = 0; j < properties.size(); j++) {
            if (response == j) {
                // Just like how properties must be evenly upgraded, their upgrades must be evenly sold as well. Also, only 1 upgrade can be sold at a time.
                if ((properties.get(j).upgrades == colorSets[0][0].upgrades || properties.get(j).upgrades == colorSets[0][0].upgrades - 1) && (properties.get(j).upgrades == colorSets[0][1].upgrades || properties.get(j).upgrades == colorSets[0][1].upgrades - 1)) {
                    System.out.println("The upgrade has been sold. You have received half of the cost to initially upgraded it, and the property has lost an upgrade level.");
                    this.balance = this.balance + 13; // Half of 25 is technically 12.5, but monopoly rules state you get to pick to round up or down on decimals.
                    properties.get(j).upgrades = properties.get(j).upgrades - 1;
                }
                if ((properties.get(j).upgrades == colorSets[1][0].upgrades || properties.get(j).upgrades == colorSets[1][0].upgrades - 1) && (properties.get(j).upgrades == colorSets[1][1].upgrades || properties.get(j).upgrades == colorSets[1][1].upgrades - 1) && (properties.get(j).upgrades == colorSets[1][2].upgrades || properties.get(j).upgrades == colorSets[1][2].upgrades - 1)) {
                    System.out.println("The upgrade has been sold. You have received half of the cost to initially upgraded it, and the property has lost an upgrade level.");
                    this.balance = this.balance + 13;
                    properties.get(j).upgrades = properties.get(j).upgrades - 1;
                }
                if ((properties.get(j).upgrades == colorSets[2][0].upgrades || properties.get(j).upgrades == colorSets[2][0].upgrades - 1) && (properties.get(j).upgrades == colorSets[2][1].upgrades || properties.get(j).upgrades == colorSets[2][1].upgrades - 1) && (properties.get(j).upgrades == colorSets[2][2].upgrades || properties.get(j).upgrades == colorSets[2][2].upgrades - 1)) {
                    System.out.println("The upgrade has been sold. You have received half of the cost to initially upgraded it, and the property has lost an upgrade level.");
                    this.balance = this.balance + 25; // Every 2 color types, the cost of building a house/hotel goes up, so the user will be reimbursed more as well when they sell this upgrade.
                    properties.get(j).upgrades = properties.get(j).upgrades - 1;
                }
                if ((properties.get(j).upgrades == colorSets[3][0].upgrades || properties.get(j).upgrades == colorSets[3][0].upgrades - 1) && (properties.get(j).upgrades == colorSets[3][1].upgrades || properties.get(j).upgrades == colorSets[3][1].upgrades - 1) && (properties.get(j).upgrades == colorSets[3][2].upgrades || properties.get(j).upgrades == colorSets[3][2].upgrades - 1)) {
                    System.out.println("The upgrade has been sold. You have received half of the cost to initially upgraded it, and the property has lost an upgrade level.");
                    this.balance = this.balance + 25;
                    properties.get(j).upgrades = properties.get(j).upgrades - 1;
                }
                if ((properties.get(j).upgrades == colorSets[4][0].upgrades || properties.get(j).upgrades == colorSets[4][0].upgrades - 1) && (properties.get(j).upgrades == colorSets[4][1].upgrades || properties.get(j).upgrades == colorSets[4][1].upgrades - 1) && (properties.get(j).upgrades == colorSets[4][2].upgrades || properties.get(j).upgrades == colorSets[4][2].upgrades - 1)) {
                    System.out.println("The upgrade has been sold. You have received half of the cost to initially upgraded it, and the property has lost an upgrade level.");
                    this.balance = this.balance + 38;
                    properties.get(j).upgrades = properties.get(j).upgrades - 1;
                }
                if ((properties.get(j).upgrades == colorSets[5][0].upgrades || properties.get(j).upgrades == colorSets[5][0].upgrades - 1) && (properties.get(j).upgrades == colorSets[5][1].upgrades || properties.get(j).upgrades == colorSets[5][1].upgrades - 1) && (properties.get(j).upgrades == colorSets[5][2].upgrades || properties.get(j).upgrades == colorSets[5][2].upgrades - 1)) {
                    System.out.println("The upgrade has been sold. You have received half of the cost to initially upgraded it, and the property has lost an upgrade level.");
                    this.balance = this.balance + 38;
                    properties.get(j).upgrades = properties.get(j).upgrades - 1;
                }
                if ((properties.get(j).upgrades == colorSets[6][0].upgrades || properties.get(j).upgrades == colorSets[6][0].upgrades - 1) && (properties.get(j).upgrades == colorSets[6][1].upgrades || properties.get(j).upgrades == colorSets[6][1].upgrades - 1) && (properties.get(j).upgrades == colorSets[6][2].upgrades || properties.get(j).upgrades == colorSets[6][2].upgrades - 1)) {
                    System.out.println("The upgrade has been sold. You have received half of the cost to initially upgraded it, and the property has lost an upgrade level.");
                    this.balance = this.balance + 50;
                    properties.get(j).upgrades = properties.get(j).upgrades - 1;
                }
                if ((properties.get(j).upgrades == colorSets[7][0].upgrades || properties.get(j).upgrades == colorSets[7][0].upgrades - 1) && (properties.get(j).upgrades == colorSets[7][1].upgrades || properties.get(j).upgrades == colorSets[7][1].upgrades - 1)) {
                    System.out.println("The upgrade has been sold. You have received half of the cost to initially upgraded it, and the property has lost an upgrade level.");
                    this.balance = this.balance + 50;
                    properties.get(j).upgrades = properties.get(j).upgrades - 1;
                }
            }
        }
    }

}

