#03_02_2025
## Block 3: Ein- und Ausgabe

**Lernziele**: Einfache Benutzereingaben und Konsolenausgaben handhaben.

---

### Ein- und Ausgabe in Java

Die Ein- und Ausgabe (I/O) ist eine grundlegende Fähigkeit in der Programmierung. Sie ermöglicht es einem Programm, mit dem Benutzer zu interagieren, z.B. um Informationen anzufordern oder Ergebnisse anzuzeigen.

In Java wird die Konsolenausgabe mit der `System.out.println()`-Methode durchgeführt. Diese Methode ermöglicht es, Text auf der Konsole auszugeben. Die Eingabe hingegen erfolgt oft über die `Scanner`-Klasse, die Daten von der Konsole lesen kann.

### Konsolenausgabe mit `System.out.println()`

Die `System.out.println()`-Methode ist der einfachste Weg, Informationen in der Konsole anzuzeigen. Sie gibt den Inhalt in den Klammern aus und fügt am Ende eine neue Zeile hinzu.

Beispiel:
```java
System.out.println("Willkommen in Java!");
System.out.print("Das ist eine einfache Ausgabe.");
```

- **`System.out`**: Dies ist ein vordefiniertes Objekt in Java, das auf die Standardausgabe verweist (in der Regel die Konsole).
- **`println()`**: Die Methode gibt den angegebenen Text aus und fügt automatisch einen Zeilenumbruch hinzu.

Wenn du keinen Zeilenumbruch am Ende benötigst, kannst du stattdessen `System.out.print()` verwenden.

Beispiel:
```java
System.out.print("Dies ist eine Ausgabe ohne neuen Zeilenumbruch. ");
System.out.print("Weiterer Text in der gleichen Zeile.");
```

### Benutzereingabe mit der `Scanner`-Klasse

Die `Scanner`-Klasse ist eine der einfachsten Möglichkeiten, um Benutzereingaben in Java zu verarbeiten. Sie liest Daten von der Konsole und ermöglicht die Eingabe verschiedener Datentypen wie `String`, `int`, `double` usw.

#### Nutzung der `Scanner`-Klasse

Bevor du den `Scanner` verwenden kannst, musst du ihn importieren:
```java
import java.util.Scanner;
```

Anschließend kannst du ein `Scanner`-Objekt erstellen und es verwenden, um Eingaben vom Benutzer zu lesen.

Beispiel für Benutzereingaben:
```java
import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner-Objekt erstellen
        System.out.print("Gib deinen Namen ein: ");
        String name = scanner.nextLine();  // Liest eine Zeile Text vom Benutzer
        System.out.println("Hallo, " + name + "!");

        System.out.print("Gib dein Alter ein: ");
        int age = scanner.nextInt();  // Liest eine Ganzzahl (int) vom Benutzer
        System.out.println("Du bist " + age + " Jahre alt.");

        scanner.close();  // Scanner schließen, um Ressourcen freizugeben
    }
}
```

#### Erklärung des Codes

- **`Scanner scanner = new Scanner(System.in);`**: Erstellt ein neues `Scanner`-Objekt, das Eingaben von der Konsole liest.
- **`nextLine()`**: Liest eine ganze Textzeile vom Benutzer.
- **`nextInt()`**: Liest eine Ganzzahl (int) vom Benutzer.
- **`scanner.close();`**: Schließt den Scanner, um Speicherressourcen freizugeben. Dies ist optional, aber eine gute Praxis.

### Beispiel: Einfache Ein- und Ausgabeanwendung

Hier ist ein weiteres Beispiel, das den Benutzer nach seinem Namen und Alter fragt und die Informationen dann auf der Konsole ausgibt.

```java
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte gib deinen Namen ein: ");
        String name = scanner.nextLine();

        System.out.print("Bitte gib dein Alter ein: ");
        int age = scanner.nextInt();

        System.out.println("Willkommen, " + name + "!");
        System.out.println("Du bist " + age + " Jahre alt.");

        scanner.close();
    }
}
```

---

### Übung

Um die Grundlagen der Ein- und Ausgabe weiter zu vertiefen, führe folgende Aufgaben aus:

1. **Begrüßungsprogramm erweitern**: Erweitere das Beispielprogramm, sodass es zusätzlich nach dem Wohnort des Benutzers fragt und eine entsprechende Begrüßung ausgibt.
2. **Rechenaufgabe**: Erstelle ein Programm, das den Benutzer nach zwei Zahlen fragt und deren Summe, Differenz und Produkt berechnet und ausgibt.
3. **Fehlerbehandlung**: Verwende den `Scanner`, um Eingabefehler zu testen. Was passiert, wenn der Benutzer bei einer `nextInt()`-Eingabe Text eingibt?

Diese Übungen geben dir ein besseres Verständnis der Ein- und Ausgabe in Java. Indem du die `Scanner`-Klasse und `System.out.println()` verwendest, kannst du mit dem Benutzer interagieren und einfache Konsolenanwendungen erstellen.
