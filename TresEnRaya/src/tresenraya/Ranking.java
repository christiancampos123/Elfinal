package tresenraya;

public class Ranking {

    //atributos:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    
    int victoria;
    int jugadas;
    int empate;
    int derrota;

    //constructor:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    
    public Ranking() {
        this.victoria = 0;
        this.jugadas = 0;
        this.empate = 0;
        this.derrota = 0;
    }
    
    //metodos:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

    public void addEmpate() {
        this.jugadas++;
        this.empate++;
    }

    public void addVictoria(boolean victoriaJ) {
        this.jugadas++;
        if (victoriaJ == true) {
            this.victoria++;    //añade victorias, tambien añade jugadas
        }else{
            this.derrota++;     //añade derrotas cuando no gana el jugador y entra en aqui
        }
    }
    
    public void mostrarRank() {
        System.out.println("Victorias = " + victoria);
        System.out.println("Empates = " + empate);
        System.out.println("Derrotas = " + derrota);
        System.out.println("Total Jugadas = " + jugadas);
    }
    
}
