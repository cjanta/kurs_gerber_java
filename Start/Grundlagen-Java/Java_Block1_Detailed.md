#13_11_2024
## Block 1: Einführung in Java und „Hello World“

**Lernziele**: 
Verständnis der Java-Plattform, grundlegende Programmstruktur und Einrichten der Entwicklungsumgebung.

---

### Einführung in Java

Java ist eine vielseitige und weit verbreitete Programmiersprache, die sich besonders durch ihre Plattformunabhängigkeit und starke Ausrichtung auf Objektorientierung auszeichnet. Die Plattformunabhängigkeit bedeutet, dass einmal geschriebene Programme in Java auf nahezu jedem Gerät ausgeführt werden können, das die Java-Laufzeitumgebung (Java Runtime Environment, JRE) unterstützt.

Java wurde ursprünglich von Sun Microsystems entwickelt und erfreut sich seitdem besonders im Unternehmens- und Bildungsbereich großer Beliebtheit. Die Sprache wird ständig weiterentwickelt und verbessert, um den Anforderungen moderner Softwareentwicklung gerecht zu werden.

### Die Rolle der JVM (Java Virtual Machine)

Die Java Virtual Machine (JVM) ist eine Schlüsselkomponente der Java-Technologie. Wenn du ein Java-Programm schreibst, wird es in „Bytecode“ kompiliert – ein Zwischencode, der weder reiner Maschinencode noch vollständig interpretierter Code ist. Die JVM übernimmt die Ausführung dieses Bytecodes, indem sie ihn in den Maschinencode der jeweiligen Plattform übersetzt. Dadurch ist Java plattformunabhängig: Der gleiche Bytecode kann auf Windows, macOS, Linux oder anderen Betriebssystemen ausgeführt werden, solange eine JVM vorhanden ist.

### Einrichten der Entwicklungsumgebung (IDE)

Um in Java zu programmieren, benötigst du das Java Development Kit (JDK), das die Werkzeuge zum Schreiben, Kompilieren und Ausführen von Java-Programmen bereitstellt. Eine der gängigen und leistungsfähigen Entwicklungsumgebungen (IDEs) für Java ist IntelliJ IDEA (kostenlose Community Edition verfügbar) oder Eclipse (ebenfalls kostenlos). Diese IDEs bieten Funktionen wie Code-Vervollständigung, Syntax-Hervorhebung, Debugging-Tools und viele weitere Hilfen, die das Programmieren erleichtern.

#### Installationsanleitung

1. Lade das JDK von der [Oracle-Website](https://www.oracle.com/java/technologies/javase-downloads.html) oder einer OpenJDK-Quelle herunter und installiere es auf deinem Computer.
2. Lade eine IDE wie IntelliJ oder Eclipse herunter und installiere sie.
3. Öffne die IDE und erstelle ein neues Java-Projekt.

---

### Dein erstes Java-Programm: „Hello World“

„Hello World“ ist traditionell das erste Programm, das in einer neuen Programmiersprache geschrieben wird. Es gibt eine einfache Nachricht auf der Konsole aus und vermittelt ein grundlegendes Verständnis für die Struktur eines Java-Programms.

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

#### Erklärung des Programms

- **`public class HelloWorld`**: Dies ist die Definition einer Klasse. In Java ist jede Anwendung in Klassen organisiert. Der Name der Klasse `HelloWorld` muss mit dem Dateinamen (z.B. `HelloWorld.java`) übereinstimmen.
- **`public static void main(String[] args)`**: Die `main`-Methode ist der Startpunkt eines jeden Java-Programms. Wenn das Programm ausgeführt wird, sucht die JVM nach dieser Methode und startet die Ausführung des Codes, der sich innerhalb der geschweiften Klammern `{}` befindet.
- **`System.out.println("Hello, World!");`**: Dies ist eine Anweisung zur Ausgabe von Text auf der Konsole. `System.out` ist ein vordefiniertes Objekt in Java, das auf die Standardausgabe verweist (in der Regel die Konsole). Die `println`-Methode gibt die Nachricht in Anführungszeichen aus und fügt automatisch einen Zeilenumbruch hinzu.

---

### Übung

Um ein Gefühl für die Entwicklungsumgebung und den Ablauf von „Schreiben – Kompilieren – Ausführen“ zu bekommen, führe die folgenden Aufgaben aus:

1. **IDE einrichten**: Öffne deine IDE, erstelle ein neues Java-Projekt und füge eine Klasse namens `HelloWorld` hinzu. Kopiere den obigen Code und füge ihn in deine Klasse ein.
2. **Code ausführen**: Führe das Programm aus und überprüfe, ob die Nachricht „Hello, World!“ auf der Konsole erscheint.
3. **Experimentieren**: Ändere die Nachricht in `System.out.println()` und beobachte, wie sich die Ausgabe auf der Konsole verändert.
4. **Zusätzliche Zeilen hinzufügen**: Füge weitere `System.out.println()`-Anweisungen hinzu, um verschiedene Nachrichten auszugeben. Sieh dir an, wie die IDE dir beim Schreiben des Codes hilft (z.B. durch Vorschläge und Autovervollständigung).

---

Mit diesem ersten Block hast du die grundlegenden Schritte zum Erstellen und Ausführen eines Java-Programms kennengelernt. Die Einführung in die IDE und die grundlegende Java-Syntax erleichtert dir die Arbeit mit den folgenden Programmen. Experimentiere weiter mit `System.out.println()` und werde mit der Umgebung vertraut, bevor du dich den nächsten Themen widmest.
