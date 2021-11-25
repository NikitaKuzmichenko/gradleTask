import static by.epam.module1.utils.StringUtils.isPositiveNumber;

public class Utils {

    public static boolean isAllPositiveNumbers(String... str){
        for(String currentStr :str){
            if(!isPositiveNumber(currentStr)) return false;
        }
        return true;
    }
}
