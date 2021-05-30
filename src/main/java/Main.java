public class Main {

    public static void main(String[] args) {

        KnightChess[] knights = new KnightChess[4];
        knights[0] = new KnightChess();
        knights[1] = new KnightChess("b6");
        knights[2] = new KnightChess("h4");
        knights[3] = new KnightChess("a2");
        for (KnightChess kn: knights) {

            kn.moveFigure("c3");

        }
        
    }

}
