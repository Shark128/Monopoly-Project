import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Written by Carson (Half of Spaces, Dice, and all of the arrays) & Shreyes (Half of Spaces, All of Links)
        CircularLinkedList board = new CircularLinkedList();
        Dice gameDie = new Dice();
        BoardSpace[] topRow = new BoardSpace[11];
        BoardSpace[] leftCol = new BoardSpace[11];
        BoardSpace[] rightCol = new BoardSpace[11];
        BoardSpace[] botRow = new BoardSpace[11];
        BoardSpace Empty1 = new BoardSpace("Blank Space", 0, new int[]{},
                0, 8);// Blank spaces take the spots of Chance/Community chest spots.
        BoardSpace Empty2 = new BoardSpace("Blank Space", 0, new int[]{},
                0, 8);
        BoardSpace Empty3 = new BoardSpace("Blank Space", 0, new int[]{},
                0, 8);
        BoardSpace Empty4 = new BoardSpace("Blank Space", 0, new int[]{},
                0, 8);
        BoardSpace Empty5 = new BoardSpace("Blank Space", 0, new int[]{},
                0, 8);
        BoardSpace Empty6 = new BoardSpace("Blank Space", 0, new int[]{},
                0, 8);
        topRow[2] = Empty4;
        leftCol[3] = Empty3;
        rightCol[3] = Empty5;
        rightCol[6] = Empty6;
        botRow[2] = Empty1;
        botRow[7] = Empty2;
        Link<BoardSpace> linkEmpty1 = new Link<BoardSpace>(Empty1);
        Link<BoardSpace> linkEmpty2 = new Link<BoardSpace>(Empty2);
        Link<BoardSpace> linkEmpty3 = new Link<BoardSpace>(Empty3);
        Link<BoardSpace> linkEmpty4 = new Link<BoardSpace>(Empty4);
        Link<BoardSpace> linkEmpty5 = new Link<BoardSpace>(Empty5);
        Link<BoardSpace> linkEmpty6 = new Link<BoardSpace>(Empty6);

        BoardSpace GO = new BoardSpace("Go", 0, new int[]{0, 0, 0, 0, 0, 0},
                0, 0);
        Collections.fill(GO.occupier, true);
        botRow[0] = GO;
        rightCol[10] = GO;
        //Creation of all Boardspaces
        Link<BoardSpace> linkGo = new Link<BoardSpace>(GO);
        BoardSpace Mediterranean_Avenue = new BoardSpace("Mediterranean Avenue", 60, new int[]{2, 10, 30, 90, 160, 250},
                1, 1);
        botRow[1] = Mediterranean_Avenue;
        Link<BoardSpace> linkMed = new Link<BoardSpace>(Mediterranean_Avenue);
        BoardSpace Baltic_Avenue = new BoardSpace("Baltic Avenue", 60, new int[]{4, 20, 60, 180, 320, 450},
                1, 1);
        botRow[3] = Baltic_Avenue;
        Link<BoardSpace> linkBal = new Link<BoardSpace>(Baltic_Avenue);
        BoardSpace Income_Tax = new BoardSpace("Income Tax", 0, new int[]{200},
                0, 7);
        botRow[4] = Income_Tax;
        Link<BoardSpace> linkInc = new Link<BoardSpace>(Income_Tax);
        BoardSpace Reading_Railroad = new BoardSpace("Reading Railroad", 200, new int[]{25, 50, 100, 200},
                0, 2);
        botRow[5] = Reading_Railroad;
        Link<BoardSpace> linkRea = new Link<BoardSpace>(Reading_Railroad);
        BoardSpace Oriental_Avenue = new BoardSpace("Oriental Avenue", 100, new int[]{6, 30, 90, 270, 400, 550},
                2, 1);
        botRow[6] = Oriental_Avenue;
        Link<BoardSpace> linkOri = new Link<BoardSpace>(Oriental_Avenue);
        BoardSpace Vermont_Avenue = new BoardSpace("Vermont Avenue", 100, new int[]{6, 30, 90, 270, 400, 550},
                2, 1);
        botRow[8] = Vermont_Avenue;
        Link<BoardSpace> linkVer = new Link<BoardSpace>(Vermont_Avenue);
        BoardSpace Connecticut_Avenue = new BoardSpace("Connecticut Avenue", 120, new int[]{8, 40, 100, 300, 450, 600},
                2, 1);
        botRow[9] = Connecticut_Avenue;
        Link<BoardSpace> linkCon = new Link<BoardSpace>(Connecticut_Avenue);
        BoardSpace JustVisiting_InJail = new BoardSpace("Just Visiting / In Jail", 0, new int[]{0, 0, 0, 0, 0, 0},
                0, 6);
        botRow[10] = JustVisiting_InJail;
        leftCol[10] = JustVisiting_InJail;
        Link<BoardSpace> linkJus = new Link<BoardSpace>(JustVisiting_InJail);
        BoardSpace St_Charles_Place = new BoardSpace("St Charles Place", 140, new int[]{10, 50, 150, 450, 625, 750},
                3, 1);
        leftCol[9] = St_Charles_Place;
        Link<BoardSpace> linkStc = new Link<BoardSpace>(St_Charles_Place);
        BoardSpace Electric_Company = new BoardSpace("Electric Company", 150, new int[]{4 * gameDie.totalDiceValue, 10 * gameDie.totalDiceValue},
                0, 3);
        leftCol[8] = Electric_Company;
        Link<BoardSpace> linkEle = new Link<BoardSpace>(Electric_Company);
        BoardSpace States_Avenue = new BoardSpace("States Avenue", 140, new int[]{10, 50, 150, 450, 625, 750},
                3, 1);
        leftCol[7] = States_Avenue;
        Link<BoardSpace> linkSta = new Link<BoardSpace>(States_Avenue);
        BoardSpace Virginia_Avenue = new BoardSpace("Virginia Avenue", 160, new int[]{12, 60, 180, 500, 700, 900},
                3, 1);
        leftCol[6] = Virginia_Avenue;
        Link<BoardSpace> linkVir = new Link<BoardSpace>(Virginia_Avenue);
        BoardSpace Pennsylvania_Railroad = new BoardSpace("Pennsylvania Railroad", 200, new int[]{25, 50, 100, 200},
                0, 2);
        leftCol[5] = Pennsylvania_Railroad;
        Link<BoardSpace> linkPen = new Link<BoardSpace>(Pennsylvania_Railroad);
        BoardSpace St_James_Place = new BoardSpace("St James Place", 180, new int[]{14, 70, 200, 550, 750, 950},
                4, 1);
        leftCol[4] = St_James_Place;
        Link<BoardSpace> linkStj = new Link<BoardSpace>(St_James_Place);
        BoardSpace Tennessee_Avenue = new BoardSpace("Tennessee Avenue", 180, new int[]{14, 70, 200, 550, 750, 950},
                4, 1);
        leftCol[2] = Tennessee_Avenue;
        Link<BoardSpace> linkTen = new Link<BoardSpace>(Tennessee_Avenue);
        BoardSpace New_York_Avenue = new BoardSpace("New York Avenue", 200, new int[]{16, 80, 220, 600, 800, 1000},
                4, 1);
        leftCol[1] = New_York_Avenue;
        Link<BoardSpace> linkNew = new Link<BoardSpace>(New_York_Avenue);
        BoardSpace FreeParking = new BoardSpace("Free Parking", 0, new int[]{}, 0, 5);
        leftCol[0] = FreeParking;
        topRow[0] = FreeParking;
        Link<BoardSpace> linkFre = new Link<BoardSpace>(FreeParking);
        // Written by Shreyes
        BoardSpace Kentucky_Avenue = new BoardSpace("Kentucky Avenue", 220, new int[]{18, 90, 250, 700, 875, 1050},
                5, 1);
        topRow[1] = Kentucky_Avenue;
        Link<BoardSpace> linkKen = new Link<BoardSpace>(Kentucky_Avenue);
        BoardSpace Indiana_Avenue = new BoardSpace("Indiana Avenue", 220, new int[]{18, 90, 250, 700, 875, 1050},
                5, 1);
        topRow[3] = Indiana_Avenue;
        Link<BoardSpace> linkInd = new Link<BoardSpace>(Indiana_Avenue);
        BoardSpace Illinois_Avenue = new BoardSpace("Illinois Avenue", 240, new int[]{20, 100, 300, 750, 925, 1100},
                5, 1);
        topRow[4] = Illinois_Avenue;
        Link<BoardSpace> linkIll = new Link<BoardSpace>(Illinois_Avenue);
        BoardSpace B_O_Railroad = new BoardSpace("B & O Railroad", 200, new int[]{25, 50, 100, 200},
                0, 2);
        topRow[5] = B_O_Railroad;
        Link<BoardSpace> linkBor = new Link<BoardSpace>(B_O_Railroad);
        BoardSpace Atlantic_Avenue = new BoardSpace("Atlantic Avenue", 260, new int[]{22, 110, 330, 800, 975, 1150},
                6, 1);
        topRow[6] = Atlantic_Avenue;
        Link<BoardSpace> linkAtl = new Link<BoardSpace>(Atlantic_Avenue);
        BoardSpace Ventinor_Avenue = new BoardSpace("Ventinor Avenue", 260, new int[]{22, 110, 330, 800, 975, 1150},
                6, 1);
        topRow[7] = Ventinor_Avenue;
        Link<BoardSpace> linkVen = new Link<BoardSpace>(Ventinor_Avenue);
        BoardSpace Water_Works = new BoardSpace("Water Works", 150, new int[]{4 * gameDie.totalDiceValue, 10 * gameDie.totalDiceValue},
                0, 3);
        topRow[8] = Water_Works;
        Link<BoardSpace> linkWat = new Link<BoardSpace>(Water_Works);
        BoardSpace Marvin_Gardens = new BoardSpace("Marvin Gardens", 280, new int[]{24, 120, 360, 850, 1025, 1200},
                6, 1);
        topRow[9] = Marvin_Gardens;
        Link<BoardSpace> linkMar = new Link<BoardSpace>(Marvin_Gardens);
        BoardSpace Go_To_Jail = new BoardSpace("Go To Jail", 0, new int[]{}, 0, 4);
        topRow[10] = Go_To_Jail;
        rightCol[0] = Go_To_Jail;
        Link<BoardSpace> linkGot = new Link<BoardSpace>(Go_To_Jail);
        // Written by Bryan
        BoardSpace Pacific_Avenue = new BoardSpace("Pacific Avenue", 300, new int[]{26, 130, 390, 900, 1100, 1275},
                7, 1);
        rightCol[1] = Pacific_Avenue;
        Link<BoardSpace> linkPac = new Link<BoardSpace>(Pacific_Avenue);
        BoardSpace North_Carolina_Avenue = new BoardSpace("North Carolina Avenue", 300, new int[]{26, 130, 390, 900, 1100, 1275},
                7, 1);
        rightCol[2] = North_Carolina_Avenue;
        Link<BoardSpace> linkNor = new Link<BoardSpace>(North_Carolina_Avenue);
        BoardSpace Pennsylvania_Avenue = new BoardSpace("Pennsylvania Avenue", 320, new int[]{28, 150, 450, 1000, 1200, 1400},
                7, 1);
        rightCol[4] = Pennsylvania_Avenue;
        Link<BoardSpace> linkPe = new Link<BoardSpace>(Pennsylvania_Avenue);
        BoardSpace Short_Line = new BoardSpace("Short Line", 200, new int[]{25, 50, 100, 200},
                0, 2);
        rightCol[5] = Short_Line;
        Link<BoardSpace> linkSho = new Link<BoardSpace>(Short_Line);
        BoardSpace Park_Place = new BoardSpace("Park Place", 350, new int[]{35, 175, 500, 1100, 1300},
                8, 1);
        rightCol[7] = Park_Place;
        Link<BoardSpace> linkPar = new Link<BoardSpace>(Park_Place);
        BoardSpace Luxury_Tax = new BoardSpace("Luxury Tax", 0, new int[]{100},
                0, 7);
        rightCol[8] = Luxury_Tax;
        Link<BoardSpace> linkLux = new Link<BoardSpace>(Luxury_Tax);
        BoardSpace Boardwalk = new BoardSpace("Boardwalk", 400, new int[]{50, 200, 600, 1400, 1700},
                8, 1);
        rightCol[9] = Boardwalk;
        Link<BoardSpace> linkBoa = new Link<BoardSpace>(Boardwalk);
        // Written by Shreyes, adding all spaces into the cll board (backwards)
        board.insertFirst(linkBoa);
        board.insertFirst(linkLux);
        board.insertFirst(linkPar);
        board.insertFirst(linkEmpty6);
        board.insertFirst(linkSho);
        board.insertFirst(linkPe);
        board.insertFirst(linkEmpty5);
        board.insertFirst(linkNor);
        board.insertFirst(linkPac);
        board.insertFirst(linkGot);
        board.insertFirst(linkMar);
        board.insertFirst(linkWat);
        board.insertFirst(linkVen);
        board.insertFirst(linkAtl);
        board.insertFirst(linkBor);
        board.insertFirst(linkIll);
        board.insertFirst(linkInd);
        board.insertFirst(linkEmpty4);
        board.insertFirst(linkKen);
        board.insertFirst(linkFre);
        board.insertFirst(linkNew);
        board.insertFirst(linkTen);
        board.insertFirst(linkEmpty3);
        board.insertFirst(linkStj);
        board.insertFirst(linkPen);
        board.insertFirst(linkVir);
        board.insertFirst(linkSta);
        board.insertFirst(linkEle);
        board.insertFirst(linkStc);
        board.insertFirst(linkJus);
        board.insertFirst(linkCon);
        board.insertFirst(linkVer);
        board.insertFirst(linkEmpty2);
        board.insertFirst(linkOri);
        board.insertFirst(linkRea);
        board.insertFirst(linkInc);
        board.insertFirst(linkBal);
        board.insertFirst(linkEmpty1);
        board.insertFirst(linkMed);
        board.insertFirst(linkGo);
        // Written by Carson
        BoardSpace[][] colorSets = new BoardSpace[8][3];

        colorSets[0][0] = Mediterranean_Avenue;
        colorSets[0][1] = Baltic_Avenue;
        colorSets[0][2] = null;

        colorSets[1][0] = Oriental_Avenue;
        colorSets[1][1] = Vermont_Avenue;
        colorSets[1][2] = Connecticut_Avenue;

        colorSets[2][0] = St_Charles_Place;
        colorSets[2][1] = States_Avenue;
        colorSets[2][2] = Virginia_Avenue;

        colorSets[3][0] = St_James_Place;
        colorSets[3][1] = Tennessee_Avenue;
        colorSets[3][2] = New_York_Avenue;

        colorSets[4][0] = Kentucky_Avenue;
        colorSets[4][1] = Indiana_Avenue;
        colorSets[4][2] = Illinois_Avenue;

        colorSets[5][0] = Atlantic_Avenue;
        colorSets[5][1] = Ventinor_Avenue;
        colorSets[5][2] = Marvin_Gardens;

        colorSets[6][0] = Pacific_Avenue;
        colorSets[6][1] = North_Carolina_Avenue;
        colorSets[6][2] = Pennsylvania_Avenue;

        colorSets[7][0] = Park_Place;
        colorSets[7][1] = Boardwalk;
        colorSets[7][2] = null;

        // Written by Shreyes
        Scanner scan = new Scanner(System.in);
        System.out.println("How many players are playing?");
        int numberOfPlayers = scan.nextInt();
        CircularLinkedList players = new CircularLinkedList();
        ArrayList<Player> pl = new ArrayList<Player>();
        ArrayList<Player> listOfPlayers = new ArrayList<Player>();
        for (int j = numberOfPlayers; j > 0; j--) { //Scans and enters all players' name and piece symbol
            System.out.println("Player " + j + ", enter your name and a character to symbolize your piece.");
            String name = scan.next();
            char icon = scan.next().charAt(0);
            Player player = new Player(name, icon);
            player.currBS = (BoardSpace) board.firstLink.data;
            Link<Player> link1 = new Link<Player>(player);
            listOfPlayers.add(player);
            players.insertFirst(link1);
        }

        //Written by Bryan
        //Creates link for first player
        Link currentPlayerLink = players.firstLink;
        while (!isGameOver(players)) { //While for until game is over (until 1 player left)
            Player currentPlayer = (Player) currentPlayerLink.data;
            int doubleCounter = 0; //Counter for number of times player has gone in a row
            //resets die values
            gameDie.firstDiceValue = 0;
            gameDie.secondDiceValue = 0;
            //While loop for the player if they roll doubles
            while(gameDie.firstDiceValue == gameDie.secondDiceValue) {
                //If player has stayed in jail for 3 turns
                if(currentPlayer.jailCounter == 3){
                    System.out.println("You have stayed in jail long enough, you are free to go.");
                    currentPlayer.inJail = false;
                }
                Link currentBoardLink = board.find(currentPlayer.currBS);
                BoardSpace currentPosition = currentPlayer.currBS;
                System.out.println(currentPlayer.name + ", it is your turn now. Your current balance is " +currentPlayer.balance);
                if(currentPlayer.inJail){ //Checks if currentPlayer is in jail
                    System.out.print("You are currently in jail and have two options to leave: roll for a double or pay 50 dollars");
                    System.out.println("What would you like to do? (roll or pay)");
                    if(currentPlayer.balance < 50) { //If they can't afford to pay to leave jail they have to roll
                        System.out.println("You can't afford paying the fee so you have to roll the die");
                        gameDie.rollDice();
                        System.out.println("You rolled a "+gameDie.firstDiceValue+" and a "+gameDie.secondDiceValue);
                        //If dice roll if a double, then they get out of jail, moving according to the roll
                        if (gameDie.firstDiceValue == gameDie.secondDiceValue){
                            System.out.println("You got out of jail!");
                            currentPlayer.inJail = false;
                        }
                        else{
                            //If dice wasn't a double, they continue to stay in jail, moves to next player's turn
                            System.out.println("You failed to get out.");
                            currentPlayer.jailCounter++;
                            break;
                        }
                    }
                    else{
                        String input = scan.next().toLowerCase(Locale.ROOT);
                        //If they want to roll
                        if(input.equals("roll")){
                            gameDie.rollDice();
                            System.out.println("You rolled a "+gameDie.firstDiceValue+" and a "+gameDie.secondDiceValue);
                            //If they roll a double, they leave jail and move according to the roll
                            if (gameDie.firstDiceValue == gameDie.secondDiceValue){
                                System.out.println("You rolled a " + gameDie.firstDiceValue + " and a " + gameDie.secondDiceValue + ", totaling " + gameDie.totalDiceValue);
                                System.out.println("You got out of jail!");
                                currentPlayer.inJail = false;
                            }
                            else{ //They continue to stay in jail
                                System.out.println("You didn't roll a double, you still have to stay");
                                currentPlayer.jailCounter++;
                                break;
                            }
                        }
                        //If they choose to pay the money
                        else if(input.equals("pay")){
                            //Removes 50 from their balance and they are no longer in jail
                            System.out.println("You have paid 50 dollars to leave jail");
                            currentPlayer.balance -= 50;
                            currentPlayer.inJail = false;
                            //They roll the dice and continue their regular turn
                            gameDie.rollDice();
                            System.out.println("You rolled a " + gameDie.firstDiceValue + " and a " + gameDie.secondDiceValue + ", totaling " + gameDie.totalDiceValue);
                        }
                    }
                }
                //If not in jail, regular turn continues
                else{
                    gameDie.rollDice(); //Dice is rolled
                    System.out.println("You rolled a " + gameDie.firstDiceValue + " and a " + gameDie.secondDiceValue + ", totaling " + gameDie.totalDiceValue);
                }
                if(gameDie.firstDiceValue == gameDie.secondDiceValue) {
                    //Adds to counter if double is rolled on their turn
                    doubleCounter++;
                }
                //Sends player to jail immediately if 3 doubles are rolled in a row, next player's turn
                if(doubleCounter == 3){
                    System.out.println("You have rolled 3 doubles in a row, you have gone to jail, your turn has ended.");
                    currentPlayer.currBS = JustVisiting_InJail;
                    break;
                }
                //Iterates and moves the player through the board according to dice roll
                for (int i = 0; i < gameDie.totalDiceValue; i++) {
                    currentBoardLink = currentBoardLink.nextLink;
                    currentPlayer.currBS = (BoardSpace) currentBoardLink.data;
                    //If player passes GO, they collect 200 dollars
                    if (currentPlayer.currBS.equals(GO)) {
                        System.out.println("You have passed GO. You have collected 200 dollars");
                        currentPlayer.balance += 200;
                    }
                }
                currentPosition = currentPlayer.currBS;
                System.out.println("You have landed on " + currentPlayer.currBS.name);
                printBoard(topRow, leftCol, rightCol, botRow, pl);
                //If boardSpace landed on is a regular property (excluding railroads and utility)
                if (currentPosition.buildType == 1) {
                    //If property landed on does not have an owner
                    if(currentPosition.owner == null) {
                        //If player can not afford the property
                        if (currentPlayer.balance < currentPosition.purchasePrice) {
                            System.out.println("You don't have enough money to buy this property.");
                        } else {
                            //Scans input on whether the player wishes to buy the property
                            System.out.println("Would you like to buy " + currentPosition.name + "?");
                            String decision = scan.next().toLowerCase(Locale.ROOT);
                            if (decision.equals("yes")) {
                                //Sets owner of boardSpace to currentPlayer and adds the boardSpace to the Arraylist of the player's properties
                                //Subtracts property cost from player's balance
                                currentPlayer.balance = currentPlayer.balance - currentPosition.purchasePrice;
                                currentPosition.owner = currentPlayer;
                                currentPlayer.properties.add(currentPosition);
                                System.out.println("You have bought " + currentPosition.name);
                                System.out.println("Your remaining balance is " +currentPlayer.balance);
                            }
                        }
                    }
                    else{
                        //If player needs to pay rent and does not have enough money, they lose
                        if(currentPlayer.balance < currentPosition.rentCost[currentPosition.upgrades]) {
                            System.out.println("You do not have enough money you lose");
                            players.deleteLink(currentPlayer);
                            break;
                        }
                        //Subtract rent cost based on upgrades from player's balance and adds to owner of boardspace
                        else {
                            currentPlayer.balance -= currentPosition.rentCost[currentPosition.upgrades];
                            currentPosition.owner.balance += currentPosition.rentCost[currentPosition.upgrades];
                            System.out.println("You have payed a rent amount of " + currentPosition.rentCost[currentPosition.upgrades] + " with a remaining balance of " + currentPlayer.balance);
                        }
                    }
                } else if (currentPosition.buildType == 2){ //If boardSpace is a railroad
                    //If railroad does not have an owner
                    if(currentPosition.owner == null) {
                        //If player does not have enough money to purchase the property
                        if (currentPlayer.balance < currentPosition.purchasePrice) {
                            System.out.println("You don't have enough money to buy this property.");
                        } else {
                            //Scans whether the player wishes to buy the property
                            System.out.println("Would you like to buy " + currentPosition.name + "?");
                            String decision = scan.next().toLowerCase(Locale.ROOT);
                            if (decision.equals("yes")) {
                                //Sets owner of boardSpace to currentPlayer and adds the boardSpace to the Arraylist of the player's properties
                                //Subtracts property cost from player's balance
                                currentPlayer.balance = currentPlayer.balance - currentPosition.purchasePrice;
                                currentPosition.owner = currentPlayer;
                                currentPlayer.properties.add(currentPosition);
                                System.out.println("You have bought " + currentPosition.name);
                                System.out.println("Your remaining balance is " +currentPlayer.balance);
                            }
                        }
                    }
                    else{
                        //If boardSpace has an owner and player does not have enough money to pay rent
                        if(currentPlayer.balance < currentPosition.rentCost[currentPosition.upgrades]) {
                            //Player is deleted from game
                            System.out.println("You do not have enough money you lose");
                            players.deleteLink(currentPlayer);
                            break;
                        }
                        else {
                            //calculates the amount of railroads the owner of the railroad has
                            int amountOfProperties = -1;
                            for(int i = 0; i < currentPosition.owner.properties.size(); i++){
                                if(currentPosition.owner.properties.get(i).buildType == 2){
                                    amountOfProperties++;
                                }
                            }
                            //Deducts rent from currentPlayer and adds to owner's balance
                            currentPlayer.balance -= currentPosition.rentCost[amountOfProperties];
                            currentPosition.owner.balance += currentPosition.rentCost[amountOfProperties];
                            System.out.println("You have payed a rent amount of " + currentPosition.rentCost[amountOfProperties] + " with a remaining balance of " + currentPlayer.balance);
                        }
                    }
                }else if (currentPosition.buildType == 3){ //If boardSpace is utility space
                    //If current property does not have an owner
                    if(currentPosition.owner == null) {
                        //If player can not afford to pay purchase cost
                        if (currentPlayer.balance < currentPosition.purchasePrice) {
                            System.out.println("You don't have enough money to buy this property.");
                        } else {
                            //Scans decision to buy property
                            System.out.println("Would you like to buy " + currentPosition.name + "?");
                            String decision = scan.next().toLowerCase(Locale.ROOT);
                            if (decision.equals("yes")) {
                                //Sets owner of boardSpace to currentPlayer and adds the boardSpace to the Arraylist of the player's properties
                                //Subtracts property cost from player's balance
                                currentPlayer.balance = currentPlayer.balance - currentPosition.purchasePrice;
                                currentPosition.owner = currentPlayer;
                                currentPlayer.properties.add(currentPosition);
                                System.out.println("You have bought " + currentPosition.name);
                                System.out.println("Your remaining balance is " +currentPlayer.balance);
                            }
                        }
                    }
                    else{
                        //If this property has an owner and currentPlayer can not pay rent
                        if(currentPlayer.balance < currentPosition.rentCost[currentPosition.upgrades]) {
                            System.out.println("You do not have enough money you lose");
                            players.deleteLink(currentPlayer);
                            break;
                        }
                        else {
                            //Calculates rent cost based on number of properties
                            int amountOfProperties = -1;
                            for(int i = 0; i < currentPosition.owner.properties.size(); i++){
                                if(currentPosition.owner.properties.get(i).buildType == 2){
                                    amountOfProperties++;
                                }
                            }
                            //Deducts rent cost from currentPlayer's balance and adds to owner of property's balance
                            currentPlayer.balance -= currentPosition.rentCost[amountOfProperties];
                            currentPosition.owner.balance += currentPosition.rentCost[amountOfProperties];
                            System.out.println("You have payed a rent amount of " + currentPosition.rentCost[amountOfProperties] + " with a remaining balance of " + currentPlayer.balance);
                        }
                    }
                }else if (currentPosition.buildType == 4){ //If landed on go to jail space
                    //Player goes to jail, sets inJail to true, and turn moves onto the next player
                    System.out.println("You are going to jail");
                    currentPlayer.currBS = JustVisiting_InJail;
                    currentPlayer.inJail = true;
                    break;
                }else if (currentPosition.buildType == 5){ //If landed on free parking, nothing happens
                    System.out.println("Congrats you get to park for free!");
                }else if (currentPosition.buildType == 6){ //If landed on visiting jail boardSpace
                    System.out.println("You are just visiting jail so nothing to worry about");
                }else if (currentPosition.buildType == 7){ //If landed on income tax or luxury tax
                    //If can not afford tax
                    if(currentPlayer.balance < currentPosition.rentCost[0]){
                        //Player is deleted from list and loses game, turn moves on to next player
                        System.out.println("The taxes gottcha, you lose");
                        players.deleteLink(currentPlayer);
                        break;
                    }
                    else{
                        //Pay the tax
                        System.out.println("You paid taxes of "+currentPosition.rentCost[0]+" dollars");
                        currentPlayer.balance -= currentPosition.rentCost[0];
                        System.out.println("Your remaining balance is " +currentPlayer.balance);
                    }
                }
                //Loops through if the player wishes to do any optional actions
                while(true) {
                    //Scans whether the player would like to commit and additional actions
                    System.out.println("Would you like your current turn to be over?");
                    String answer = scan.next().toLowerCase(Locale.ROOT);
                    if(answer.equals("yes")){
                        //Turn moves on to next player
                        break;
                    }
                    //Scans what the player would like to do
                    System.out.println("What would you like to do now: trade, upgrade, or sell (houses/hotels)");
                    String move = scan.next().toLowerCase(Locale.ROOT);
                    //Player is shown the trade menu
                    switch (move) {
                        case "trade" -> tradeProperties(currentPlayer, listOfPlayers);

                        //Player is shown the upgrade menu
                        case "upgrade" -> currentPlayer.upgradeProperties(colorSets);

                        //Player is shown the sell upgrade menu
                        case "sell" -> currentPlayer.sellUpgrades(colorSets);
                    }
                }
            }
            //Moves turn onto next player
            currentPlayerLink = currentPlayerLink.nextLink;
        }
    }
    //Shreyes
    public static boolean isGameOver (CircularLinkedList players) {
        if (players.firstLink == players.lastLink) {
            return true;
        }
        else {
            return false;
        }
    }
    // Carson
    public static boolean isBankrupt (Player player) {
        return player.balance<0;
    }
    // Written by Shreyes and Carson
    public static void printBoard(BoardSpace[] topRow, BoardSpace[] leftCol, BoardSpace[] rightCol, BoardSpace[] botRow, ArrayList<Player> players){
        // the arrays have the properties as board spaces
        // topRow contains the whole top row, left & rightCol have everything from NYA and Pac. Ave. to the bottom,
        // botRow has just the stuff in between jail and go
        String spacing = " "; // this is for convenience so I can use .repeat
        System.out.println("┎----------------------------------┓┎-----------------------┓┎-----------------------┓┎-----------------------┓┎-----------------------┓┎-----------------------┓┎-----------------------┓┎-----------------------┓┎-----------------------┓┎-----------------------┓┎----------------------------------┓");
        // above is the top of the board
        System.out.print("           Free Parking                    ");
        // Free Parking is hardcoded so I have the corner b/c all of the corners are a bit strange
        // Could have done without hardcoding but I wasn't sure how at the time I made this so I didn't
        for(int i = 1; i < 11; i++){
            System.out.print(topRow[i].name + spacing.repeat(25-topRow[i].name.length()));
        }
        // this prints the names of the topRow spaces at the top of the square, putting spaces between the names
        // corresponding to the length of the space name (to make spacing work properly)
        System.out.println();
        System.out.println("|                                  ||                       ||                       ||                       ||                       ||                       ||                       ||                       ||                       ||                       ||                                  |");
        // this section deals with printing upgrades, the spacing might be scuffed at the time of making but will fix
        System.out.print("                                            ");
        for (int i = 1; i<11; i++) {
            int upgradeNum = topRow[i].upgrades;
            if (upgradeNum == 0) continue; // keep moving if there are no properties
            else if (upgradeNum<5) {
                for (int j = 0; j<upgradeNum; j++) {
                    System.out.print("^"); // this is the symbol for a house, you have up to 4 houses
                }
            }
            else { // hopefully you don't have a negative or >5 upgrade number
                System.out.print("||"); // hotel symbol
            }
            System.out.print(spacing.repeat(22)); // here the amount of characters is so few that I don't need
            // to base it off of spacing for it to be spaced decently well
        }
        System.out.println();
        System.out.print("                                            ");
        // this section is for the purchase price, only prints a price if that price is not 0
        for (int i = 1; i<11; i++) {
            if (topRow[i].purchasePrice != 0) {System.out.print("$" + topRow[i].purchasePrice + spacing.repeat(21));}
            else { System.out.print(spacing.repeat(25));}
        }
        System.out.println();
        // finishing up the square
        System.out.println("|                                  ||                       ||                       ||                       ||                       ||                       ||                       ||                       ||                       ||                       ||                                  |");
        System.out.println("|                                  ||                       ||                       ||                       ||                       ||                       ||                       ||                       ||                       ||                       ||                                  |");
        System.out.print("                    ");
        for (int i = 0; i<11; i++) {
            for (int j = 0; j<topRow[i].occupier.size(); j++) {
                if (topRow[i].occupier.get(j)) {
                    System.out.print(players.get(j).icon + "                    ");
                }
                else {
                    System.out.print("                     ");
                }
            } // fix this
        }
        System.out.println("|                                  ||                       ||                       ||                       ||                       ||                       ||                       ||                       ||                       ||                       ||                                  |");
        System.out.println("┗----------------------------------┛┗-----------------------┛┗-----------------------┛┗-----------------------┛┗-----------------------┛┗-----------------------┛┗-----------------------┛┗-----------------------┛┗-----------------------┛┗-----------------------┛┗----------------------------------┛");
        // top row done
        // left & right cols (together b/c java goes down when printing)
        for(int i = 1; i < 10; i++) { // starts from 1 b/c the top row was 0
            System.out.println("┎----------------------------------┓                                                                                                                                                                                                                                 ┎----------------------------------┓");
            System.out.print(spacing.repeat(10));
            System.out.println(leftCol[i].name + spacing.repeat(260-leftCol[i].name.length()) + rightCol[i].name);
            // for similar reasons as topRow's names, the spacing is based on the length of the left name
            System.out.println("|                                  |                                                                                                                                                                                                                                 |                                  |");
            // leftCol's upgrades - basically the same as topRow's properties
            int upgradeNum = leftCol[i].upgrades;
            if (upgradeNum == 0) {
                // do nothing
                // this is the only difference between topRow's upgrades & column upgrades b/c continue would send you
                // down one space which is bad
            }
            else if (upgradeNum<5) {
                for (int j = 0; j<upgradeNum; j++) {
                    System.out.print("^");
                }
            }
            else {
                System.out.print("||");
            }
            System.out.print(spacing.repeat(260)); // spacing in between
            // rightCol's upgrades
            upgradeNum = rightCol[i].upgrades;
            if (upgradeNum == 0) {
                // do nothing
            }
            else if (upgradeNum<5) {
                for (int j = 0; j<upgradeNum; j++) {
                    System.out.print("^");
                }
            }
            else {
                System.out.print("||");
            }


            System.out.println();
            System.out.println("|                                  |                                                                                                                                                                                                                                 |                                  |");
            // purchase price, the difference between here and above is that if price is 0 the print statement changes
            // to accommodate the fact that there is nothing
            if (leftCol[i].purchasePrice != 0 && rightCol[i].purchasePrice != 0) {
                System.out.println(spacing.repeat(15) + "$" + leftCol[i].purchasePrice + spacing.repeat(256) + "$" + rightCol[i].purchasePrice);
            }
            else if (rightCol[i].purchasePrice != 0) {
                System.out.println(spacing.repeat(274) + "$" + rightCol[i].purchasePrice);
            }
            else if (leftCol[i].purchasePrice != 0) {
                System.out.println(spacing.repeat(15) + "$" + leftCol[i].purchasePrice);
            }
            else {
                System.out.println();
            }
            System.out.println("|                                  |                                                                                                                                                                                                                                 |                                  |");
            System.out.println("|                                  |                                                                                                                                                                                                                                 |                                  |");
            System.out.println("|                                  |                                                                                                                                                                                                                                 |                                  |");
            System.out.println("|                                  |                                                                                                                                                                                                                                 |                                  |");
            System.out.println("┗----------------------------------┛                                                                                                                                                                                                                                 ┗----------------------------------┛");
        }
        // columns done
        // botRow
        System.out.println("┎----------------------------------┓┎-----------------------┓┎-----------------------┓┎-----------------------┓┎-----------------------┓┎-----------------------┓┎-----------------------┓┎-----------------------┓┎-----------------------┓┎-----------------------┓┎----------------------------------┓");
        System.out.print("       Just Visiting/In Jail            ");
        // fix above
        // starts from 9 because 10 is Just Visiting/In Jail and that's dealt with specially
        // everything here is all but the same as topRow
        for(int i = 9; i >= 0; i--){
            System.out.print(botRow[i].name + spacing.repeat(25-botRow[i].name.length()));
        }
        System.out.println();
        System.out.println("|                                  ||                       ||                       ||                       ||                       ||                       ||                       ||                       ||                       ||                       ||                                  |");
        System.out.print("                                            ");
        for (int i = 9; i>=0; i--) {
            int upgradeNum = botRow[i].upgrades;
            if (upgradeNum == 0) continue;
            else if (upgradeNum<5) {
                for (int j = 0; j<upgradeNum; j++) {
                    System.out.print("^");
                }
            }
            else {
                System.out.print("||");
            }
            System.out.print(spacing.repeat(22-upgradeNum));
        }
        System.out.println();
        System.out.println("|                                  ||                       ||                       ||                       ||                       ||                       ||                       ||                       ||                       ||                       ||                                  |");
        System.out.print("                                            ");
        for (int i = 9; i>=0; i--) {
            if (botRow[i].purchasePrice != 0) {System.out.print("$" + botRow[i].purchasePrice + spacing.repeat(21));}
            else { System.out.print(spacing.repeat(25));}
        }
        System.out.println();
        System.out.println("|                                  ||                       ||                       ||                       ||                       ||                       ||                       ||                       ||                       ||                       ||                                  |");
        System.out.println("|                                  ||                       ||                       ||                       ||                       ||                       ||                       ||                       ||                       ||                       ||                                  |");
        System.out.println("|                                  ||                       ||                       ||                       ||                       ||                       ||                       ||                       ||                       ||                       ||                                  |");
        System.out.println("┗----------------------------------┛┗-----------------------┛┗-----------------------┛┗-----------------------┛┗-----------------------┛┗-----------------------┛┗-----------------------┛┗-----------------------┛┗-----------------------┛┗-----------------------┛┗----------------------------------┛");
    }

    // Written by Carson
    public static void tradeProperties(Player currentPlayer, ArrayList<Player> listOfPlayers){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, "+currentPlayer.name+". Enter the name of the player you wish to trade with.");
        String tradePartnerName = sc.next().toLowerCase(Locale.ROOT);

        for (int i = 0; i < listOfPlayers.size(); i++){
            if (tradePartnerName.equals(listOfPlayers.get(i).name.toLowerCase(Locale.ROOT))){ // Locates tradePartner within player list.
                Player tradePartner = listOfPlayers.get(i);
                System.out.println("Here are "+currentPlayer.name+"'s properties: "); // Displays all properties so users are aware what they can trade for.
                for (int j = 0; j < currentPlayer.properties.size(); j++){
                    System.out.println(j+": "+currentPlayer.properties.get(j).name);
                }
                System.out.println("Here are "+tradePartner.name+"'s properties: ");
                for (int k = 0; k < tradePartner.properties.size(); k++){
                    System.out.println(k+": "+tradePartner.properties.get(k).name);
                }

                System.out.println(currentPlayer.name+" enter the number (shown above) of the property you want to trade AWAY: ");
                int p1PropertyToTrade = sc.nextInt(); // Locates property user wishes to trade away.
                ArrayList<Integer> p1IndexOfPropertiesToTrade = new ArrayList<Integer>();
                p1IndexOfPropertiesToTrade.add(p1PropertyToTrade);

                System.out.println("Do you want to trade more properties?"); // Allows user to trade for more than 1 property.
                String response = sc.next().toLowerCase(Locale.ROOT);
                while(response.equals("yes")){
                    System.out.println(currentPlayer.name+" enter the number (shown above) of the property you want to trade AWAY: ");
                    int p1NewPropertyToTrade = sc.nextInt();
                    p1IndexOfPropertiesToTrade.add(p1NewPropertyToTrade);
                    System.out.println("Do you want to trade more properties?"); // Allows user to trade for more than 1 property.
                    response = sc.next().toLowerCase(Locale.ROOT);
                }

                System.out.println(currentPlayer.name+" how much cash do you want to trade? If none, enter 0: ");
                int p1CashToTrade = sc.nextInt(); // Cash can be traded as well, but it is not required.

                System.out.println(tradePartner.name+" enter the number (shown above) of the property you want to trade: ");
                int p2PropertyToTrade = sc.nextInt(); // Repeats the same process for other player involved in trade.
                ArrayList<Integer> p2IndexOfPropertiesToTrade = new ArrayList<Integer>();
                p2IndexOfPropertiesToTrade.add(p2PropertyToTrade);
                System.out.println("Do you want to trade more properties?");
                String p2response = sc.next().toLowerCase(Locale.ROOT);
                while(p2response.equals("yes")){
                    System.out.println(tradePartner.name+" enter the number (shown above) of the property you want to trade: ");
                    int p2NewPropertyToTrade = sc.nextInt();
                    p2IndexOfPropertiesToTrade.add(p2NewPropertyToTrade);
                    System.out.println("Do you want to trade more properties?");
                    p2response = sc.next().toLowerCase(Locale.ROOT);
                }
                System.out.println(tradePartner.name+" how much cash do you want to trade? If none, enter 0: ");
                int p2CashToTrade = sc.nextInt();

                // Informs users of what exactly is being traded.
                System.out.println(currentPlayer.name+", you are trading away the following: ");
                for (int l = 0; l < p1IndexOfPropertiesToTrade.size(); l++){
                    System.out.println(currentPlayer.properties.get(p1IndexOfPropertiesToTrade.get(l)).name);
                }
                if (p1CashToTrade > 0){
                    System.out.println("and "+p1CashToTrade+" dollars.");
                }

                System.out.println(tradePartner.name+", you are trading away the following: ");
                for (int m = 0; m < p1IndexOfPropertiesToTrade.size(); m++){
                    System.out.println(tradePartner.properties.get(p2IndexOfPropertiesToTrade.get(m)).name);
                }
                if (p2CashToTrade > 0){
                    System.out.println("and "+p2CashToTrade+" dollars.");
                }
                // Gives users options to deny or accept the trade.
                System.out.println("Do both players agree to the trade? If not, nothing will happen.");
                String response3 = sc.next().toLowerCase(Locale.ROOT);
                if (response3.equals("yes")){
                    System.out.println("The trade has been agreed upon!");
                    // Adds or removes cash to users balance depending on how much, if any, they traded.
                    currentPlayer.balance = currentPlayer.balance - p1CashToTrade + p2CashToTrade;
                    tradePartner.balance = tradePartner.balance - p2CashToTrade + p1CashToTrade;
                    // stores users property that they will receive.
                    ArrayList<BoardSpace> p2PropertyToReceive = new ArrayList<BoardSpace>();
                    ArrayList<BoardSpace> p1PropertyToReceive = new ArrayList<BoardSpace>();
                    // removes property each user is trading away and stores in into the other players toReceive arraylist.
                    for (int n = 0; n < p1IndexOfPropertiesToTrade.size(); n++){
                        BoardSpace temp = currentPlayer.properties.get(p1IndexOfPropertiesToTrade.get(n));
                        p2PropertyToReceive.add(temp);
                        currentPlayer.properties.remove(p1IndexOfPropertiesToTrade.get(n));
                    }
                    // Repeats process for player 2.
                    for (int o = 0; o < p2IndexOfPropertiesToTrade.size(); o++){
                        BoardSpace temp2 = tradePartner.properties.get(p2IndexOfPropertiesToTrade.get(o));
                        p1PropertyToReceive.add(temp2);
                        tradePartner.properties.remove(p2IndexOfPropertiesToTrade.get(o));
                    }
                    // Finally adds all properties traded into each users inventory.
                    for (int p = 0; p < p1PropertyToReceive.size(); p++){
                       currentPlayer.properties.add(p1PropertyToReceive.get(p));
                    }
                    for (int q = 0; q < p2PropertyToReceive.size(); q++){
                        tradePartner.properties.add(p2PropertyToReceive.get(q));
                    }
                }
                else{
                    System.out.println("The trade was not agreed upon. Sorry.");
                    return; // If the trade is not agreed upon, the process ends.
                }
            }
        }
    }
}