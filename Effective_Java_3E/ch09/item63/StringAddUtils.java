package ch09.item63;

public class StringAddUtils {
    void getTimeWhenAddString1000TimesWithPlus(String str) {
        long startTime = System.currentTimeMillis();
        String temp = str;
        for(int i = 0; i < 1000; i++) {
            temp += i;
        }
        System.out.println("Add String 1000 times with plus >> " + (System.currentTimeMillis() - startTime));
    }

    void getTimeWhenAddString1000TimesWithConcat(String str) {
        long startTime = System.currentTimeMillis();
        String temp = str;
        for(int i = 0; i < 1000; i++) {
            temp.concat("" + i);
        }
        System.out.println("Add String 1000 times with concat >> " + (System.currentTimeMillis() - startTime));
    }

    void getTimeWhenAddString1000TimesWithBuilder(String str) {
        long startTime = System.currentTimeMillis();
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < 1000; i++) {
            temp.append(i);
        }
        System.out.println("Add String 1000 times with builder >> " + (System.currentTimeMillis() - startTime));
    }

    void getTimeWhenAddString1000TimesWithBuffer(String str) {
        long startTime = System.currentTimeMillis();
        StringBuffer temp = new StringBuffer();
        for(int i = 0; i < 1000; i++) {
            temp.append(i);
        }
        System.out.println("Add String 1000 times with buffer >> " + (System.currentTimeMillis() - startTime));
    }
}
