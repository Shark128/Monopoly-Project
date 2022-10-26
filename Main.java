import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.awt.image.renderable.RenderableImage;
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
        BoardSpace Empty = new BoardSpace("", 0, new int[]{0, 0, 0, 0, 0, 0},
                0, 8); // Blank spaces take the spots of Chance/Community chest spots.
        topRow[2] = Empty;
        leftCol[3] = Empty;
        rightCol[3] = Empty;
        rightCol[6] = Empty;
        botRow[2] = Empty;
        botRow[7] = Empty;
        Link<BoardSpace> linkEmpty = new Link<BoardSpace>(Empty);
        BoardSpace GO = new BoardSpace("Go", 0, new int[]{0, 0, 0, 0, 0, 0},
                0, 0);
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
        board.insertFirst(linkEmpty);
        board.insertFirst(linkSho);
        board.insertFirst(linkPe);
        board.insertFirst(linkEmpty);
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
        board.insertFirst(linkEmpty);
        board.insertFirst(linkKen);
        board.insertFirst(linkFre);
        board.insertFirst(linkNew);
        board.insertFirst(linkTen);
        board.insertFirst(linkEmpty);
        board.insertFirst(linkStj);
        board.insertFirst(linkPen);
        board.insertFirst(linkVir);
        board.insertFirst(linkSta);
        board.insertFirst(linkEle);
        board.insertFirst(linkStc);
        board.insertFirst(linkJus);
        board.insertFirst(linkCon);
        board.insertFirst(linkVer);
        board.insertFirst(linkEmpty);
        board.insertFirst(linkOri);
        board.insertFirst(linkRea);
        board.insertFirst(linkInc);
        board.insertFirst(linkBal);
        board.insertFirst(linkEmpty);
        board.insertFirst(linkMed);
        board.insertFirst(linkGo);
        // Written by Shreyes
        Scanner scan = new Scanner(System.in);
        System.out.println("How many players are playing?");
        int n = scan.nextInt();
        CircularLinkedList players = new CircularLinkedList();


        Link currentPlayerLink = players.firstLink;
        Link currentBoardLink = board.firstLink;
        while (!isGameOver(players)) {
            Player currentPlayer = (Player) currentPlayerLink.data;
            gameDie.rollDice();
            BoardSpace currentPosition = currentPlayer.currBS;
            for(int i = 0; i < gameDie.totalDiceValue; i++){
                currentBoardLink = currentBoardLink.nextLink;
                currentPlayer.currBS = (BoardSpace) currentBoardLink.data;
            }

            currentPlayerLink = currentPlayerLink.nextLink;
        }

        BoardSpace.printBoard(topRow, leftCol, rightCol, botRow);
    }
    //Bryan
    public static boolean openProperty(BoardSpace boardSpace){
        if (boardSpace.owner != null){
            System.out.println("Would you like to purchase this property for " + boardSpace.purchasePrice + "?" );
            return true;
        }
        else{
            System.out.println("This property is taken. You payed a rent value of");
            return false;
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
    public static boolean isBankrupt (Player player) {
        return player.balance<0;
    }


}
