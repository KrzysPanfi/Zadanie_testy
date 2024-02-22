import org.junit.Test;

import static org.junit.Assert.*;

public class Zad3Test {

    @Test
    public void odwrocone_znaki() {
        String resoult= Zad3.odwrocone_znaki("A B C");
        assertEquals("C B A",resoult);
    }
}