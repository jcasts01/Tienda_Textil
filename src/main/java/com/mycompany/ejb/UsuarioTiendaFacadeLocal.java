/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejb;

import com.mycompany.model.UsuarioTienda;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author nachoalvarez
 */
@Local
public interface UsuarioTiendaFacadeLocal {

    void create(UsuarioTienda usuarioTienda);

    void edit(UsuarioTienda usuarioTienda);

    void remove(UsuarioTienda usuarioTienda);

    UsuarioTienda find(Object id);

    List<UsuarioTienda> findAll();

    List<UsuarioTienda> findRange(int[] range);

    int count();
    
}
