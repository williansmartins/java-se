# Resumo das Principais Novidades do Java 5
- Generics
- Enhanced for-loop (For-each loop)
- Anotações (Annotations)
- Autoboxing e Unboxing
- Tipos Enumerados (Enum Types)
- Varargs (Argumentos Variáveis)
- Strings no switch
- Novo Pacote de Concurrency (java.util.concurrent)
- Melhorias no Framework de Coleções
- Melhorias em I/O com java.nio

# Mudanças do Java 4 para o Java 5

O **Java 5** (também conhecido como **Java 1.5** ou **J2SE 5.0**) foi uma das versões mais importantes da linguagem, introduzindo uma série de mudanças e melhorias significativas em relação ao **Java 4**. Abaixo estão as principais mudanças que ocorreram do Java 4 para o Java 5:

## 1. Generics
**Java 5** introduced **Generics**, allowing developers to write safer and more reusable code. With Generics, you can define parameterized data types, improving type checking at compile time.

Exemple:

```java
// Antes (Java 4):
List list = new ArrayList();
list.add("String");
String str = (String) list.get(0);

// Depois (Java 5):
List<String> list = new ArrayList<>();
list.add("String");
String str = list.get(0); // Sem necessidade de cast
```

## 2. Enhanced for-loop (For-each Loop)
The for-each loop was introduced in Java 5, allowing easy iteration over collections and arrays without the need for an index or explicit iterator.

Exemplo:

```java
// Antes (Java 4):
for (int i = 0; i < array.length; i++) {
    System.out.println(array[i]);
}

// Depois (Java 5):
for (String item : list) {
    System.out.println(item);
}
```

## 3. Metadata Annotations
Java 5 introduced Annotations, allowing developers to add metadata to code. Annotations are used to provide additional information to the compiler, frameworks, or tools.

Example:
```java
@Override
public void myMethod() {
    // Method overriding another
}
```

## 4. Autoboxing and Unboxing
Autoboxing and unboxing allow automatic conversion between primitive types and their wrapper classes (like int to Integer), without the need for explicit conversion.

Example:
```java
// Before (Java 4):
Integer i = new Integer(10);
int x = i.intValue();

// After (Java 5):
Integer i = 10; // Autoboxing
int x = i; // Unboxing
```

## 5. Enum Types
Java 5 introduced Enum Types, allowing developers to define a finite set of named constants.

Example:
```java
// Before (Java 4):
int day = 1;
if (day == 1) {
    System.out.println("Monday");
} else if (day == 2) {
    System.out.println("Tuesday");
} else if (day == 3) {
    System.out.println("Wednesday");
} else {
    System.out.println("Invalid day");
}

// After (Java 5):    
enum Day {
    MONDAY, TUESDAY, WEDNESDAY; // Define a finite set of named constants
}

Day day = Day.MONDAY;
if (day == Day.MONDAY) {
    System.out.println("Monday");
} else if (day == Day.TUESDAY) {
    System.out.println("Tuesday");
} else if (day == Day.WEDNESDAY) {
    System.out.println("Wednesday");
} else {
    System.out.println("Invalid day");
}
```

## 6. Varargs
Java 5 introduced Varargs, allowing developers to pass a variable number of arguments to a method.

Example:
```java
// Before (Java 4):
public void printNumbers(int[] numbers) { ... }

// After (Java 5):
public void printNumbers(int... numbers) { ... }
```

## 7. String Data Type in switch
Java 5 introduced String in Switch, allowing developers to switch on strings.

Example:
```java
String day = "MONDAY";
switch (day) {
    case "MONDAY":
        System.out.println("Start of the week");
        break;
    case "FRIDAY":
        System.out.println("End of the week");
        break;
}
```

## 8. Java Util Collections Framework
The introduction of Generics brought significant improvements to the Collections Framework. Additionally, Java 5 introduced new implementations and optimizations in collections.

Exemple:

```java
// Before (Java 4):
// Creating an ArrayList without generics
ArrayList list = new ArrayList();

// Adding different types of objects
list.add("String");
list.add(10);

// Retrieving items requires casting
String str = (String) list.get(0);  // Casting required
Integer number = (Integer) list.get(1);  // Casting required

System.out.println("String: " + str);
System.out.println("Integer: " + number);

// After (Java 5):
// Creating an ArrayList with Generics (type-safe)
ArrayList<String> list = new ArrayList<>();

// Adding only Strings to the list (type-safe)
list.add("String");
// list.add(10);  // This would cause a compile-time error

// Retrieving items without casting
String str = list.get(0);
System.out.println("String: " + str);

```

## 9. Concurrency Utilities (java.util.concurrent package)
Java 5 introduced the new java.util.concurrent package to facilitate the development of multithreaded applications.

Exemple:

```java
// Before (Java 4):
// Criar um objeto Runnable que define a tarefa
Runnable task1 = new Runnable() {
    public void run() {
        System.out.println("Task 1 is running on: " + Thread.currentThread().getName());
    }
};

Runnable task2 = new Runnable() {
    public void run() {
        System.out.println("Task 2 is running on: " + Thread.currentThread().getName());
    }
};

// Criar threads e passar o objeto Runnable para elas
Thread thread1 = new Thread(task1);
Thread thread2 = new Thread(task2);

// Iniciar as threads
thread1.start();
thread2.start();

// After (Java 5):
// Create an ExecutorService with a fixed thread pool of 2 threads
ExecutorService executor = Executors.newFixedThreadPool(2);

// Submit tasks for execution using Runnable
executor.submit(new Runnable() {
    public void run() {
        System.out.println("Task 1 is running on: " + Thread.currentThread().getName());
    }
});

executor.submit(new Runnable() {
    public void run() {
        System.out.println("Task 2 is running on: " + Thread.currentThread().getName());
    }
});

// Shut down the executor after tasks are submitted
executor.shutdown();

```

## 10. Improvements in java.io and java.nio
Improvements in Java IO and the introduction of Java NIO (New Input/Output) offered new APIs to work with I/O more efficiently. NIO brought concepts like buffers, selectors, channels, and path, improving performance in I/O operations.

Exemple:

```java
// Before (Java 4):
File file = new File("file.txt");
BufferedReader reader = new BufferedReader(new FileReader(file));
String line = reader.readLine();
reader.close();

// After (Java 5):
Path path = Paths.get("file.txt");
BufferedReader reader = Files.newBufferedReader(path);
String line = reader.readLine();
reader.close();

``` 
## 11. Other Language Enhancements
Syntactic Sugar: Introduction of several small syntax improvements, like the use of static imports to import static members directly.

Exemple:

```java 
// Before (Java 4):
// Before Java 5, you would use the class name explicitly
import java.lang.Math;
int result = Math.max(10, 20);
System.out.println("Max value: " + result);

// After (Java 5):
// After Java 5, you can directly use the static member without class name
import static java.lang.Math.max;
int result = max(10, 20);
System.out.println("Max value: " + result);

```
