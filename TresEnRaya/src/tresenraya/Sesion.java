package tresenraya;

import java.util.ArrayList;
import java.util.Scanner;

public class Sesion {

    //atributos:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    private Jugador jugador;
    private IA0 jugadorA;
    private ArrayList<Partida> partidas;
    private Ranking ranking;

    //constructor:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public Sesion() {
        this.partidas = new ArrayList();
        this.jugadorA = new IA4(); //cambiar de IA
        this.ranking = new Ranking();
    }

    //metodos:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public void elegirIA(){
         System.out.println("1- IA0");
        System.out.println("2- IA1");
        System.out.println("3- IA2");
        System.out.println("4- IA3");
        System.out.println("5- IA4");
        Scanner sc = new Scanner(System.in);
        int navegar = sc.nextInt();
        switch (navegar) {

            case 1:
                this.jugadorA = new IA0();
                break;
            case 2:
                this.jugadorA = new IA1();
                break;
            case 3:
                this.jugadorA = new IA2();
                break;
            case 4:
                this.jugadorA = new IA3();
                break;
            case 5:
                this.jugadorA = new IA4();
                break; 
    }
    }
    
    public void iniciarSesion() {
        this.newJugador();
        int opcion = 0;
        do {
            opcion = this.menu();
            switch (opcion) {

                case 1:

                    newPartida();
                    break;

                case 2:

                    this.ranking.mostrarRank();
                    break;

                case 3:
                  
                    this.elegirIA();
                    break;
                    
            }

        } while (opcion != 4);

    }

    public int menu() {

        System.out.println("1 para jugar."
                + "2 ver el ranking."
                + "3 para IAs."
                + "4 para salir.");

        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        return opcion;

    }

    public void newJugador() {
        System.out.println("Nombre:");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();  //aun ni idea
        this.jugador = new Jugador(nombre);
    }

    public void newPartida() {
        Partida part;
        int sorteo;
        sorteo = this.sorteo();

        if (sorteo == 0) {
            part = new Partida(this.jugador, this.jugadorA);
            System.out.println("Empiezas Tu!");
        } else {
            part = new Partida(this.jugadorA, this.jugador);
            System.out.println("Vas Segundo!");
        }
        part.jugar();
        this.rankingAct(part);
    }

    private void rankingAct(Partida part) {
        if (part.getTablero().comprobarEmp()) {
            System.out.println("Empate");
            this.ranking.addEmpate(); //llamamos add empate
        } else {
            if (part.Ganador()) {
                this.ranking.addVictoria(true);
                System.out.println("VICTORIA!");
            } else {
                this.ranking.addVictoria(false);
                System.out.println("Has perdido...");
            }
        }

    }

    public int sorteo() {
        int numeraco;
        numeraco = (int) (Math.random() * 2);
        if (numeraco == 0) {
            System.out.println("Empiezas tu!");
        } else {
            System.out.println("Empieza la IA!");
        }

        return numeraco;
    }

    // MAIN:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    public static void main(String[] args) {
        Sesion sesion;
        sesion = new Sesion();
        sesion.iniciarSesion();
    }
}
