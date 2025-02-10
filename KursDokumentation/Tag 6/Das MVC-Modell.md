# Das MVC-Modell – Detaillierte Erklärung und vollständiger Code

## **1. Einführung in MVC**
Das **MVC-Modell** (**Model-View-Controller**) ist ein bewährtes Architekturprinzip zur Strukturierung von Anwendungen, insbesondere in der GUI-Programmierung. Es trennt **die Daten, die Benutzeroberfläche und die Steuerlogik**, wodurch der Code modularer, wiederverwendbarer und wartbarer wird.

## **2. Ein Ansatz für MVC**
Dein MVC-Ansatz nutzt ein **modellbasiertes Event-System mit ChangeListener**, das eine saubere Trennung zwischen den Komponenten ermöglicht:

---

### **📌 1. Model (RechnerModel) – Die Datenverwaltung**
Das **Model speichert nur die Daten** und enthält keinerlei Geschäftslogik. Es dient lediglich als zentrale Datenhaltung und informiert andere Komponenten über Änderungen.

**Merkmale:**
- Speichert den aktuellen Rechenzustand (Eingabe, Operator, Zwischenergebnis).
- Gibt Änderungen über `PropertyChangeSupport` weiter, um die View zu aktualisieren.
- Kein direkter Bezug zur Geschäftslogik oder View.

```java
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

class RechnerModel {
    private StringBuilder eingabe = new StringBuilder();
    private int speicher = 0;
    private String operator = "";
    private final PropertyChangeSupport support;

    public RechnerModel() {
        this.support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void setEingabe(String wert) {
        String old = this.eingabe.toString();
        this.eingabe.setLength(0);
        this.eingabe.append(wert);
        support.firePropertyChange("anzeige", old, eingabe.toString());
    }

    public String getEingabe() {
        return eingabe.toString();
    }

    public void setOperator(String operator) {
        String old = this.operator;
        this.operator = operator;
        support.firePropertyChange("operator", old, operator);
    }

    public String getOperator() {
        return operator;
    }

    public void setSpeicher(int speicher) {
        String old = this.speicher;
        this.speicher = speicher;
        support.firePropertyChange("speicher", old, operator);
    }

    public int getSpeicher() {
        return speicher;
    }
}
```

 **Vorteile:** 
 Model ist von der Geschäftslogik getrennt.  
 Testbarkeit: Keine Abhängigkeit von UI-Komponenten.  
 View aktualisiert sich automatisch bei Änderungen.  

---

### **📌 2. Geschäftslogik (RechnerLogic) – Die Berechnungen**
Die eigentliche **Berechnungslogik wurde aus dem Model entfernt** und in eine separate Klasse `RechnerLogic` ausgelagert.

**Merkmale:**
- Führt Berechnungen unabhängig durch.
- Kein Bezug zu GUI oder Model.
- Bereitstellung einer `berechne`-Methode zur Nutzung im Controller.

```java
class RechnerLogic {
    public static int berechne(int a, int b, String op) {
        return switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> (b != 0) ? a / b : 0;
            default -> 0;
        };
    }
}
```

 **Vorteile:**
 Die Berechnungen können unabhängig getestet werden.  
 Klare Trennung zwischen Datenhaltung und Geschäftslogik.  
 Erweiterbarkeit für zukünftige Rechenoperationen.  

---

### **📌 3. View (RechnerView) – Die Benutzeroberfläche**
Die **View zeigt nur Daten an** und enthält keinerlei Logik für Berechnungen oder Geschäftsprozesse. Sie empfängt Ereignisse vom Model und aktualisiert die Anzeige.

**Merkmale:**
- Enthält UI-Komponenten (`JTextField`, `JButton`, `JPanel`).
- Registriert sich als Listener am Model.
- Übergibt Benutzereingaben an den Controller.

```java
import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Arrays;

class RechnerView extends JFrame implements PropertyChangeListener {
    private JTextField anzeige;
    private RechnerController controller;

    public RechnerView(RechnerModel model) {
        setTitle("Taschenrechner");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        anzeige = new JTextField();
        anzeige.setEditable(false);
        add(anzeige, "North");

        JPanel panel = new JPanel(new GridLayout(0, 4));
        for (String t : Arrays.asList("AC", "", "", "/", "7", "8", "9", "*", "4", "5", "6", "-", "1", "2", "3", "+", "", "0", "", "=")) {
            if (!t.isEmpty()) {
                JButton button = new JButton(t);
                button.addActionListener(e -> controller.handleInput(t));
                panel.add(button);
            } else {
                panel.add(new JLabel());
            }
        }
        add(panel, "Center");
        pack();
        setVisible(true);
        model.addPropertyChangeListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("anzeige".equals(evt.getPropertyName())) {
            anzeige.setText((String) evt.getNewValue());
        }
    }

    public void setController(RechnerController controller) {
        this.controller = controller;
    }
}
```

 **Vorteile:**
 Saubere Trennung von UI und Logik.  
 Kann leicht gegen eine andere GUI-Technologie ausgetauscht werden.  
 Model und Controller sind nicht von UI abhängig.  

---

## **6. Fazit**
Durch die Trennung von **Model (Daten), Logic (Berechnungen) und Controller (Steuerung)** wurde die Architektur noch modularer und wartbarer. Das System bleibt flexibel für zukünftige Erweiterungen und erlaubt eine einfache Erweiterung um neue Rechenfunktionen oder UI-Technologien. 🚀

 **Modularität:** Komponenten können unabhängig entwickelt und getestet werden.  
 **Flexibilität:** Die UI kann durch eine andere Technologie ersetzt werden (z. B. JavaFX, Web).  
 **Testbarkeit:** Die Geschäftslogik und das Model sind unabhängig testbar.  

Mit dieser Architektur ist der Taschenrechner zukunftssicher und leicht erweiterbar! 🎯

