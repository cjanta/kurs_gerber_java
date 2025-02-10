#04_02_2025 
## Block 9: Grundkonzepte OOP – Klassen und Objekte

**Lernziele**: Verständnis für die Grundlagen der Objektorientierten Programmierung (OOP) und die Definition von Klassen und Objekten in Java.

---

### Objektorientierte Programmierung (OOP) und ihre Bedeutung

Die Objektorientierte Programmierung (OOP) ist ein Programmierparadigma, das auf der Idee basiert, Programme in **Objekte** zu unterteilen, die jeweils Daten und Methoden enthalten. OOP hilft dabei, komplexe Softwareprojekte übersichtlich und wartbar zu gestalten, da der Code in kleinere, modularisierte Einheiten (Klassen und Objekte) aufgeteilt wird.

### Was sind Klassen und Objekte?

- **Klassen**: Eine Klasse ist wie eine Vorlage oder ein Bauplan, der beschreibt, wie Objekte aussehen und sich verhalten sollen. Eine Klasse enthält Attribute (Eigenschaften) und Methoden (Verhalten) und legt fest, welche Daten ein Objekt der Klasse speichern kann und welche Aktionen es ausführen kann.
- **Objekte**: Ein Objekt ist eine Instanz einer Klasse. Wenn eine Klasse als Bauplan fungiert, ist das Objekt das tatsächliche Gebäude, das aus diesem Bauplan erstellt wurde. Jedes Objekt hat seine eigenen Werte für die in der Klasse definierten Attribute.

### Beispiel einer Klasse

Hier ist ein Beispiel für eine einfache Klasse in Java namens `Auto`, die Attribute und eine Methode enthält:

```java
public class Auto {
    // Attribute (Eigenschaften) der Klasse
    public String farbe;
    public int geschwindigkeit;

    // Methode (Verhalten) der Klasse
    public void fahren() {
        System.out.println("Das Autohat die Farbe " + farbe + " fährt mit " + geschwindigkeit + " km/h.");
    }
    public void vollBremsung () {
	    geschwindigkeit = 0;
    }
}
```

#### Erklärung des Codes:

- **Attribute**: `farbe` und `geschwindigkeit` sind die Attribute der Klasse `Auto`. Diese Attribute speichern den Zustand eines Objekts der Klasse. Die Attribute sind von anderen Klassen zugänglich, wenn sie öffentlich oder im selben Paket deklariert sind.
- **Methode `fahren`**: Die Methode `fahren()` beschreibt eine Aktion, die das Auto ausführen kann. Hier gibt die Methode eine Nachricht mit der aktuellen Geschwindigkeit des Autos auf der Konsole aus.

### Erstellen eines Objekts

Ein Objekt der Klasse `Auto` kann wie folgt erstellt werden:

```java
public class Main {
    public static void main(String[] args) {
        Auto meinAuto = new Auto();  // Erstellen eines neuen Objekts der Klasse Auto
        meinAuto.farbe = "Rot";  // Festlegen der Farbe
        meinAuto.geschwindigkeit = 120;  // Festlegen der Geschwindigkeit
        meinAuto.fahren();  // Methode aufrufen
    }
}
```

In diesem Beispiel erstellen wir ein Objekt `meinAuto` der Klasse `Auto`. Wir setzen die Werte der Attribute `farbe` und `geschwindigkeit` und rufen dann die Methode `fahren()` auf.

### Zusammenfassung

1. **Klassen** sind Blaupausen, die festlegen, welche Eigenschaften und Methoden Objekte dieser Klasse haben werden.
2. **Objekte** sind Instanzen von Klassen. Jedes Objekt hat seine eigenen Werte für die Attribute, die in der Klasse definiert wurden.
3. **Attribute** definieren den Zustand eines Objekts, während **Methoden** das Verhalten beschreiben.

---

### Übung

Um die Grundlagen von Klassen und Objekten zu festigen, führe folgende Aufgaben aus:

1. Erstelle eine Klasse `Person`, die die Attribute `name` (String) und `alter` (int) hat.
2. Füge eine Methode `begruesse` hinzu, die eine Begrüßungsnachricht mit dem Namen der Person ausgibt.
3. Erstelle ein Objekt der Klasse `Person`, setze den Namen und das Alter, und rufe die Methode `begruesse` auf.

Durch das Erstellen von Klassen und Objekten und das Setzen von Attributen erhältst du ein grundlegendes Verständnis für die Struktur und Funktionsweise der objektorientierten Programmierung in Java.
