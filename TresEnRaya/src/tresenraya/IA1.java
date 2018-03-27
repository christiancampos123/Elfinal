package tresenraya;

public class IA1 extends IA0 {

    //Atributos

    private int valores[][] = {{3, 2, 3}, {2, 4, 2}, {3, 2, 3}};

    //Constructor
    public IA1() {
        super();
    }

    //M閠odos
    @Override
    public Movimiento movimiento(Tablero t) {
        Movimiento mov;
        mov = new Movimiento();

        mov.setJugador(this);
        mov.setCruces(this.getCruces());
        int coordenadas[]=this.buscarCeldaVacia(t);
        mov.setFila(coordenadas[0]);
        mov.setColumna(coordenadas[1]);
        return mov;
    }

    public int[] buscarCeldaVacia(Tablero t) {

        int valorMax = -1;
        int coordenadas[] = {0, 0};
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                if(t.celdaVacia(fila, columna)&& this.getValor(fila,columna)>valorMax){
                    coordenadas[0] = fila;
                    coordenadas[1] = columna;
                    valorMax= this.getValor(fila, columna);
                }
            }
        }
        return coordenadas;
    }
    
    public int getValor(int fila, int columna){
        return this.valores[fila][columna];
    }
    
    public int[][] getTablaV() {
        return this.valores;
    }

    public void llenarTabla() {
        //Centro
        this.valores[1][1] = 4;
        //Esquinas
        this.valores[0][0] = 3;
        this.valores[0][2] = 3;
        this.valores[2][0] = 3;
        this.valores[2][2] = 3;
        //Aristas
        this.valores[0][1] = 2;
        this.valores[1][0] = 2;
        this.valores[1][2] = 2;
        this.valores[2][1] = 2;
    }
    
}
