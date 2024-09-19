package Lectura;


import Entrada.CapaDatosEntrada;
import Filtro.CapaFiltro;
import Proceso.CapaProceso;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */


public class KWIC_main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Por favor, ingresa una cadena de texto como parámetro.");
            return;
        }

        String inputText = String.join(" ", args).toLowerCase();
        
        // Capa de entrada y procesamiento
        CapaDatosEntrada ioLayer = new CapaDatosEntrada();
        CapaProceso capaProcesamiento = new CapaProceso();
        
        // Leer palabras vacías desde el archivo
        Set<String> stopWords = ioLayer.leerPalabrasVacias("spanish.txt");
        
        // Eliminar palabras vacías y generar rotaciones
        List<String> palabrasFiltro = capaProcesamiento.filtroPalabrasVacias(inputText, stopWords);
        List<String> rotaciones = capaProcesamiento.generarRotaciones(palabrasFiltro);
        
        // Ordenar rotaciones
        CapaFiltro capaFiltro = new CapaFiltro();
        List<String> rotacionFiltrada = capaFiltro.sortRotaciones(rotaciones);
        
        // Capa de salida: Imprimir resultados
        ioLayer.impresionSalida(rotacionFiltrada);
    }
}
