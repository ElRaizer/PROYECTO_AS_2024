/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proceso;

/**
 *
 * @author USER
 */
import java.util.*;

public class CapaProceso implements InterfaceProceso{

    // Filtrar las palabras vacías
    @Override
    public List<String> filtroPalabrasVacias (String textoIngresado, Set<String> palabrasVacias) {
        List<String> words = new ArrayList<>(Arrays.asList(textoIngresado.split("\\s+")));
        words.removeIf(palabrasVacias::contains);
        return words;
    }

    // Generar todas las rotaciones posibles de la lista de palabras
    @Override
    public List<String> generarRotaciones(List<String> palabras) {
        List<String> rotaciones = new ArrayList<>();
        int contPalabras = palabras.size();
        
        for (int i = 0; i < contPalabras; i++) {
            StringBuilder rotar = new StringBuilder();
            for (int j = 0; j < contPalabras; j++) {
                rotar.append(palabras.get((i + j) % contPalabras)).append(" ");
            }
            rotaciones.add(rotar.toString().trim());
        }
        return rotaciones;
    }
}

