# Factory Pattern in Java

## 1. Einleitung
Das **Factory Pattern** ist ein **erzeugendes Designmuster**, das dazu dient, die Erstellung von Objekten zu kapseln. Es ermöglicht eine lose Kopplung zwischen der Client-Klasse und den konkreten Implementierungen, indem es eine zentrale Schnittstelle für die Objekterzeugung bereitstellt.

## 2. Warum das Factory Pattern nutzen?
- **Entkopplung**: Der Client muss nicht wissen, welche konkrete Klasse instanziiert wird.
- **Wartbarkeit**: Änderungen an der Objekterzeugung erfordern keine Modifikation des Client-Codes.
- **Flexibilität**: Neue Objekttypen können leicht hinzugefügt werden, ohne bestehende Codebereiche zu ändern.
- **Wiederverwendbarkeit**: Die Objektinstanziierung kann an einer zentralen Stelle organisiert werden.

## 3. Aufbau des Factory Patterns
Das Factory Pattern besteht typischerweise aus den folgenden Komponenten:
1. **Produkt (Interface oder abstrakte Klasse)**: Definiert eine gemeinsame Schnittstelle für die zu erzeugenden Objekte.
2. **Konkrete Implementierungen**: Verschiedene konkrete Klassen, die die Produkt-Schnittstelle implementieren.
3. **Factory-Klasse**: Enthält eine Methode, die basierend auf bestimmten Parametern das gewünschte Objekt zurückgibt.

## 4. Beispiel für das Factory Pattern in Java

### 4.1 Produkt-Interface
```java
public interface Fahrzeug {
    void fahren();
}
```

### 4.2 Konkrete Implementierungen
```java
public class Auto implements Fahrzeug {
    @Override
    public void fahren() {
        System.out.println("Das Auto fährt auf der Straße.");
    }
}

public class Fahrrad implements Fahrzeug {
    @Override
    public void fahren() {
        System.out.println("Das Fahrrad fährt auf dem Radweg.");
    }
}

public class Dreirad implements Fahrzeug {
    @Override
    public void fahren() {
        System.out.println("Das Dreirad fährt auf dem Gehweg.");
    }
}

```

### 4.3 Die Factory-Klasse
```java
public class FahrzeugFactory {
    public static Fahrzeug getFahrzeug(String typ) {
        if (typ.equalsIgnoreCase("Auto")) {
            return new Auto();
        } else if (typ.equalsIgnoreCase("Fahrrad")) {
            return new Fahrrad();
        } else if (typ.equalsIgnoreCase("Dreirad")) {
            return new Dreirad();
        }
        throw new IllegalArgumentException("Unbekannter Fahrzeugtyp: " + typ);
    }
}
```

### 4.4 Nutzung der Factory
```java
public class Main {
    public static void main(String[] args) {
        Fahrzeug auto = FahrzeugFactory.getFahrzeug("Auto");
        auto.fahren();

        Fahrzeug fahrrad = FahrzeugFactory.getFahrzeug("Fahrrad");
        fahrrad.fahren();
    }
}
```

## 5. Vorteile des Factory Patterns
- Die Client-Klasse muss die konkreten Implementierungen nicht kennen.
- Einfache Erweiterbarkeit durch neue Fahrzeugtypen.
- Reduziert die Abhängigkeiten zwischen Klassen und verbessert die Testbarkeit.

## 6. Fazit
Das Factory Pattern ist ein bewährtes Muster zur **Erzeugung von Objekten**, das die Code-Wartbarkeit verbessert und eine flexible Architektur ermöglicht. Es wird oft in Kombination mit anderen Design Patterns verwendet, um die Erzeugung komplexer Objekte zu steuern.

