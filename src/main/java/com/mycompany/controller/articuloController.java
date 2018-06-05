/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;


import com.mycompany.ejb.ArticuloFacadeLocal;
import com.mycompany.model.Articulo;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author nachoalvarez
 */
@Named
@ViewScoped
public class articuloController implements Serializable{
    
    @EJB
    private ArticuloFacadeLocal articuloEJB;
    
    private Articulo articulo;
    
    @PostConstruct
    public void init(){
       articulo =  new Articulo();
    }
    
    public void registrar(){
        try{
            articuloEJB.create(articulo);
        }catch(Exception e){
            
        }
    }

    public ArticuloFacadeLocal getArticuloEJB() {
        return articuloEJB;
    }

    public void setArticuloEJB(ArticuloFacadeLocal articuloEJB) {
        this.articuloEJB = articuloEJB;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
    
    
    
}
