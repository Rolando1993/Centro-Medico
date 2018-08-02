/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.dao;

import com.proyecto.entidades.Doctores;
import java.util.List;

/**
 *
 * @author Bienvenido
 */
public interface IDoctoresDao {
    void insertar (Doctores d);
    void actualizar (Doctores d);
    void eliminar (Doctores d);
    
    List<Doctores> getListDoctores();
    
}
