package com.mycompany.controller;


import com.mycompany.ejb.UsuarioTiendaFacadeLocal;
import com.mycompany.model.UsuarioTienda;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
/**
 *
 * @author nachoalvarez
 */
@Named
@ViewScoped
public class usuarioController implements Serializable{
    
    @EJB
    private UsuarioTiendaFacadeLocal usuarioEJB;
    
    private UsuarioTienda usuario;

    public UsuarioTiendaFacadeLocal getUsuarioEJB() {
        return usuarioEJB;
    }

    public void setUsuarioEJB(UsuarioTiendaFacadeLocal usuarioEJB) {
        this.usuarioEJB = usuarioEJB;
    }

    public UsuarioTienda getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioTienda usuario) {
        this.usuario = usuario;
    }

   
   
    
    
    @PostConstruct
    public void init(){
       usuario =  new UsuarioTienda();
    }
    
    public void registrar(){
        try{
            usuarioEJB.create(usuario);
        }catch(Exception e){
            
        }
    }
    
}
