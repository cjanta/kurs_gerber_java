**Integer-Vergleich in Java: Warum ist die Ausgabe unerwartet?**

## **1. Einführung**
Beim Vergleich von `Integer`-Wrapper-Objekten in Java kann es zu unerwarteten Ergebnissen kommen, wenn der `==` Operator verwendet wird. Das liegt an der Art und Weise, wie Java Wrapper-Klassen behandelt, insbesondere durch **Caching und Autoboxing**.

---

## **2. Code-Analyse**

### **Beispiel-Code**
```java
package day0402.car;

public class IntVergleich {
    public static void main(String[] args) {
        Integer wert1 = 1;
        Integer wert2 = 0;

        System.out.println("werte1 =  " + wert1);
        System.out.println("werte2 =  " + wert2);
        if(wert1 == wert2) {
            System.out.println("werte sind gleich");
        } else {
            System.out.println("werte sind ungleich");
        }

        wert2 = wert2 + 1;
        System.out.println("werte1 =  " + wert1);
        System.out.println("werte2 =  " + wert2);
        if(wert1 == wert2) {
            System.out.println("werte sind gleich");
        } else {
            System.out.println("werte sind ungleich");
        }
    }
}
```

### **Erwartete Ausgabe:**
```
werte1 =  1
werte2 =  0
werte sind ungleich
werte1 =  1
werte2 =  1
werte sind gleich
```

---

## **3. Warum passiert das?**

### **3.1 `==` vergleicht Referenzen, nicht Werte**
In Java vergleicht der `==` Operator bei Wrapper-Klassen wie `Integer` die **Speicherreferenzen**, nicht die eigentlichen Werte.

### **3.2 Integer-Caching (-128 bis 127)**
Java speichert `Integer`-Werte zwischen `-128` und `127` in einem internen Cache (`Integer.valueOf(n)`). Das bedeutet:
- Wenn eine Zahl in diesem Bereich liegt, gibt Java **die gleiche Referenz** zurück.
- Liegt eine Zahl außerhalb dieses Bereichs, wird **ein neues `Integer`-Objekt** erzeugt.

---

## **4. Erklärung der Ausgabe**

### **4.1 Erster Vergleich (`wert1 == wert2`)**
```java
Integer wert1 = 1;
Integer wert2 = 0;
if (wert1 == wert2)
```
- `wert1 (1) != wert2 (0)` (da unterschiedliche Referenzen)
- **Ergebnis:** `werte sind ungleich`

---

### **4.2 Wert von `wert2` wird erhöht**
```java
wert2 = wert2 + 1;
```
- `wert2 + 1` führt zu einer **Unboxing-Operation** (`0 + 1 = 1`, Ergebnis ist `int`).
- Danach wird dieser `int` wieder in ein `Integer`-Objekt verpackt (**Autoboxing**).
- **Da `1` im Integer-Cache liegt, erhält `wert2` die gleiche Referenz wie `wert1`!**

#### **Zweiter Vergleich (`wert1 == wert2`)**
```java
if (wert1 == wert2)
```
- **Ergebnis:** `werte sind gleich` (weil `wert1` und `wert2` nun auf das gleiche Integer-Objekt zeigen)

---

## **5. Lösung: Sicherer Vergleich mit `equals()`**
Statt `==` sollte **`equals()`** verwendet werden, um die tatsächlichen Werte zu vergleichen:

```java
if (wert1.equals(wert2)) {
    System.out.println("werte sind gleich");
} else {
    System.out.println("werte sind ungleich");
}
```

### **Warum?**
- `equals()` vergleicht die **Werte** der Objekte, nicht die Referenzen.
- Dadurch ist das Ergebnis unabhängig vom Integer-Cache oder Autoboxing.

---

## **6. Fazit**
- `==` vergleicht bei `Integer`-Objekten die **Referenzen**, nicht die Werte.
- Java **cached Integer-Werte zwischen -128 und 127**, was zu scheinbar inkonsistentem Verhalten führen kann.
- **Verwende immer `equals()`, wenn du Werte von Wrapper-Klassen vergleichen möchtest!**

