# Detaillierte Erklärung des Refactorings des Taschenrechners

## 1. **Ausgangslage: Spaghetti-Code**
Der ursprüngliche Code des Taschenrechners enthielt eine Mischung aus:
- **GUI-Code** (Swing-Komponenten wie `JFrame`, `JButton`, `JTextField`)
- **Logik für die Berechnung** (arithmetische Operationen)
- **Event-Handling** (Aktionen bei Button-Klicks)

Dies führte zu folgenden Problemen:
- **Schlecht wartbar:** Änderungen erforderten tiefe Eingriffe in verschiedene Code-Abschnitte.
- **Enge Kopplung:** GUI und Rechenlogik waren nicht getrennt.
- **Schwierige Testbarkeit:** Die Berechnungslogik konnte nicht separat getestet werden.

### Ziel des Refactorings:
- **Saubere Trennung der Verantwortlichkeiten** nach dem **MVC-Muster**
- **Verbesserte Wartbarkeit und Skalierbarkeit**
- **Erhöhte Testbarkeit der Rechenlogik**

---

## 2. **Schritt 1: Anzeige aus dem Hauptcode entfernen**
**Vorher:** Die `JTextField`-Anzeige war direkt im Hauptprogramm enthalten und wurde dort verwaltet. Änderungen am Anzeigetext erfolgten überall im Code.

**Refactoring:**
- Die Anzeige wurde in die `RechnerView`-Klasse ausgelagert.
- Das Model (Rechnerlogik) informiert die View **über Events** (ChangeListener), wenn sich der Wert ändert.
 **Vorteil:** Die GUI kann sich nun unabhängig von der Logik ändern.

---

## 3. **Schritt 2: Tastatur in eigenes Panel auslagern**
**Vorher:** Die Buttons für die Eingabe waren direkt im Hauptcode definiert und miteinander vermischt.

**Refactoring:**
- Eine separate Klasse `TastenPanel` wurde erstellt, die alle Tasten verwaltet.
- Dieses Panel sendet die Benutzereingaben **über Events** an den Controller **Vorteil:** Die Tastatur ist nun modular und kann leichter erweitert oder geändert werden.

---

## 4. **Schritt 3: Rechenwerk in eigene Klasse verschieben**
**Vorher:** Die Berechnungen wurden direkt im UI-Code ausgeführt.

**Refactoring:**
- Eine separate **RechnerModel**-Klasse wurde erstellt.
- Diese enthält den aktuellen Zustand (`speicher`, `operator`, `eingabe`).
- Die Berechnungen (`+`, `-`, `*`, `/`) sind nun **gekapselt** und können separat getestet werden.
- Änderungen werden über **`PropertyChangeSupport`** an die View weitergeleitet.

 **Vorteil:** Die Rechenlogik ist **wiederverwendbar** und kann auch in anderen Programmen oder Tests genutzt werden.

---

## 5. **Übersicht der neuen Struktur**
###  **Vorher: Monolithischer Code**
```plaintext
- Taschenrechner.java
  - GUI (JFrame, JPanel, Buttons)
  - Logik für Berechnung
  - Event-Handling
```

###  **Nachher: Klare Trennung (MVC-Prinzip)**
```plaintext
- Taschenrechner.java
  - Erstellt Model, View, Controller

- RechnerModel.java (Geschäftslogik)
  - Speichert Werte 
  - Informiert View über Änderungen

- RechnerView.java (Anzeige)
  - Registriert sich als Listener beim Model
  - Zeigt aktuelle Werte an

- Rechenwerk
	-  verarbeitet Berechnungen
	
- TastenPanel.java (Eingabe)
  - Erzeugt Buttons und leitet Eingaben an Controller weiter

- RechnerController.java (Steuerung)
  - Vermittelt zwischen View und Model
```

---

## 6. **Ergebnisse & Vorteile**
 **Lose Kopplung**: GUI, Logik und Eingabe sind getrennt und können unabhängig geändert werden.  
 **Bessere Wartbarkeit**: Änderungen an der Berechnung beeinflussen nicht die GUI.  
 **Testbarkeit**: Die Logik kann in isolierten Unit-Tests geprüft werden.  
 **Wiederverwendbarkeit**: Das Rechenwerk kann in andere Anwendungen integriert werden.  
 **Skalierbarkeit**: Weitere Funktionen (z. B. erweiterte Operatoren, Speicherfunktion) lassen sich leicht ergänzen.  

---

### Fazit 
Durch dieses Refactoring wurde aus einem schwer erweiterbaren Spaghetti-Code eine **saubere, modulare Taschenrechner-Anwendung**, die nun **nachhaltig und gut wartbar** ist. Weitere Funktionen können nun leicht hinzugefügt werden, ohne das gesamte Programm neu schreiben zu müssen. 

