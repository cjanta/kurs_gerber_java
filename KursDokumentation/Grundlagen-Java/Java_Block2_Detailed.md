#03_02_2025
## Block 2: Variablen und Datentypen

**Lernziele**: Deklaration und Initialisierung von Variablen, Verständnis von Datentypen.

---

### Einführung in Variablen und Datentypen in Java

In Java dienen Variablen dazu, Datenwerte zu speichern und zu verwalten, die später im Programm verwendet werden können. Jede Variable hat einen bestimmten Datentyp, der festlegt, welche Art von Daten sie speichern kann, und eine klare Deklaration, die dem Programm mitteilt, wie die Daten genutzt werden sollen.

### Datentypen in Java

Java unterscheidet zwischen primitiven Datentypen und Referenztypen (z.B. Objekten). Hier konzentrieren wir uns auf die primitiven Datentypen, die grundlegende Informationen wie Zahlen und Zeichen speichern:

1. **Ganzzahlen**:
   - `byte`: 8-Bit-Ganzzahl (Bereich: -128 bis 127)
   - `short`: 16-Bit-Ganzzahl (Bereich: -32,768 bis 32,767)
   - `int`: 32-Bit-Ganzzahl (häufig verwendeter Standard für ganze Zahlen)
   - `long`: 64-Bit-Ganzzahl (für sehr große Zahlen)

2. **Gleitkommazahlen** (Dezimalzahlen):
   - `float`: 32-Bit-Gleitkommazahl, geeignet für einfache Dezimalwerte
   - `double`: 64-Bit-Gleitkommazahl, für präzisere Dezimalzahlen (Standard für Dezimalwerte in Java)

3. **Zeichen und Wahrheitswerte**:
   - `char`: 16-Bit-Unicode-Zeichen (z.B. `char letter = 'A';`)
   - `boolean`: Wahrheitswert `true` oder `false` (z.B. `boolean isJavaFun = true;`)

### Variablen deklarieren und initialisieren

Eine Variable wird in Java durch Angabe des Datentyps und eines Namens deklariert und kann anschließend mit einem Wert initialisiert werden.

Beispiel:
```java
int age = 25;
double price = 19.99;
boolean isJavaFun = true;
```

### Konstanten mit `final`

In Java können wir den Schlüsselbegriff `final` verwenden, um eine Konstante zu erstellen – eine Variable, die nur einmal gesetzt und danach nicht mehr verändert werden kann. Konstanten werden oft in Großbuchstaben geschrieben, um sie von veränderlichen Variablen zu unterscheiden.

Beispiel:
```java
final double PI = 3.14159;
```

---

### Beispielprogramm

Das folgende Programm zeigt, wie verschiedene Variablen deklariert und initialisiert werden und wie sie ausgegeben werden können.

```java
public class VariablesExample {
    public static void main(String[] args) {
        int age = 25;
        double price = 19.99;
        boolean isJavaFun = true;
        char grade = 'A';
        final double PI = 3.14159;

        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Grade: " + grade);
        System.out.println("PI: " + PI);
    }
}
```

### Erklärung des Programms

- **Deklaration und Initialisierung**: Jede Variable wird mit einem bestimmten Datentyp deklariert und direkt mit einem Anfangswert initialisiert.
- **Verwendung von `final`**: Die Variable `PI` ist als Konstante deklariert. Der Versuch, `PI` später im Code zu ändern, würde zu einem Fehler führen.

---

### Übung

Experimentiere mit Variablen und Konstanten in Java, um ein besseres Verständnis der Datentypen und ihrer Verwendung zu gewinnen.

1. **Verschiedene Variablen erstellen**: Erstelle Variablen für deine Lieblingszahl (int), deine Körpergröße (double) und deine Lieblingsbuchstaben (char). Gib die Werte auf der Konsole aus.
2. **Konstanten definieren**: Definiere eine Konstante für die Lichtgeschwindigkeit und versuche, sie nach der Initialisierung zu ändern. Beobachte die Fehlermeldung.
3. **Rechnen mit Variablen**: Verwende `int` und `double` Variablen, um eine einfache Berechnung durchzuführen (z.B. Fläche eines Kreises).

---

In diesem Block hast du die Grundlagen der Variablendeklaration und der Datentypen in Java kennengelernt. Variablen sind essenziell, um Daten in Programmen zu speichern und zu verarbeiten. Mit diesen Basiskenntnissen bist du bereit, einfache Programme zu schreiben, die mit numerischen, logischen und textbasierten Daten arbeiten.
