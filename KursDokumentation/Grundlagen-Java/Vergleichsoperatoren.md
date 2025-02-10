#03_02_2025
# Vergleichsoperatoren in Java

In Java gibt es mehrere Vergleichsoperatoren, die für den Vergleich von Werten verwendet werden. Diese Operatoren haben unterschiedliche **Prioritäten** (Prio), die bestimmen, in welcher Reihenfolge sie bei komplexen Ausdrücken ausgewertet werden.

## **Vergleichsoperatoren mit Prioritäten**

| Operator | Bedeutung           | Priorität (1 = höchste, 15 = niedrigste) |
| -------- | ------------------- | ---------------------------------------- |
| `==`     | Gleichheit          | 9                                        |
| `!=`     | Ungleichheit        | 9                                        |
| `>`      | Größer als          | 8                                        |
| `<`      | Kleiner als         | 8                                        |
| `>=`     | Größer oder gleich  | 8                                        |
| `<=`     | Kleiner oder gleich | 8                                        |

### **Erklärung der Prioritäten**
- **Vergleichsoperatoren (`==`, `!=`, `>`, `<`, `>=`, `<=`)** haben eine mittlere Priorität.
- Sie werden **nach mathematischen Operatoren** (`+`, `-`, `*`, `/`) aber **vor logischen Operatoren** (`&&`, `||`) ausgewertet.

### **Beispiel für die Prioritäten**
```java
public class Vergleichsoperatoren {
    public static void main(String[] args) {
        int a = 5, b = 10;
        boolean ergebnis = a + 2 < b && b - 5 == a;
        System.out.println(ergebnis); // true
    }
}
```
**Erklärung:**
1. `a + 2 < b` → `5 + 2 < 10` → `7 < 10` → `true`
2. `b - 5 == a` → `10 - 5 == 5` → `5 == 5` → `true`
3. `true && true` ergibt `true`

## Tipp
- wenn Du Dir unsicher bis, wie die Reihenfolge der Auswertung ist, klammere bitte
```java
public class Vergleichsoperatoren {
    public static void main(String[] args) {
        int a = 5, b = 10;
        boolean ergebnis = ( a + 2 < b ) && ( b - 5 == a );
        System.out.println(ergebnis); // true
    }
}
```

## **Zusätzliche Hinweise**
- **`==` und `!=` sind für primitive Datentypen sicher, aber nicht für Objekte!**
- Zum Vergleichen von Strings sollte **`.equals()`** verwendet werden:
```java
String str1 = "Hallo";
String str2 = "Hallo";
System.out.println(str1.equals(str2)); // true
```

