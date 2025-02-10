#04_02_2025 
## Block 10: Konstruktoren und Zugriffsmodifikatoren (`public`, `private`, `protected`)

**Lernziele**: Einführung in Konstruktoren und Zugriffsmodifikatoren, um den Zugriff auf Attribute und Methoden in Java zu steuern.

---

### Konstruktoren

Ein **Konstruktor** ist eine spezielle Methode, die aufgerufen wird, wenn ein neues Objekt einer Klasse erstellt wird. Konstruktoren werden verwendet, um die Attribute eines Objekts zu initialisieren. Ein Konstruktor hat denselben Namen wie die Klasse und keinen Rückgabewert.

#### Beispiel für einen Konstruktor

```java
public class Auto {
    private String farbe;
    private int geschwindigkeit;

    // Konstruktor der Klasse Auto
    public Auto(String farbe, int geschwindigkeit) {
        this.farbe = farbe;
        this.geschwindigkeit = geschwindigkeit;
    }
    public String getFarbe() {
	    return this.farbe;
    }
    public int getGeschwindigkeit() {
	    return this.geschwindigkeit;
    }
    public void vollBremsung() {
	    this.geschwindigkeit= 0;
    }

}
```

In diesem Beispiel nimmt der Konstruktor zwei Parameter `farbe` und `geschwindigkeit`, die verwendet werden, um die Attribute des Objekts zu initialisieren. Das Schlüsselwort `this` verweist auf das aktuelle Objekt und unterscheidet die Parameter von den Attributen.

#### Verwendung des Konstruktors

```java
public class Main {
    public static void main(String[] args) {
        Auto meinAuto = new Auto("Blau", 120);  // Erstellen eines Objekts mit Konstruktor
        System.out.println("Farbe: " + meinAuto.getFarbe());
        System.out.println("Geschwindigkeit: " + meinAuto.getGeschwindigkeit());
    }
}
```

### Zugriffsmodifikatoren: `public`, `private`, `protected`

Zugriffsmodifikatoren steuern die Sichtbarkeit und den Zugriff auf Klassen, Attribute und Methoden. Die drei Hauptmodifikatoren sind `public`, `private` und `protected`.

#### 1. `public`

- Ein Element mit dem Modifikator `public` ist von überall zugänglich, sowohl innerhalb der Klasse als auch von anderen Klassen und Paketen.
- Typischerweise werden Methoden, die öffentlich zugänglich sein sollen, als `public` deklariert.

**Beispiel**:
```java
public class Auto {
    public String farbe;  // Öffentliches Attribut
    public void fahren() {  // Öffentliche Methode
        System.out.println("Das Auto fährt.");
    }
}
```

#### 2. `private`

- `private` bedeutet, dass das Element nur innerhalb derselben Klasse zugänglich ist.
- Es wird häufig für Attribute verwendet, um den direkten Zugriff von außen zu verhindern und die Datenkapselung zu fördern.

**Beispiel**:
```java
public class Auto {
    private String farbe;  // Privates Attribut

    public Auto(String farbe) {
        this.farbe = farbe;
    }

    public String getFarbe() {
        return farbe;
    }
}
```

Hier ist das Attribut `farbe` privat und kann nur über die `getFarbe`-Methode von außen abgerufen werden.

#### 3. `protected`

- `protected` bedeutet, dass das Element in der gleichen Klasse, in Unterklassen und in Klassen desselben Pakets zugänglich ist.
- `protected` wird häufig in Vererbungsszenarien verwendet.

**Beispiel**:
```java
public class Fahrzeug {
    protected int geschwindigkeit;  // Geschützt für Unterklassen
}
```

### Zusammenfassung der Zugriffsmodifikatoren

| Modifikator  | Sichtbarkeit                                                                                   |
|--------------|-----------------------------------------------------------------------------------------------|
| `public`     | Überall sichtbar, auch in anderen Paketen                                                      |
| `private`    | Nur in der Klasse sichtbar                                                                     |
| `protected`  | In der Klasse, in Unterklassen und im gleichen Paket sichtbar                                  |

---

### Übung

1. Erstelle eine Klasse `Person` mit privaten Attributen `name` und `alter` und einem Konstruktor zur Initialisierung dieser Attribute.
2. Füge öffentliche Methoden `getName` und `getAlter` hinzu, um auf diese Attribute zuzugreifen.
3. Erstelle eine Klasse `Mitarbeiter`, die von `Person` erbt, und füge ein `protected`-Attribut `position` hinzu.

Durch die Arbeit mit Konstruktoren und Zugriffsmodifikatoren erhältst du ein besseres Verständnis dafür, wie Daten in Klassen gekapselt und geschützt werden können und wie der Zugriff innerhalb und außerhalb der Klassen geregelt wird.
