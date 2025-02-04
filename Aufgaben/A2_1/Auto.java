package Aufgaben.A2_1;

import java.time.Year;

public class Auto {

    private String marke;
    private String modell;
    private int baujahr;
    private final int OLDTIMER = 30;
    private final String SEP = ", ";

    public Auto(String marke, String modell, int baujahr){
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
    }

    public String showDetails(){
        return marke + SEP + modell + SEP + baujahr;
    }
    public boolean isOldtimer() {
        return baujahr <= (Year.now().getValue() - OLDTIMER);
    }
    
    @Override
    public String toString(){
        return showDetails();
    }
}
