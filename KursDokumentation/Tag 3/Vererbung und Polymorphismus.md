

## **Thema:** Vererbung und Polymorphismus anhand von Fahrzeugen

### **Lernziele:**
- Verständnis der Vererbung in Java
- Anwendung von `extends` zur Modellierung von Klassenhierarchien
- Nutzung von `@Override`, um Methoden in Unterklassen zu überschreiben
- Verstehen und Anwenden von Polymorphismus
- Dynamische Methodenbindung zur Laufzeit

---

## **1. Einführung in Vererbung**

Die Vererbung (`extends`) ermöglicht es einer Klasse, von einer anderen Klasse zu erben. Dadurch übernimmt die Unterklasse (`Child Class`) alle Eigenschaften und Methoden der Oberklasse (`Parent Class`), kann diese jedoch auch anpassen und erweitern.

### **Warum ist Vererbung nützlich?**
- Code-Wiederverwendung: Gemeinsame Funktionalitäten müssen nicht mehrfach implementiert werden.
- Strukturierung: Ähnliche Klassen können in einer übersichtlichen Hierarchie organisiert werden.
- Erweiterbarkeit: Neue Funktionen können durch Ableitung von bestehenden Klassen ergänzt werden.

---

## **2. Beispiel: Fahrzeug-Hierarchie in Java**

Wir modellieren eine Hierarchie von Fahrzeugen:

- **Fahrzeug** ist die allgemeine Basisklasse.
- **Motorrad** erbt von Fahrzeug und gibt `2` als Anzahl der Räder zurück.
- **MotorradMitSozius** erbt von Motorrad und überschreibt die Methode zur Rückgabe der Anzahl der Räder mit `3`.

### **Code-Implementierung:**
```java
// Basisklasse Fahrzeug
abstract class Fahrzeug {
    // Abstrakte Methode für die Anzahl der Räder
    public abstract int getAnzahlRaeder();
}

// Unterklasse Motorrad erbt von Fahrzeug
class Motorrad extends Fahrzeug {
    @Override
    public int getAnzahlRaeder() {
        return 2;
    }
}

// Unterklasse MotorradMitSozius erbt von Motorrad
class MotorradMitSozius extends Motorrad {
    @Override
    public int getAnzahlRaeder() {
        return 3;
    }
}

// Hauptklasse zum Testen
public class FahrzeugTest {
    public static void main(String[] args) {
//	    Fahrzeug f0 = new Fahrzeug();   -- Fehler vom Compiler
        Fahrzeug f1 = new Motorrad();
        Fahrzeug f2 = new MotorradMitSozius();

        System.out.println("Motorrad hat " + f1.getAnzahlRaeder() + " Räder.");
        System.out.println("Motorrad mit Sozius hat " + f2.getAnzahlRaeder() + " Räder.");
    }
}
```

---

## **3. Wichtige Konzepte aus diesem Code**

### **1. Abstrakte Klassen und Methoden**
- `Fahrzeug` ist eine abstrakte Klasse mit einer abstrakten Methode `getAnzahlRaeder()`.
- Dies zwingt alle Unterklassen, diese Methode zu implementieren.

### **2. Vererbung mit `extends`**
- `Motorrad` erbt von `Fahrzeug`, d. h., es übernimmt alle Eigenschaften von `Fahrzeug`.
- `MotorradMitSozius` erbt von `Motorrad`, kann aber dennoch Methoden überschreiben.

### **3. Methodenüberschreibung (`@Override`)**
- In `MotorradMitSozius` wird `getAnzahlRaeder()` überschrieben, um `3` zurückzugeben.

### **4. Polymorphismus und dynamische Methodenbindung**
- Obwohl `f1` und `f2` als `Fahrzeug` deklariert sind, wird zur Laufzeit die korrekte Implementierung von `getAnzahlRaeder()` aufgerufen.
- Dies stellt sicher, dass immer die spezifischste Methode der jeweiligen Unterklasse genutzt wird.

---

## **4. Ausführung und erwartete Ausgabe**

### **Erwartete Ausgabe:**
```
Motorrad hat 2 Räder.
Motorrad mit Sozius hat 3 Räder.
```

### **Erklärung der Ausgabe:**
1. `Motorrad` gibt `2` zurück, weil die Methode `getAnzahlRaeder()` in dieser Klasse so definiert wurde.
2. `MotorradMitSozius` überschreibt `getAnzahlRaeder()` und gibt `3` zurück.
3. Obwohl `f2` als `Fahrzeug` referenziert wird, sorgt Polymorphismus dafür, dass die richtige Methode von `MotorradMitSozius` aufgerufen wird.

---

## **5. Fragen zur Selbstüberprüfung**

4. Warum wird die Methode `getAnzahlRaeder()` in `MotorradMitSozius` aufgerufen, obwohl die Referenz `Fahrzeug` ist?
5. Was passiert, wenn `MotorradMitSozius` die Methode `getAnzahlRaeder()` nicht überschreibt?
6. Warum sollte die Methode `getAnzahlRaeder()` in `Fahrzeug` abstrakt sein?
7. Was würde passieren, wenn wir `MotorradMitSozius` direkt von `Fahrzeug` erben lassen?

---

## **6. Fazit**

- Vererbung ermöglicht eine strukturierte Wiederverwendung von Code.
- Methodenüberschreibung mit `@Override` sorgt dafür, dass Unterklassen spezifisches Verhalten definieren können.
- Polymorphismus ermöglicht es, Objekte über eine gemeinsame Oberklasse zu referenzieren und dennoch die richtige Methode aufzurufen.
- Dynamische Methodenbindung stellt sicher, dass zur Laufzeit immer die korrekte Implementierung genutzt wird.

Durch diese Konzepte können Fachinformatiker effizient objektorientierte Programme entwickeln und bestehende Codestrukturen erweitern.

