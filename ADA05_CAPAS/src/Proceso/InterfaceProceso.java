/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Proceso;

import java.util.List;
import java.util.Set;

/**
 *
 * @author HP
 */
public interface InterfaceProceso {
    List<String> filtroPalabrasVacias(String textoIngresado, Set<String> palabrasVacias);
    List<String> generarRotaciones(List<String> palabras);
    
}
