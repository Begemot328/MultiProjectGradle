package com.epam.lab;

import com.epam.lab.utils.StringUtils;

public class Utils {

    public static boolean isAllPositiveNumbers(String... str) {
        for (String s : str) {
            if (!StringUtils.isPositiveNumber(s)) {
                return false;
            }
        }
        return true;
    }
}
