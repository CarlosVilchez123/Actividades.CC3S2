import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableroTest {
    Tablero tablero = new Tablero();
    @Test
    public void tesIsValid()
    {
        assertEquals(true,tablero.isValid(0,0));
        assertEquals(false,tablero.isValid(0,1));
    }
}