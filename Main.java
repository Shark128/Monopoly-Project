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
        BoardSpace Empty = new BoardSpace("Blank Space", 0, new int[]{},
                0, 8); // Blank spaces take the spots of Chance/Community chest spots.
        topRow[2] = Empty;
        leftCol[3] = Empty;
        rightCol[3] = Empty;
        rightCol[6] = Empty;
        botRow[2] = Empty;
        botRow[7] = Empty;
        Link<BoardSpace> linkEmpty1 = new Link<BoardSpace>(Empty);
        Link<BoardSpace> linkEmpty2 = new Link<BoardSpace>(Empty);
        Link<BoardSpace> linkEmpty3 = new Link<BoardSpace>(Empty);
        Link<BoardSpace> linkEmpty4 = new Link<BoardSpace>(Empty);
        Link<BoardSpace> linkEmpty5 = new Link<BoardSpace>(Empty);
        Link<BoardSpace> linkEmpty6 = new Link<BoardSpace>(Empty);

        BoardSpace GO = new BoardSpace("Go", 0, new int[]{0, 0, 0, 0, 0, 0},
                0, 0);
        Collections.fill(GO.occupier, true);
        botRow[0] = GO;
        rightCol[10] = GO;
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
        for (int j = numberOfPlayers; j > 0; j--) {
            System.out.println("Player " + j + ", enter your name and a character to symbolize your piece.");
            String name = scan.next();
            char icon = scan.next().charAt(0);
            Player player = new Player(name, icon);
            player.currBS = (BoardSpace) board.firstLink.data;
            Link<Player> link1 = new Link<Player>(player);
            players.insertFirst(link1);
        }

        //Written by Bryan
        Link currentPlayerLink = players.firstLink;
        while (!isGameOver(players)) {
            Player currentPlayer = (Player) currentPlayerLink.data;
            int doubleCounter = 0;
            gameDie.firstDiceValue = 0;
            gameDie.secondDiceValue = 0;
            while(gameDie.firstDiceValue == gameDie.secondDiceValue) {
                Link currentBoardLink = board.find(currentPlayer.currBS);
                BoardSpace currentPosition = currentPlayer.currBS;
                System.out.println(currentPlayer.name + ", it is your turn now. Your current balance is" +currentPlayer.balance);
                if(currentPlayer.inJail){
                    System.out.print("You are currently in jail and have two options to leave: roll for a double or pay 50 dollars");
                    System.out.println("What would you like to do? (roll or pay)");
                    if(currentPlayer.balance < 50) {
                        System.out.println("You can't afford paying the fee so you have to roll the die");
                        gameDie.rollDice();
                        System.out.println("You rolled a "+gameDie.firstDiceValue+" and a "+gameDie.secondDiceValue);
                        if (gameDie.firstDiceValue == gameDie.secondDiceValue){
                            System.out.println("You got out of jail!");
                            currentPlayer.inJail = false;
                        }
                        else{
                            System.out.println("You failed to get out.");
                            break;
                        }
                    }
                    else{
                        String input = scan.nextLine().toLowerCase(Locale.ROOT);
                        if(input.equals("roll")){
                            gameDie.rollDice();
                            System.out.println("You rolled a "+gameDie.firstDiceValue+" and a "+gameDie.secondDiceValue);
                            if (gameDie.firstDiceValue == gameDie.secondDiceValue){
                                System.out.println("You rolled a " + gameDie.firstDiceValue + " and a " + gameDie.secondDiceValue + ", totaling " + gameDie.totalDiceValue);
                                System.out.println("You got out of jail!");
                                currentPlayer.inJail = false;
                            }
                            else{
                                System.out.println("You didn't roll a double, you still have to stay");
                                break;
                            }
                        }
                        else if(input.equals("pay")){
                            System.out.println("You have paid 50 dollars to leave jail");
                            currentPlayer.balance -= 50;
                            currentPlayer.inJail = false;
                            gameDie.rollDice();
                            System.out.println("You rolled a " + gameDie.firstDiceValue + " and a " + gameDie.secondDiceValue + ", totaling " + gameDie.totalDiceValue);
                        }
                    }
                }
                else{
                    gameDie.rollDice();
                    System.out.println("You rolled a " + gameDie.firstDiceValue + " and a " + gameDie.secondDiceValue + ", totaling " + gameDie.totalDiceValue);
                }
                if(gameDie.firstDiceValue == gameDie.secondDiceValue) {
                    doubleCounter++;
                }
                if(doubleCounter == 3){
                    System.out.println("You have rolled 3 doubles in a row, you have gone to jail, your turn has ended.");
                    currentPlayer.currBS = JustVisiting_InJail;
                    break;
                }
                for (int i = 0; i < gameDie.totalDiceValue; i++) {
                    currentBoardLink = currentBoardLink.nextLink;
                    currentPlayer.currBS = (BoardSpace) currentBoardLink.data;
                    if (currentPlayer.currBS.equals(GO)) {
                        System.out.println("You have passed GO. You have collected 200 dollars");
                        currentPlayer.balance += 200;
                    }
                }
                currentPosition = currentPlayer.currBS;
                System.out.println("You have landed on " + currentPlayer.currBS.name);
                printBoard(topRow, leftCol, rightCol, botRow, players);
                if (currentPosition.buildType == 1) {
                    if(currentPosition.owner == null) {
                        if (currentPlayer.balance < currentPosition.purchasePrice) {
                            System.out.println("You don't have enough money to buy this property.");
                        } else {
                            System.out.println("Would you like to buy " + currentPosition.name + "?");
                            String decision = scan.nextLine().toLowerCase(Locale.ROOT);
                            if (decision.equals("yes")) {
                                currentPlayer.balance = currentPlayer.balance - currentPosition.purchasePrice;
                                currentPosition.owner = currentPlayer;
                                currentPlayer.properties.add(currentPosition);
                                System.out.println("You have bought " + currentPosition.name);
                                System.out.println("Your remaining balance is " +currentPlayer.balance);
                            }
                        }
                    }
                    else{
                        if(currentPlayer.balance < currentPosition.rentCost[currentPosition.upgrades]) {
                            System.out.println("You do not have enough money you lose");
                            players.deleteLink(currentPlayer);
                            break;
                        }
                        else {
                            currentPlayer.balance -= currentPosition.rentCost[currentPosition.upgrades];
                            currentPosition.owner.balance += currentPosition.rentCost[currentPosition.upgrades];
                            System.out.println("You have payed a rent amount of " + currentPosition.rentCost[currentPosition.upgrades] + " with a remaining balance of " + currentPlayer.balance);
                        }
                    }
                } else if (currentPosition.buildType == 2){
                    if(currentPosition.owner == null) {
                        if (currentPlayer.balance < currentPosition.purchasePrice) {
                            System.out.println("You don't have enough money to buy this property.");
                        } else {
                            System.out.println("Would you like to buy " + currentPosition.name + "?");
                            String decision = scan.nextLine().toLowerCase(Locale.ROOT);
                            if (decision.equals("yes")) {
                                currentPlayer.balance = currentPlayer.balance - currentPosition.purchasePrice;
                                currentPosition.owner = currentPlayer;
                                currentPlayer.properties.add(currentPosition);
                                System.out.println("You have bought " + currentPosition.name);
                                System.out.println("Your remaining balance is " +currentPlayer.balance);
                            }
                        }
                    }
                    else{
                        if(currentPlayer.balance < currentPosition.rentCost[currentPosition.upgrades]) {
                            System.out.println("You do not have enough money you lose");
                            players.deleteLink(currentPlayer);
                            break;
                        }
                        else {
                            currentPlayer.balance -= currentPosition.rentCost[currentPosition.upgrades];
                            currentPosition.owner.balance += currentPosition.rentCost[currentPosition.upgrades];
                            System.out.println("You have payed a rent amount of " + currentPosition.rentCost[currentPosition.upgrades] + " with a remaining balance of " + currentPlayer.balance);
                        }
                    }
                }else if (currentPosition.buildType == 3){
                    if(currentPosition.owner == null) {
                        if (currentPlayer.balance < currentPosition.purchasePrice) {
                            System.out.println("You don't have enough money to buy this property.");
                        } else {
                            System.out.println("Would you like to buy " + currentPosition.name + "?");
                            String decision = scan.nextLine().toLowerCase(Locale.ROOT);
                            if (decision.equals("yes")) {
                                currentPlayer.balance = currentPlayer.balance - currentPosition.purchasePrice;
                                currentPosition.owner = currentPlayer;
                                currentPlayer.properties.add(currentPosition);
                                System.out.println("You have bought " + currentPosition.name);
                                System.out.println("Your remaining balance is " +currentPlayer.balance);
                            }
                        }
                    }
                    else{
                        if(currentPlayer.balance < currentPosition.rentCost[currentPosition.upgrades]) {
                            System.out.println("You do not have enough money you lose");
                            players.deleteLink(currentPlayer);
                            break;
                        }
                        else {
                            currentPlayer.balance -= currentPosition.rentCost[currentPosition.upgrades];
                            currentPosition.owner.balance += currentPosition.rentCost[currentPosition.upgrades];
                            System.out.println("You have payed a rent amount of " + currentPosition.rentCost[currentPosition.upgrades] + " with a remaining balance of " + currentPlayer.balance);
                        }
                    }
                }else if (currentPosition.buildType == 4){
                    System.out.println("You are going to jail");
                    currentPlayer.currBS = JustVisiting_InJail;
                    currentPlayer.inJail = true;
                    break;
                }else if (currentPosition.buildType == 5){
                    System.out.println("Congrats you get to park for free!");
                }else if (currentPosition.buildType == 6){
                    System.out.println("You are just visiting jail so nothing to worry about");
                }else if (currentPosition.buildType == 7){
                    if(currentPlayer.balance < 200){
                        System.out.println("The taxes gottcha, you lose");
                        players.deleteLink(currentPlayer);
                        break;
                    }
                    else{
                        System.out.println("You paid taxes of 200 dollars");
                        currentPlayer.balance -= 200;
                    }
                }
                while(true) {
                    System.out.println("Would you like your current turn to be over?");
                    String answer = scan.nextLine().toLowerCase(Locale.ROOT);
                    if(answer.equals("yes")){
                        break;
                    }
                    System.out.println("What would you like to do now: trade or upgrade");
                    String move = scan.nextLine().toLowerCase(Locale.ROOT);
                    if(move.equals("trade")){
                        //trade
                    }
                    else if(move.equals("upgrade")){
                        currentPlayer.upgradeProperties(colorSets);
                    }
                }
            }
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
    public static void printBoard(BoardSpace[] topRow, BoardSpace[] leftCol, BoardSpace[] rightCol, BoardSpace[] botRow, CircularLinkedList players){
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
        System.out.print("                     ");
        for (int j = 0; j<topRow[0].occupier.size(); j++) {

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
    public void tradeProperties(Player currentPlayer){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, "+currentPlayer.name+". Enter the name of the player you wish to trade with.");
        String tradePartnerName = sc.next().toLowerCase(Locale.ROOT);

    }
}
