import by.epam.module1.utils.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class StringUtilsTest {

    @Test
    void positiveNumberTest(){
        Assertions.assertTrue(StringUtils.isPositiveNumber("123"));
    }
}
