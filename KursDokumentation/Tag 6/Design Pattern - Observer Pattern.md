# Einstieg
- PropertyChangeSupport und das zugehörige Design Pattern

## **1. Einführung in PropertyChangeSupport**
Das `PropertyChangeSupport`-Objekt in Java gehört zum **Observer-Pattern** und wird verwendet, um Änderungen an einer Eigenschaft eines Objekts zu überwachen und entsprechende Listener (Beobachter) darüber zu informieren. Es ist eine einfache und effiziente Möglichkeit, das **Publisher-Subscriber-Prinzip** innerhalb einer Anwendung umzusetzen.

### ** Warum PropertyChangeSupport nutzen?**
- Ermöglicht eine **lose Kopplung** zwischen Komponenten.
- Vereinfacht die Kommunikation zwischen **Model** und **View**.
- Unterstützt die **Einhaltung des Observer-Patterns**, das in vielen Architekturen verwendet wird.
- Erleichtert das Testen und die Erweiterbarkeit von Anwendungen.

---

## **2. Das zugehörige Design Pattern: Observer-Pattern**
Das **Observer-Pattern** ist ein Verhaltensmuster (Behavioral Design Pattern), das es einem Objekt (dem Subject) ermöglicht, eine Liste von Abonnenten (Observers) zu führen und diese automatisch zu benachrichtigen, wenn sich der Zustand ändert.

### ** Struktur des Observer-Patterns**
1. **Subject (Beobachtetes Objekt):** Enthält die zu beobachtenden Daten und eine Liste von Observers.
2. **Observer (Beobachter):** Registriert sich beim Subject und wird benachrichtigt, wenn sich eine Eigenschaft ändert.
3. **ConcreteSubject (Konkretes Modell):** Implementiert das Subject und verwaltet die Daten.
4. **ConcreteObserver (Konkrete Ansicht):** Reagiert auf Änderungen im Model und aktualisiert sich selbst.

 **PropertyChangeSupport in Java implementiert dieses Muster direkt, indem es Observer (PropertyChangeListener) verwaltet.**

---

## **3. Implementierung von PropertyChangeSupport in Java**
### ** Beispiel für die Nutzung von PropertyChangeSupport**
#### 1-  Model (Subject) mit PropertyChangeSupport**
```java
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PersonModel {
    private String name;
    private int alter;
    private final PropertyChangeSupport support;

    public PersonModel() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

    public void setName(String newName) {
        String oldName = this.name;
        this.name = newName;
        support.firePropertyChange("name", oldName, newName);
    }

    public void setAlter(int newAlter) {
        int oldAlter = this.alter;
        this.alter = newAlter;
        support.firePropertyChange("alter", oldAlter, newAlter);
    }
}
```
 **Das Model verwaltet Daten und informiert Listener über Änderungen.**

---

#### 2 - View (Observer) mit PropertyChangeListener**
```java
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PersonView implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Eigenschaft geändert: " + evt.getPropertyName() +
                " | Alter Wert: " + evt.getOldValue() + " | Neuer Wert: " + evt.getNewValue());
    }
}
```
 **Die View registriert sich als Beobachter und reagiert auf Änderungen im Model.**

---

#### 3 - Hauptprogramm zur Demonstration**
```java
public class Main {
    public static void main(String[] args) {
        PersonModel person = new PersonModel();
        PersonView view = new PersonView();
        
        person.addPropertyChangeListener(view);
        
        person.setName("Max Mustermann");
        person.setAlter(30);
    }
}
```
 **Beim Ändern der Eigenschaften im Model wird die View automatisch informiert.**

---

## **4. Vorteile von PropertyChangeSupport**
-  **Lose Kopplung:** Die Komponenten sind unabhängig voneinander und kommunizieren über Events.  
-  **Einfache Implementierung des Observer-Patterns:** Keine manuelle Verwaltung von Listener-Listen notwendig.  
-  **Erweiterbarkeit:** Neue Observer können einfach hinzugefügt werden.  
-  **Testbarkeit:** Das Model kann ohne GUI getestet werden, da es unabhängig arbeitet.  

---

## **5. Fazit**
Das `PropertyChangeSupport`-Objekt ermöglicht eine effiziente Implementierung des **Observer-Patterns** und sorgt für eine **klare Trennung zwischen Model und View**. Dies führt zu einem modularen, wartbaren und erweiterbaren Code, der ideal für **moderne GUI-Anwendungen und Architekturen** geeignet ist. 🚀

