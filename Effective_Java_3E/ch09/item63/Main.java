package ch09.item63;

public class Main {
    public static void main(String[] args) {
        String plainText = "ab";
        StringAddUtils stringAddUtils = new StringAddUtils();
        stringAddUtils.getTimeWhenAddString1000TimesWithPlus(plainText);
        stringAddUtils.getTimeWhenAddString1000TimesWithConcat(plainText);
        stringAddUtils.getTimeWhenAddString1000TimesWithBuilder(plainText);
        stringAddUtils.getTimeWhenAddString1000TimesWithBuffer(plainText);
    }
}
