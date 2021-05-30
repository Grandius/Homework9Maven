public class KnightChess {

    private String initialPosition;
    private KnightMoveConverter converter = new KnightMoveConverter();

    public KnightChess(String initialPosition) {
        setInitialPosition(initialPosition);
    }

    public KnightChess(KnightMoveConverter converter) {
        this.converter = converter;

    }

    public KnightChess() {

    }

    public String getInitialPosition() {
        return initialPosition;
    }

    public void setInitialPosition(String initialPosition) {
        if (!isValidPosition(initialPosition)) {
            System.out.println("the provided position is invalid");
            this.initialPosition = "A1";

        }
        this.initialPosition = initialPosition;
    }

    public KnightMoveConverter getConverter() {
        return converter;
    }

    public void setConverter(KnightMoveConverter converter) {
        this.converter = converter;
    }


    static boolean isValidChar(char verifiableChar, char lower, char upper) {
        return (verifiableChar <= upper) && (verifiableChar >= lower);
    }

    static boolean isValidPosition(String position) {
        return isValidChar(position.toUpperCase().charAt(0), 'A', 'H') && isValidChar(position.charAt(1), '1', '8');
    }

    public void moveFigure(String desiredPosition) {

        if (initialPosition == null || initialPosition.isEmpty() || initialPosition.isBlank() || desiredPosition == null || desiredPosition.isEmpty() || desiredPosition.isBlank()) {
            setInitialPosition("A1");
            moveFigure("B3");
        } else if (isValidPosition(desiredPosition)) {
            converter.convertKnightMove(initialPosition, desiredPosition);
            if (((converter.getIndex1() == 2) && (converter.getIndex2() == 1)) || ((converter.getIndex1() == 1) && (converter.getIndex2() == 2))) {
                System.out.println("Knight can move from initial position " + initialPosition + " to position " + desiredPosition);
            }
        } else {
            System.out.println("Knight cannot move from initial position " + initialPosition + " to position " + desiredPosition);
        }

    }
}
