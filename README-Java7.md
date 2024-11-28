# Resumo das Principais Novidades do Java 5
- Strings no switch

## 1. String Data Type in switch
Java 7 introduced String in Switch, allowing developers to switch on strings.

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

## 2. Diamond Operator
Java 7 introduced the diamond operator, which is a new way to create generic objects.

Example:
```java
List<String> list = new ArrayList<>();
```

## 3. Try-With-Resources
Java 7 introduced the try-with-resources statement, which is a new way to automatically close resources.

Example:
```java
try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
    System.out.println(br.readLine());
} catch (IOException e) {
    e.printStackTrace();
}
```

## 4. Catching Múltiplas Exceções
Java 7 introduced the ability to catch multiple exceptions in a single catch block.

Example:
```java
try {
    // code that may throw multiple exceptions
} catch (Exception1 | Exception2 e) {
    // handle multiple exceptions
}
```

## 5. API: Melhorias em Java.nio.file
Java 7 introduced enhancements to the Java.nio.file package

Example:
```java
Path path = Paths.get("file.txt");
BufferedReader reader = Files.newBufferedReader(path);
String line = reader.readLine();
reader.close();
```

## 6.  Watch Service API
Java 7 introduced the Watch Service API, which allows developers to monitor changes to files and directories.

Example:
```java
WatchService watchService = FileSystems.getDefault().newWatchService();
Path path = Paths.get("my_directory");
path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE);

WatchKey key;
while ((key = watchService.take()) != null) {
    for (WatchEvent<?> event : key.pollEvents()) {
        System.out.println("Event: " + event.kind() + ", File: " + event.context());
    }
    key.reset();
}
```

## 7. Numerais com Underscore
Java 7 introduced the ability to use underscores in numeric literals.

Example:
```java
int number = 1_000_000;
```

