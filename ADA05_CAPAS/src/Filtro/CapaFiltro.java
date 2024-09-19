/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filtro;

/**
 *
 * @author USER
 */
import java.util.*;

public class CapaFiltro implements InterfaceFiltro{

    // Método para ordenar alfabéticamente las rotaciones
    @Override
    public List<String> sortRotaciones(List<String> rotaciones) {
        Collections.sort(rotaciones);
        return rotaciones;
    }
    
    
}

