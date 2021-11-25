package by.epam.module1.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    /**
    * <p>Returns true if the specified number in {@code String} is positive.</p>
    *
    * <p>Returns {@code false} if the string is {@code null}.</p>
    * @throws NumberFormatException if the value cannot be converted
    */
    public static boolean isPositiveNumber(String number){
        if(number == null) return false;
        return  NumberUtils.createDouble(number) >= 0;
    }
}
