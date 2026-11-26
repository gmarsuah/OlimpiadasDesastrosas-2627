import java.util.Random;

public abstract class DeporteDeCombate extends Deporte {
    protected Random random = new Random();
    protected int marcador1;
    protected int marcador2;
    

    public DeporteDeCombate(String nombre) {
        super(nombre);
    }

    protected void reiniciarMarcador(){
        marcador1 = 0;
        marcador2 = 0;

    }
    protected void anotar(int participante, int puntos){
        if(participante == 1){
            marcador1 += puntos;
        }else if(participante == 2){
            marcador2 += puntos;
        }
    }
    
    protected void mostrarMarcador(String pais1, String pais2){
        System.out.println("Total de " + pais1 + ": " + marcador1 + " puntos");
        System.out.println("Total de " + pais2 + ": " + marcador2 + " puntos");
    }
    
    protected void mostrarResultado(String pais1, String pais2) {
        System.out.println("\nRESULTADO: " + pais1 + " " + marcador1
                + " - " + pais2 + " " +  marcador2);

        if (marcador1 > marcador2) {
            System.out.println("Ganador: " + pais1);
        } else if (marcador2 > marcador1) {
            System.out.println("Ganador: " + pais2);
        } else {
            System.out.println("Empate entre " + pais1 + " y " + pais2);
        }
    }
}
