# Here are the significant features and improvements introduced in Java 6 (released in December 2006):

# Java 6 Features

## 1. Scripting Language Support (JSR 223)
- Support for integrating scripting languages with Java.
- `javax.script` package added for scripting engines.

## 2. Compiler API (JSR 199)
- Interact with the Java compiler programmatically.
- `javax.tools` package introduced.

## 3. Pluggable Annotations Processing (JSR 269)
- Annotation processors for compile-time metadata handling.

## 4. Swing Improvements
- **System Tray API**: Interact with system tray.
- **Splash Screen API**: Add startup splash screens.

## 5. Web Service Enhancements
- Added JAXB 2.0 and JAX-WS 2.0 for XML binding and web services.

## 6. Desktop Enhancements
- **Desktop API**: Open files and URLs using the associated desktop application.

## 7. Monitoring and Management Enhancements
- Improved JMX and enhanced `JConsole`.

## 8. Performance Improvements
- Optimized JVM startup and garbage collection.
- Better multi-core processor support.

## 9. JDBC 4.0
- Automatic driver loading.
- Enhanced SQL exception handling.

## 10. Removal of Deprecated Features
- Cleanup of older, unused APIs for a leaner platform.


## 1. Scripting Language Support (JSR 223)
Java 6 introduced built-in support for scripting languages through the javax.script package, enabling seamless integration of Java code with other scripting languages (e.g., JavaScript).

Example:
```java 
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;

public class ScriptingExample {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        engine.eval("var x = 10;");
        System.out.println("Result: " + engine.eval("x + 5"));
    }
}
```

## 2. Compiler API (JSR 199)
The javax.tools package provides an API for interacting with the Java compiler, allowing developers to programmatically compile Java source code and generate class files.

Example:
```java
import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public class CompilerExample {
    public static void main(String[] args) {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
        try {
            JavaFileObject file = fileManager.getJavaFileForOutput(null, "MyClass", JavaFileObject.Kind.CLASS, null);
            file.openWriter().write("class MyClass { ... }");
            fileManager.close();
            compiler.getTask(null, fileManager, null, null, null, null).call();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

## 3. Pluggable Annotations Processing (JSR 269)
Java 6 introduced pluggable annotation processing, which allows developers to extend the annotation processing capabilities of the compiler.

Example:
```java
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnnotation {
    String value();
}

public class AnnotationExample {
    @MyAnnotation("Hello")
    public void myMethod() {
        System.out.println("My annotated method.");
    }
}
```

## 4. Swing Improvements
Java 6 introduced enhancements to the Swing library, including:
- System Tray API: Interact with system tray.
- Splash Screen API: Add startup splash screens.

Example:
```java
import java.awt.*;
import javax.swing.*;

import java.awt.*;

public class SystemTrayExample {
    public static void main(String[] args) throws AWTException {
        if (!SystemTray.isSupported()) {
            System.out.println("System tray is not supported!");
            return;
        }

        // Get the system tray
        SystemTray tray = SystemTray.getSystemTray();

        // Create a tray icon
        Image image = Toolkit.getDefaultToolkit().getImage("icon.png");
        TrayIcon trayIcon = new TrayIcon(image, "My App");

        trayIcon.setImageAutoSize(true);
        trayIcon.setToolTip("Hello System Tray");

        // Add the icon to the tray
        tray.add(trayIcon);
    }
}
```

## 5. Web Service Enhancements
Java 6 introduced enhancements to web services, including:
- JAXB 2.0 and JAX-WS 2.0 for XML binding and web services.

Example:
```java
import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public class HelloWorld {
    @WebMethod
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
```

## 6. Desktop Enhancements
Java 6 introduced enhancements to the desktop API, including:
- Desktop API: Open files and URLs using the associated desktop application.

Example:
```java
import java.awt.Desktop;
import java.io.File;
if (Desktop.isDesktopSupported()) {
    Desktop desktop = Desktop.getDesktop();

    // Open a PDF file (adjust the file path)
    File file = new File("/Users/user/Downloads/nayara-escola.pdf");
    if (file.exists()) {
        desktop.open(file);
    } else {
        System.out.println("File does not exist.");
    }
}
```

## 7. Monitoring and Management Enhancements
Java 6 introduced enhancements to monitoring and management, including:
- Improved JMX and enhanced JConsole.

Example:
```java
MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();

MemoryUsage heapMemoryUsage = memoryMXBean.getHeapMemoryUsage();
System.out.println("Heap Memory:");
System.out.println(" - Initial: " + heapMemoryUsage.getInit());
System.out.println(" - Used: " + heapMemoryUsage.getUsed());
System.out.println(" - Committed: " + heapMemoryUsage.getCommitted());
System.out.println(" - Max: " + heapMemoryUsage.getMax());

MemoryUsage nonHeapMemoryUsage = memoryMXBean.getNonHeapMemoryUsage();
System.out.println("Non-Heap Memory:");
System.out.println(" - Initial: " + nonHeapMemoryUsage.getInit());
System.out.println(" - Used: " + nonHeapMemoryUsage.getUsed());
System.out.println(" - Committed: " + nonHeapMemoryUsage.getCommitted());
System.out.println(" - Max: " + nonHeapMemoryUsage.getMax());

## 8. Performance Improvements
Java 6 introduced improvements to performance, including:
- Optimized JVM startup and garbage collection.
- Better multi-core processor support.

## 9. JDBC 4.0
Java 6 introduced JDBC 4.0, which introduced automatic driver loading and enhanced SQL exception handling.

Example:
```java
String url = "jdbc:mysql://localhost:3306/testdb";
String user = "root";
String password = "password";

try (Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement()) {

    ResultSet rs = stmt.executeQuery("SELECT * FROM employees");

    while (rs.next()) {
        System.out.println(rs.getString("name"));
    }
}
```

## 10. Removal of Deprecated Features
Java 6 removed deprecated features, including:
- Cleanup of older, unused APIs for a leaner platform.

