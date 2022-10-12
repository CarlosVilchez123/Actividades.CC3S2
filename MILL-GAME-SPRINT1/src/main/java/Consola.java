import java.sql.SQLOutput;
public class Consola {
    private Tablero tablero;

    public Consola(Tablero tablero) { this.tablero = tablero ;}

    public void mostrarTablero() {
        int i, j;
        char c;
        for ( i = 0; i < tablero.getLENGTH(); i++){
            for ( j = 0; j < tablero.getLENGTH(); j++){
                if(tablero.isValid(i,j))
                    System.out.print(tablero.getGrid(i,j));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
