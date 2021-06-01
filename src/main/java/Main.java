public class Main {

    public static void main(String[] args) {

        KnightChess[] knights = new KnightChess[5];
        knights[0] = new KnightChess();
        knights[1] = new KnightChess("B6");
        knights[2] = new KnightChess("H4");
        knights[3] = new KnightChess("A2");
        knights[4] = new KnightChess("H12");

        for (KnightChess kn: knights) {
            kn.moveFigure("C3");
        }
        knights[2].moveFigure("W6");

    }

}
