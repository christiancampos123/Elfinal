package tresenraya;

public class IA2 extends IA1 {

    //Atributos
    
    //Constructor
    public IA2() {
        super();
    }

    //Metodos
    @Override
    public Movimiento movimiento(Tablero t) {
        int valor = -1;
        Movimiento mov;
        mov = new Movimiento();
        mov.setJugador(this);
        mov.setCruces(this.getCruces());
        if (this.getCruces() == true) {
            valor = 0;
        } else {
            valor = 1;
        }
        if(this.posibleVictoria(t, valor)!=null){
            int coordenadas[]=this.posibleVictoria(t, valor);
            mov.setFila(coordenadas[0]);
            mov.setColumna(coordenadas[1]);
            return mov;
        }
        int coordenadas[] = this.buscarCeldaVacia(t);
        mov.setFila(coordenadas[0]);
        mov.setColumna(coordenadas[1]);
        return mov;

    }

    public int[] posibleVictoria(Tablero t, int valor) {
        int coordenadas[] = {0, 0};
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                if (t.celdaVacia(fila, columna) == true) {
                    t.setCelda(fila, columna, valor);
                    if (t.comprobarVictoria() == valor) {
                        coordenadas[0] = fila;
                        coordenadas[1] = columna;
                        t.setCelda(fila, columna, -1);
                        return coordenadas;
                    }
                    t.setCelda(fila, columna, -1);
                }
            }

        }
        return null;
    }
}
