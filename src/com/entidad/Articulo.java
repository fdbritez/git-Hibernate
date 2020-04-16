/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entidad;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author fdbritez
 */
@Entity
public class Articulo implements Serializable{
    private int id_articulo;
    private String des_articulo;
    private int p_compra;
    private int porcentaje;
    private int p_venta;
    private int cantidad;
    private Tipo tipo;

        
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    @Column(length = 50)
    public String getDes_articulo() {
        return des_articulo;
    }
    
    

    public void setDes_articulo(String des_articulo) {
        this.des_articulo = des_articulo;
    }
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
  
    public int getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(int id_articulo) {
        this.id_articulo = id_articulo;
    }

    public int getP_compra() {
        return p_compra;
    }

    public void setP_compra(int p_compra) {
        this.p_compra = p_compra;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getP_venta() {
        return p_venta;
    }

    public void setP_venta(int p_venta) {
        
        this.p_venta = p_venta;
    }

    @ManyToOne
    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
