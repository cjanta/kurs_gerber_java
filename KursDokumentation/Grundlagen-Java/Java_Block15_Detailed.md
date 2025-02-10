#04_02_2025 
## Block 15: Abstrakte Klassen und Interfaces

**Lernziele**: Verständnis der Konzepte abstrakter Klassen und Interfaces in Java und deren Anwendung zur Erstellung flexibler und erweiterbarer Softwarestrukturen.

---

### Abstrakte Klassen

Eine **abstrakte Klasse** in Java ist eine Klasse, die nicht instanziiert werden kann und als Vorlage für andere Klassen dient. Abstrakte Klassen können sowohl abstrakte Methoden (Methoden ohne Implementierung) als auch vollständige Methoden enthalten.

#### Eigenschaften einer abstrakten Klasse:

1. **Kann nicht instanziiert werden**: Man kann kein direktes Objekt einer abstrakten Klasse erstellen.
2. **Kann abstrakte Methoden enthalten**: Diese Methoden müssen in den Subklassen implementiert werden.
3. **Kann vollständige Methoden enthalten**: Diese Methoden können gemeinsam genutzt und von Subklassen geerbt werden.

#### Syntax einer abstrakten Klasse

```java
public abstract class Tier {
    private String name;

    public Tier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstrakte Methode, die in Subklassen implementiert wird
    public abstract void lautGeben();
}
```

In diesem Beispiel ist `Tier` eine abstrakte Klasse mit einer abstrakten Methode `lautGeben()`. Jede Subklasse von `Tier` muss die `lautGeben()`-Methode implementieren.

#### Implementierung einer Subklasse

```java
public class Hund extends Tier {
    public Hund(String name) {
        super(name);
    }

    @Override
    public void lautGeben() {
        System.out.println(getName() + " bellt.");
    }
}
```

Hier wird `Hund` von der abstrakten Klasse `Tier` abgeleitet und implementiert die abstrakte Methode `lautGeben()`.

### Was ist ein Interface?

Ein **Interface** ist eine komplett abstrakte Klasse, die nur abstrakte Methoden und Konstanten enthalten kann. Interfaces legen fest, welche Methoden eine Klasse implementieren muss, ohne dabei die Implementierung vorzuschreiben.

#### Eigenschaften eines Interfaces:

1. **Nur abstrakte Methoden** (bis Java 8): Alle Methoden in einem Interface sind implizit abstrakt und müssen von der implementierenden Klasse definiert werden.
2. **Können Konstanten enthalten**: Variablen in einem Interface sind automatisch `public`, `static` und `final`.
3. **Mehrfachvererbung**: Eine Klasse kann mehrere Interfaces implementieren, wodurch eine flexible Mehrfachvererbung möglich ist.

#### Syntax eines Interfaces

```java
public interface Fahrbar {
    void fahren();  // Abstrakte Methode
}
```

Eine Klasse, die `Fahrbar` implementiert, muss die Methode `fahren` definieren.

#### Implementierung eines Interfaces

```java
public class Auto implements Fahrbar {
    @Override
    public void fahren() {
        System.out.println("Das Auto fährt.");
    }
}
```

Hier implementiert `Auto` das Interface `Fahrbar` und definiert die Methode `fahren`.

### Abstrakte Klassen vs. Interfaces

| Merkmal                      | Abstrakte Klasse                                | Interface                                |
|------------------------------|-------------------------------------------------|------------------------------------------|
| Instanziierung               | Kann nicht instanziiert werden                  | Kann nicht instanziiert werden           |
| Methoden                     | Kann vollständige und abstrakte Methoden haben  | Enthält nur abstrakte Methoden (bis Java 8) |
| Vererbung                    | Eine Klasse kann nur eine abstrakte Klasse erben| Eine Klasse kann mehrere Interfaces implementieren |
| Zweck                        | Dient als Vorlage für ähnliche Klassen          | Dient zur Definition einer Schnittstelle, die mehrere Klassen implementieren können |

