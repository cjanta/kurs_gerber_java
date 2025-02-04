Aufgabe: Verwaltung eines Fahrzeugparks
Schreiben Sie eine Java-Klasse Fahrzeug, die grundlegende Eigenschaften eines Fahrzeugs speichert. Die Klasse soll folgende Attribute und Methoden enthalten:
1. Attribute:
•	marke (String) → Die Marke des Fahrzeugs (z. B. "BMW", "Toyota").
•	modell (String) → Das Modell des Fahrzeugs (z. B. "X5", "Corolla").
•	baujahr (int) → Das Baujahr des Fahrzeugs.
•	kmStand (double) → Der aktuelle Kilometerstand.
•	kraftstoffart (String) → Die Kraftstoffart des Fahrzeugs ("Benzin", "Diesel", "Elektro", "Hybrid").
•	tankvolumen (double) → Das maximale Tankvolumen in Litern.
•	tankstand (double) → Der aktuelle Tankfüllstand in Litern.
2. Konstruktor:
Der Konstruktor soll folgende Werte als Parameter entgegennehmen:
•	marke, modell, baujahr, kmStand, kraftstoffart, tankvolumen.
•	Der tankstand soll standardmäßig auf 0.0 gesetzt werden.
3. Methoden:
•	void tanke(double liter): Erhöht den tankstand, darf aber das tankvolumen nicht überschreiten.
•	void fahre(double km): Erhöht den kmStand. Falls das Fahrzeug kein Kraftstoff mehr hat, soll eine Fehlermeldung ausgegeben werden. Auto braucht 5 l / 100 km.
•	int wieWeitKannIchFahren() : Tankinhalt / Verbrauch * 100
•	void zeigeDetails(): Gibt alle Fahrzeugdaten auf der Konsole aus.
4. Hauptprogramm (main-Methode):
•	Erstellt zwei Fahrzeug-Objekte.
•	Tanke die Fahrzeuge mit Kraftstoff.
•	Lasse die Fahrzeuge eine Strecke fahren.
•	Gebe die Fahrzeugdetails aus.
•	Checke wie weit das Auto noch fahren kann
