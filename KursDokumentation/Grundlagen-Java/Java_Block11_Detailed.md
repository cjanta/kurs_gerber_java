#04_02_2025 
## Block 11: Methoden und Parameter – Rückgabewerte und `void`-Methoden

**Lernziele**: Grundlegendes Verständnis für Methoden mit Rückgabewerten und `void`-Methoden, sowie den Einsatz von Parametern in Java.

---

### Was sind Methoden?

In Java sind **Methoden** Blöcke von Code, die eine bestimmte Aufgabe oder Funktionalität ausführen. Methoden helfen dabei, den Code zu modularisieren, zu strukturieren und die Wiederverwendbarkeit zu fördern. Methoden bestehen aus einem Methodennamen, einem Rückgabewert, und optionalen Parametern, die zur Verarbeitung in der Methode verwendet werden.

### Aufbau einer Methode

Der allgemeine Aufbau einer Methode in Java sieht so aus:

```java
RückgabeType Methodenname(Parameter) {
    // Code, der ausgeführt wird
    return Rückgabewert;  // Nur falls ein Rückgabewert vorhanden ist
}
```

### Arten von Methoden

1. **Methoden mit Rückgabewert**: Diese Methoden geben einen Wert an den Aufrufer zurück.
2. **`void`-Methoden**: Diese Methoden geben keinen Wert zurück und führen nur eine Aktion aus.

### 1. Methoden mit Rückgabewert

Methoden mit Rückgabewerten sind nützlich, wenn die Methode eine Berechnung durchführt oder einen bestimmten Wert an den aufrufenden Code zurückgeben soll. Der Rückgabewert wird mit dem `return`-Schlüsselwort angegeben.

#### Beispiel

```java
public class MathOperations {
    public int add(int a, int b) {
        int summe = a + b;
        return summe;
    }
    public double add(double a, double b) {
        double summe = a + b;
        return summe;
    }
}
```

Hier ist `add` eine Methode, die zwei `int`-Parameter (`a` und `b`) entgegennimmt, ihre Summe berechnet und diesen Wert zurückgibt.

#### Aufruf einer Methode mit Rückgabewert

```java
public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        int ergebnis = math.add(5, 3);
        System.out.println("Ergebnis: " + ergebnis);
        double ergebnisDouble = math.add(5.0, 3.0);
        System.out.println("Ergebnis: " + ergebnisDouble);
    }
}
```

### 2. `void`-Methoden

`void`-Methoden führen eine Aktion aus, ohne einen Wert zurückzugeben. Sie sind nützlich, wenn keine Berechnung oder kein Wert an den aufrufenden Code zurückgegeben werden muss.

#### Beispiel

```java
public class Printer {
    public void printMessage(String message) {
        System.out.println(message);
    }
}
```

In diesem Beispiel nimmt die `printMessage`-Methode einen `String`-Parameter `message` und gibt ihn auf der Konsole aus. Da sie keinen Wert zurückgibt, ist der Rückgabewert `void`.

#### Aufruf einer `void`-Methode

```java
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.printMessage("Hallo, Welt!");
    }
}
```

### Parameter in Methoden

Parameter ermöglichen es, Daten an Methoden zu übergeben. In Java müssen die Datentypen der Parameter beim Definieren der Methode angegeben werden. Beim Aufruf der Methode müssen die Argumente in der gleichen Reihenfolge und im gleichen Typ angegeben werden.

#### Beispiel mit mehreren Parametern

```java
public class Calculator {
    public int subtract(int a, int b) {
        return a - b;
    }
}
```

Hier nimmt die Methode `subtract` zwei `int`-Parameter (`a` und `b`) und gibt das Ergebnis der Subtraktion zurück.

### Mehrere Methoden in einer Klasse

Eine Klasse kann mehrere Methoden enthalten, und diese können sowohl `void`-Methoden als auch Methoden mit Rückgabewerten sein.

```java
public class MathOperations {
    public int multiply(int a, int b) {
        return a * b;
    }

    public void printResult(int result) {
        System.out.println("Das Ergebnis ist: " + result);
    }
}
```

### Zusammenfassung

- **Methoden mit Rückgabewert**: Nützlich für Berechnungen oder wenn ein Wert benötigt wird. Ein `return`-Statement gibt den Wert zurück.
- **`void`-Methoden**: Führen eine Aktion aus, geben jedoch keinen Wert zurück.
- **Parameter**: Ermöglichen es, Daten an Methoden zu übergeben, um die Funktionalität zu variieren.

---

### Übung

1. Erstelle eine Klasse `Rechner` mit Methoden zur Berechnung von Addition, Subtraktion, Multiplikation und Division (alle mit Rückgabewerten).
2. Füge eine `void`-Methode `printErgebnis` hinzu, die das Ergebnis einer Berechnung auf der Konsole ausgibt.
3. Erstelle eine `main`-Methode, die ein `Rechner`-Objekt erstellt, Berechnungen durchführt und die Ergebnisse ausgibt.

Durch das Erstellen und Verwenden von Methoden erhältst du ein tieferes Verständnis dafür, wie Java-Programme strukturiert und modularisiert werden.
