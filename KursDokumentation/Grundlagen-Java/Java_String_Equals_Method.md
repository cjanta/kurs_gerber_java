#03_02_2025 #04_02_2025 
## Vergleich von Strings in Java – Die `equals`-Methode und warum `==` nicht verwendet werden sollte

In Java ist der Vergleich von `String`-Objekten ein wichtiges Konzept, da Strings häufig in Programmen verwendet werden. Ein häufiger Fehler bei Einsteigern ist die Verwendung des `==`-Operators zum Vergleich von Strings. In dieser Erklärung werden wir die Unterschiede zwischen `==` und der `equals`-Methode im Detail erläutern.

---

### Warum `==` nicht für den String-Vergleich verwenden?

Der `==`-Operator wird in Java verwendet, um zu überprüfen, ob zwei Referenzen (also Speicheradressen) auf das **gleiche** Objekt im Speicher verweisen. Das bedeutet, dass `==` nur dann `true` zurückgibt, wenn beide Variablen tatsächlich auf dasselbe `String`-Objekt zeigen.

#### Beispiel mit `==`:

```java
String str1 = new String("Hallo");
String str2 = new String("Hallo");

if (str1 == str2) {
    System.out.println("Die Strings sind gleich.");
} else {
    System.out.println("Die Strings sind nicht gleich.");
}
```

## häufiger Fehler: 
```java
String str1 = new String("Hallo");
String str2 = new String("Hallo");

if (str1 = str2) {
    System.out.println("Die Strings sind gleich.");
} else {
    System.out.println("Die Strings sind nicht gleich.");
}
```

**Erklärung**: In diesem Beispiel wird "Die Strings sind nicht gleich." ausgegeben, obwohl `str1` und `str2` den gleichen Text ("Hallo") enthalten. Der Grund ist, dass `==` überprüft, ob `str1` und `str2` auf dasselbe Objekt verweisen. Da wir hier zwei separate `String`-Objekte erstellt haben, befinden sich `str1` und `str2` an unterschiedlichen Speicheradressen.

### Die `equals`-Methode

Die `equals`-Methode wird verwendet, um den **Inhalt** von zwei `String`-Objekten zu vergleichen, also die tatsächliche Zeichenkette. Im Gegensatz zu `==`, das auf Speicheradressen prüft, vergleicht `equals` Zeichen für Zeichen, um festzustellen, ob die Strings denselben Inhalt haben.

#### Beispiel mit `equals`:

```java
String str1 = new String("Hallo");
String str2 = new String("Hallo");

if (str1.equals(str2)) {
    System.out.println("Die Strings sind gleich.");
} else {
    System.out.println("Die Strings sind nicht gleich.");
}
```

**Erklärung**: Hier gibt `equals` den Vergleich auf Basis des Inhalts zurück. Das bedeutet, dass das Ergebnis `true` ist, da `str1` und `str2` denselben Text ("Hallo") enthalten, auch wenn sie zwei verschiedene Objekte sind.

### Wichtige Hinweise zur Verwendung von `equals`

- **Unterscheidung zwischen Groß- und Kleinschreibung**: Die Methode `equals` unterscheidet zwischen Groß- und Kleinschreibung. Das bedeutet, dass `"Hallo"` und `"hallo"` als ungleich betrachtet werden.
  
    Beispiel:
    ```java
    String str1 = "Hallo";
    String str2 = "hallo";
    System.out.println(str1.equals(str2));  // Gibt false zurück
    ```

- **Fallunempfindlicher Vergleich**: Für einen Vergleich ohne Berücksichtigung der Groß- und Kleinschreibung kann `equalsIgnoreCase` verwendet werden.
  
    Beispiel:
    ```java
    String str1 = "Hallo";
    String str2 = "hallo";
    System.out.println(str1.equalsIgnoreCase(str2));  // Gibt true zurück
    ```

### Zusammenfassung

- **Verwende `==` nur für den Vergleich von Referenzen**: `==` prüft, ob zwei Variablen auf dasselbe Objekt verweisen.
- **Verwende `equals`, um den Inhalt von Strings zu vergleichen**: `equals` überprüft, ob die tatsächlichen Zeichen in den Strings übereinstimmen.
- **Vorsicht bei Groß- und Kleinschreibung**: `equals` ist casesensitiv, während `equalsIgnoreCase` fallunempfindlich ist.

Indem man die Unterschiede zwischen `==` und `equals` versteht, lassen sich häufige Fehler vermeiden und korrekte String-Vergleiche in Java durchführen.
