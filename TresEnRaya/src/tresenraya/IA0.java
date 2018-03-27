package tresenraya;

public class IA0 extends Jugador {
    
    //Atributos:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    
    private Tablero tablero;
    
    //constructor:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    
    public IA0() {
        super("IA0");
    }

    //metodos:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    
    
    public Movimiento movimiento(Tablero t) {
        Movimiento mov;
        mov = new Movimiento();

        mov.setJugador(this);
        mov.setCruces(this.getCruces());

        for (int fila = 0; fila <= 2; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                if (t.celdaVacia(fila, columna) == true) {
                    mov.setFila(fila);
                    mov.setColumna(columna);
                    return mov;
                }
            }
        }
        return null;
    }

    public void setTablero(Tablero tab) {
        if (tab != null) {
            this.tablero = tab;
        }
    }
}
