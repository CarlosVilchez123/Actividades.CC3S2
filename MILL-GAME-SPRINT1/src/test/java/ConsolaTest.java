import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsolaTest {
    @Test
    public void testMostrarTablero()
    {
        Tablero tablero = new Tablero();
        Consola con = new Consola(tablero);
        con.mostrarTablero();
    }

}