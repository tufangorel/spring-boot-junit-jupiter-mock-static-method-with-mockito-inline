package com.company.customerinfo.util;

public class StringUtils {

    private StringUtils() {
        throw new AssertionError("shouldn't be instantiated");
    }

    public static boolean isEmpty(final String str) {
        return str == null || str.length() == 0;
    }


}
