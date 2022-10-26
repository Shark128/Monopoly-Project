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

    public Player (String name, char icon){
        this.name = name;
        balance = 1500;
        properties = new ArrayList<BoardSpace>();
        this.icon =  icon;
        inJail = false;
        dead = false;
        currBS = null;
    }

    // Written by Carson
    public void upgradeProperties(BoardSpace[][] colorSets){
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
        for(int i = 0; i < properties.size(); i++){
            if(properties.get(i).color == 1){
                brownCounter++;
            }
            if(properties.get(i).color == 2){
                babyBlueCounter++;
            }
            if(properties.get(i).color == 3){
                pinkCounter++;
            }
            if(properties.get(i).color == 4){
                orangeCounter++;
            }
            if(properties.get(i).color == 5){
                redCounter++;
            }
            if(properties.get(i).color == 6){
                yellowCounter++;
            }
            if(properties.get(i).color == 7){
                greenCounter++;
            }
            if(properties.get(i).color == 8){
                darkBlueCounter++;
            }
            for(int j = 0; j < properties.size(); j++){
                if(brownCounter == 3 && properties.get(j).color == 1){
                    System.out.println(j+": "+properties.get(j));
                   // Check to make sure each property is within 1 upgrade of each other, then present options
                }
                if(babyBlueCounter == 3 && properties.get(j).color == 2){
                    System.out.println(j+": "+properties.get(j));
                }
                if(pinkCounter == 3 && properties.get(j).color == 3){
                    System.out.println(j+": "+properties.get(j));
                }
                if(orangeCounter == 3 && properties.get(j).color == 4){
                    System.out.println(j+": "+properties.get(j));
                }
                if(redCounter == 3 && properties.get(j).color == 5){
                    System.out.println(j+": "+properties.get(j));
                }
                if(yellowCounter == 3 && properties.get(j).color == 6){
                    System.out.println(j+": "+properties.get(j));
                }
                if(greenCounter == 3 && properties.get(j).color == 7){
                    System.out.println(j+": "+properties.get(j));
                }
                if(darkBlueCounter == 3 && properties.get(j).color == 8){
                    System.out.println(j+": "+properties.get(j));
                }
            }
        }
        int response = sc.nextInt();
        for(int i = 0; i < properties.size(); i++){
            if(response == i){

            }

        }

    }


}
