public class KnightMoveConverter {

    private int index1;
    private int index2;

    public KnightMoveConverter(int index1, int index2) {
        this.index1 = index1;
        this.index2 = index2;
    }

    public KnightMoveConverter() {

    }

    public int getIndex1() {
        return index1;
    }

    public void setIndex1(int index1) {
        this.index1 = index1;
    }

    public int getIndex2() {
        return index2;
    }

    public void setIndex2(int index2) {
        this.index2 = index2;
    }

    public KnightMoveConverter convertKnightMove(String from, String to) {

        int subsChars = Math.abs(from.toUpperCase().charAt(0) - to.toUpperCase().charAt(0));
        int subsNum = Math.abs(from.charAt(1) - to.charAt(1));
        return new KnightMoveConverter(subsChars, subsNum);
    }
}
