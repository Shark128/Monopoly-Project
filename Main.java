public class Main {
    public static void main(String[] args) {
        // Written by Shreyes
        CircularLinkedList board = new CircularLinkedList();
        Dice gameDie = new Dice();
        // Written by Carson
        BoardSpace GO = new BoardSpace(0, new int[]{0,0,0,0,0,0},
                0, 0);
        Link<BoardSpace> linkGo = new Link<BoardSpace>(GO);
        BoardSpace Mediterranean_Avenue = new BoardSpace(60, new int[]{2, 10, 30, 90, 160, 250},
                1, 1);
        Link<BoardSpace> linkMed = new Link<BoardSpace>(Mediterranean_Avenue);
        BoardSpace Baltic_Avenue = new BoardSpace(60, new int[]{4, 20, 60, 180, 320, 450},
                1, 1);
        Link<BoardSpace> linkBal = new Link<BoardSpace>(Baltic_Avenue);
        BoardSpace Income_Tax = new BoardSpace(0, new int[]{200},
                0, 7);
        Link<BoardSpace> linkInc = new Link<BoardSpace>(Income_Tax);
        BoardSpace Reading_Railroad = new BoardSpace(200, new int[]{25, 50, 100, 200},
                0, 2);
        Link<BoardSpace> linkRea = new Link<BoardSpace>(Reading_Railroad);
        BoardSpace Oriental_Avenue = new BoardSpace(100, new int[]{6, 30, 90, 270, 400, 550},
                2,1);
        Link<BoardSpace> linkOri = new Link<BoardSpace>(Oriental_Avenue);
        BoardSpace Vermont_Avenue = new BoardSpace(100, new int[]{6, 30, 90, 270, 400, 550},
                2,1);
        Link<BoardSpace> linkVer = new Link<BoardSpace>(Vermont_Avenue);
        BoardSpace Connecticut_Avenue = new BoardSpace(120, new int[]{8, 40, 100, 300, 450, 600},
                2,1);
        Link<BoardSpace> linkCon = new Link<BoardSpace>(Connecticut_Avenue);
        // Add Just Visiting and InJail.....
        BoardSpace St_Charles_Place = new BoardSpace(140, new int[]{10, 50, 150, 450, 625, 750},
                3,1);
        Link<BoardSpace> linkStc = new Link<BoardSpace>(St_Charles_Place);
        BoardSpace Electric_Company = new BoardSpace(150, new int[]{4 * gameDie.totalDiceValue, 10 * gameDie.totalDiceValue},
                0,3);
        Link<BoardSpace> linkEle = new Link<BoardSpace>(Electric_Company);
        BoardSpace States_Avenue = new BoardSpace(140, new int[]{10, 50, 150, 450, 625, 750},
                3,1);
        Link<BoardSpace> linkSta = new Link<BoardSpace>(States_Avenue);
        BoardSpace Virginia_Avenue = new BoardSpace(160, new int[]{12, 60, 180, 500, 700, 900},
                3,1);
        Link<BoardSpace> linkVir = new Link<BoardSpace>(Virginia_Avenue);
        BoardSpace Pennsylvania_Railroad = new BoardSpace(200,new int[]{25, 50, 100, 200},
                0, 2 );
        Link<BoardSpace> linkPen = new Link<BoardSpace>(Pennsylvania_Railroad);
        BoardSpace St_James_Place = new BoardSpace(180, new int[]{14, 70, 200, 550, 750, 950},
                4, 1);
        Link<BoardSpace> linkStj = new Link<BoardSpace>(St_James_Place);
        BoardSpace Tennessee_Avenue = new BoardSpace(180, new int[]{14, 70, 200, 550, 750, 950},
                4, 1);
        Link<BoardSpace> linkTen = new Link<BoardSpace>(Tennessee_Avenue);
        BoardSpace New_York_Avenue = new BoardSpace(200, new int[]{16, 80, 220, 600, 800, 1000},
                4, 1);
        Link<BoardSpace> linkNew = new Link<BoardSpace>(New_York_Avenue);
        // Add FreeParking
        // Written by Shreyes
        BoardSpace Kentucky_Avenue = new BoardSpace(220, new int[]{18, 90, 250, 700, 875, 1050},
                5, 1);
        Link<BoardSpace> linkKen = new Link<BoardSpace>(Kentucky_Avenue);
        BoardSpace Indiana_Avenue = new BoardSpace(220, new int[]{18, 90, 250, 700, 875, 1050},
                5, 1);
        Link<BoardSpace> linkInd = new Link<BoardSpace>(Indiana_Avenue);
        BoardSpace Illinois_Avenue = new BoardSpace(240,new int[]{20, 100, 300, 750, 925, 1100},
                5,1);
        Link<BoardSpace> linkIll = new Link<BoardSpace>(Illinois_Avenue);
        BoardSpace B_O_Railroad = new BoardSpace(200, new int[]{25, 50, 100, 200},
                0, 2);
        Link<BoardSpace> linkBor = new Link<BoardSpace>(B_O_Railroad);
        BoardSpace Atlantic_Avenue = new BoardSpace(260, new int[]{22, 110, 330, 800, 975, 1150},
                6, 1);
        Link<BoardSpace> linkAtl = new Link<BoardSpace>(Atlantic_Avenue);
        BoardSpace Ventinor_Avenue = new BoardSpace(260, new int[]{22, 110, 330, 800, 975, 1150},
                6, 1);
        Link<BoardSpace> linkVen = new Link<BoardSpace>(Ventinor_Avenue);
        BoardSpace Water_Works = new BoardSpace(150, new int[]{4 * gameDie.totalDiceValue, 10 * gameDie.totalDiceValue},
                0, 3);
        Link<BoardSpace> linkWat = new Link<BoardSpace>(Water_Works);
        BoardSpace Marvin_Gardens = new BoardSpace(280, new int[]{24, 120, 360, 850, 1025, 1200},
                6, 1);
        Link<BoardSpace> linkMar = new Link<BoardSpace>(Marvin_Gardens);
        BoardSpace Go_To_Jail = new BoardSpace(0, new int[]{}, 0, 4);
        Link<BoardSpace> linkGot = new Link<BoardSpace>(Go_To_Jail);
        // Written by Bryan
        BoardSpace Pacific_Avenue = new BoardSpace(300, new int[]{26,130,390,900,1100,1275},
                7,1);
        Link<BoardSpace> linkPac = new Link<BoardSpace>(Pacific_Avenue);
        BoardSpace North_Carolina_Avenue = new BoardSpace(300, new int[]{26,130,390,900,1100,1275},
                7,1);
        Link<BoardSpace> linkNor = new Link<BoardSpace>(North_Carolina_Avenue);
        BoardSpace Community_Chest = new BoardSpace(0,new int[]{},
                0, 9);
        Link<BoardSpace> linkCom = new Link<BoardSpace>(Community_Chest);
        BoardSpace Pennsylvania_Avenue = new BoardSpace(320, new int[]{28, 150, 450, 1000, 1200, 1400},
                7,1);
        Link<BoardSpace> linkPe = new Link<BoardSpace>(Pennsylvania_Avenue);
        BoardSpace Short_Line = new BoardSpace(200, new int[]{25,50,100,200},
                0,2);
        Link<BoardSpace> linkSho = new Link<BoardSpace>(Short_Line);
        BoardSpace Chance = new BoardSpace(0,new int[]{},
                0,8);
        Link<BoardSpace> linkCha = new Link<BoardSpace>(Chance);
        BoardSpace Park_Place = new BoardSpace(350, new int[]{35, 175, 500, 1100, 1300},
                8,1);
        Link<BoardSpace> linkPar = new Link<BoardSpace>(Park_Place);
        BoardSpace Luxury_Tax = new BoardSpace(0, new int[]{100},
                0, 7);
        Link<BoardSpace> linkLux = new Link<BoardSpace>(Luxury_Tax);
        BoardSpace Boardwalk = new BoardSpace(400, new int[]{50,200,600,1400,1700},
                8,1);
        Link<BoardSpace> linkBoa = new Link<BoardSpace>(Boardwalk);
        // Written by Shreyes, adding all spaces into the cll board (backwards)
        board.insertFirst(linkBoa); board.insertFirst(linkLux); board.insertFirst(linkPar); board.insertFirst(linkCha);
        board.insertFirst(linkSho); board.insertFirst(linkPe); board.insertFirst(linkCom); board.insertFirst(linkNor);
        board.insertFirst(linkPac); board.insertFirst(linkGot); board.insertFirst(linkMar); board.insertFirst(linkWat);
        board.insertFirst(linkVen); board.insertFirst(linkAtl); board.insertFirst(linkBor); board.insertFirst(linkIll);
        board.insertFirst(linkInd); board.insertFirst(linkCha); board.insertFirst(linkKen); // board.insertFirst(linkFre);
        board.insertFirst(linkNew); board.insertFirst(linkTen); board.insertFirst(linkCom); board.insertFirst(linkStj);
        board.insertFirst(linkPen); board.insertFirst(linkVir); board.insertFirst(linkSta); board.insertFirst(linkEle);
        board.insertFirst(linkStc); // board.insertFirst(linkJus);
        board.insertFirst(linkCon); board.insertFirst(linkVer); board.insertFirst(linkCha); board.insertFirst(linkOri);
        board.insertFirst(linkRea); board.insertFirst(linkInc); board.insertFirst(linkBal); board.insertFirst(linkCom);
        board.insertFirst(linkMed); board.insertFirst(linkGo);

        //Bryan
        //ChanceChest Advance_To_Go = new ChanceChest(0,200,1, "GO");
        ChanceChest Bank_Error = new ChanceChest("Bank Error",0,200,0, null);
        ChanceChest Doctor_Fee = new ChanceChest("Doctor Fee",0,-50,0, null);
        ChanceChest Sale_Of_Stock = new ChanceChest("Sale Of Stock ",0,50,0, null);
        //ChanceChest Get_Out_Of_Jail_Card = new ChanceChest("Get Out Of Jail Card",0,0,2, null);
        //ChanceChest Go_To_Jail_Card = new ChanceChest("Go_To_Jail_Card", 0,0, 1, "Jail");
        ChanceChest Holiday_Fund = new ChanceChest("Holiday Fund",0,100,0,null);
        ChanceChest Income_Tax_Refund = new ChanceChest("Income Tax Refund",0,20,0,null);
        //ChanceChest Birthday = new ChanceChest("Birthday",0,10,0,null);
        ChanceChest Life_Insurance = new ChanceChest("Life Insurance",0,100,0,null);
        ChanceChest Hospital_Fees = new ChanceChest("Hospital Fees",0,-100,0,null);
        ChanceChest School_Fees = new ChanceChest("School Fees", 0,-50,0,null);
        ChanceChest Consultancy = new ChanceChest("Consultancy",0,-100,0,null);
        //ChanceChest Street_Repair = new ChanceChest("Street_Repair",0,40,0,null);
        ChanceChest Beauty_Contest = new ChanceChest("Beauty_Contest",0,10,0,null);
        ChanceChest Inheritance = new ChanceChest("Inheritance",0,100,0,null);

    }
}
