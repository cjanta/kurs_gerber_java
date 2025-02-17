# Entwurfsmuster: Kompositum

## Einführung
Das **Kompositum-Entwurfsmuster** (engl. Composite Pattern) gehört zu den Strukturmustern und wird verwendet, um eine Baumstruktur von Objekten zu modellieren. Dabei können sowohl einzelne Objekte als auch Gruppen von Objekten auf die gleiche Weise behandelt werden.

### Anwendungsfälle
Das Muster wird eingesetzt, wenn:
- eine **hierarchische Struktur** von Objekten modelliert werden soll,
- **einzelne Objekte** und **Kompositionen** (Zusammenfassungen mehrerer Objekte) gleich behandelt werden sollen,
- die Verwaltung von **Teil-Ganzes-Beziehungen** vereinfacht werden soll.

## Struktur
Das Kompositum-Muster besteht aus folgenden Komponenten:
1. **Komponente (Component)**: Definiert die gemeinsame Schnittstelle für alle Objekte.
2. **Blatt (Leaf)**: Stellt einzelne Objekte dar, die keine weiteren Elemente enthalten.
3. **Kompositum (Composite)**: Beinhaltet mehrere Komponenten, also sowohl Blätter als auch weitere Kompositen.
4. **Client**: Nutzt die Komponente und kann mit einzelnen Objekten sowie mit zusammengesetzten Objekten arbeiten.

## UML-Diagramm
```
+-------------------+
|   Komponente     |<-----------------+ (Interface oder abstrakte Klasse)
|+operation()      |
+-------------------+
       /\
        |
 ---------------------
 |                   |
 |                   |
+-------------+      +----------------+
|    Blatt    |      |   Kompositum    |
|+operation() |      |+operation()     |
|             |      |+add(Component)  |
|             |      |+remove(Component)|
|             |      |+getChild(int)   |
+-------------+      +----------------+
```

## Beispiel in Java
```java
import java.util.ArrayList;
import java.util.List;

// Komponente
interface Komponente {
    void operation();
}

// Blatt
class Blatt implements Komponente {
    private String name;

    public Blatt(String name) {
        this.name = name;
    }
    
    @Override
    public void operation() {
        System.out.println("Blatt: " + name);
    }
}

// Kompositum
class Kompositum implements Komponente {
    private List<Komponente> kinder = new ArrayList<>();
    
    public void add(Komponente komponente) {
        kinder.add(komponente);
    }
    
    public void remove(Komponente komponente) {
        kinder.remove(komponente);
    }
    
    @Override
    public void operation() {
        System.out.println("Kompositum enthält:");
        for (Komponente k : kinder) {
            k.operation();
        }
    }
}

// Client-Code
public class CompositePatternDemo {
    public static void main(String[] args) {
        Blatt blatt1 = new Blatt("Blatt 1");
        Blatt blatt2 = new Blatt("Blatt 2");
        
        Kompositum kompositum = new Kompositum();
        kompositum.add(blatt1);
        kompositum.add(blatt2);
        
        kompositum.operation();
    }
}
```

## Vorteile und Nachteile
### Vorteile:
✔ Vereinfachte Struktur für hierarchische Systeme
✔ Einheitliche Behandlung von Einzel- und Gruppenobjekten
✔ Gute Erweiterbarkeit durch einfache Hinzufügung neuer Elemente

### Nachteile:
✘ Kann zu einer komplexeren Struktur führen
✘ Verwaltung von Eltern-Kind-Beziehungen kann aufwendig sein

## Fazit
Das **Kompositum-Muster** ist ideal für die Modellierung von Baumstrukturen, insbesondere in grafischen Benutzeroberflächen, Dateisystemen oder Organisationseinheiten. Es ermöglicht eine flexible und skalierbare Struktur, um mit Objekten unterschiedlicher Granularität einheitlich zu arbeiten.