### Erweiterte Funktionen (ab Java 8 und Java 9)

- **Default-Methoden** (Java 8): Interfaces können nun `default`-Methoden enthalten, die eine Standardimplementierung haben.
- **Static-Methoden** (Java 8): Interfaces können `static`-Methoden enthalten.
- **Private-Methoden** (Java 9): Interfaces können private Methoden verwenden, die nur innerhalb des Interfaces aufgerufen werden können.

#### Beispiel für Default-Methoden in einem Interface

```java
public interface Fahrbar {
    void fahren();
    
    default void parken() {
        System.out.println("Das Fahrzeug parkt.");
    }
}
```

Eine Klasse, die dieses Interface implementiert, kann optional die `parken`-Methode überschreiben, muss es aber nicht.

### Beispielprojekt: Tiere und Fahrzeuge

1. **Erstelle eine abstrakte Klasse `Tier`** mit der abstrakten Methode `lautGeben()`.
2. **Erstelle eine Klasse `Hund`** und eine Klasse `Katze`, die von `Tier` erben und `lautGeben()` spezifisch implementieren.
3. **Erstelle ein Interface `Fahrbar`** mit der Methode `fahren()`.
4. **Erstelle eine Klasse `Auto`** und eine Klasse `Fahrrad`, die `Fahrbar` implementieren und die Methode `fahren()` ausführen.

### Beispielcode

```java
// Abstrakte Klasse Tier
public abstract class Tier {
    private String name;

    public Tier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void lautGeben();
}

// Implementierung der Subklassen
public class Hund extends Tier {
    public Hund(String name) {
        super(name);
    }

    @Override
    public void lautGeben() {
        System.out.println(getName() + " bellt.");
    }
}

public class Katze extends Tier {
    public Katze(String name) {
        super(name);
    }

    @Override
    public void lautGeben() {
        System.out.println(getName() + " miaut.");
    }
}

// Interface Fahrbar
public interface Fahrbar {
    void fahren();
}

// Implementierung der Klasse Auto
public class Auto implements Fahrbar {
    @Override
    public void fahren() {
        System.out.println("Das Auto fährt.");
    }
}

// Implementierung der Klasse Fahrrad
public class Fahrrad implements Fahrbar {
    @Override
    public void fahren() {
        System.out.println("Das Fahrrad fährt.");
    }
}

// Hauptklasse zur Demonstration
public class Main {
    public static void main(String[] args) {
        Tier meinHund = new Hund("Bello");
        Tier meineKatze = new Katze("Minka");
        
        meinHund.lautGeben();
        meineKatze.lautGeben();

        Fahrbar meinAuto = new Auto();
        Fahrbar meinFahrrad = new Fahrrad();
        
        meinAuto.fahren();
        meinFahrrad.fahren();
    }
}
```

### Zusammenfassung

- **Abstrakte Klassen** sind nützlich, wenn gemeinsame Methoden mit einer Standardimplementierung vorhanden sein sollen.
- **Interfaces** sind ideal, um eine einheitliche Schnittstelle für mehrere Klassen bereitzustellen.
- **Java 8 und später** bietet zusätzliche Möglichkeiten in Interfaces, wie `default`- und `static`-Methoden.

---

### Übung

1. Erstelle ein Interface `Beweglich` mit den Methoden `starten()` und `stoppen()`.
2. Erstelle die Klassen `Boot` und `Flugzeug`, die `Beweglich` implementieren und die Methoden spezifisch definieren.
3. Erstelle eine `Main`-Klasse, die Objekte von `Boot` und `Flugzeug` erstellt und ihre Methoden aufruft.

Durch diese Übung vertiefst du dein Verständnis von abstrakten Klassen und Interfaces und lernst, wie du verschiedene Typen von Objekten auf flexible Weise in Java modellieren kannst.
