#13_11_2024
## Block 1: Einführung in Java und „Hello World“

**Lernziele**: Verständnis der Java-Plattform, Programmstruktur, Entwicklungsumgebung.

[[Java_Block1_Detailed]]

**Inhalte**:
- Kurze Einführung in Java und JVM: Warum Java? Was ist Bytecode?
- Installation und Nutzung einer einfachen IDE wie Eclipse oder IntelliJ.

**Erstes Programm**: „Hello World“ erstellen und ausführen.

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

**Übung**:
- Installiere die IDE, schreibe das „Hello World“-Programm und führe es aus.
- Experimentiere mit der `System.out.println()` Methode und gib verschiedene Nachrichten aus.

---

## Block 2: Variablen und Datentypen

**Lernziele**: Deklaration und Initialisierung von Variablen, Verständnis von Datentypen.

[[Java_Block2_Detailed]]

**Inhalte**:
- Grundlegende Datentypen (`int`, `double`, `boolean`, `char`) und Variablen.
- Umgang mit Konstanten (`final`-Schlüsselwort).

```java
public class VariablesExample {
    public static void main(String[] args) {
        int age = 25;
        double price = 19.99;
        boolean isJavaFun = true;
        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Is Java fun? " + isJavaFun);
    }
}
```

Integer iAge = new Integer(25);
Double dPrice = new Double(19.99);

**Übung**:
- Definiere verschiedene Variablen und ändere ihre Werte.
- Versuche, eine Variable als `final` zu deklarieren und ihren Wert zu ändern (sieh dir die Fehlermeldung an).

---

## Block 3: Ein- und Ausgabe

**Lernziele**: Einfache Benutzereingaben und Konsolenausgaben handhaben.

[[Java_Block3_Detailed]]

**Inhalte**:
- Einführung in `Scanner` für die Eingabe.
- Einfache Berechnungen basierend auf Benutzereingaben.

```java
import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
```

**Übung**:
- Frage den Benutzer nach seinem Alter und berechne das Geburtsjahr.
- Versuche, Eingabefehler abzufangen, indem du prüfst, ob die Eingabe eine Zahl ist.

---

## Block 4: Kontrollstrukturen – Bedingungen

**Lernziele**: Bedingungen in Programmen anwenden (`if`, `else`, `switch`).

[[Java_Block4_Detailed]]
[[Java_String_Equals_Method]]

**Inhalte**:
- Grundlagen von `if`- und `else`-Bedingungen.
- `switch` für Auswahlstrukturen.

```java
public class ConditionExample {
    public static void main(String[] args) {
        int number = 10;
        if (number > 5) {
            System.out.println("The number is greater than 5");
        } else {
            System.out.println("The number is 5 or less");
        }
    }
}
```

**Übung**:
- Erstelle ein Programm, das eine Zahl abfragt und ausgibt, ob sie positiv, negativ oder null ist.
- Verwende `switch`, um eine Wochentagsnummer (1–7) in den entsprechenden Tag (z.B. Montag) umzuwandeln.

---

## Block 5: Kontrollstrukturen – Schleifen

**Lernziele**: Verständnis von `for`-, `while`- und `do-while`-Schleifen.

[[Java_Block5_Detailed]]

**Inhalte**:
- Erklärung und Vergleich der Schleifenarten.
- Anwendung der Schleifen für wiederholende Aufgaben.

```java
public class LoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }
    }
}
```

**Übung**:
- Schreibe ein Programm, das die Zahlen 1 bis 10 ausgibt.
- Verwende eine Schleife, um die Summe der Zahlen von 1 bis 100 zu berechnen.

---

## Block 6: Methoden und Parameter

**Lernziele**: Einführung in die Methodendefinition und -aufrufe.

[[Java_Block6_Detailed]]
**Inhalte**:
- Methoden erstellen, Parameter übergeben und Rückgabewerte nutzen.

```java
public class MethodExample {
    public static void main(String[] args) {
        int result = add(5, 10);
        System.out.println("Sum: " + result);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
```

**Übung**:
- Erstelle eine Methode `multiply`, die zwei Zahlen multipliziert und das Ergebnis zurückgibt.
- Schreibe eine Methode, die den größten von drei Zahlenwerten zurückgibt.

---

## Block 7: Einführung in OOP (Klassen und Objekte)

**Lernziele**: Verständnis von Klassen und Objekten, einfache Klassen erstellen.
[[Java_Block7_Detailed]]
**Inhalte**:
- Grundlegende Struktur einer Klasse und ihre Attribute.
- Objekte erzeugen und Methoden aufrufen.

```java
public class Car {
    String color;
    int speed;

    public void drive() {
        System.out.println("The car is driving at " + speed + " km/h.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.speed = 60;
        myCar.drive();
    }
}
```

**Übung**:
- Erstelle eine Klasse `Person` mit Attributen `name` und `age` und einer Methode `sayHello`, die eine Begrüßung ausgibt.
- Instanziere ein Objekt `Person` und rufe die Methode `sayHello` auf.

---

## Block 8: Abschlussprojekt – Mini-Anwendung

[[Java_Block8_Detailed]]
**Lernziele**: Anwendung der erworbenen Kenntnisse in einem kleinen Projekt.

**Projekt**: Bibliotheksverwaltung für Bücher.
- Klasse `Book` mit Attributen `title`, `author`, `year`.
- Methoden zur Ausgabe der Buchdetails.
- Einfache Liste von Büchern erstellen und Details anzeigen.

```java
public class Book {
    String title;
    String author;
    int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Year: " + year);
    }
}

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", 1949);
        book1.display();
    }
}
```

**Übung**:
- Füge weitere Bücher hinzu und gib alle Bücher der Liste aus.
- Erweitere die Anwendung, sodass der Benutzer neue Bücher zur Liste hinzufügen kann.

Weitere wichtige Punkte

[[OneNote/Schulung/Programmierung/Woche 1/Tag 2-Basics/Typkonvertierungen_in_Java]]

[[OneNote/Schulung/Programmierung/Woche 1/Tag 2-Basics/Ueberpruefung_Konvertierbarkeit_String]]

