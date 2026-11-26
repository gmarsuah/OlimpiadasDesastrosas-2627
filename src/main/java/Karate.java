public class Karate extends DeporteDeCombate {

    public Karate() {
        super("Karate");
    }

    @Override
    public void competir(String pais1,String pais2){

        presentarCompeticion(pais1,pais2);
        reiniciarMarcador();
        mostrarMarcador(pais1,pais2);
        System.out.println();

        for(int i = 0 ; i < 8 ; i++){

            int paises = random.nextInt(2) + 1;
            int acontecimientos = random.nextInt(3) + 1;

            switch(paises){
                case 1:
                    System.out.print("Turno " + (i + 1) + ": " + pais1 + " -");
                break;
                case 2:
                    System.out.print("Turno " + (i + 1) + ": " + pais2 + " -");
                break;
            }

            switch(acontecimientos){
                case 1:
                    System.out.println(" Puñetazo válido (+1 punto)");
                    anotar(paises, 1);
                break;

                case 2:
                    System.out.println(" Bloqueo (+0 puntos)");
                    anotar(paises, 0);
                break;

                case 3:
                    System.out.println(" Patada válida (+2 puntos)");
                    anotar(paises, 2);
                break;

            }
            pausa();
        }
        mostrarResultado(pais1,pais2);
    }
}
