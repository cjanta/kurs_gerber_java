#04_02_2025 
## Block 12: Einführung in Packages und die Organisation von Klassen

**Lernziele**: Verstehen der Strukturierung von Code mit Packages und Organisation von Klassen in Java.

---

### Was sind Packages?

Ein **Package** (Paket) ist ein Verzeichnis, das zusammengehörige Java-Klassen, Interfaces und andere Packages organisiert. Packages helfen dabei, den Code in sinnvolle Gruppen zu gliedern, die Struktur eines Projekts zu verbessern und Namenskonflikte zu vermeiden. Packages erleichtern zudem das Auffinden und Wiederverwenden von Code.

In Java ist jedes Package ein Ordner, der die Klassen enthält, die ihm zugeordnet sind. Die Verzeichnisstruktur spiegelt die Package-Struktur wider.

### Erstellen und Verwenden von Packages

Um eine Klasse einem Package zuzuordnen, fügt man die `package`-Anweisung am Anfang der Java-Datei hinzu. Das Package wird dabei in der Projektstruktur als Ordner erstellt.

#### Beispiel für ein Package

Hier erstellen wir ein Package namens `fahrzeuge` und legen eine Klasse `Auto` in dieses Package:

```java
package fahrzeuge;

public class Auto {
    private String farbe;

    public Auto(String farbe) {
        this.farbe = farbe;
    }

    public String getFarbe() {
        return farbe;
    }
}
```

Diese `Auto`-Klasse gehört nun zum `fahrzeuge`-Package. Die Klasse muss in einem Ordner `fahrzeuge` gespeichert sein, damit Java die Package-Struktur erkennt.

### Importieren von Klassen aus anderen Packages

Wenn du Klassen aus einem anderen Package verwenden möchtest, kannst du sie mit der `import`-Anweisung importieren. Diese Anweisung wird am Anfang der Datei platziert.

```java
import fahrzeuge.Auto;

public class Main {
    public static void main(String[] args) {
        Auto meinAuto = new Auto("Blau");
        System.out.println("Die Farbe des Autos ist: " + meinAuto.getFarbe());
    }
}
```

In diesem Beispiel importieren wir die `Auto`-Klasse aus dem `fahrzeuge`-Package, sodass sie in der `Main`-Klasse verwendet werden kann.

### Verwendung von Unterpackages

Packages können auch **hierarchisch** organisiert werden, indem Unterpackages erstellt werden. Die Unterpackage-Struktur wird durch einen Punkt (`.`) im Namen getrennt.

#### Beispiel für Unterpackages

```java
package fahrzeuge.lkw;

public class LKW {
    private int ladung;

    public LKW(int ladung) {
        this.ladung = ladung;
    }

    public int getLadung() {
        return ladung;
    }
}
```

Die Klasse `LKW` gehört jetzt zum Package `fahrzeuge.lkw`. Wenn diese Klasse in einer anderen Datei verwendet werden soll, importiert man sie mit dem vollständigen Namen:

```java
import fahrzeuge.lkw.LKW;
```

### Standard-Package

Wenn eine Klasse keinem Package zugeordnet wird, gehört sie zum **Standard-Package** (default package). Es ist jedoch eine bewährte Praxis, Klassen explizit in Packages zu organisieren, um eine saubere Struktur zu gewährleisten.

### Vorteile der Verwendung von Packages

- **Strukturierung und Organisation**: Packages gruppieren Klassen thematisch und erleichtern das Finden und Verwalten von Code.
- **Namenskonflikte vermeiden**: Zwei Klassen können denselben Namen haben, solange sie in unterschiedlichen Packages liegen.
- **Zugriffskontrolle**: In Java können Zugriffsmodifikatoren genutzt werden, um den Zugriff auf Klassen und Methoden innerhalb eines Packages zu steuern.

### Namenskonvention für Packages

In Java ist es üblich, Package-Namen in Kleinbuchstaben zu schreiben und den Domainnamen des Unternehmens umgekehrt zu verwenden (z. B. `com.unternehmen.projekt`). Innerhalb des Unternehmens wird dann weiter in Unterpackages gegliedert.

Beispiel:
```
com.beispielunternehmen.projekt.fahrzeuge
```

### Zusammenfassung

- **Packages** gruppieren verwandte Klassen und bieten eine strukturierte Organisation von Code.
- Klassen werden durch `import` importiert, um sie in anderen Packages zugänglich zu machen.
- **Unterpackages** erlauben eine hierarchische Strukturierung von Code.

---

### Übung

1. Erstelle ein Package `personen` und darin die Klasse `Person` mit den Attributen `name` und `alter` sowie einer Methode `vorstellen`, die den Namen und das Alter ausgibt.
2. Erstelle ein weiteres Package `unternehmen` und eine Klasse `Mitarbeiter`, die von `Person` erbt.
3. In einer `Main`-Klasse importiere beide Klassen und teste die `vorstellen`-Methode für ein `Mitarbeiter`-Objekt.

Die Verwendung von Packages in Java bietet dir eine klare Struktur und eine bessere Übersicht in größeren Projekten und fördert den modularen Aufbau deines Codes.
