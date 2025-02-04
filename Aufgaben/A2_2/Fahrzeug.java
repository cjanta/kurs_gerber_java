package Aufgaben.A2_2;

public class Fahrzeug {

    private String marke;
    private String modell;
    private int baujahr;
    private double kmStand;
    private String kraftstoffart;

    private double tankvolumen;
    private double tankstand;

    private final double VERBRAUCH_LITER_PRO_KM = 0.05;  // Fahrzeug braucht 5 l / 100 km.

    public Fahrzeug(String marke, String modell, int baujahr, double kmStand, String kraftstoffart,
            double tankvolumen) {
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.kmStand = kmStand;
        this.kraftstoffart = kraftstoffart;
        this.tankvolumen = tankvolumen;
        tankstand = 0.0;
    }

    void tanke(double liter){
        double gesamt = tankstand + liter;
        
        if (gesamt > tankvolumen){
            System.out.printf("Vollgetankt, jedoch gingen %d liter daneben", gesamt - tankvolumen);
            tankstand = tankvolumen;
            return;
        }

        tankstand += liter;
    }

    void fahre(double km){
        double maxStrecke = wieWeitKannIchGenauFahren();
        double strecke = maxStrecke <= km ? maxStrecke : km;

        kmStand += strecke;
        tankstand = strecke == maxStrecke ? 0 : tankstand - (strecke * VERBRAUCH_LITER_PRO_KM);

        try {
            checkTankstand();
        } catch (TankIstLeerException tile) {
            System.out.println(tile.getMessage());
        }
    }

    private void checkTankstand() throws TankIstLeerException {
        if (tankstand  <= 0){
            throw new TankIstLeerException(kmStand);
        }
    }

    double wieWeitKannIchGenauFahren(){
        return tankstand / VERBRAUCH_LITER_PRO_KM;
    }

    int wieWeitKannIchFahren(){
        return (int) (tankstand / VERBRAUCH_LITER_PRO_KM);
    }

    void zeigeDetails(){
        //  Gibt alle Fahrzeugdaten auf der Konsole aus.
        StringBuffer sb = new StringBuffer();
        sb.append("Fahzeug\n");
        sb.append("Marke: " + marke + "\n");
        sb.append("Modell: " + modell + "\n");
        sb.append("Baujahr: " + baujahr + "\n");
        sb.append("Kilometerstand: " + kmStand + "\n");
        sb.append("Kraftstoffart: " + kraftstoffart + "\n");
        sb.append("Tankvolumen: " + tankvolumen + "\n");
        sb.append("Tankstand: " + tankstand + "\n");
        sb.append("Reichweite gem. Tankstand: " + wieWeitKannIchGenauFahren() + " km\n\n");
        System.out.println(sb.toString());
    }



}
