import org.junit.Test;

import static org.junit.Assert.*;

public class Zad3Test {

    @Test
    public void odwrocone_znaki() {
        String result= Zad3.odwrocone_znaki("A B C");
        assertEquals("C B A",result);
    }
}