# Callback-Methoden in Design Patterns

## 1. Einleitung
Callback-Methoden sind eine Technik, bei der eine Methode als Argument übergeben wird, um später asynchron oder ereignisgesteuert aufgerufen zu werden. Sie werden häufig in verschiedenen **Design Patterns** verwendet, um die Flexibilität und Wiederverwendbarkeit von Code zu erhöhen.

## 2. Design Patterns mit Callback-Methoden

### 2.1 Observer Pattern
**Einsatz:** Das **Observer Pattern** ermöglicht die Benachrichtigung mehrerer Abonnenten über Zustandsänderungen eines Subjekts.

**Callback-Bezug:** Die Methode `update()` im Observer ist eine typische Callback-Methode, die aufgerufen wird, wenn sich der Zustand des Subjekts ändert.

**Beispiel:**
```java
import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String message);
}

class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " erhielt die Nachricht: " + message);
    }
}

class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer obs1 = new ConcreteObserver("Alice");
        Observer obs2 = new ConcreteObserver("Bob");

        subject.addObserver(obs1);
        subject.addObserver(obs2);

        subject.notifyObservers("Neues Update verfügbar!");
    }
}
```

### 2.2 Strategy Pattern
**Einsatz:** Das **Strategy Pattern** erlaubt das dynamische Austauschen von Algorithmen zur Laufzeit.

**Callback-Bezug:** Die Methoden der Strategie-Interfaces werden als Callbacks genutzt, um verschiedene Verhaltensweisen auszuführen.

**Beispiel:**
```java
interface Strategy {
    void execute();
}

class ConcreteStrategyA implements Strategy {
    @Override
    public void execute() {
        System.out.println("Strategie A wird ausgeführt");
    }
}

class ConcreteStrategyB implements Strategy {
    @Override
    public void execute() {
        System.out.println("Strategie B wird ausgeführt");
    }
}

class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        if (strategy != null) {
            strategy.execute();
        }
    }
}

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new ConcreteStrategyA());
        context.executeStrategy();

        context.setStrategy(new ConcreteStrategyB());
        context.executeStrategy();
    }
}
```

### 2.3 Command Pattern
**Einsatz:** Das **Command Pattern** kapselt Befehle in eigenständige Objekte, die verzögert oder wiederholt ausgeführt werden können.

**Callback-Bezug:** Die Methode `execute()` im Command-Objekt wird als Callback aufgerufen.

**Beispiel:**
```java
interface Command {
    void execute();
}

class LightOnCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Licht ist eingeschaltet");
    }
}

class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        if (command != null) {
            command.execute();
        }
    }
}

public class CommandPatternDemo {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        remote.setCommand(new LightOnCommand());
        remote.pressButton();
    }
}
```

## 3. Fazit
Callback-Methoden werden oft in **verhaltensbezogenen Design Patterns** wie **Observer, Strategy und Command** verwendet, da sie die Flexibilität und Wiederverwendbarkeit des Codes erhöhen. Sie helfen, lose gekoppelte Architekturen zu schaffen und ermöglichen eine bessere Modularität.

