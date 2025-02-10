#03_02_2025 #04_02_2025 
# Überprüfung der Konvertierbarkeit eines Strings in int oder double in Java

Um vor einer Umwandlung zu testen, ob ein `String` tatsächlich in einen bestimmten Datentyp wie `int` oder `double` konvertiert werden kann, kannst du in Java eine Methode schreiben, die dies überprüft.

## 1. Überprüfung, ob ein `String` in `int` konvertiert werden kann

Hierfür kannst du eine Methode schreiben, die versucht, den `String` in `int` zu konvertieren. Falls eine `NumberFormatException` ausgelöst wird, ist der `String` nicht geeignet. Diese Methode gibt `true` zurück, wenn der `String` in `int` konvertiert werden kann, und `false` ansonsten.

```java
public static boolean isInteger(String str) {
    try {
        Integer.parseInt(str);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}
```

### Beispielnutzung:
```java
String testString = "123";
if (isInteger(testString)) {
    System.out.println(testString + " kann in int konvertiert werden.");
} else {
    System.out.println(testString + " kann nicht in int konvertiert werden.");
}
```

## 2. Überprüfung, ob ein `String` in `double` konvertiert werden kann

Ähnlich zur `int`-Überprüfung kannst du eine Methode schreiben, um zu testen, ob ein `String` in `double` konvertierbar ist.

```java
public static boolean isDouble(String str) {
    try {
        Double.parseDouble(str);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}
```

### Beispielnutzung:
```java
String testString = "123.45";
if (isDouble(testString)) {
    System.out.println(testString + " kann in double konvertiert werden.");
} else {
    System.out.println(testString + " kann nicht in double konvertiert werden.");
}
```

## Kombination der Methoden

Mit diesen beiden Methoden kannst du vor einer Umwandlung sicherstellen, dass der `String` wirklich konvertiert werden kann, ohne dass dein Programm abstürzt.
