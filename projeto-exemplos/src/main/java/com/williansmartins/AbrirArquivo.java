package com.williansmartins;

import java.net.URI;
import java.awt.*;
import java.io.File;

public class AbrirArquivo {
        public static void main(String[] args) {
        try {
            // Check if Desktop is supported
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();

                // Open a PDF file (adjust the file path)
                File file = new File("/Users/user/Downloads/nayara-escola.pdf");
                if (file.exists()) {
                    desktop.open(file);
                } else {
                    System.out.println("File does not exist.");
                }
            } else {
                System.out.println("Desktop API is not supported on this system.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
