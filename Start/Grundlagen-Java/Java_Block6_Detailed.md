#13_11_2024 #14_11_2024
## Block 6: Methoden und Parameter

**Lernziele**: Einführung in die Methodendefinition und -aufrufe.

---

### Methoden in Java

Methoden sind wiederverwendbare Blöcke von Code, die eine spezifische Aufgabe ausführen. Sie helfen dabei, den Code in überschaubare Abschnitte zu gliedern, die einzelnen Aufgaben erledigen, und erhöhen die Lesbarkeit sowie Wiederverwendbarkeit eines Programms.

Eine Methode kann Parameter entgegennehmen, die ihr Verhalten steuern, und sie kann einen Wert zurückgeben, um Ergebnisse an den Aufrufer zurückzugeben.

### Methodendefinition

Eine Methode wird definiert, indem man den Rückgabewert, den Namen und optionale Parameter angibt. Der allgemeine Aufbau einer Methode sieht so aus:

```java
Rückgabewert Methodenname(Parameter) {
    // Code, der ausgeführt wird
    return Rückgabewert;  // Falls die Methode einen Wert zurückgibt
}
```

#### Beispiel: Eine einfache Methode

Hier ist eine Methode, die zwei Zahlen addiert und das Ergebnis zurückgibt:

```java
public static int add(int a, int b) {
    int sum = a + b;
    return sum;
}
```

- **`public static`**: Dies sind Zugriffsmodifizierer. `public` bedeutet, dass die Methode von überall aufgerufen werden kann, und `static` bedeutet, dass sie zur Klasse gehört und nicht zu einer Instanz.
- **`int`**: Der Rückgabewert dieser Methode ist ein `int`. Eine Methode kann auch `void` als Rückgabewert haben, wenn sie keinen Wert zurückgibt.
- **`add(int a, int b)`**: Der Name der Methode ist `add`, und sie akzeptiert zwei Parameter vom Typ `int`.

### Aufruf einer Methode

Um eine Methode auszuführen, wird sie durch ihren Namen und die benötigten Argumente aufgerufen:

```java
int result = add(5, 10);
System.out.println("Die Summe ist: " + result);
```

### Parameter und Rückgabewerte

Parameter sind Eingabewerte, die an eine Methode übergeben werden und deren Verhalten beeinflussen. Rückgabewerte sind das Ergebnis, das die Methode an den Aufrufer zurückgibt.

#### Beispiel: Methode mit Parametern und Rückgabewert

Hier ist eine Methode, die zwei Zahlen multipliziert:

```java
public static int multiply(int x, int y) {
    return x * y;
}
```

Die Methode `multiply` nimmt zwei `int`-Parameter an, multipliziert sie und gibt das Ergebnis zurück.

#### Beispiel: Methode ohne Rückgabewert (void)

Manchmal muss eine Methode keinen Wert zurückgeben, sondern nur eine Aktion ausführen. In solchen Fällen wird der Rückgabewert auf `void` gesetzt.

```java
public static void greet(String name) {
    System.out.println("Hallo, " + name + "!");
}
```

Die Methode `greet` nimmt einen `String` als Parameter und gibt eine Begrüßung auf der Konsole aus.

---

### Übung

Um die Anwendung von Methoden zu üben, probiere folgende Aufgaben aus:

1. **Berechnungen**: Schreibe eine Methode `subtract`, die zwei `int`-Parameter akzeptiert und die Differenz berechnet und zurückgibt.
2. **Begrüßungsmethode erweitern**: Erstelle eine Methode `personalizedGreeting`, die den Namen und das Alter einer Person entgegennimmt und eine personalisierte Nachricht auf der Konsole ausgibt.
3. **Mehrere Methoden kombinieren**: Schreibe ein Programm mit den Methoden `add`, `subtract`, `multiply` und `divide`, um grundlegende mathematische Operationen durchzuführen.

Diese Übungen helfen dir, den Umgang mit Methoden, Parametern und Rückgabewerten in Java zu meistern.
