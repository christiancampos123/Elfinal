package tresenraya;

public class IA3 extends IA2 {

    //Atributos
    //Constructor
    public IA3() {
        super();
    }

    //M閠odos
    @Override
    public Movimiento movimiento(Tablero t) {
        int valor = -1;
        int noValor = -1;
        Movimiento mov;
        mov = new Movimiento();
        mov.setJugador(this);
        mov.setCruces(this.getCruces());

        if (this.getCruces() == true) {
            valor = 0;
            noValor = 1;
        } else {
            valor = 1;
            noValor = 0;
        }

        if (this.posibleVictoria(t, valor) != null) {
            int coordenadas[] = this.posibleVictoria(t, valor);
            mov.setFila(coordenadas[0]);
            mov.setColumna(coordenadas[1]);
            return mov;
        }

        if (this.posibleVictoria(t, noValor) != null) {
            int coordenadas[] = this.posibleVictoria(t, noValor);
            mov.setFila(coordenadas[0]);
            mov.setColumna(coordenadas[1]);
            return mov;
        }

        int coordenadas[] = this.buscarCeldaVacia(t);
        mov.setFila(coordenadas[0]);
        mov.setColumna(coordenadas[1]);
        return mov;

    }
}
