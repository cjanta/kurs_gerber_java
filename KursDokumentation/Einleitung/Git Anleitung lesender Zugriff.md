#03_02_2025
# Git-Anleitung für den lesenden Zugriff

Diese Anleitung beschreibt, wie du regelmäßig Änderungen aus dem Git-Repository abrufst, ohne versehentlich eigene Änderungen hochzuladen.
 
## 1. Repository klonen (einmalig)
Bevor du das Repository nutzen kannst, musst du es einmalig klonen:

```bash
git clone --depth=1 <URL_ZUM_REPO>
```

Ersetze `<URL_ZUM_REPO>` mit der tatsächlichen Adresse des Repositories.

## 2. Neue Änderungen herunterladen
Um regelmäßig die neuesten Änderungen aus dem Repository zu holen, benutze folgenden Befehl:

```bash
git pull --rebase
```

Falls du sicher sein möchtest, dass deine lokalen Änderungen nicht mit übernommen werden, kannst du stattdessen Folgendes nutzen (Achtung: Eigene Änderungen gehen verloren!):

```bash
git fetch origin && git reset --hard origin/main
```

## 3. Eigene Änderungen ansehen
Falls du Änderungen an Dateien gemacht hast, kannst du dir anzeigen lassen, was du verändert hast:

```bash
git diff
```

## 4. Eigene Änderungen zurücksetzen
Falls du deine Änderungen nicht behalten möchtest, kannst du alle lokalen Änderungen verwerfen:

```bash
git checkout -- .
```

Falls du deine Änderungen später wieder benötigst, kannst du sie stattdessen mit `git stash` zwischenspeichern:

```bash
git stash
```

Um die gespeicherten Änderungen später wiederherzustellen, verwende:

```bash
git stash pop
```

## 5. Änderungen niemals hochladen
Damit du keine Änderungen versehentlich hochlädst, gibt es zwei Schutzmechanismen:

1. Du hast nur **Leserechte** auf das Repository, ein `git push` funktioniert daher nicht.
2. Falls du Schreibrechte hast, kannst du einen lokalen Schutz einrichten, um versehentliches Pushen zu verhindern. Dazu führe folgenden Befehl im Repository aus:

   ```bash
   echo -e "#!/bin/sh
exit 1" > .git/hooks/pre-push
   chmod +x .git/hooks/pre-push
   ```
   Dies blockiert alle `git push`-Befehle lokal.

## Zusammenfassung der wichtigsten Befehle
| Aktion                          | Befehl                               |
| ------------------------------- | ------------------------------------ |
| Repository klonen               | `git clone --depth=1 <URL_ZUM_REPO>` |
| Änderungen abrufen              | `git pull --rebase`                  |
| Änderungen ansehen              | `git diff`                           |
| Änderungen verwerfen            | `git checkout -- .`                  |
| Änderungen zwischenspeichern    | `git stash`                          |
| Änderungen wiederherstellen     | `git stash pop`                      |
| Lokale Änderungen überschreiben | `git reset --hard origin/main`       |


