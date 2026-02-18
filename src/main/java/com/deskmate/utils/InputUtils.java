package com.deskmate.utils;

import java.util.*;

public final class InputUtils {
    private static final Scanner sc = new Scanner(System.in);

    private InputUtils() {}

    public static int readInt(String prompt) {
        System.out.print(prompt);
        return Integer.parseInt(sc.nextLine().trim());
    }

    public static String readString(String prompt) {
        System.out.print(prompt);
        return sc.nextLine().trim();
    }
}
