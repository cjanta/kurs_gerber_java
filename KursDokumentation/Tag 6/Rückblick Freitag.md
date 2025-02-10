# Refactoring des Taschenrechners – Von Spaghetti-Code zum (sauberen) MVC

## Ausgangssituation
Zu Beginn war der Taschenrechner als monolithischer Code organisiert, der die gesamte Anwendungslogik, die Benutzeroberfläche und die Rechenoperationen in einer einzigen Klasse enthielt. Dies führte zu Spaghetti-Code mit folgenden Problemen:
- **Schlechte Wartbarkeit**: Änderungen an der GUI oder an der Logik erforderten oft tiefgehende Modifikationen im gesamten Code.
- **Enge Kopplung**: UI und Rechenlogik waren nicht getrennt, sodass die Anwendung schwer erweiterbar war.
- **Schwierige Testbarkeit**: Da die Logik in der UI enthalten war, war es nahezu unmöglich, Unit-Tests für die Rechenoperationen zu schreiben.

## Verbesserungen und Refactoring
Um eine saubere **MVC-Architektur** mit einer **losen Kopplung** zu erreichen, wurden die folgenden Schritte durchgeführt:

### 1. **Entfernung der Anzeige als eigenes Objekt**
Vorher war die Anzeige (`JTextField`) direkt in der Hauptklasse des Taschenrechners enthalten. Jetzt wurde sie in die **View-Klasse** ausgelagert:
- Die **View** zeigt nur noch den aktuellen Zustand des Rechners an.
- Das Model feuert Events, um die Anzeige zu aktualisieren, ohne direkte Abhängigkeit zur GUI.
- Dadurch kann die UI unabhängig von der Logik geändert werden (z. B. durch eine Konsolen- oder Web-Oberfläche).

### 2. **Extraktion der Tastatur in ein separates Panel-Objekt**
Statt dass die Buttons direkt in der Hauptklasse erstellt wurden:
- Wurde eine separate **Panel-Klasse** (`JPanel`) für die Tastatur erstellt.
- Die Tasten übermitteln ihre Eingaben **über Events** an den Controller.
- Die View enthält nur die Tastatur, ohne selbst Logik auszuführen.

### 3. **Auslagerung des Rechenwerks in eine eigene Klasse**
Vorher war die Berechnung direkt im UI-Code implementiert. Jetzt wurde die gesamte Berechnungslogik in die **Model-Klasse** (`RechnerModel`) verschoben:
- Sie speichert den aktuellen Zustand des Rechners (Eingabe, Operator, Ergebnis).
- Die Berechnung erfolgt **ohne direkte Verbindung zur View**.
- Das Model informiert die View **über PropertyChangeListener**, wenn sich der Zustand ändert.
- Dies ermöglicht eine saubere **Trennung zwischen Daten und Darstellung**.

## Vorteile des neuen Ansatzes
Durch diese Änderungen ergeben sich folgende **Verbesserungen**:

**Bessere Wartbarkeit**: Änderungen an der Oberfläche oder Berechnung können unabhängig vorgenommen werden.  
**Lose Kopplung**: Die Anzeige und Logik sind unabhängig voneinander, was die Erweiterbarkeit erleichtert.  
**Einfachere Testbarkeit**: Die Berechnungslogik kann jetzt unabhängig getestet werden, ohne UI-Abhängigkeit.  
**Wiederverwendbarkeit**: Die Rechenlogik kann auch für andere Anwendungen genutzt werden (z. B. CLI- oder Web-Apps).  
**Skalierbarkeit**: Durch Events und Listener kann das Programm leichter um neue Funktionen erweitert werden.  

Mit dieser sauberen **MVC-Struktur mit ChangeListener** ist der Taschenrechner nun flexibel, wartbar und zukunftssicher.

