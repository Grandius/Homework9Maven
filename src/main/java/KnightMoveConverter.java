public class KnightMoveConverter {


    static boolean isPossibleKnightMove(String from, String to) {
        if (!isValidChar(from.toUpperCase().charAt(0), 'A', 'H')) return false;
        if (!isValidChar(to.toUpperCase().charAt(0), 'A', 'H')) return false;
        if (!isValidChar(from.charAt(1), '1', '8')) return false;
        if (!isValidChar(to.charAt(1), '1', '8')) return false;
        int subsChars = Math.abs(from.toUpperCase().charAt(0) - to.toUpperCase().charAt(0));
        int subsNum = Math.abs(from.charAt(1) - to.charAt(1));
        if (subsChars == 2)
            return subsNum == 1;
        else if (subsChars == 1)
            return subsNum == 2;
        return false;
    }

    static boolean isValidChar(char verifiableChar, char lower, char upper) {
        return (verifiableChar <= upper) && (verifiableChar >= lower);
    }

}
