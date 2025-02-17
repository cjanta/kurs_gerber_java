#03_02_2025
## Block 5: Kontrollstrukturen – Schleifen

**Lernziele**: Verständnis von `for`-, `while`- und `do-while`-Schleifen.

---

### Schleifen in Java

Schleifen sind ein grundlegendes Konzept in der Programmierung und ermöglichen das wiederholte Ausführen eines Codeblocks, bis eine bestimmte Bedingung erfüllt ist. Java bietet mehrere Arten von Schleifen, um verschiedene Wiederholungsaufgaben effizient zu lösen: die `for`-Schleife, die `while`-Schleife und die `do-while`-Schleife.

### `for`-Schleife

Die `for`-Schleife eignet sich besonders, wenn die Anzahl der Wiederholungen bekannt ist. Sie besteht aus drei Teilen: Initialisierung, Bedingung und Inkrementierung.

Syntax:
```java
for (Initialisierung; Bedingung; Inkrementierung) {
    // Code, der wiederholt wird
}
```

Beispiel:
```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Iteration: " + i);
    System.out.print("Zeilenende");
}

```
##ACHTUNG!!!!
```java
for (int i = 1; i <= 5; i++) 
    System.out.println("Iteration: " + i);
    System.out.print("Zeilenende");

```

In diesem Beispiel wird die Schleife fünfmal durchlaufen und gibt die Zahl der aktuellen Iteration aus.

### `while`-Schleife

Die `while`-Schleife wird verwendet, wenn die Anzahl der Wiederholungen nicht vorab festgelegt ist. Die Schleife wird solange ausgeführt, wie die Bedingung wahr ist.

Syntax:
```java
while (Bedingung) {
    // Code, der wiederholt wird
}
```

Beispiel:
```java
int i = 1;
while (i <= 5) {
    System.out.println("Iteration: " + i);
    i++;
}
```
Hier wird der Wert von `i` in jeder Iteration um eins erhöht, bis die Bedingung `i <= 5` nicht mehr erfüllt ist.

### `do-while`-Schleife

Die `do-while`-Schleife funktioniert ähnlich wie die `while`-Schleife, jedoch wird der Codeblock mindestens einmal ausgeführt, da die Bedingung am Ende überprüft wird.

Syntax:
```java
do {
    // Code, der mindestens einmal ausgeführt wird
} while (Bedingung);
```

Beispiel:
```java
int i = 1;
do {
    System.out.println("Iteration: " + i);
    i++;
} while (i <= 5);
```
In diesem Beispiel wird der Codeblock mindestens einmal ausgeführt, selbst wenn die Bedingung von Anfang an falsch wäre.

### Vergleich der Schleifen

- **`for`-Schleife**: Gut geeignet, wenn die Anzahl der Wiederholungen im Voraus bekannt ist.
- **`while`-Schleife**: Nützlich, wenn die Schleifenbedingung vor der ersten Iteration überprüft werden soll und die Anzahl der Wiederholungen unbekannt ist.
- **`do-while`-Schleife**: Optimal, wenn der Codeblock mindestens einmal ausgeführt werden muss, da die Bedingung am Ende geprüft wird.

---

### Übung

Um ein besseres Verständnis für Schleifen zu erlangen, probiere die folgenden Aufgaben aus:

1. **Zahlenreihe drucken**: Schreibe ein Programm, das die Zahlen von 1 bis 10 mit einer `for`-Schleife ausgibt.
2. **Summenberechnung**: Erstelle ein Programm, das die Summe der Zahlen von 1 bis 100 berechnet und das Ergebnis mit einer `while`-Schleife ausgibt.
3. **Benutzereingaben**: Schreibe ein Programm, das wiederholt eine Zahl vom Benutzer abfragt und die Eingabe speichert, bis der Benutzer `0` eingibt. Verwende eine `do-while`-Schleife.

Diese Aufgaben helfen dir, die verschiedenen Schleifenarten zu verstehen und auszuwählen, welche Schleife für bestimmte Situationen am besten geeignet ist.
