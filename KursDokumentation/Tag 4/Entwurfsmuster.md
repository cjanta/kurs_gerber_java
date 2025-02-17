# Was ist ein Entwurfsmuster?

## Einführung
Ein **Entwurfsmuster** (engl. Design Pattern) ist eine bewährte Lösung für wiederkehrende Probleme in der Softwareentwicklung. Es handelt sich um eine standardisierte Vorgehensweise zur Strukturierung von Code, um die Wartbarkeit, Erweiterbarkeit und Wiederverwendbarkeit zu verbessern.

## Merkmale von Entwurfsmustern
- **Wiederverwendbare Lösungen** für typische Software-Designprobleme
- **Best Practices**, die sich über Jahre bewährt haben
- **Nicht direkt einsetzbarer Code**, sondern eine Vorlage für die Implementierung
- **Unabhängig von Programmiersprachen**, aber anwendbar in objektorientierten Sprachen wie Java, C++, Python, usw.

## Arten von Entwurfsmustern
Entwurfsmuster werden in drei Hauptkategorien unterteilt:

### 1. Erzeugungsmuster (Creational Patterns)
Diese Muster helfen bei der Instanziierung von Objekten und optimieren die Objektverwaltung.
- **Singleton (Einzelstück)**: Stellt sicher, dass eine Klasse nur eine einzige Instanz hat.
- **Factory Method (Fabrikmethode)**: Ermöglicht die Erstellung von Objekten durch eine Methode, ohne direkt einen Konstruktor aufzurufen.
- **Abstract Factory (Abstrakte Fabrik)**: Erzeugt eine Familie von verwandten Objekten, ohne deren konkrete Klassen zu spezifizieren.
- **Builder (Erbauer)**: Trennt die Konstruktion eines komplexen Objekts von seiner Repräsentation.
- **Prototype (Prototyp)**: Erstellt neue Objekte durch Kopieren eines vorhandenen Objekts.

### 2. Strukturmuster (Structural Patterns)
Diese Muster befassen sich mit der Organisation und dem Aufbau von Klassen und Objekten.
- **Adapter (Anpasser)**: Ermöglicht die Zusammenarbeit inkompatibler Schnittstellen.
- **Bridge (Brücke)**: Trennt die Abstraktion von der Implementierung, um die Erweiterbarkeit zu verbessern.
- **Composite (Kompositum)**: Erlaubt die Behandlung einzelner Objekte und Gruppen von Objekten auf dieselbe Weise. [[Entwurfsmuster Kompositum]]
- **Decorator (Dekorierer)**: Fügt zur Laufzeit zusätzliche Funktionen zu einem Objekt hinzu, ohne dessen Klasse zu ändern.
- **Facade (Fassade)**: Vereinfachung komplexer Schnittstellen durch eine einzige, vereinfachte Schnittstelle.
- **Flyweight (Fliegengewicht)**: Reduziert Speicherverbrauch durch gemeinsame Nutzung von Objekten.
- **Proxy (Stellvertreter)**: Kontrolliert den Zugriff auf ein Objekt durch ein Stellvertreterobjekt.

### 3. Verhaltensmuster (Behavioral Patterns)
Diese Muster definieren Kommunikationsmuster zwischen Objekten und optimieren deren Interaktion.
- **Chain of Responsibility (Verantwortlichkeitskette)**: Delegiert eine Anfrage durch eine Kette von Handlern.
- **Command (Befehl)**: Kapselt eine Anforderung als Objekt.
- **Interpreter (Interpreter)**: Definiert eine Grammatik und deren Interpretation.
- **Iterator (Iterator)**: Erlaubt sequentiellen Zugriff auf Elemente einer Sammlung, ohne deren interne Struktur offenzulegen.
- **Mediator (Vermittler)**: Zentralisiert die Kommunikation zwischen Objekten.
- **Memento (Erinnerungsspeicher)**: Ermöglicht das Speichern und Wiederherstellen eines Objekts.
- **Observer (Beobachter)**: Ermöglicht eine lose Kopplung durch Benachrichtigungsmechanismen.
- **State (Zustand)**: Ermöglicht die Veränderung des Verhaltens eines Objekts basierend auf seinem Zustand.
- **Strategy (Strategie)**: Definiert eine Familie von Algorithmen und macht sie austauschbar.
- **Template Method (Schablonenmethode)**: Definiert das Grundgerüst eines Algorithmus, wobei einige Schritte untergeordnete Klassen implementieren.
- **Visitor (Besucher)**: Ermöglicht die Trennung von Algorithmen und Datenstrukturen.

## Vorteile der Verwendung von Entwurfsmustern
✔ **Verbesserte Wartbarkeit und Erweiterbarkeit** des Codes
✔ **Wiederverwendbare Lösungen**, die Best Practices folgen
✔ **Standardisierte Konzepte**, die von vielen Entwicklern verstanden werden
✔ **Reduzierung von Entwicklungszeit**, da Probleme nicht neu erfunden werden müssen

## Fazit
Entwurfsmuster sind essenzielle Werkzeuge in der Softwareentwicklung. Sie helfen dabei, bewährte Lösungen für komplexe Designprobleme zu nutzen und ermöglichen es Entwicklern, effizienteren, wartbaren und skalierbaren Code zu schreiben.

