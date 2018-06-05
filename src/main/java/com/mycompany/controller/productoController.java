/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.ejb.ProductoFacadeLocal;
import com.mycompany.model.Producto;
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
public class productoController implements Serializable {
    @EJB
    private ProductoFacadeLocal ProductoEJB;
    
    private Producto producto;
    
    @PostConstruct
    public void init(){
       producto =  new Producto();
    }
    
    public void registrar(){
        try{
            ProductoEJB.create(producto);
        }catch(Exception e){
            
        }
    }

    public ProductoFacadeLocal getProductoEJB() {
        return ProductoEJB;
    }

    public void setProductoEJB(ProductoFacadeLocal ProductoEJB) {
        this.ProductoEJB = ProductoEJB;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
      
    
}
