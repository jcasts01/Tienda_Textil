/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejb;

import com.mycompany.model.UsuarioTienda;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author nachoalvarez
 */
@Stateless
public class UsuarioTiendaFacade extends AbstractFacade<UsuarioTienda> implements UsuarioTiendaFacadeLocal {

    @PersistenceContext(unitName = "tiendaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioTiendaFacade() {
        super(UsuarioTienda.class);
    }
    
}
