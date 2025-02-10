#04_02_2025 
## Block 13: Übung – Einfache Klasse für ein alltägliches Objekt erstellen

**Lernziele**: Anwendung der Konzepte von Klassen, Objekten, Konstruktoren und Methoden in einer praktischen Übung.

---

### Aufgabenstellung

In dieser Übung wirst du eine Klasse für ein alltägliches Objekt, wie z. B. ein **Auto**, erstellen. Ziel ist es, die Grundlagen der Objektorientierten Programmierung in Java zu vertiefen. Du wirst Attribute, Konstruktoren und Methoden verwenden, um das Verhalten des Objekts zu modellieren.

### Schritt-für-Schritt-Anleitung

1. **Erstelle eine neue Klasse `Auto`**:

   Die Klasse `Auto` repräsentiert ein Auto mit grundlegenden Eigenschaften und Methoden. Du kannst die Klasse nach deinen Vorstellungen anpassen, aber sie sollte mindestens die folgenden Attribute und Methoden haben.

2. **Attribute definieren**:

   Definiere in der Klasse `Auto` einige grundlegende Attribute:

   - `String marke`: Die Marke des Autos (z. B. "Toyota")
   - `String farbe`: Die Farbe des Autos (z. B. "Blau")
   - `int geschwindigkeit`: Die aktuelle Geschwindigkeit des Autos in km/h
   - `int maximaleGeschwindigkeit`: Die maximale Geschwindigkeit, die das Auto erreichen kann

   ```java
   public class Auto {
       private String marke;
       private String farbe;
       private int geschwindigkeit;
       private int maximaleGeschwindigkeit;
   }
   ```

3. **Konstruktor hinzufügen**:

   Füge einen Konstruktor hinzu, der die Attribute `marke`, `farbe` und `maximaleGeschwindigkeit` beim Erstellen eines `Auto`-Objekts initialisiert. Setze die Anfangsgeschwindigkeit auf `0`, da das Auto beim Start steht.

   ```java
   public Auto(String marke, String farbe, int maximaleGeschwindigkeit) {
       this.marke = marke;
       this.farbe = farbe;
       this.maximaleGeschwindigkeit = maximaleGeschwindigkeit;
       this.geschwindigkeit = 0;
   }
   ```

4. **Methoden hinzufügen**:

   Erstelle Methoden, die das Verhalten des Autos simulieren.

   - **Methode `beschleunigen`**: Erhöht die Geschwindigkeit um einen angegebenen Wert, jedoch nicht über die `maximaleGeschwindigkeit` hinaus.

   ```java
   public void beschleunigen(int wert) {
       if (geschwindigkeit + wert > maximaleGeschwindigkeit) {
           geschwindigkeit = maximaleGeschwindigkeit;
       } else {
           geschwindigkeit += wert;
       }
       System.out.println("Das Auto beschleunigt auf " + geschwindigkeit + " km/h.");
   }
   ```

   - **Methode `bremsen`**: Verringert die Geschwindigkeit um einen angegebenen Wert, jedoch nicht unter `0`.

   ```java
   public void bremsen(int wert) {
       if (geschwindigkeit - wert < 0) {
           geschwindigkeit = 0;
       } else {
           geschwindigkeit -= wert;
       }
       System.out.println("Das Auto bremst auf " + geschwindigkeit + " km/h.");
   }
   ```

   - **Methode `detailsAnzeigen`**: Gibt die Details des Autos, wie Marke, Farbe und aktuelle Geschwindigkeit, auf der Konsole aus.

   ```java
   public void detailsAnzeigen() {
       System.out.println("Auto Marke: " + marke);
       System.out.println("Farbe: " + farbe);
       System.out.println("Aktuelle Geschwindigkeit: " + geschwindigkeit + " km/h");
       System.out.println("Maximale Geschwindigkeit: " + maximaleGeschwindigkeit + " km/h");
   }
   ```

### Beispiel eines vollständigen Programms

Hier ist das vollständige Programm, das die `Auto`-Klasse verwendet:

```java
public class Main {
    public static void main(String[] args) {
        Auto meinAuto = new Auto("Toyota", "Blau", 180);
        
        meinAuto.detailsAnzeigen();
        meinAuto.beschleunigen(50);
        meinAuto.beschleunigen(100);
        meinAuto.bremsen(30);
        meinAuto.beschleunigen(80);
        meinAuto.bremsen(200);
    }
}
```

Dieses Programm erstellt ein `Auto`-Objekt und ruft verschiedene Methoden auf, um das Verhalten des Autos zu simulieren.

### Erklärung des Programms

- **Erstellen eines `Auto`-Objekts**: Wir erstellen ein neues Auto mit der Marke "Toyota", der Farbe "Blau" und einer maximalen Geschwindigkeit von 180 km/h.
- **Methodenaufrufe**:
  - `beschleunigen(50)`: Erhöht die Geschwindigkeit um 50 km/h.
  - `beschleunigen(100)`: Erhöht die Geschwindigkeit um 100 km/h.
  - `bremsen(30)`: Verringert die Geschwindigkeit um 30 km/h.
  - `beschleunigen(80)`: Erhöht die Geschwindigkeit, jedoch nicht über die maximale Geschwindigkeit.
  - `bremsen(200)`: Verringert die Geschwindigkeit, aber nicht unter 0.

### Erweiterungsideen

1. **Tankanzeige**: Füge ein Attribut `tankstand` hinzu und Methoden `tanken` und `verbrauchAnzeigen`, die den Tankstatus anzeigen und simulieren.
2. **Verbrauch basierend auf Geschwindigkeit**: Simuliere einen höheren Verbrauch bei höheren Geschwindigkeiten.
3. **Zusätzliche Details**: Füge weitere Details wie `Baujahr` oder `Kilometerstand` hinzu.

---

Diese Übung hilft dir, das Erstellen und Verwenden von Klassen, Konstruktoren, Attributen und Methoden zu üben und ein alltägliches Objekt durch Programmcode darzustellen.
