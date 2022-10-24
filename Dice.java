public class Dice { // Written by Carson
    public int totalDiceValue;
    public int firstDiceValue;
    public int secondDiceValue;

    public Dice(){
        firstDiceValue = 0;
        secondDiceValue = 0;
        totalDiceValue = 0;
    }

    public int[] rollDice(){
        int min = 1; // Dice can only roll between 1 and 6.
        int max = 6;
        // Randomizes diceValues between 1 and 6.
        firstDiceValue = (int)Math.floor(Math.random() * (max-min+1)+min);
        secondDiceValue = (int)Math.floor(Math.random() * (max-min+1)+min);
        totalDiceValue = firstDiceValue + secondDiceValue;
        int[] dieValues = new int[3];
        dieValues[0] = firstDiceValue;
        dieValues[1] = secondDiceValue;
        dieValues[2] = totalDiceValue;
        return dieValues;
    }
    public boolean isDouble () { return firstDiceValue == secondDiceValue; }

}
