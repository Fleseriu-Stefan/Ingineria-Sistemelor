package lab7.util;

import java.util.Random;

public class PasswordMaker {

    private static final int MAGIC_NUMBER = 3;
    private static final String MAGIC_STRING;

    private static PasswordMaker instance;
    private static int callingCounts = 0;

    private String name;

    static {
        StringRandomizer srand = new StringRandomizer();
        MAGIC_STRING = srand.randomString(20);
        instance = new PasswordMaker("student");
    }
    private PasswordMaker(String name) {
        this.name = name;
    }
    public static PasswordMaker getInstance() {
        callingCounts++;
        return instance;
    }

    public static int getCallingCounts() {
        return callingCounts;
    }

    public String getPassword() {
        Random r = new Random();

        String ln = "" + name.length();
        ln += r.nextInt(101);

        StringRandomizer srand = new StringRandomizer();

        return srand.randomString(MAGIC_NUMBER)
                + srand.randomString(10, MAGIC_STRING)
                + ln;
    }
}

