import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Zad2Test {

    @Test
    public void balancedParenthesis() {
        String exp = " Ala ([ma]) {kota} i psa i cos jeszcze ";
        boolean resoult=Zad2.balancedParenthesis(exp);
        assertEquals(true,resoult);
    }
}