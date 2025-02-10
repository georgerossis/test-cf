package gr.aueb.cf.ch20;

public class RegExMain {

    public static void main(String[] args) {
        String s = "*9";
        System.out.println(isRed(s));
        System.out.println(isRedOrGreen(s));
        System.out.println(isrRedOrgGreen(s));
        System.out.println(beginsWithOneUpperCaseAndEndsIning(s));
        System.out.println(isOneLetterEndsIning(s));
        System.out.println(whitespaceDigit(s));
        System.out.println(anySymbolDigit(s));
    }

    /**
     * ελέγχει (matches) αν το input string
     * είναι το "red"
     * @param s
     * @return
     */
    public static boolean isRed(String s) {
        return s.matches("red");
    }

    /**
     * ελέγει (matches) αν το input string
     * είναι "red" ή "green"
     * @param s
     * @return
     */
    public static boolean isRedOrGreen(String s) {
        return s.matches("red|green");
    }

    /**
     * ελέγει (matches) αν το input string
     * είναι "red" ή "Red" ή "green" ή "Green"
     * @param s
     * @return
     */
    public static boolean isrRedOrgGreen(String s) {
        return s.matches("[rR]ed|[gG]reen");
    }

    public static boolean beginsWithOneUpperCaseAndEndsIning(String s) {
        return s.matches("[A-Z]ing");
    }

    public static boolean isOneLetterEndsIning(String s) {
        return s.matches("[a-zA-Z]ing");
    }

    public static boolean whitespaceDigit(String s) {
        return s.matches("\\s\\d");
    }

    /**
     * οποιοσδήποτε χαρακτήρας και μετά ακολουθεί ψηφίο
     * @param s
     * @return
     */
    public static boolean anySymbolDigit(String s) {
        return s.matches(".\\d");
        return s.matches(".[0-9]");
    }
}
