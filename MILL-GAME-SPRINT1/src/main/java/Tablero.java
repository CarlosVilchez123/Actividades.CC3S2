public class Tablero {
    private int[][] grid;
    private char turn='B';
    private static final int LENGTH = 7;

    public int getLENGTH() {
        return LENGTH;
    }

    public Tablero() {
        grid = new int[LENGTH][LENGTH];
    }

    public int getGrid(int filas, int columnas) {
        if (filas>=0 && filas<LENGTH && columnas>=0 && columnas<LENGTH)
            return grid[filas][columnas];
        else
            return -1;
    }

    public boolean isValid(int i, int j){
        if (i < 0 || i >= LENGTH || j < 0 || j >= LENGTH || (i == 3 && j == 3)) {
            return false;
        }

        if (i == j){return true;}
        else if ( i + j == LENGTH - 1) {return true;}
        else if (j == 3) {return true;}
        else if(i == 3) {return true;}
        else return false;
    }

    public char getTurn()
    {
        return turn;
    }
}
