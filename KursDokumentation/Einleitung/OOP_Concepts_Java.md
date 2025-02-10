#04_02_2025 
## OOP in Java: Grundkonzepte und Aufbau

Dieser Bereich deckt die Grundlagen der Objektorientierten Programmierung (OOP) in Java ab. Die folgenden Blöcke führen nacheinander in Klassen, Objekte, Methoden, Zugriffsmodifikatoren und die Organisation von Klassen ein.

---
 
### Block 9: Grundkonzepte OOP – Klassen und Objekte

[[Java_Block9_Detailed]]
**Lernziele**: Verständnis für die Grundlagen der Objektorientierung und die Definition von Klassen und Objekten.

**Inhalt**:
- **Klassen**: Eine Klasse beschreibt den Bauplan für Objekte und definiert deren Eigenschaften und Methoden.
- **Objekte**: Ein Objekt ist eine Instanz einer Klasse und enthält spezifische Werte für die in der Klasse definierten Attribute.

**Beispiel**:
```java
public class Auto {
    String farbe;
    int geschwindigkeit;

    public void fahren() {
        System.out.println("Das Auto fährt mit " + geschwindigkeit + " km/h.");
    }
}
```

**Übung**:
- Erstelle eine Klasse `Person` mit Attributen `name` und `alter`.
- Instanziere `Person`-Objekte und verwende die Attribute.

---

### Block 10: Konstruktoren und Zugriffsmodifikatoren (`public`, `private`, `protected`)
[[Java_Block10_Detailed]]

**Lernziele**: Einführung in Konstruktoren und Zugriffsmodifikatoren, um den Zugriff auf Attribute und Methoden zu steuern.

**Inhalt**:
- **Konstruktoren**: Eine spezielle Methode, die beim Erstellen eines Objekts aufgerufen wird, um Attribute zu initialisieren.
- **Zugriffsmodifikatoren**:
  - `public`: Die Methode oder das Attribut ist überall zugänglich.
  - `private`: Die Methode oder das Attribut ist nur innerhalb der Klasse zugänglich.
  - `protected`: Zugriff in der Klasse und allen Unterklassen.

**Beispiel**:
```java
public class Auto {
    private String farbe;
    private int geschwindigkeit;

    public Auto(String farbe, int geschwindigkeit) {
        this.farbe = farbe;
        this.geschwindigkeit = geschwindigkeit;
    }

    public void fahren() {
        System.out.println("Das " + farbe + "e Auto fährt mit " + geschwindigkeit + " km/h.");
    }
}
```

**Übung**:
- Erstelle einen Konstruktor in der `Person`-Klasse, der `name` und `alter` initialisiert.
- Setze ein Attribut `alter` auf `private` und teste den Zugriff von außen.

---

### Block 11: Methoden und Parameter – Rückgabewerte und `void`-Methoden

[[Java_Block11_Detailed]]

**Lernziele**: Grundlegendes Verständnis für Methoden mit Rückgabewerten und `void`-Methoden, sowie den Einsatz von Parametern.

**Inhalt**:
- **Methoden**: Codeblöcke, die eine bestimmte Funktionalität ausführen.
- **Parameter**: Eingaben, die beim Aufruf einer Methode übergeben werden.
- **Rückgabewerte und `void`-Methoden**: Methoden können entweder einen Wert zurückgeben oder `void` sein, wenn sie nur eine Aktion ausführen.

**Beispiel**:
```java
public class Auto {
    private String farbe;

    public Auto(String farbe) {
        this.farbe = farbe;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String neueFarbe) {
        this.farbe = neueFarbe;
    }
}
```

**Übung**:
- Ergänze die `Person`-Klasse um eine Methode `gibAlter`, die das Alter der Person zurückgibt.
- Erstelle eine `void`-Methode `feiereGeburtstag`, die das Alter der Person um 1 erhöht.

---

### Block 12: Einführung in Packages und die Organisation von Klassen
[[Java_Block12_Detailed]]

**Lernziele**: Strukturierung des Codes durch Verwendung von Packages und Organisation der Klassen.

**Inhalt**:
- **Packages**: Pakete gruppieren verwandte Klassen und helfen, den Code besser zu organisieren.
- **Erstellen von Packages**: In Java-Projekten sollten Klassen thematisch in Packages organisiert werden (z. B. `model` für Datenmodelle, `service` für Dienste).

**Beispiel**:
```java
package fahrzeuge;

public class Auto {
    private String farbe;

    public Auto(String farbe) {
        this.farbe = farbe;
    }
}
```

**Übung**:
- Erstelle ein Package `personen` und verschiebe die Klasse `Person` in dieses Package.
- Experimentiere mit mehreren Klassen in verschiedenen Packages und importiere sie in einer Hauptklasse.

---

Jeder Block kann durch eine abschließende, praxisorientierte Übung vertieft werden, um die Anwendung der OOP-Konzepte zu festigen.

[[Java_Block13_Detailed]]

[[Java_Block14_Detailed]]

[[Java_Block15_Detailed]]
