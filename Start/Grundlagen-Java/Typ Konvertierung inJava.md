


## Umwandlung von `String` in `int`

Wenn du einen `String` in einen `int` umwandeln möchtest, kannst du die Methode `Integer.parseInt()` verwenden. Diese Methode nimmt einen `String` als Eingabe und gibt das entsprechende `int` zurück.

```java
String zahlAlsString = "123";
int zahl = Integer.parseInt(zahlAlsString);
System.out.println("Die Zahl als int: " + zahl);  // Ausgabe: Die Zahl als int: 123
```

**Hinweis:** Wenn der `String` nicht in eine Zahl umgewandelt werden kann (z. B. `"abc"`), wirft `Integer.parseInt()` eine `NumberFormatException`.

## Umwandlung von `String` in `double`

Um einen `String` in einen `double` zu konvertieren, kannst du die Methode `Double.parseDouble()` verwenden. Diese Methode konvertiert den `String` in den entsprechenden `double`-Wert.

```java
String kommaZahlAlsString = "123.45";
double kommaZahl = Double.parseDouble(kommaZahlAlsString);
System.out.println("Die Zahl als double: " + kommaZahl);  // Ausgabe: Die Zahl als double: 123.45
```

**Hinweis:** Ähnlich wie bei `Integer.parseInt()` wirft `Double.parseDouble()` eine `NumberFormatException`, wenn der `String` keine gültige Gleitkommazahl enthält.

## Umwandlung von `int` in `String`

Es gibt zwei einfache Möglichkeiten, einen `int`-Wert in einen `String` umzuwandeln:
1. Verwende die Methode `String.valueOf()`.
2. Verwende den `+ ""` Trick, um den `int`-Wert in einen `String` zu verwandeln.

```java
int zahl = 123;
String zahlAlsString = String.valueOf(zahl);
System.out.println("Die Zahl als String: " + zahlAlsString);  // Ausgabe: Die Zahl als String: 123

// Alternativ
String zahlAlsString2 = zahl + "";
System.out.println("Die Zahl als String (Alternative): " + zahlAlsString2);  // Ausgabe: Die Zahl als String (Alternative): 123
```

## Umwandlung von `double` in `String`

Ähnlich wie bei `int` gibt es auch für `double` die Möglichkeit, `String.valueOf()` oder den `+ ""` Trick zu verwenden.

```java
double kommaZahl = 123.45;
String kommaZahlAlsString = String.valueOf(kommaZahl);
System.out.println("Die Zahl als String: " + kommaZahlAlsString);  // Ausgabe: Die Zahl als String: 123.45

// Alternativ
String kommaZahlAlsString2 = kommaZahl + "";
System.out.println("Die Zahl als String (Alternative): " + kommaZahlAlsString2);  // Ausgabe: Die Zahl als String (Alternative): 123.45
```

## Umwandlung von `int` in `double`

In Java kann ein `int`-Wert direkt in einen `double`-Wert umgewandelt werden, da `double` eine breitere Typkonvertierung zulässt. Dies nennt man **implizite Typkonvertierung**.

```java
int zahl = 123;
double kommaZahl = zahl;  // Automatische Konvertierung von int zu double
System.out.println("Die Zahl als double: " + kommaZahl);  // Ausgabe: Die Zahl als double: 123.0
```

## Umwandlung von `double` in `int`

Um einen `double`-Wert in einen `int` zu konvertieren, muss eine **explizite Typkonvertierung** erfolgen, da `int` keine Dezimalstellen hat. Die Typkonvertierung schneidet dabei die Nachkommastellen ab.

```java
double kommaZahl = 123.45;
int zahl = (int) kommaZahl;  // Typumwandlung (cast)
System.out.println("Die Zahl als int: " + zahl);  // Ausgabe: Die Zahl als int: 123
```

**Achtung:** Durch das Abschneiden der Dezimalstellen können Daten verloren gehen.
