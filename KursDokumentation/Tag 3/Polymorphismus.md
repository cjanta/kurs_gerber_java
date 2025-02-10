**Polymorphismus in Java**

## **1. Einführung in Polymorphismus**

Polymorphismus ist ein zentrales Konzept der objektorientierten Programmierung (OOP). Es bedeutet, dass eine Methode oder ein Objekt in verschiedenen Kontexten unterschiedliche Formen annehmen kann. Java unterstützt Polymorphismus hauptsächlich durch **Methodenüberschreibung** und **Methodenüberladung**.

### **Warum ist Polymorphismus wichtig?**
- Erhöht die **Flexibilität** und **Wiederverwendbarkeit** von Code.
- Ermöglicht die **dynamische Methodenbindung** zur Laufzeit.
- Reduziert Code-Duplikation durch die Verwendung gemeinsamer Schnittstellen.

---

## **2. Arten des Polymorphismus**

### **2.1. Compile-Time-Polymorphismus (Methodenüberladung)**
Beim **Compile-Time-Polymorphismus**, auch bekannt als **Methodenüberladung**, kann eine Klasse mehrere Methoden mit demselben Namen, aber unterschiedlichen Parametertypen oder -anzahlen haben.

#### **Beispiel für Methodenüberladung:**
```java
class MatheBerechnungen {
    // Methode zur Addition von zwei Zahlen
    public int add(int a, int b) {
        return a + b;
    }
    
    // Methode zur Addition von drei Zahlen
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Methode zur Addition von zwei Dezimalzahlen
    public double add(double a, double b) {
        return a + b;
    }
}
```

**Erklärung:**
- Alle Methoden heißen `add`, haben aber unterschiedliche Parameterlisten.
- Der Compiler entscheidet zur **Übersetzungszeit**, welche Methode aufgerufen wird.

---

### **2.2. Runtime-Polymorphismus (Methodenüberschreibung)**
Beim **Runtime-Polymorphismus**, auch als **Methodenüberschreibung** bekannt, definiert eine Unterklasse eine Methode neu, die bereits in der Oberklasse existiert.

#### **Beispiel für Methodenüberschreibung:**
```java
class Fahrzeug {
    public void starten() {
        System.out.println("Das Fahrzeug startet.");
    }
}

class Auto extends Fahrzeug {
    @Override
    public void starten() {
        System.out.println("Das Auto startet mit einem Schlüssel.");
    }
}

public class TestPolymorphismus {
    public static void main(String[] args) {
        Fahrzeug meinFahrzeug = new Auto();
        meinFahrzeug.starten();
    }
}
```

**Erwartete Ausgabe:**
```
Das Auto startet mit einem Schlüssel.
```

**Erklärung:**
- Die Methode `starten()` wird in `Auto` überschrieben.
- Obwohl `meinFahrzeug` als `Fahrzeug` deklariert ist, ruft Java zur **Laufzeit** die Methode aus der `Auto`-Klasse auf (dynamische Methodenbindung).

---

## **3. Polymorphismus mit Interfaces**

Polymorphismus kann auch mit **Interfaces** genutzt werden, um verschiedene Implementierungen über eine gemeinsame Schnittstelle zu verwenden.

#### **Beispiel für Interface-Polymorphismus:**
```java
interface Tier {
    void geraeuschMachen();
}

class Hund implements Tier {
    @Override
    public void geraeuschMachen() {
        System.out.println("Der Hund bellt.");
    }
}

class Katze implements Tier {
    @Override
    public void geraeuschMachen() {
        System.out.println("Die Katze miaut.");
    }
}

public class TestInterfacePolymorphismus {
    public static void main(String[] args) {
        Tier meinTier1 = new Hund();
        Tier meinTier2 = new Katze();
        
        meinTier1.geraeuschMachen(); // Der Hund bellt.
        meinTier2.geraeuschMachen(); // Die Katze miaut.
    }
}
```

**Erklärung:**
- `Hund` und `Katze` implementieren das Interface `Tier`.
- Durch die gemeinsame Referenz `Tier` kann die Methode `geraeuschMachen()` polymorph aufgerufen werden.
- Dies ermöglicht flexible und erweiterbare Programmierung.

---

## **4. Vorteile von Polymorphismus**
✅ Erhöhte **Flexibilität** in der Softwareentwicklung.  
✅ Einfachere **Erweiterbarkeit** durch Implementierung neuer Klassen.  
✅ **Wartungsfreundlichkeit**, da Codewiederverwendung gefördert wird.  
✅ Bessere **Testbarkeit**, da allgemeine Methoden für verschiedene Typen genutzt werden können.

---

## **5. Fragen zur Selbstüberprüfung**

1. Was ist der Unterschied zwischen Methodenüberladung und Methodenüberschreibung?
2. Wann wird Methodenüberschreibung sinnvoll eingesetzt?
3. Warum sollte man Polymorphismus mit Interfaces verwenden?
4. Was bedeutet „dynamische Methodenbindung“?
5. Wie kann man sicherstellen, dass eine Methode aus der Unterklasse aufgerufen wird, auch wenn die Referenz der Oberklasse gehört?

---

## **6. Fazit**

Polymorphismus ist ein mächtiges Konzept der objektorientierten Programmierung. Es ermöglicht eine flexible Code-Struktur, die leicht erweitert werden kann, ohne bestehende Implementierungen zu ändern.

Mit **Methodenüberladung, Methodenüberschreibung und der Verwendung von Interfaces** bietet Java eine Vielzahl an Möglichkeiten, um Polymorphismus effektiv zu nutzen.

