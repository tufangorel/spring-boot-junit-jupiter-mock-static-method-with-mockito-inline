package com.company.customerinfo.util;

public class StringUtils {

    private StringUtils() {
        throw new AssertionError("shouldn't be instantiated");
    }

    public static boolean isEmpty(final CharSequence cs) {
        return cs == null || cs.length() == 0;
    }


}
