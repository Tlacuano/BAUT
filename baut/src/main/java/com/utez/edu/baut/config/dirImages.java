package com.utez.edu.baut.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.File;

public class dirImages implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext context = servletContextEvent.getServletContext();
        String imagesDirectoryPath =  "C:/images";
        System.out.println("Directorio de imágenes: " + imagesDirectoryPath);

        File imagesDirectory = new File(imagesDirectoryPath);

        // Verifica si el directorio ya existe, si no, créalo.
        if (!imagesDirectory.exists()) {
            boolean created = imagesDirectory.mkdirs();
            if (created) {
                System.out.println("Directorio 'images' creado con éxito.");
            } else {
                System.err.println("No se pudo crear el directorio 'images'.");
            }
        }else {
            System.out.println("Directorio 'images' ya existe.");
        }
    }
}
