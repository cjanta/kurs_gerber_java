#13_11_2024
## Block 4: Kontrollstrukturen – Bedingungen

**Lernziele**: Bedingungen in Programmen anwenden (`if`, `else`, `switch`).

---

### Bedingungen und Entscheidungsstrukturen in Java

In der Programmierung müssen häufig Entscheidungen getroffen werden, die den weiteren Programmablauf beeinflussen. In Java werden Entscheidungsstrukturen wie `if`, `else` und `switch` verwendet, um verschiedene Programmzweige basierend auf bestimmten Bedingungen auszuführen.

### `if`- und `else`-Anweisungen

Die `if`-Anweisung ermöglicht es dir, eine Bedingung zu prüfen und nur dann Code auszuführen, wenn diese Bedingung wahr ist. Die `else`-Anweisung kann angefügt werden, um einen alternativen Code auszuführen, wenn die Bedingung nicht wahr ist.

Syntax:
```java
if (Bedingung) {
    // Code, wenn die Bedingung wahr ist
} else {
    // Code, wenn die Bedingung falsch ist
}
```

Beispiel:
```java
int number = 10;

if (number > 5) {
    System.out.println("Die Zahl ist größer als 5");
} else {
    System.out.println("Die Zahl ist 5 oder kleiner");
}
```

#### Verschachtelte Bedingungen und `else if`

Manchmal müssen mehrere Bedingungen überprüft werden. In solchen Fällen können `else if`-Anweisungen verwendet werden. (Sollte so gut wie möglich vermieden werden).

Beispiel:
```java
int number = 0;

if (number > 0) {
    System.out.println("Die Zahl ist positiv");
} else if (number < 0) {
    System.out.println("Die Zahl ist negativ");
} else {
    System.out.println("Die Zahl ist null");
}
```

### `switch`-Anweisung

Die `switch`-Anweisung ist nützlich, wenn eine Variable auf eine Reihe spezifischer Werte geprüft werden soll. Sie ist eine Alternative zu mehreren `if`- und `else if`-Anweisungen und kann den Code übersichtlicher machen.

Syntax:
```java
switch (Variable) {
    case Wert1:
        // Code, wenn Variable gleich Wert1 ist
        break;
    case Wert2:
        // Code, wenn Variable gleich Wert2 ist
        break;
    // Weitere Fälle ...
    default:
        // Code, wenn keine der Bedingungen erfüllt ist
}
```

In einem `switch`-Block wird jedes `case` durch ein `break` beendet, um den Programmablauf zu unterbrechen und nur den passenden Block auszuführen.

Beispiel:
```java
int day = 3;
String dayName;

switch (day) {
    case 1:
        dayName = "Montag";
        break;
    case 2:
        dayName = "Dienstag";
        break;
    case 3:
        dayName = "Mittwoch";
        break;
    default:
        dayName = "Unbekannter Tag";
}

System.out.println("Der Tag ist: " + dayName);
```

In diesem Beispiel wird die Variable `day` überprüft und entsprechend dem Wert der passende Fall (`case`) ausgeführt. Falls kein Fall zutrifft, wird der `default`-Block ausgeführt.

### Vergleich zwischen `if` und `switch`

Die `switch`-Anweisung ist besonders nützlich, wenn eine Variable mit mehreren festen Werten verglichen werden soll. Sie ist oft effizienter als eine lange `if`-Kette und kann den Code übersichtlicher gestalten. Wenn jedoch komplexere Bedingungen geprüft werden müssen, ist `if` die bessere Wahl.

---

### Übung

Um die Anwendung von Bedingungen zu üben, führe die folgenden Aufgaben aus:

1. **Positive und negative Zahlen**: Erstelle ein Programm, das eine Zahl abfragt und anzeigt, ob die Zahl positiv, negativ oder null ist.
2. **Wochentagsausgabe**: Verwende eine `switch`-Anweisung, um eine Zahl (1 bis 7) in den entsprechenden Wochentag (Montag bis Sonntag) umzuwandeln und auszugeben.
3. **Alter und Lebensphase**: Schreibe ein Programm, das das Alter des Benutzers abfragt und basierend auf dem Alter die Lebensphase angibt (z.B. Kind, Teenager, Erwachsener, Senior) mit Hilfe von `if`, `else if`, und `else`.

Diese Übungen vertiefen dein Verständnis der Entscheidungsstrukturen in Java und bereiten dich auf komplexere Programme vor, in denen Entscheidungen basierend auf Benutzereingaben und anderen Bedingungen getroffen werden.
