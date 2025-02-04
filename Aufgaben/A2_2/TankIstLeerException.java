package Aufgaben.A2_2;

public class TankIstLeerException extends RuntimeException {
    

    public TankIstLeerException(double kmStand){
        super("Bei Kilometerstand: " + kmStand + " ging der Kraftstoff aus. Bitte das Fahrzeug tanken.");
    }
}
