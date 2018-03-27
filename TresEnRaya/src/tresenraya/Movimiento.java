package tresenraya;

public class Movimiento {

//Atributos:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    
    public boolean cruces;
    private int fila;
    private int columna;
    private Jugador jugador;

//constructor:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    
    public Movimiento() {

    }

//getters:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

    public int getColumna() {
        return this.columna;
    }//obtienes la columna
        
    public boolean getCruces() {
        return this.cruces;
    }//obtienes la ficha

    public int getFila() {
        return this.fila;
    }//obtienes la fila

    public Jugador getJugador() {
        return this.jugador;
    }//ontienes el jugador

//seters::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    
    public boolean setColumna(int columna) {
        if (columna < 0 || columna > 2) {
            return false;
            //movimiento Invalido
        } else {
            //movimiento Valido

            this.columna = columna;
            return true;
        }
    }
    
    public void setCruces(boolean cruces) {
        this.cruces = cruces;
    }

    public boolean setFila(int fila) {
        if (fila < 0 || fila > 2) {
            return false;
            //movimiento Invalido
        } else {
            //movimiento Valido
            
            this.fila = fila;
            return true;
        }
    }

    public void setJugador(Jugador jugador) {
        if (jugador != null) {
            this.jugador = jugador;
        }
    }
}
