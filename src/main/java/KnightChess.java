import java.util.Objects;

public class KnightChess {

    private String initialPositionField;
    private KnightMoveConverter converter = new KnightMoveConverter();

    public KnightChess(String initialPosition) {
        initialPositionField = initialPosition;
    }

    public KnightChess(KnightMoveConverter converter) {
        this.converter = converter;

    }

    public KnightChess() {

    }

    public String getInitialPosition() {
        return initialPositionField;
    }

    public void setInitialPosition(String initialPosition) {
        if (!isValidPosition(initialPosition)) {
            System.out.println("the provided position " + initialPosition + " is invalid");

        } else {
            initialPositionField = initialPosition;
        }

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

        boolean validPosition;
        if (position == null || position.length() != 2) {
            validPosition = false;
        } else {
            validPosition = (!position.isEmpty() || !position.isBlank()) && (isValidChar(position.toUpperCase().charAt(0), 'A', 'H') && isValidChar(position.charAt(1), '1', '8'));
        }
        return validPosition;

    }

    public void moveFigure(String desiredPosition) {

        if (!isValidPosition(initialPositionField)) {
            System.out.println("The provided initial position " + initialPositionField + " is not correct, knight cannot move");
        } else if (!isValidPosition(desiredPosition)) {
            System.out.println("The provided destined position " + desiredPosition + " is not correct, knight cannot move");
        } else {
            converter = converter.convertKnightMove(initialPositionField, desiredPosition);
            if (((converter.getIndex1() == 2) && (converter.getIndex2() == 1)) || ((converter.getIndex1() == 1) && (converter.getIndex2() == 2))) {
                System.out.println("Knight can move from initial position " + initialPositionField + " to position " + desiredPosition);
            } else {
                System.out.println("Knight cannot move from initial position " + initialPositionField + " to position " + desiredPosition);
            }
        }
    }
}
