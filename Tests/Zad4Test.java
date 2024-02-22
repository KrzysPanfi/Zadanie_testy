import org.junit.Test;

import static org.junit.Assert.*;

public class Zad4Test {

    @Test
    public void ONP() {
        String expre="3 4 + 2 * 7 /";
        int resoult= Zad4.ONP(expre);
        assertEquals(2,resoult);

    }
}