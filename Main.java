public class Main {
    public static void main(String[] args) {
        // Written by Carson
        BoardSpace GO = new BoardSpace(0, new int[]{0,0,0,0,0,0},
                0, 0);
        BoardSpace Mediterranean_Avenue = new BoardSpace(60, new int[]{2, 10, 30, 90, 160, 250},
                1, 1);
        // Add Community Chest BoardSpace Community_Chest = new BoardSpace();
        BoardSpace Baltic_Avenue = new BoardSpace(60, new int[]{4, 20, 60, 180, 320, 450},
                1, 1);
        BoardSpace Income_Tax = new BoardSpace(0, new int[]{200},
                0, 7);
        BoardSpace Reading_Railroad = new BoardSpace(200, new int[]{25, 50, 100, 200},
                0, 2);
        BoardSpace Oriental_Avenue = new BoardSpace(100, new int[]{6, 30, 90, 270, 400, 550},
                2,1);
        // Add Chance  BoardSpace Chance = new BoardSpace();
        BoardSpace Vermont_Avenue = new BoardSpace(100, new int[]{6, 30, 90, 270, 400, 550},
                2,1);
        BoardSpace Connecticut_Avenue = new BoardSpace(120, new int[]{8, 40, 100, 300, 450, 600},
                2,1);
        // Add Just Visiting and InJail.....
        BoardSpace St_Charles_Place = new BoardSpace(140, new int[]{10, 50, 150, 450, 625, 750},
                3,1);
        // BoardSpace Electric_Company = new BoardSpace(150, new int[4 * diceValue, 10 * diceValue], 0,3);
        BoardSpace States_Avenue = new BoardSpace(140, new int[]{10, 50, 150, 450, 625, 750},
                3,1);
        BoardSpace Virginia_Avenue = new BoardSpace(160, new int[]{12, 60, 180, 500, 700, 900},
                3,1);
        BoardSpace Pennsylvania_Railroad = new BoardSpace(200,new int[]{25, 50, 100, 200},
                0, 2 );
        // Add Orange Spaces
        BoardSpace St_James_Place = new BoardSpace(180, new int[]{14, 70, 200, 550, 750, 950},
                4, 1);
        BoardSpace Tennessee_Avenue = new BoardSpace(180, new int[]{14, 70, 200, 550, 750, 950},
                4, 1);
        BoardSpace New_York_Avenue = new BoardSpace(200, new int[]{16, 80, 220, 600, 800, 1000},
                4, 1);
        // Add FreeParking
        // Written by Shreyes
        BoardSpace Kentucky_Avenue = new BoardSpace(220, new int[]{18, 90, 250, 700, 875, 1050},
                5, 1);
        BoardSpace Indiana_Avenue = new BoardSpace(220, new int[]{18, 90, 250, 700, 875, 1050},
                5, 1);
        BoardSpace Illinois_Avenue = new BoardSpace(240,new int[]{20, 100, 300, 750, 925, 1100},
                5,1);
        BoardSpace B_O_Railroad = new BoardSpace(200, new int[]{25, 50, 100, 200},
                0, 2);
        BoardSpace Atlantic_Avenue = new BoardSpace(260, new int[]{22, 110, 330, 800, 975, 1150},
                6, 1);
        BoardSpace Ventinor_Avenue = new BoardSpace(260, new int[]{22, 110, 330, 800, 975, 1150},
                6, 1);
         // BoardSpace Water_Works = new BoardSpace(150, new int[]{},0, 3);
        BoardSpace Marvin_Gardens = new BoardSpace(280, new int[]{24, 120, 360, 850, 1025, 1200},
                6, 1);
        BoardSpace Go_To_Jail = new BoardSpace(0, new int[]{}, 0, 4);
        // Written by Brian
        BoardSpace Pacific_Avenue = new BoardSpace(300, new int[]{26,130,390,900,1100,1275},
                7,1);
        BoardSpace North_Caroline_Avenue = new BoardSpace(300, new int[]{26,130,390,900,1100,1275},
                7,1);
        BoardSpace Pennsylvania_Avenue = new BoardSpace(320, new int[]{28, 150, 450, 1000, 1200, 1400},
                7,1);
        BoardSpace Short_Line = new BoardSpace(200, new int[]{25,50,100,200},
                0,2);
        BoardSpace Park_Place = new BoardSpace(350, new int[]{35, 175, 500, 1100, 1300},
                8,1);
        BoardSpace Luxury_Tax = new BoardSpace(0, new int[]{100},
                0, 7);
        BoardSpace Boardwalk = new BoardSpace(400, new int[]{50,200,600,1400,1700},
                8,1);

    }
}
