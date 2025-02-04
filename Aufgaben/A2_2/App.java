package Aufgaben.A2_2;

public class App {

// Erstellt zwei Fahrzeug-Objekte.
// Tanke die Fahrzeuge mit Kraftstoff.
// Lasse die Fahrzeuge eine Strecke fahren.
// Gebe die Fahrzeugdetails aus.
// Checke wie weit das Auto noch fahren kann

    public static void main(String[] params){
        Fahrzeug fz1 = new Fahrzeug("Ford" , "Mustang", 1978, 0, "Jet A-1Kerosin", 100);
        Fahrzeug fz2 = new Fahrzeug("Chevrolet" , "xyz", 1945, 10000, "Benzin", 100);

        fz1.tanke(5.0);
        fz2.tanke(5.0);
        
        fz1.fahre(100.0);
        fz2.fahre(50.0);
        
        fz1.zeigeDetails();
        fz2.zeigeDetails();
        

    }
}