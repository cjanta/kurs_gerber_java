# Beispiele für User Stories in der agilen Entwicklung

## 1. Einfache User Stories
### Beispiel 1: Nutzerregistrierung
**User Story:**
*„Als neuer Benutzer möchte ich mich mit meiner E-Mail-Adresse registrieren können, um Zugang zur Plattform zu erhalten.“*

**Akzeptanzkriterien:**
- Ein Benutzer kann eine E-Mail und ein Passwort eingeben.
- Nach erfolgreicher Registrierung wird eine Bestätigungs-E-Mail versendet.
- Fehlermeldung, falls die E-Mail bereits existiert.

**Definition of Done:**
- Der Code ist im Repository und dokumentiert.
- Alle Unit-Tests sind erfolgreich.
- Die Registrierung ist über die UI und API getestet.
- Sicherheitsüberprüfung der Passwortspeicherung abgeschlossen.

**Tests:**
- Registrierung mit gültigen und ungültigen Daten.
- Test der E-Mail-Bestätigung.
- Passwort-Validierung und Sicherheitschecks.

### Beispiel 2: Passwort zurücksetzen
**User Story:**
*„Als registrierter Benutzer möchte ich mein Passwort zurücksetzen können, um wieder Zugang zu meinem Konto zu erhalten.“*

**Akzeptanzkriterien:**
- Nutzer gibt seine E-Mail-Adresse ein.
- Ein temporärer Link wird an die E-Mail gesendet.
- Nutzer kann ein neues Passwort festlegen.

**Definition of Done:**
- Funktion ist dokumentiert und bereitgestellt.
- Sicherheitsprüfung für Passwort-Reset abgeschlossen.
- UI und API-Tests sind erfolgreich.

**Tests:**
- Passwort-Reset mit existierender und nicht-existierender E-Mail.
- Ablauf der temporären Links testen.
- Sichere Speicherung des neuen Passworts prüfen.

## 2. Erweiterte User Stories
### Beispiel 3: Einkaufskorb
**User Story:**
*„Als Kunde möchte ich Artikel in meinen Warenkorb legen können, um sie später zu kaufen.“*

**Akzeptanzkriterien:**
- Nutzer kann Produkte zum Warenkorb hinzufügen und entfernen.
- Der Warenkorb speichert Artikel zwischen Sitzungen.
- Preis und Anzahl der Artikel werden korrekt angezeigt.

**Definition of Done:**
- Persistente Speicherung des Warenkorbs funktioniert.
- UI- und API-Tests sind erfolgreich.
- Performance-Tests durchgeführt.

**Tests:**
- Produkte hinzufügen und entfernen.
- Warenkorb in mehreren Sessions überprüfen.
- Preisberechnung und Steuern testen.

### Beispiel 4: Produktbewertung
**User Story:**
*„Als Kunde möchte ich Produkte bewerten können, um meine Meinung mit anderen Kunden zu teilen.“*

**Akzeptanzkriterien:**
- Nutzer kann Sternebewertungen (1–5) abgeben.
- Eine schriftliche Rezension kann hinzugefügt werden.
- Bewertungen sind für andere Nutzer sichtbar.

**Definition of Done:**
- Bewertungen werden erfolgreich gespeichert und abgerufen.
- Moderationsmechanismus für Bewertungen implementiert.
- UI und API-Tests abgeschlossen.

**Tests:**
- Bewertungen hinzufügen und löschen.
- Anzeige von Bewertungen testen.
- Missbrauchserkennung prüfen.

## 3. Technische User Stories
### Beispiel 5: Performance-Optimierung
**User Story:**
*„Als Systemadministrator möchte ich, dass die Ladezeit der Startseite unter 2 Sekunden bleibt, um die Benutzererfahrung zu verbessern.“*

**Akzeptanzkriterien:**
- Startseite lädt in unter 2 Sekunden bei einer 50-Mbit/s-Verbindung.
- Bilder sind optimiert und komprimiert.
- Caching ist aktiviert.

**Definition of Done:**
- Performance-Metriken dokumentiert.
- Caching und Bildoptimierung überprüft.
- Lasttests durchgeführt.

**Tests:**
- Geschwindigkeitstests mit verschiedenen Netzwerkbedingungen.
- Caching-Mechanismen testen.
- Ladezeiten unter Last messen.

### Beispiel 6: Sicherheitserweiterung
**User Story:**
*„Als Sicherheitsbeauftragter möchte ich eine Zwei-Faktor-Authentifizierung implementieren, um die Sicherheit der Benutzerkonten zu erhöhen.“*

**Akzeptanzkriterien:**
- Nutzer können 2FA über eine Authenticator-App aktivieren.
- Nach erfolgreicher Anmeldung wird ein einmaliger Code abgefragt.
- Möglichkeit zur Wiederherstellung bei Verlust des 2FA-Codes.

**Definition of Done:**
- 2FA ist vollständig implementiert und getestet.
- Sicherheitstests sind abgeschlossen.
- Benutzeranleitungen aktualisiert.

**Tests:**
- Aktivierung und Deaktivierung von 2FA testen.
- Login mit und ohne 2FA testen.
- Wiederherstellungsmöglichkeiten prüfen.

## Fazit
Diese Beispiele zeigen, wie User Stories mit klar definierten Akzeptanzkriterien, einer Definition of Done und Tests entwickelt werden. Sie helfen Teams, die Anforderungen nutzerzentriert und verständlich umzusetzen.

