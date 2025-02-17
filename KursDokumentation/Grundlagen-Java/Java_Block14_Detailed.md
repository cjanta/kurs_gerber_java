#04_02_2025 
## Block 14: Grundlagen von Vererbung und Polymorphie

**Lernziele**: Verstehen der Konzepte Vererbung und Polymorphie in Java und deren Anwendung zur Wiederverwendung und Erweiterung von Klassen.

---

### Was ist Vererbung?

**Vererbung** ist ein fundamentales Konzept der Objektorientierten Programmierung (OOP), das es ermöglicht, eine neue Klasse auf Basis einer bestehenden Klasse zu erstellen. Die neue Klasse, auch **Subklasse** oder **Kindklasse** genannt, erbt Eigenschaften und Methoden der bestehenden Klasse, die als **Superklasse** oder **Elternklasse** bezeichnet wird. Durch Vererbung können Klassen ihre Funktionalität teilen, was den Code modularer und wiederverwendbarer macht.

#### Syntax der Vererbung

In Java wird die Vererbung mit dem `extends`-Schlüsselwort ausgedrückt:

```java
public class Elternklasse {
    // Eigenschaften und Methoden
}

public class Kindklasse extends Elternklasse {
    // Zusätzliche Eigenschaften und Methoden
}
```

### Beispiel für Vererbung

Angenommen, wir haben eine Klasse `Fahrzeug`, die allgemeine Eigenschaften für verschiedene Arten von Fahrzeugen enthält, und wir wollen eine spezifische Klasse `Auto` erstellen, die von `Fahrzeug` erbt.

```java
// Superklasse
public class Fahrzeug {
    protected int geschwindigkeit;
    
    public void fahren() {
        System.out.println("Das Fahrzeug fährt mit " + geschwindigkeit + " km/h.");
    }
}
```

```java
// Subklasse
public class Auto extends Fahrzeug {
    private String marke;
    
    public Auto(String marke, int geschwindigkeit) {
        this.marke = marke;
        this.geschwindigkeit = geschwindigkeit;
    }

    public void detailsAnzeigen() {
        System.out.println("Marke: " + marke);
        System.out.println("Geschwindigkeit: " + geschwindigkeit + " km/h");
    }
}
```

### Zugriff auf Superklassenmethoden

Die Subklasse hat automatisch Zugriff auf die Methoden und Attribute der Superklasse (solange sie nicht `private` sind). Methoden und Attribute, die `protected` oder `public` sind, können direkt in der Subklasse verwendet werden.

```java
public class Main {
    public static void main(String[] args) {
        Auto meinAuto = new Auto("Toyota", 120);
        meinAuto.fahren();  // Ruft die Methode der Superklasse auf
        meinAuto.detailsAnzeigen();  // Ruft die Methode der Subklasse auf
    }
}
```

### Was ist Polymorphie?

**Polymorphie** bedeutet "vielgestaltig" und erlaubt es, dass eine Methode in unterschiedlichen Klassen verschiedene Implementierungen haben kann. Polymorphie ermöglicht es, dass ein Objekt einer Subklasse auch als Objekt der Superklasse behandelt werden kann. So kann eine Methode flexibel mit verschiedenen Objekttypen arbeiten.

#### Beispiel für Polymorphie

Erweitern wir unser Beispiel, indem wir eine zusätzliche Subklasse `LKW` erstellen:

```java
public class LKW extends Fahrzeug {
    private int ladung;

    public LKW(int ladung, int geschwindigkeit) {
        this.ladung = ladung;
        this.geschwindigkeit = geschwindigkeit;
    }

    public void detailsAnzeigen() {
        System.out.println("Ladung: " + ladung + " kg");
        System.out.println("Geschwindigkeit: " + geschwindigkeit + " km/h");
    }
}
```

Nun können wir die Klasse `Fahrzeug` verwenden, um sowohl `Auto` als auch `LKW`-Objekte zu referenzieren:

```java
public class Main {
    public static void main(String[] args) {
        Fahrzeug meinAuto = new Auto("Toyota", 120);
        Fahrzeug meinLKW = new LKW(5000, 80);

        meinAuto.fahren();  // Ruft die `fahren`-Methode von Fahrzeug auf
        meinLKW.fahren();

        ((Auto) meinAuto).detailsAnzeigen();  // Typumwandlung, um detailsAnzeigen zu verwenden
        ((LKW) meinLKW).detailsAnzeigen();    // Typumwandlung, um detailsAnzeigen zu verwenden
    }
}
```

### Dynamisches Binden und Überschreiben von Methoden

In Java können Subklassen Methoden der Superklasse überschreiben, um spezifisches Verhalten zu implementieren. Diese Technik wird als **Methodenüberschreibung** bezeichnet. Zur Laufzeit entscheidet Java, welche Implementierung der Methode aufgerufen wird, basierend auf dem Objekttyp.

#### Beispiel: Methodenüberschreibung

```java
// In der Klasse Fahrzeug
public void fahren() {
    System.out.println("Das Fahrzeug fährt.");
}

// In der Klasse Auto
@Override
public void fahren() {
    System.out.println("Das Auto fährt schnell.");
}
```

Wenn wir ein `Auto`-Objekt verwenden und die `fahren`-Methode aufrufen, wird die `fahren`-Methode von `Auto` ausgeführt, da sie die `fahren`-Methode der Superklasse überschreibt.

### Vorteile der Vererbung und Polymorphie

- **Wiederverwendbarkeit**: Vererbung erlaubt es, bestehende Klassen zu erweitern und wiederzuverwenden.
- **Flexibilität**: Polymorphie ermöglicht es, dass Methoden mit verschiedenen Klassen zusammenarbeiten, ohne deren interne Implementierungen zu kennen.
- **Erweiterbarkeit**: Neue Klassen können leicht hinzugefügt werden, die die Funktionalität bestehender Klassen erben und erweitern.

---

### Übung

1. Erstelle eine Superklasse `Tier` mit einer Methode `lautGeben()`.
2. Erstelle Subklassen `Hund` und `Katze`, die von `Tier` erben und die Methode `lautGeben()` überschreiben, um spezifische Laute auszugeben.
3. Erstelle eine `Main`-Klasse, die eine Liste von `Tier`-Objekten (Hunde und Katzen) erstellt und `lautGeben()` aufruft.

Durch die Anwendung von Vererbung und Polymorphie kannst du komplexere Beziehungen zwischen Klassen modellieren und flexiblere sowie erweiterbare Programme schreiben.
