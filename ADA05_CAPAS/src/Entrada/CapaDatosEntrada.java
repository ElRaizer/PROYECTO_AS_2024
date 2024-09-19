/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entrada;

/**
 *
 * @author USER
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class CapaDatosEntrada implements InterfaceImpresionSalida{
    // Leer palabras vacías desde un archivo
    public Set<String> leerPalabrasVacias(String filePath) {
        Set<String> palabrasVacias = new HashSet<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get("Lectura", filePath));
            for (String line : lines) {
                palabrasVacias.add(line.trim().toLowerCase());
            }
        } catch (IOException e) {
            System.out.println("Error de lectura del archivo  txt " + e.getMessage());
        }
        return palabrasVacias;
    }

    // Método para imprimir la lista de rotaciones

    @Override
    public void impresionSalida(List<String> rotaciones) {
        for (String rotar : rotaciones) {
            System.out.println(rotar);
        }
    }
    
}
