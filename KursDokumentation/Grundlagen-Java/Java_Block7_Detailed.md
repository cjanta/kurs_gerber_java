#03_02_2025 #04_02_2025 
## Block 7: Einführung in OOP (Klassen und Objekte)

**Lernziele**: Verständnis von Klassen und Objekten, einfache Klassen erstellen.

---

### Objektorientierte Programmierung (OOP) in Java

Objektorientierte Programmierung (OOP) ist ein Paradigma in der Softwareentwicklung, das sich darauf konzentriert, Daten und Funktionen in wiederverwendbare „Objekte“ zu kapseln. Java ist eine objektorientierte Sprache, die Klassen und Objekte verwendet, um Programme zu strukturieren.

### Klassen und Objekte

- **Klassen**: Eine Klasse ist eine Vorlage oder ein Bauplan, der beschreibt, welche Eigenschaften (Attribute) und Verhaltensweisen (Methoden) die Objekte dieser Klasse haben werden.
- **Objekte**: Ein Objekt ist eine Instanz einer Klasse, die konkrete Werte für die in der Klasse definierten Attribute enthält und deren Methoden verwenden kann.

#### Beispiel einer einfachen Klasse

Hier ist ein Beispiel für eine einfache Klasse `Car`:

```java
public class Car {
    // Attribute
    private String color;
    private int speed;

    // Methode
    public void drive() {
        System.out.println("Das Auto fährt mit " + speed + " km/h.");
    }
}
```

- muss in eine eigene Datei geschrieben werden mit 
	- Car.java
- **Attribute**: Die `Car`-Klasse hat zwei Attribute, `color` und `speed`, die die Eigenschaften eines Autos beschreiben.
- **Methode**: Die Methode `drive()` beschreibt ein Verhalten des Autos.
- Hier das UML für Car
![[Pasted image 20250204104754.png]]
### Erstellen eines Objekts

Um ein Objekt einer Klasse zu erstellen, verwendet man das `new`-Schlüsselwort. Ein Objekt kann dann auf seine Attribute und Methoden zugreifen.

Beispiel:

```java
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();  // Objekt erstellen
        myCar.color = "Rot";  // Attribut setzen - klappt nicht bei privatem Attribut
        myCar.speed = 100;  // Attribut setzen - klappt nicht bei privatem Attribut
        myCar.drive();  // Methode aufrufen
    }
}
```

In diesem Beispiel erstellen wir ein `Car`-Objekt namens `myCar`, setzen die Attribute `color` und `speed`, und rufen die Methode `drive()` auf.

### Konstruktoren

Ein Konstruktor ist eine spezielle Methode, die aufgerufen wird, wenn ein Objekt einer Klasse erstellt wird. Konstruktoren werden verwendet, um Objekte zu initialisieren.

Beispiel:

```java
public class Car {
    private String color;
    private int speed;

    // Konstruktor
    public Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public void drive() {
        System.out.println("Das Auto fährt mit " + speed + " km/h.");
    }
}
```

Hier wird ein Konstruktor definiert, der die Attribute `color` und `speed` beim Erstellen eines neuen `Car`-Objekts setzt.

Aufruf des Konstruktors:

```java
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Blau", 120);  // Konstruktor aufrufen
        myCar.drive();
    }
}
```

### Zusammenfassung

- Eine **Klasse** beschreibt den Bauplan eines Objekts, indem sie Attribute und Methoden definiert.
- Ein **Objekt** ist eine Instanz dieser Klasse, die spezifische Werte für die Attribute enthält und Methoden verwenden kann.
- Ein **Konstruktor** dient zur Initialisierung von Objekten, wenn sie erstellt werden.

---

### Übung

Um Klassen und Objekte besser zu verstehen, führe die folgenden Aufgaben aus:

1. **Klasse erstellen**: Erstelle eine Klasse `Person` mit den Attributen `name` und `age`. Füge eine Methode `introduce` hinzu, die den Namen und das Alter der Person ausgibt.
2. **Konstruktor verwenden**: Ergänze die `Person`-Klasse mit einem Konstruktor, der `name` und `age` als Parameter nimmt und die Attribute initialisiert.
3. **Objekte erstellen und Methoden verwenden**: Erstelle im `Main`-Programm mehrere `Person`-Objekte und rufe die Methode `introduce` für jedes Objekt auf.

Diese Übungen geben dir ein tieferes Verständnis dafür, wie Klassen und Objekte in Java verwendet werden und wie sie die Grundlage für die objektorientierte Programmierung bilden.



## **Aufgabe: Erstelle eine Klasse `Auto`**

Schreibe eine Java-Klasse `Auto`, die folgende Anforderungen erfüllt:

### **1. Eigenschaften (Attribute)**

- `marke` (z.B. "BMW", "Audi") → `String`
- `modell` (z.B. "A4", "X5") → `String`
- `baujahr` (z.B. 2022) → `int`

### **2. Konstruktor**

- Der Konstruktor soll alle drei Attribute (`marke`, `modell`, `baujahr`) als Parameter übernehmen und initialisieren.

### **3. Methoden**

- `zeigeDetails()`: Gibt alle Informationen des Autos in der Konsole aus.
- `istOldtimer()`: Prüft, ob das Auto älter als 30 Jahre ist. Falls ja, gibt die Methode `true` zurück, sonst `false`.

---