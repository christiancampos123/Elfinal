package tresenraya;

public class IA4 extends IA3 {

    //Constructor
    public IA4() {
        super();
    }

    //Métodos
    public void calcularProbabilidadDeGanar(Tablero tablero) {
        this.llenarTabla();
        int valor = 0;
        if (this.getCruces() == true) {
            valor = 0;

        } else {
            valor = 1;

        }
        //Casilla fila: 0, columna: 0
        if (tablero.celdaVacia(0, 0) == false) {
            this.getTablaV()[0][0] = 0;
        }
        if ((tablero.celdaVacia(0, 1) == false && tablero.getCelda(0, 1) != valor) || (tablero.celdaVacia(0, 2) == false && tablero.getCelda(0, 2) != valor)) {
            if (this.getTablaV()[0][0] > 0) {
                this.getTablaV()[0][0]--;
            }
        }
        if ((tablero.celdaVacia(1, 0) == false && tablero.getCelda(1, 0) != valor) || (tablero.celdaVacia(2, 0) == false && tablero.getCelda(2, 0) != valor)) {
            if (this.getTablaV()[0][0] > 0) {
                this.getTablaV()[0][0]--;
            }
        }
        if ((tablero.celdaVacia(1, 1) == false && tablero.getCelda(1, 1) != valor) || (tablero.celdaVacia(2, 2) == false && tablero.getCelda(2, 2) != valor)) {
            if (this.getTablaV()[0][0] > 0) {
                this.getTablaV()[0][0]--;
            }
        }
        //Casilla fila: 0, columna: 1
        if (tablero.celdaVacia(0, 1) == false) {
            this.getTablaV()[0][1] = 0;
        }
        if ((tablero.celdaVacia(0, 0) == false && tablero.getCelda(0, 0) != valor) || (tablero.celdaVacia(0, 2) == false && tablero.getCelda(0, 2) != valor)) {
            if (this.getTablaV()[0][1] > 0) {
                this.getTablaV()[0][1]--;
            }
        }
        if ((tablero.celdaVacia(1, 1) == false && tablero.getCelda(1, 1) != valor) || (tablero.celdaVacia(2, 1) == false && tablero.getCelda(2, 1) != valor)) {
            if (this.getTablaV()[0][1] > 0) {
                this.getTablaV()[0][1]--;
            }
        }
        //Casilla fila: 0, columna: 2
        if (tablero.celdaVacia(0, 2) == false) {
            this.getTablaV()[0][2] = 0;
        }
        if ((tablero.celdaVacia(0, 0) == false && tablero.getCelda(0, 0) != valor) || (tablero.celdaVacia(0, 1) == false && tablero.getCelda(0, 1) != valor)) {
            if (this.getTablaV()[0][2] > 0) {
                this.getTablaV()[0][2]--;
            }
        }
        if ((tablero.celdaVacia(1, 2) == false && tablero.getCelda(1, 2) != valor) || (tablero.celdaVacia(2, 2) == false && tablero.getCelda(2, 2) != valor)) {
            if (this.getTablaV()[0][2] > 0) {
                this.getTablaV()[0][2]--;
            }
        }
        if ((tablero.celdaVacia(1, 1) == false && tablero.getCelda(1, 1) != valor) || (tablero.celdaVacia(2, 0) == false && tablero.getCelda(2, 0) != valor)) {
            if (this.getTablaV()[0][2] > 0) {
                this.getTablaV()[0][2]--;
            }
        }
        //Casilla fila: 1, columna: 0
        if (tablero.celdaVacia(1, 0) == false) {
            this.getTablaV()[1][0] = 0;
        }
        if ((tablero.celdaVacia(0, 0) == false && tablero.getCelda(0, 0) != valor) || (tablero.celdaVacia(2, 0) == false && tablero.getCelda(2, 0) != valor)) {
            if (this.getTablaV()[1][0] > 0) {
                this.getTablaV()[1][0]--;
            }
        }
        if ((tablero.celdaVacia(1, 1) == false && tablero.getCelda(1, 1) != valor) || (tablero.celdaVacia(1, 2) == false && tablero.getCelda(1, 2) != valor)) {
            if (this.getTablaV()[1][0] > 0) {
                this.getTablaV()[1][0]--;
            }
        }
        //Casilla fila: 1, columna: 1
        if (tablero.celdaVacia(1, 1) == false) {
            this.getTablaV()[1][1] = 0;
        }
        if ((tablero.celdaVacia(0, 0) == false && tablero.getCelda(0, 0) != valor) || (tablero.celdaVacia(2, 2) == false && tablero.getCelda(2, 2) != valor)) {
            if (this.getTablaV()[1][1] > 0) {
                this.getTablaV()[1][1]--;
            }
        }
        if ((tablero.celdaVacia(0, 2) == false && tablero.getCelda(0, 2) != valor) || (tablero.celdaVacia(2, 0) == false && tablero.getCelda(2, 0) != valor)) {
            if (this.getTablaV()[1][1] > 0) {
                this.getTablaV()[1][1]--;
            }
        }
        if ((tablero.celdaVacia(0, 1) == false && tablero.getCelda(0, 1) != valor) || (tablero.celdaVacia(2, 1) == false && tablero.getCelda(2, 1) != valor)) {
            if (this.getTablaV()[1][1] > 0) {
                this.getTablaV()[1][1]--;
            }
        }
        if ((tablero.celdaVacia(1, 0) == false && tablero.getCelda(1, 0) != valor) || (tablero.celdaVacia(1, 2) == false && tablero.getCelda(1, 2) != valor)) {
            if (this.getTablaV()[1][1] > 0) {
                this.getTablaV()[1][1]--;
            }
        }
        //Casilla fila: 1, columna: 2
        if (tablero.celdaVacia(1, 2) == false) {
            this.getTablaV()[1][2] = 0;
        }
        if ((tablero.celdaVacia(0, 2) == false && tablero.getCelda(0, 2) != valor) || (tablero.celdaVacia(2, 2) == false && tablero.getCelda(2, 2) != valor)) {
            if (this.getTablaV()[1][2] > 0) {
                this.getTablaV()[1][2]--;
            }
        }
        if ((tablero.celdaVacia(1, 0) == false && tablero.getCelda(1, 0) != valor) || (tablero.celdaVacia(1, 1) == false && tablero.getCelda(1, 1) != valor)) {
            if (this.getTablaV()[1][2] > 0) {
                this.getTablaV()[1][2]--;
            }
        }
        //Casilla row: 2, columna: 0
        if (tablero.celdaVacia(2, 0) == false) {
            this.getTablaV()[2][0] = 0;
        }
        if ((tablero.celdaVacia(0, 0) == false && tablero.getCelda(0, 0) != valor) || (tablero.celdaVacia(1, 0) == false && tablero.getCelda(1, 0) != valor)) {
            if (this.getTablaV()[2][0] > 0) {
                this.getTablaV()[2][0]--;
            }
        }
        if ((tablero.celdaVacia(2, 1) == false && tablero.getCelda(2, 1) != valor) || (tablero.celdaVacia(2, 2) == false && tablero.getCelda(2, 2) != valor)) {
            if (this.getTablaV()[2][0] > 0) {
                this.getTablaV()[2][0]--;
            }
        }
        if ((tablero.celdaVacia(0, 2) == false && tablero.getCelda(0, 2) != valor) || (tablero.celdaVacia(1, 1) == false && tablero.getCelda(1, 1) != valor)) {
            if (this.getTablaV()[2][0] > 0) {
                this.getTablaV()[2][0]--;
            }
        }
        //Casilla row: 2, columna: 1
        if (tablero.celdaVacia(2, 1) == false) {
            this.getTablaV()[2][1] = 0;
        }
        if ((tablero.celdaVacia(2, 0) == false && tablero.getCelda(2, 0) != valor) || (tablero.celdaVacia(2, 2) == false && tablero.getCelda(2, 2) != valor)) {
            if (this.getTablaV()[2][1] > 0) {
                this.getTablaV()[2][1]--;
            }
        }
        if ((tablero.celdaVacia(0, 1) == false && tablero.getCelda(0, 1) != valor) || (tablero.celdaVacia(1, 1) == false && tablero.getCelda(1, 1) != valor)) {
            if (this.getTablaV()[2][1] > 0) {
                this.getTablaV()[2][1]--;
            }
        }
        //Casilla row: 2, columna: 2
        if (tablero.celdaVacia(2, 2) == false) {
            this.getTablaV()[2][2] = 0;
        }
        if ((tablero.celdaVacia(0, 2) == false && tablero.getCelda(0, 2) != valor) || (tablero.celdaVacia(1, 2) == false && tablero.getCelda(1, 2) != valor)) {
            if (this.getTablaV()[2][2] > 0) {
                this.getTablaV()[2][2]--;
            }
        }
        if ((tablero.celdaVacia(2, 0) == false && tablero.getCelda(2, 0) != valor) || (tablero.celdaVacia(2, 1) == false && tablero.getCelda(2, 1) != valor)) {
            if (this.getTablaV()[2][2] > 0) {
                this.getTablaV()[2][2]--;
            }
        }
        if ((tablero.celdaVacia(0, 0) == false && tablero.getCelda(0, 0) != valor) || (tablero.celdaVacia(1, 1) == false && tablero.getCelda(1, 1) != valor)) {
            if (this.getTablaV()[2][2] > 0) {
                this.getTablaV()[2][2]--;
            }
        }

    }

    @Override
    public Movimiento movimiento(Tablero t) {
        Movimiento mov;
        int valor = -1;
        int valor2 = -1;
        mov = new Movimiento();
        mov.setJugador(this);
        mov.setCruces(this.getCruces());
        if (this.getCruces() == true) {
            valor = 0;
            valor2 = 1;
        } else {
            valor = 1;
            valor2 = 0;
        }
        if (posibleVictoria(t, valor) != null) {

            int coordenadas[] = posibleVictoria(t, valor);
            mov.setFila(coordenadas[0]);
            mov.setColumna(coordenadas[1]);
            return mov;

        }
        if (posibleVictoria(t, valor2) != null) {

            int coordenadas[] = posibleVictoria(t, valor2);
            mov.setFila(coordenadas[0]);
            mov.setColumna(coordenadas[1]);
            return mov;

        }

        //recalcular valores
        calcularProbabilidadDeGanar(t);
        //
        int coordenadas[] = this.buscarCeldaVacia(t);
        mov.setFila(coordenadas[0]);
        mov.setColumna(coordenadas[1]);
        return mov;

    }

}
