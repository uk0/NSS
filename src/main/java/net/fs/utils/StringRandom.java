package net.fs.utils;

/**
 * Created by TD00 on 2017/2/21.
 */
public class StringRandom {
    public StringRandom() {

    }

    public static int getRandom(int count) {
        return (int) Math.round(Math.random() * (count));
    }

    public static String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    public static String getRandomString(int length) {
        StringBuffer sb = new StringBuffer();
        int len = string.length();
        for (int i = 0; i < length; i++) {
            sb.append(string.charAt(getRandom(len - 1)));
        }
        return sb.toString();
    }

    private static volatile StringRandom instance = null;

    public static StringRandom getInstance() {
        if (instance == null) {
            synchronized (StringRandom.class) {
                instance = (instance == null ? new StringRandom() : instance);
            }
        }
        return instance;
    }
}
