package com.williansmartins;

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
