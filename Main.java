public class Main {
    public static void main(String[] args) {

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
        BoardSpace Water_Works = new BoardSpace(150, new int[]{},
                0, 3); // need to figure out how this works
        BoardSpace Marvin_Gardens = new BoardSpace(280, new int[]{24, 120, 360, 850, 1025, 1200},
                6, 1);
        BoardSpace Go_To_Jail = new BoardSpace(0, new int[]{}, 0, 4);

        BoardSpace Pacific_Avenue = new BoardSpace(300, new int[]{26,130,390,900,1100,1275},
                7,1);
        BoardSpace North_Caroline_Avenue = new BoardSpace(300, new int[]{26,130,390,900,1100,1275},
                7,1);
        BoardSpace Community_Chest = new BoardSpace();

        BoardSpace Pennsylvania_Avenue = new BoardSpace(320, new int[]{28, 150, 450, 1000, 1200, 1400},
                7,1);
        BoardSpace Short_Line = new BoardSpace(200, new int[]{25,50,100,200},
                0,2);
        BoardSpace Chance = new BoardSpace();

        BoardSpace Park_Place = new BoardSpace(350, new int[]{35, 175, 500, 1100, 1300},
                8,1);
        BoardSpace Luxury_Tax = new BoardSpace();

        BoardSpace Boardwalk = new BoardSpace(400, new int[]{50,200,600,1400,1700},8,1);
    }
}
