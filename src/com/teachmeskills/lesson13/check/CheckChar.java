package com.teachmeskills.lesson13.check;

public class CheckChar {

    public static boolean doCheckCharSpace(String login) {

        char[] charArray = login.toCharArray();

        char space = 32;

        for (char c : charArray) {
            if (c == space) {
                return true;
            }
        }

        return false;

    }

    public static boolean doCheckCharNumber (String password) {

        char[] charArray = password.toCharArray();

        for (char c : charArray) {
            for (char i = 48; i < 558; i++) {
                if (c == i) {
                    return false;
                }
            }
        }

        return true;

    }

}
